package com.demo;

public class Product {
    private int id;
    private String productName;
    private float price;
	public int getId() {
		return id;
	}
	
	
	public Product(int id, String productName, float price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", price=" + price + "]";
	}
    
}
