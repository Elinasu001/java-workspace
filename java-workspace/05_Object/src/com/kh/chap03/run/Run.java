package com.kh.chap03.run;

import com.kh.chap03.model.vo.Coffee;

public class Run {

	public static void main(String[] args) {
		
		// Coffee 라는 클래스(설계도)를 가지고 객체 생성
		// 1. Coffee(참조 자료형) : 클래스를 만든다는 행위 == 사용자 정의 자료형 만들겠다.
		// 2. coffee(변수명 공간)
		// 1 + 2 : 여러 개의 자료형에 여러 개의 값을 보관 + 기능 
		// 3. = (대입)
		// 4. new Coffee (객체 생성 (instance 화))
		// 주소값 저장
		Coffee coffee = new Coffee();
		
		System.out.println(coffee.info());

	}

}
