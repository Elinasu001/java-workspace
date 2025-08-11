package com.kh.chap02.model.vo;

public class JapanessFood extends Food {
	// 필드부
	// 부모로부터 상속받은 부분은 기술하지 않는다!
	private int fresh;
	
	// 생성자부
	public JapanessFood() {
		
	}
	
	public JapanessFood(String foodName, String material, int cookingTime, int fresh) {
		super(foodName, material, cookingTime);
		this.fresh = fresh;
	}
	
	// 메소드부 : getter setter
	public int getFresh() {
		return fresh;
	}
	public void setFresh(int fresh) {
		this.fresh = fresh;
	}
	
	
	// 메소드를 상속받았는데 마음에 안들어 발전시키고 싶을 경우
	// 다시 쓸 수 있음 ==> 재정의
	public String information() {
		/*
		return "음식명 : " + super.getFoodName() 
				+ ", 주재료 : " + super.getMaterial()  
				+ ", 조리시간 : " + super.getCookingTime() 
				+ ", 신선도 : " + fresh;
		*/
		return super.information() + ", 신선도 : " + fresh;
	}
}
