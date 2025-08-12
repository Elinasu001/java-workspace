package com.kh.chap03.model.vo;

public abstract class Sports { // 추상 클래스
	
	private int peopleCount;
	public Sports() {}
	public Sports(int peopleCount) {
		this.peopleCount = peopleCount;
	}
	
	public int getPeopleCount() {
		return peopleCount;
	}
	public void setPeopleCount(int peopleCount) {
		this.peopleCount = peopleCount;
	}
	
	// 자식들에게 오버라이딩 해서 다형성을 적용시켜 사용할 용도의 메소드
	/*
	public void rule() {
		System.out.println("저는 규칙이에용 ㅎㅎ;;");
	}
	*/
	// "추상" abstract
	
	// [추상 메소드 표현법]
	// 접근제한자 abstract 반환형 식별자();
	// 추상 메소드
	public abstract void rule();
		
}
