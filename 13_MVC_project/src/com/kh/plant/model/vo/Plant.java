package com.kh.plant.model.vo;


//Model : 데이터 관련 작업
// VO : 프로그램 실해 중 만들어진 값(Value)를 담는 객체(Object)
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
	
	// 생성자 단축키
	// Alt += shift + s => o -> Alt + g
	public Plant(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	
	// getters setters 단축키
	// Alt += shift + s ⇒ Generate getters and setters (대고 있는 상태에서)> r ⇒ alt + a ⇒ alt + r
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	// override tostring 단축키
	// Alt + Shift + s => Alt + Shift + s => s => Alt + g
	@Override
	public String toString() {
		return "Plant [name=" + name + ", type=" + type + "]";
	}
	
	
	
	
}
