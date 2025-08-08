package com.kh.example.practice2.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	public Product() {}
	
	public String getPname() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPname(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void information() {
		System.out.println("[ 이름: " + pName 
							+ ", 가격: " + price + "만원" 
							+ ", 상품명: " + brand + "]");
	}
	
}
