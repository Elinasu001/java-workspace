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
	
	public void method2() {
		
		boolean loginCheck = false; // 로그인 상태를 저장해둔 변수
		
		if(loginCheck == false) {
			System.out.println("네이버를 더 안전하고 편리하게 이용해보세요.");
			System.out.println("NAVER 로그인");
			System.out.println("아이디 찾기 | 비밀번호 찾기 | 회원가입");
		}
		
		if(loginCheck) {
			System.out.println("홍길동님 환영합니다 :)");
			System.out.println("메일 | 카페 | 블로그 | 쇼핑 | 예약");
		}
		
	}
	
	
}
