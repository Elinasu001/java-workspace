package com.kh.chap03.model.vo;

/*
 * [표현법]
 * 껍데기만 필요할 경우 :: 
 *  접근제한자 abstract class 클래스식별자{
 *  
 *  }
 *  
 *  클래스 내부에 요소로 추상메소드를 하나라도 선언하는 순간
 *  클래스 또한 abstract 키워드를 붙여서 추상 클래스로 정의해야함!
 * 
 *  추상 클래스 == 필드 + 메소드 + 추상메소드(생략가능)
 *  --> 추상 메소드가 존재하지 않아도 추상클래스로 정의가능
 *  
 *  => 기술적으로 개발자가 판단했을 때 이 클래스는 부모클래스 역할로만 사용할 것이고,
 *  	객체 생성은 불가능해야한다 라고 생각이 들면 추상클래스로 선언
 *  
 *  => 개념적으로는 개발자가 판단했을 때 해당 클래스가 구체적으로 구현된 상태가 아닌것 같다 하느
 *  	생각이 들면 추상 클래스로 선언
 *  
 *  => 객체 생성은 불가능하게 하고 공통적인 속성 및 메소드 그리고 타입만 다형성을 적용하게 하고싶다
 * 
 */


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
