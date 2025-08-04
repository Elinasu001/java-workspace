package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	public void method0() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 층 가세요? (B1 / B2 / B3) > ");
		String floor = sc.nextLine();
		//System.out.print(floor);
		
		// B1 B2 B3
		switch(floor) {
		case "B1" : System.out.println("지하 1층입니다. 문이 열립니다."); 
		break;
		case "B2" : System.out.println("지하 2층입니다. 문이 열립니다."); 
		break;
		case "B3" : System.out.println("지하 3층입니다. 문이 열립니다."); 
		break;
		}
		// 일반적으로 break 문은 switch의 case마다 달려있음.
		
	}
	/*
	 * switch 문
	 * 
	 * [표현식]
	 * 
	 * switch(case문에 기술할 동등비교할 대상){
	 * case 정수, 문자, 실수, 문자열 : 실행할 코드;
	 * }
	 * 
	 * switch(정수 || 실수 || 문자 || 문자열){
	 * case 값1 : 실행할 코드 a; // 동등비교대상 == 값1 true 일 경우 실행할 코드 a를 수행
	 * break;				  // switch 문을 빠져나감
	 * case 값2 : 실행할 코드 b; // 동등비교대상 == 값2 true 일 경우 실행할 코드 b를 수행
	 * break;
	 * case 값2 : 실행할 코드 n; // 동등비교대상 == 값n true 일 경우 실행할 코드 n을 수행
	 * break;
	 * default : 실행할 코드 // == else
	 * } 
	 */
	
	// 메뉴 주문
	// 부대찌개, 떡갈비, 제육볶음, 칼국수, 수제비
	public void method1() {
		
		// 사용자에게 구매할 음식의 이름을 입력받아
		// 각 음식바다 가격을 출력해줄 것
		
		// 부대찌개, 떡갈비, 제육볶음, 칼국수, 수제비
		// 11000,  13000,   9000, 10000, 7000 
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택해주세요(부대찌개, 떡갈비, 제육볶음, 칼국수, 수제비) > ");
		String menu = sc.nextLine();
		//System.out.println(menu);
		// 다시 보기 ** 문자열 == 은 equals 으로 !
		switch(menu) {
		case "부대찌개" : System.out.println("11000 원입니다.");
		break;
		case "떡갈비" : System.out.println("13000 원입니다.");
		break;
		case "제육볶음" : System.out.println("9000 원입니다.");
		break;
		case "칼국수" : System.out.println("10000 원입니다.");
		break;
		case "수제비" : System.out.println("7000 원입니다.");
		break;
		default : System.out.println("그런 메뉴는 존재하지 않습니다.");
		}
		
	}
	
}
