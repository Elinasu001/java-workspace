package com.kg.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	
	/*
	 * 프로그램 실행 시 발생하는 예외들
	 * RuntimeException
	 * 
	 * - NullPointerException : 주소값 객체를 참조했더니 null 값이 들어가있을 경우 발생하는 예외
	 * - ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근했을 때 발생하는 예외
	 * - ClassCastException : 허용할 수 없는 형변환을 진행할 경우 발생하는 예외
	 * - AritmeticException : 나누기 연산을 0으로 나누면 발생하는 예외
	 * - NegativeArraySizeException : 배열을 할당할 때 크기를 음수로 지정하면 발생하는 예외
	 * ...
	 * 
	 * RuntimeException 과 관련된 예외들은 공통점이 있음
	 * - 개발자가 예측이 가능함
	 * 
	 */
	
	// AritmeticException : 1. 5 2. 0 이 들어갈 경우 발생 => 2번째에 0 들어가면 안되는 걸 염두하기
	public void method1() {
		
		// 사용자에게 두 개의 정수값을 입력받아서 나눗셈을 한 뒤 결과를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력해주세요 > ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력해주세요 > ");
		int num2 = sc.nextInt();
		
		
		// 방법 1. 예외발생 자체를 원천 차단해버림
		/*
		if(num2 != 0) {
			System.out.println("연산 결과 : " + (num1 / num2));
		} else {
			System.out.println("너 혼꾸녕 나고싶어?");
		}
		*/
		
		// 방법 2. 예외처리를 진행
		// 예외처리 :
		// 예외 상황을 감지하고 예외상황이 발생 시 
		// 프로그램이 비정상적인 종료가 되는 것을 방지하고 적절한 대응 조취를 취하는 것
		/*
		 * try ~ catch 문
		 * 
		 * [표현법]
		 * try{
		 * 
		 * 		(num1 / num2) // 예외가 발생할 수도 있는 구문
		 * 
		 * } catch(발생할예외클래스명 변수명) { => 매개변수
		 * 		
		 * 		해당 예외가 발생했을 때 실행할 구문
		 * 		
		 * }
		 * 
		 */
		
		try {
			System.out.println(num1 / num2); // 막고 
			System.out.println("올바른 정수 입력!"); // 예외 일어나지 않을 경우
		
		} catch (ArithmeticException e) {
			
			System.out.println("두 번재 정수에 0을 입력하시면 나눌 수가 없습니다."); // 방지
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	public void homeWork() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("메뉴를 선택해주세요");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 추가하기");
			System.out.println("2. 검색하기");
			
			int menuNo = 0;
			
			try {
				menuNo = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("숫자만 넣어이눔아");
				// 예외처리 시 catch 문에 적어야하는 내용이 출력문은 아님
			}
			sc.nextLine();
			
			System.out.println(menuNo + "번 메뉴를 선택하셨습니다.");
			
		}
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 (0은 제외) > ");
		
		try {
			int num = sc.nextInt(); // 예외발생 : InputMismatchException
			
			System.out.println("100을 입력값으로 나눈 결과" + (100/ num)); //예외발생 : ArithmeticException
		
		} catch(InputMismatchException e) {// 1. 먼저 입력받은 값이 정수인지 판단
			
			System.out.println("숫자로 된 정수값이 아닙니다.");
			
		} catch(ArithmeticException e) {// 2. 정수가 맞다면 0인지 판별
			
			System.out.println("0은 안돼요!!");
		}
		
		
		
		System.out.println("프로그램 종료");
	}
	
}
