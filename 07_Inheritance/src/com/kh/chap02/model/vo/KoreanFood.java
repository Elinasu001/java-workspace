package com.kh.chap02.model.vo;
//			상속하는				상속받는
//			부모클래스				자식클래스
//			슈퍼클래스				서브클래스
//			상위클래스				하위클래스
//			조상클래스				후손클래스
//			확장클래스				파생클래스

public class KoreanFood extends Food {
	// 필드부
	// foodName, material, cookingTime, spicy
	// [ Food 클래스가 가지고 있음 ]
	private int spicy;
	
	// 생성자부
	public KoreanFood() {
		super();
		System.out.println("응애 나 자식");
	}
	
	// 메소드부
	public int getSpicy() {
		return spicy;
	}
	
	public void setSpicy(int spicy) {
		this.spicy = spicy;
	}
	
}
