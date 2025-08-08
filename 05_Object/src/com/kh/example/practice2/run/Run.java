package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		Product pr = new Product();
		
		pr.setPname("아이폰");
		pr.setPrice(100);
		pr.setBrand("애플");
		
		pr.information();
	}

}
