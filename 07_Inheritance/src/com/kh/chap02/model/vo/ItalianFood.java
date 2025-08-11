package com.kh.chap02.model.vo;

public class ItalianFood extends Food {
	
	// 필드부
	private int oil;
	
	// 생성자부
	public ItalianFood() {
		super();
		System.out.println("응애 나 자식2");
	}
	public ItalianFood(String foodName, String material, int cookingTime, int oil) {
		// 접근제한자가 private 이기 때문에 안보임
		// 해결방법 : 
		// 1. 부모클래스의 접근제한자를 (protected)로 바꿔버림 => 캡슐화 원칙 X => 적합한 방법은 아님
		// 2. 부모클래스의 접근제한자 public 인 setter 메소드를 호출
		/*
		super.setFoodName(foodName);
		super.setMaterial(material);
		super.setCookingTime(cookingTime);
		*/
		
		// 3. 부모클래스가 가지고 있는 매개변수 생성자를 호출 ★ 순서 바꾸면 안됨.(부모 => 자식)
		super(foodName, material, cookingTime);
		this.oil = oil; // 내꺼는 내 필드에서 가져와야된다.
	}
	
	
	// 메소드부
	public int getOil() {
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	
}
