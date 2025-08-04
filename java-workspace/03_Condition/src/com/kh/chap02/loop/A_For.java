package com.kh.chap02.loop;

public class A_For {
	
	public void method0() {
		/*
		System.out.println("hello world!!!!");
		System.out.println("hello world!!!!");
		System.out.println("hello world!!!!");
		System.out.println("hello world!!!!");
		*/
		// 반복해야하는 횟수가 328765번 이라면...?
		
		for(int i = 0; i < 5; i++) {
			System.out.println("돌려돌려~~");
		}
	}
	
	/*
	 * for문
	 * 
	 * for(){
	 * 		
	 * }
	 * 
	 * 괄호 안은 반복의 횟수를 지정하는 부분
	 * 초기식; 조건식; 증감식 세가지의 이루어짐.
	 * ;; 세미콜론으로 구분함.
	 * 
	 *  
	 *  [표현법]
	 *  
	 *  for(초기식; 조건식; 증감식){
	 *  	반복적으로 실행하고자 하는 코드
	 *  }
	 * 
	 * - 초기식 : 반복문을 시작할 때 "초기에 단 한번만 실행" 될 구문
	 * 			반복을 할 때 필요한 변수를 선언하고 초기화 하는 구문 (제어변수) => int i = 0;
	 * 
	 * - 조건식 : "반복문이 실행될 조건"을 작성하는 구문
	 * 			조건식의 결과가 true 일 경우 반복을 수행
	 *			조건식의 결과가 false 일 경우 반복문을 멈추고 for 문 블럭을 빠져나옴=> i < 5; 
	 * 
	 * - 증감식 : "반복문을 제어하는 변수에 대입된 값" 을 증감하는 구문
	 * 			보통 초기식에서 선언된 변수를 가지고 증감식 작성
	 * 			이 때, 보편적으로 증감연산자를 사용함
	 */
	
	public void method1() {
		//System.out.println("지인짜 단순하게 출력");
		
		// 1
		// 2
		// 3
		// 3
		// 4
		// 5
		
		// 단순 출력_1
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
		
		// 단순 출력_2
//		System.out.println("1\n2\n3\n4\n5");
		
		// for문 출력
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(i);
//		}
		
		for(/* 1 */int i = 1; /* 2 */i <= 5; /* 4 */i++) {
			/* 3 */ System.out.println(i + "번 반복");
		}
		
	}
	
}
