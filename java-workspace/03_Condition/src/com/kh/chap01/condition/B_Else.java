package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * if ~ else
	 * 
	 * [표현법]
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
		}// if 스코프가 끝나면 이 지점으로 간다.
		
//		if(!(num > 0)) {
//			System.out.println("입력값이 0보다 크지 않습니다!");
//		} 
		
		
	}
}
