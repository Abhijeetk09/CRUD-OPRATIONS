package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService ps;
	//Adding Product
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product p) {
		return ps.insertProduct(p);
	}
	//Get All Product
	@GetMapping("/getall")
	public List<Product> getAllProduct(){
		return ps.findAllProduct();
	}
	
	//Update Product
	@PutMapping("/update")
	public Product UpdateProduct(@RequestBody Product p) {
		return ps.UpdateProduct(p);
	}
	//Delete Product By Id
	@DeleteMapping("/delete/{id}")
	public String deleteProductbyId(@PathVariable("id") int id) {
		return ps.deleteProduct(id);
	}
}
