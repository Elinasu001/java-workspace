package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * if ~ else
	 * 
	 * [표현법]
	 * 
	 * if(조건식){
	 * 		조건식의 결과가 true 였을 때 실행할 코드 	- a
	 * } else {
	 * 		조건식의 결과가 false 였을 때 실행할 코드 	- b
	 * }
	 * 
	 * -> 조건식의 결과가 true 일 경우 a 를 실행
	 * -> 조건식의 결과가 false 일 경우 b 를 실행
	 * 
	 */
	
	public void method1() {
		
		// 사용자에게 정수를 입력받아서 0보다 큰지 아닌지 판별 후 출력
		System.out.println("정수를 입력해주세요 > ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		//System.out.println(num);
		
		if(num > 0) {
			System.out.println("입력값이 0보다 큽니다!");
		} else {
			System.out.println("입력값이 0보다 크지 않습니다!");
		}
		
//		if(!(num > 0)) {
//			System.out.println("입력값이 0보다 크지 않습니다!");
//		} 
		
		// if 문의 조건식의 결과가 true 일 경우 => else 블럭을 건너 띔
		// 불필요한 연산이 줄어듬 => 처리 속도가 향상됨.
		
		
	}
	
	/*
	 * if ~ else if 문
	 * 
	 * [표현법]
	 * 
	 * if(조건식1) {
	 * 		조건식이 1이 true 일 경우 실행할 코드
	 * } else if(조건식2) {
	 * 		조건식이 2가 true 일 경우 실행할 코드
	 * } else if(조건식3) {
	 * 		조건식이 3이 true 일 경우 실행할 코드
	 * } else if(조건식4) {
	 * 		조건식이 4가 true 일 경우 실행할 코드
	 * } else {
	 * 		앞에서 기술했던 모든 조건들이 false 일 경우 실행할 코드
	 * }
	 * 
	 */
	public void method2() {
		//정수를 입력받아서 0보다 큰지 / 0인지 / 0보다 작은지 출력
		System.out.println("정수를 입력해주세요 > ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
//		if(num == 0) {
//			System.out.println("0입니다.");
//		}else if(num < 0) {
//			System.out.println("0보다 작습니다.");
//		}else {
//			System.out.println("0보다 큽니다.");
//		}
		
		// 가장 많이 들어오는 값부터 가장 적게 들어오는 수로 차례대로 들어오는 게 좋다.
		if(num > 0) {
			System.out.println("0보다 큽니다.");
		}else if(num < 0) {
			System.out.println("0보다 작습니다.");
		}else {
			System.out.println("0입니다.");
		}
	}
	
	public void ageCheck() {
		// 사용자에게 나이(정수)를 입력받고
		// 입력받은 나이에 따라서 각기 다른 내용을 출력해주세요.
		// 1 ~ 12 : 어린이입니다.
		// 13 ~17 : 청소년입니다.
		// 18 ~   : 성인입니다.
		// 0, -   : 외계인입니다.
		
		System.out.println("나이를 입력해주세요. > ");
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
//		if(age >= 1 && age <= 12) {
//			System.out.println("어린이 입니다.");
//		} else if(age >= 13 && age <= 17) {
//			System.out.println("청소년 입니다.");
//		} else if(age >= 18) {
//			System.out.println("성인 입니다.");
//		} else {
//			System.out.println("외계인 입니다...");
//		}
		
		if(age < 0) { // 가장 많이 들어오는 값부터 가장 적게 들어오는 수로 차례대로 들어오는 게 좋다.
			System.out.println("올바른 나이를 입력해주세요.");
		} else if (age >= 18) {
			System.out.println("성인 입니다.");
		} else if (age <= 12) {
			System.out.println("어린이 입니다.");
		} else {
			System.out.println("청소년 입니다.");
		} 
	}
		
		
	}
