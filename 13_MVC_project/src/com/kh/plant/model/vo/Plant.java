package com.kh.plant.model.vo;

public class Plant {
	// VO 만들기 졸업
	
	// 기본 생성자
	// Generate  Constructor using Field
	// Alt + Shift + s => o => Alt + d => Alt + g
	private String name;
	private String type;
	public Plant() {
		super();
	}
	
	// 매개변수 생성자
	//Generate getters and setters
	// Alt += shift + s => o -> Alt + g
	public Plant(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	
	
	
}
