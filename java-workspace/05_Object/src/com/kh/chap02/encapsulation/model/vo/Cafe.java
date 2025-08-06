package com.kh.chap02.encapsulation.model.vo;

// 필드부, 생성자부, 메소드부
public class Cafe {

	// 필드(Field)부
	
	/*
	 * 객체가 가질 수 있는 속성
	 * 
	 * 정보(Data)를 담는 부분
	 * 
	 * 필드 == 멤버변수
	 * 
	 * 접근제한자 자료형 필드식별자;
	 */
	// private : 외부에서 여기로 접근할 수 없다.
	private String name;
	private String address;
	private String sinatureMenu;
	private int sinatureMenuPrice; // 최소한 1 이상의 정수값이 들어가야됨. 
	
	// 생성자(Constructor)부
	
	// 메소드(Method)부
	/*
	 * 기능(method)를 구현하는 부분
	 * - 상단 값과 관련된 기능을 구현해야됨.
	 * 
	 * - static과 매개변수는 있을 수도 없을 수도 있음.
	 * 
	 * 접근제한자 (예약어(있을 수도 없을 수도 있음) ex) static) 반환명 메소드식별자(매개변수){
	 * 		메소드 호출 시 실행할 코드;
	 * }
	 * 
	 * 접근제한자	: 호출할 수 있는 범위를 제한할 수 있음.
	 * 반환형 	: void => return 할 때 돌려줄 값이 없음. 
	 * 				반환 시 결과 값의 자료형을 명시해준다.(즉, 값을 돌려주고 싶을 경우)
	 * 매개변수	: 메소드 호출 시 전달 값을 받아주는 변수
	 * 				메소드 범위에서만 사용 가능.(즉, 생략도 가능하다.)
	 * 
	 */
	
	public void open() {
		dishWash();
		cleaning();
		windowCleaning();
	}
	
	private void dishWash() {
		System.out.println("깨끗하게 빡빡!");
	}
	
	private void cleaning() {
		System.out.println("청소도 빡빡!");
	}
	
	private void windowCleaning() {
		System.out.println("유리도 빡빡!");
	}
	
}
