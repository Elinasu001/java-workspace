package com.kh.chap01.condition;

public class A_If {
	
	/*
	 * (단일) if문
	 * 
	 * [표현문]
	 * 
	 * if(조건식) {
	 * 
	 * 	조건식이 true 일 경우 실행하고자 하는 코드;
	 * 
	 * }
	 * 
	 * => 조건식이 결과가 true일 경우 : if문 Scope({})안의 코드가 수행
	 * => 조건식이 결과가 false일 경우 : if문 Scope({})를 건너뜀!
	 * 
	 */
	
	public void method1() {
		
		//System.out.println("모범시민맞다~~");
		
		if(0 < 1) {
			System.out.println("0이 1보다 작아용");
		}
		
		// if 문의 조건식 자리에는 결론적으로 true 아니면 false 값이 들어가도록 만들어야함!
		if(false) {
			System.out.print("얘는 죽었다 깨나도 안나옴");
		}
		
		if(true) {
			System.out.print("조건식 자리에는 최종적으로 true가 와야함");
		}
	}
}
