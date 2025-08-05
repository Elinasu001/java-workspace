package com.kh.chap03.escape;

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
		}
	}
}
