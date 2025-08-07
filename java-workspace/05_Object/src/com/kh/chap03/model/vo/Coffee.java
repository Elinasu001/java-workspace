package com.kh.chap03.model.vo;

public class Coffee {
	// 상품명, 가격, 원두, 크기
	
	// [필드부]
	private String name;		// 상품명
	private String bean;		// 원두
	private String size;		// 사이즈
	private int price;			// 가격
	
	// [생성자부] - 아직
	
	// [메소드부] getter / setter / info
	
	// getter :: 필드 값을 반환해주는 메소드
	public String getName(){
		return name;
	}
	public String getBean() {
		return bean;
	}
	public String getSize() {
		return size;
	}
	public int getPrice() {
		return price;
	}
	
	// setter :: 필드값을 셋팅 해주는 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setBean(String bean) {
		this.bean = bean;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// info()
	public String info() {
		String info = "[상품명 : " + name 
						+ ", 원두 : " + bean 
						+ ", 사이즈 : " + size 
						+ ", 가격 : " + size 
						+ "]";
		return info;
	}
	
}
