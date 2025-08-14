package com.kh.run;

//import java.lang*

public class MathRun {

	public static void main(String[] args) {
		
		// JAVA API (Application Programming Interface) :: 응용프로그램을 만들 때 사용하는 인터페이스
		
		// Math 클래스 (수학)
		//Math math = new Math(); // The constructor Math() is not visible
		//Math.random();
		/*
		 * - 모든 필드와 메소드가 전부 다 static
		 * - 객체를 생성할 필요가 없으므로 기본생성자의 접근제한자가 private
		 * - JDK: java.lang 패키지에 있는 친구들(Math, Object..) 클래스 외부에서 사용시 import 해야되는데 이 패키지에 있는 것은 extends object 상속 되어있으며 java.lang 패키지에 있음.
		 */
		
		// 필드
		// 파이 => Math 클래스 내에 상수필드로 정의 되어있음
		System.out.println(Math.PI); //3.141592653589793
		
		// 메소드(보통 소수점 처리하는건 자바에서는 안좋기는 한데 반올림 등등 쓰는 경우는 있음)
		// 1. 제곱 => Math.pow()
		System.out.println("2의 10제곱 : " + Math.pow(2, 10)); // 2의 10제곱 : 1024.0
		// 2. 절대값 => Math.abs(int, double, long, float)
		System.out.println("절대값 : " + Math.abs(-33)); // 절대값 : 33
		
		double num = 8.14141414;
		
		// 1. 올림 => Math.ceil(double) : double
		System.out.println("올림 : " + Math.ceil(num)); // 올림 : 9.0
		
		// 2. 버림 => Math.floor(double) : double
		System.out.println("버림 : " + Math.floor(num)); // 버림 : 8.0
		
		// 3. 반올림 => Math.round(double) : long
		System.out.println("반올림 : " + Math.round(num)); // 반올림 : 8
		
		
	}

}
