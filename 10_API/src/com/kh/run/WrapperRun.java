package com.kh.run;

public class WrapperRun {

	public static void main(String[] args) {
		
		/*
		 * Wrapper Class
		 * => 기본자료형을 참조자료형으로 포장해주는 클래스들을 래퍼클래스라고 함
		 * 
		 * 기본자료형						Wrapper Class
		 * 			 <------------>
		 * boolean						Boolean
		 * char							Character
		 * byte							Byte
		 * short						Short
		 * int							Integer
		 * long							Long
		 * float						Float
		 * double						Double
		 * 
		 */
		// 기본자료형을 객체로 취급해야 하는 경우
		// 메소드 매개변수 자료형이 기본자료형이 아닌 참조자료형만 사용 가능한 경우
		// 다형성을 적용해야겠다!!
		
		int num1 = 10;
		int num2 = 15;
		
		// Object.equals()
		// Integer i1 = new Integer(num1); // (비권장 방법)그어져 있을 경우 : 버전 올릴 경우 못쓰게 될 확률이 크니 다른 문법으로 바꿔 쓰라고 알려줌.
		// System.out.println(i1);
		
		// 기본자료형 => Wrapper 로 포장 (참조자료형)
		Integer i1 = num1;
		Integer i2 = num2;
		System.out.println(i1.equals(i2)); // false
		System.out.println(i1.compareTo(i2)); // -1 : 자바가지고 정렬구조 할경우 
		
		// a.compareTo(b)
		// a가 b보다 크면 1을 반환
		// a가 b보다 작으면 -1을 반환
		// 같으면 0반환
		
		// "123", "1.1"
		String str1 = "10";
		String str2 = "1.1";
		
		System.out.println(str1 + str2); //101.1 문자 + 문자

		// 파싱(parsing) == 특정 데이터를 규칙에 따라서 분석하고 해석하는 과정
		int i = Integer.parseInt(str1); // 문자를 정수 규칙에 따라 정수로 반환
		System.out.println(i); // 10
		
		double d = Double.parseDouble(str2);
		System.out.println(d); // 1.1
		
		System.out.println(i + d); // 11.1 
		// 10(정수) 과 1.1(실수) 더할 수 없는데 어떻게 더해졌는지? System.out.println((double)i + d);
		
		// tip!! int i 를 string 으로 바꾸고 싶을 경우?
		String strInteger = i + "";
		System.out.println(strInteger); // 10
		// 숫자랑 문자 더할 경우는 ? 숫자~~
		
		
		
		
	}

}
