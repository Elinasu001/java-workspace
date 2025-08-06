package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Cafe;

public class Run {
	
	// 캡슐화(encapsulation)
	// 값을 담는 구조체
	// 속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것
	// 정보은닉(information hiding)
	
	// 접근제한자 (예약어) 반환형 메소드식별자(매개변수)
	public static void main(String[] args) {
	
		// 변수 선언 /  대입연산자 / 객체 생성 == 메모리에 적재
		Cafe cafe = new Cafe();
		
		// public 일 경우 외부로 부터 값을 받아와서 조작할 수 있다.
		// 단, 객체 간의 정보는 서로 모를 수록 좋다.
		// 1. Cafe.java 접근제한자 : public -> private 변경
		/*
		===	public ===
		cafe.name = "KH카페";
		System.out.println(cafe.name);
		cafe.sinatureMenu = "KH커피";
		cafe.sinatureMenuPrice = -500;
		System.out.println(cafe.sinatureMenu);
		System.out.println(cafe.sinatureMenuPrice);
		*/
		
		// 필드가 보이지 않아서(외부에서 접근이 불가능해서)오류 발생!
		// 접근제한자를 public에서 private으로 변경했기 때문에 직접 접근이 불가능
		// 직접 접근이 불가능하기 때문에 간접적으로 접근할 수 있는 방법을 만들어주어야 함
		// Cafe 라는 클래스에 getter / setter 라는 메소드를 만들기
		// cafe.signatureMenuPrice = -500;
		
		// *** 객체의 내부적 관점 / 외부적 관점
		/*
		===	public ===
		cafe.dishWash(); // 만약, Cafe.java의 dishWash(); 를 주석 처리 할 경우 빨간 줄이 그어짐.
		cafe.cleaning();
		cafe.windowCleaning();
		 */
		
		//cafe.open(); // private (만약, Cafe.java의 dishWash(); 를 주석 처리 할 경우 빨간 줄이 그어지지 않음. == 유지보수에 좋음.)
		/*
	 	깨끗하게 빡빡!
		청소도 빡빡!
		유리도 빡빡!
	 	*/
		// 5000을 넘길려면
		// 메소드 호출 부에서는 오로지 값만 넘길 수 있음.
		cafe.setSignatureMenuPrice(5000);
	}

}
