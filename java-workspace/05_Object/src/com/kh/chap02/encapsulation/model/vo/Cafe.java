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
	private String signatureMenu;
	private int signatureMenuPrice; // 최소한 1 이상의 정수값이 들어가야됨. 
	
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
	
	// 데이터를 기록 및 수정하는 기능의 메소드 : setter()
	/*
	 * DTO(Data Transfer Object) -> setter를 만들어줌
	 * VO(Value Object) -> 일반적으로 setter메소드를 구현하지 않음(공간만 만들어줌.)
	 * 
	 * DTO는 2달뒤에 배울 건데 DTO학습 전까지만 VO클래스에 setter를 구현해서 사용.
	 * 
	 * setter 만들기 규칙
	 * 1. setter메소드는 외부에서 접근이 가능해야 하기 때문에 접근제한자 public 사용.
	 * 2. set 필드명으로 식별자를 작성하며 낙타봉표기법(CamelCase)를 꼭 지키도록 한다.
	 * 
	 * 3.(예외상황) 우리는 당분간 항상 모든 필드에 대해서 setter를 구현합니다.
	 */
	
	// 고유 메뉴의 가격정보를 기록 및 수정할 수 있는 메소드
	// signatureMenuPrice
	public void setSignatureMenuPrice(int signatureMenuPrice) { // 매개변수 식별자는 필드명과 동일하게 작성한다.
		System.out.println("setter에서 전달 받은 정수 값 : " + signatureMenuPrice);
	}
	
	
	
	
}
