package com.kh.chap04.run;

import java.util.Arrays;

import com.kh.chap04.controller.FieldController;
import com.kh.chap04.controller.StaticController;

public class Run {

	public static void main(String[] args) {
		
		System.out.println(StaticController.str); // static 에 올라가 있기 때문에 객체 생성 없이 사용 가능.
		
		
		FieldController fc = new FieldController();
		// 1. FieldController 자료형으로 fc 라는 이름의 지역변수를 선언
		// 2. 객체 생성(new 키워드를 만났을 때) **global 멤버변수 할당
		// 3. 주소값을 대입
		System.out.println(fc.global);
		
		fc.checkVariable(50);
		// checkVariable호출 == parameter(매개변수) 할당 및 초기화
		
		
		// checkVariable 호출 종료 시 
		// parameter, local 지역변수 소멸 (stack 에 올라가있던)
		System.out.println(fc.global); // global 은 살아있음.
		// global 주소를 끊어주려면? null 값을 준다.
		fc = null; // global 사용 불가능
		//System.out.println(fc.global);
		
		// 목표 : str 출력하기 (static)
		/*
		StaticController sc = new StaticController();
		System.out.println(sc.str);
		*/
		System.out.println(StaticController.str);// static 은 StaticController 클래스 변수에 바로 접근해서 출력한다.
		System.out.println(StaticController.JAVA_VERSION);
		
		System.out.println(Arrays.toString(new int[2])); // static 특 )  Arrays.toString 누워있음.
		System.out.println(Math.random()); // 0.0 ~ 0.9999~ static 특 
		System.out.println(Math.PI); // final 특) 두꺼움 
		
		
	}

}
