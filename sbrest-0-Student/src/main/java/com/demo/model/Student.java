package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentInfo")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	private String scity;
	private double spercentage;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public double getSpercentage() {
		return spercentage;
	}
	public void setSpercentage(double spercentage) {
		this.spercentage = spercentage;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage + "]";
	}
	
	
}
