package com.kh.chap02.loop;

public class B_While {
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * 초기식; 			// 필수는 아님
	 * 
	 * while(조건식){
	 * 		반복적으로 실행하고자 하는 코드;
	 * 		증감식; 		// 필수는 아님
	 * }
	 * 
	 * while 문의 조건식의 결과값이 true 일 경우 반복적으로 실행하고자 하는 코드가 실행
	 * 
	 * for			=> 개발자가 반복의 횟수를 명확하게 알고 있을 때 사용.
	 * while 		=> 개발자가 반복의 횟수를 가늠할 수 없을 때 사용.
	 * 
	 * 무한반복
	 * for(;;) :: 아 뭔가 빼먹었나?
	 * while :: 아 계속 반복하기 위함이구나.
	 * 
	 * 
	 */
	
	public void method1() {
		while(true) { // 무한반복의 용도
			System.out.println("계속 반복할거예요~");
		} // 빨간색 누를 경우 멈춤
	}
	
	public void method2() {
		
		// 초기식, 조건식, 증감식
		int i = 0; // 메서드 블럭에서 계속 차지 하고 있음
		
		while(i < 3) {
			i++; // 1 2 3
			System.out.println(i);
//			i++;// 0 1 2 // 무조건 이자리가 아닐 수도 있음. 상단에 올라갈수도 있다.
		}
	}
	
	public void method3() {
		
		// 1 ~ 10 까지의 정수 중 짝수의 합 출력
		// 55 : 1 ~ 10 까지의 정수 합
		// 2550
		// System.out.println(2 + 4 + 6 + 8 + 10); : 1 ~ 10 짝수의 합 출력
		
		int i = 1;
		int sum = 0; // 2. 합계를 저장해둘 변수
		
		while(i <= 10) { // 1. 1 ~ 10 까지의 정수 중 짝수의 합 출력
			
			if(i % 2 == 0) { // 3. 짝수의 합 출력
				//System.out.println(i);
				sum += i;
			
			}
			
			i++;
		}
		
		System.out.println("합계 : " + sum);
		
	}
	
	public void method4() {
		
		// 1부터 시작해서 
		// 1 ~ 10 사이의 랜덤한 정수까지를 모두 더한 합계를 출력
		// 1  5
		// 1 2 3 4 5 
		// random : 무작위
		// Random 이라는 클래스가 존재
		// Math라는 클래스가 가지고 있는 random()를 호출해서 만들어 볼 예정
		// => 별칭 짓기
		
		// Math math = new Math();
		
		//Math.random();
		//System.out.println(Math.random()); //0.36415056389364064
		
		// random()의 결과값 : 0.0 ~ 0.9999999999999999 
		
		// 1단계. random() 호출 결과 체크
		double num = Math.random();
		//System.out.println(num);
		
		// 1 ~ 10
		
		// 2_1. num 에 10을 곱하면?
		//System.out.println(num * 10);
		// 0.0 ~ 9.9999999999999
		
		// 2_2. int형으로 강제형 변환
		// 	0 ~ 9 소수점 뒤에가 날아감
		//System.out.println((int)(num * 10));
		
		//2_3. +1
		//  1 ~ 10
		
		int randomNum = (int)(Math.random() * 10) + 1;
		System.out.println("가공이 끝난 무작위 정수 : " + randomNum);
		// (int)(Math.random() * 몇개의 랜덤값) + 시작값;
		
		// 3단계. 누적합계 구하기
		// 1부터 랜덤한 수 (1 ~ 10) 까지를 모두 더한 합계
		
		int i = 1;
		int sum = 0;
		
		// 1부터 10 까지중 무작위까지 반복하겠다.
		while(i <= randomNum) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + randomNum + "까지 더한 결과 : " + sum);
		
		
	}
	
	
}
