package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Product;
import com.demo.repository.ProductRepository;
@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository pr;
	
	//Insert Product
	public Product insertProduct(Product p) {
		return pr.save(p);
	}
	
	//Get All Product
	public List<Product> findAllProduct(){
		return pr.findAll();
	}
	
	//Update Product 
	public Product UpdateProduct(Product p) {
		Product existingProduct = pr.findById(p.getPid()).orElse(null);
		existingProduct.setPname(p.getPname());
		existingProduct.setPcompany(p.getPcompany());
		existingProduct.setPprice(p.getPprice());
		return pr.save(existingProduct);
	}
	
	//Delete Product by id
	public String deleteProduct(int id) {
		pr.deleteById(id);
		return "Product Removed Succesfully "+id;
	}
	
}
