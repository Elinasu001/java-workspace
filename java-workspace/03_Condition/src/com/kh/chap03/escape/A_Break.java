package com.kh.chap03.escape;

import java.util.Scanner;

public class A_Break {
	/*
	 * ** 주의사항 : switch 문 내부에 작성하는 break 문과는 구분을 해야할 필요가 있음!
	 * 			    switch 문 내부에 있는 break 는 switch 문을 빠져나가는 용도로 사용
	 * 
	 * break : break 문을 만나는 순간 "가장 가까운 반복문"을 빠져나감
	 * 			break; 문이 속해 있는 반복문 "한 겹" 만 빠져나감 !!!
	 */
	
	public void method1() {
		
		//System.out.println("안녕 나는 메소드 1이얌~");
		
		// 무한 반복하면서 랜덤한 정수(1 ~ 100)를 생성해서 출력
		// 50이 생성되면 반복을 중단!
		
		while(true) {
			
			int num = (int)(Math.random() * 100) + 1;
			
			System.out.println(num);
			
			// 생성된 정수값이 50이면 멈춰 !
			if(num == 50) {
				System.out.println("멈춰 !");
				break;
			}
		}// 반복문을 멈출 경우 자신이 포함된 가장 가까운 반복문으로 나감.
	}
	
	public void method2() {
		
		System.out.println("========= 주도적으로 사용할 반복문 ==========");
		// 무한 반복하면서 사용자에게 매 번 문자열을 입력받은 후
		// 해당 문자열의 길이를 출력
		// 단, 사용자가 입력한 문자열이 "exit"과 같다면 반복을 종료
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("아무거나 쓰셈(대신 종료를 원하신다면 'exit'을 입력해주세요) >");
			String keyword = sc.nextLine();
			
			System.out.println(keyword + "은(는) " + keyword.length() + "글자 입니다!");
			
			if(keyword.equals("exit")) {
				System.out.println("호로구래무를 종료합니다~");
				break;
			}
		
		}
	}
}
