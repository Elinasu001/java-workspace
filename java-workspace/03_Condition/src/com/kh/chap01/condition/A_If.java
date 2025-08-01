package com.kh.chap01.condition;

import java.util.Scanner;

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
	
	public void lunchMenu() {
		
		// 오늘의 날씨를 입력받아서
		Scanner sc = new Scanner(System.in);
		
		// 더움 / 맑음 / 비옴
		System.out.println("오늘의 날씨는 어떤가요(더움 / 맑음 / 비옴) > ");
		
		String weather = sc.nextLine();
		// System.out.println(weather);
		
		// 점심메뉴를 추천해주는 프로그램
		// 비온을 입력했다면 김밥 천국을 가라고 하자
		
		// 사용자가 입력한 값과 "비옴"이라는 문자열값을 동등비교해서 일치하는 지 비교
		// weather "비옴"
		// System.out.println(weather == "비옴");
		// 문자열 비교
		// 동등비교연산자(==)를 사용할 수 없음
		// .equals()
		// System.out.println(weather.equals("비옴"));
		
		
		// 조건
		// 만약에 사용자가 입력한 문자열 값이 "비움"과 일치하다면
		if(weather.equals("비옴")) {
			System.out.println("김밥천국에서 스페셜정식드세요~");
		}
		
		// 만약에 사용자가 입력한 문자열 값이 "더움"과 일치하다면
		if(weather.equals("더움")) {
			System.out.println("김밥일번가에서 냉모밀 드세요~");
		}
		
		// 만약에 사용자가 입력한 문자열 값이 "맑음"과 일치하다면
		if(weather.equals("맑음")) {
			System.out.println("샌드위치 드세요");
		}
		
	}
	
	public void method3() {
		
		// 사용자에게 정수값을 입력 받아서 홀/ 짝을 판별 => 출력
		// if문을 이용해서 출력!
		// 단, 입력받은 정수가 0보다 클경우에만 조건문을 실행
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0보다 큰 정수주세요 > ");
		
		int number = sc.nextInt();
		
		// 1.비교연산
		//  입력받은 정수가 0보다 클 경우
		// number > 0
		// 2. 홀/짝
		// 	입력받은 정수를 2로 나눈 나머지를 0과 동등비교해서
		// !number % 2 == 0 홀수 (true 일 때)
		
		/*
		if(number % 2 == 0 && number > 0) { System.out.println("짝수");} // number > 0 앞으로 가야 버그가 없음
		if(number % 2 != 0 && number > 0)  
		System.out.println("홀수"); // 가능은 하지만 권장사항은 아님.
		*/
		
		//if 문 중첩 
//		if(number > 0) {
//			if(number % 2 == 0) {
//				System.out.println("짝수");
//			}
//			if(number % 2 == 1) {
//				System.out.println("홀수");
//			}
//		}
		
		
		boolean result = (number > 0) && (number % 2 == 0);
		
		if(result) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		

		
	}
	
	// 원섬후레이스
	public void method4() {
		
		// 1. 메뉴판 보여주기 (2개만)
		// 출력문 == System.out.print();
		System.out.println("======술집 메뉴판=====");
		System.out.println("1.맥주");
		System.out.println("2.소주");
		
		
		// 2. 메뉴번호로 메뉴 입력받기
		// Scanner 사용해서 nextInt()
		
		System.out.println("메뉴를 선택해주세요 > ");
		Scanner sc = new Scanner(System.in);
		int menuNo = sc.nextInt();
		System.out.println("선택한 메뉴 번호 : " + menuNo);
		
		// 3. 수량 입력받기
		// Scanner 사용해서 nextInt()
		System.out.println("수량을 입력해주세요 > ");
		int bottle = sc.nextInt();
		System.out.println("수량 : " + bottle);
		
		// 4. 조건문
		// if 문을 이용해서 입력한 메뉴번호에 따라 메뉴명 대입하기
		// 혹시 없는 메뉴 번호를 입력했다면 없는 메뉴라고 대입하기
		// 만약에 사용자가 입력한 메뉴번호가 1번이라면
		// if 			menuNo == 1
		
		String menuName = "";
		if(menuNo == 1) menuName = "맥주";
		
		if(menuNo == 2) menuName = "소주";
		
		if(!(menuNo == 1) && !(menuNo ==2)) menuName = "없는메뉴";
		
		// 5. xxx메뉴를 xxx잔 주문하셨습니다. 출력해주기 print()
		System.out.println(menuName + "를(을)" + bottle + "잔 주문하셨습니다.");
		
		
		// 6. 진짜 주문할건지 물어보기
		// Y / N 입력받아서 확인하기
		System.out.println("\n 위 주문내역으로 주문하시겠습니까? (Y / N) > ");
		sc.nextLine();
		char answer = sc.nextLine().charAt(0);
		System.out.println(answer);
		
		// 7. 6.번에서 입력받은 단일 문자가 'Y'또는 'y'와 일치하다면
		// 메뉴명과 수량과 가격 출력하기 if문 + 중첩 if문 + 출력문
		boolean result = (answer == 'Y') || (answer == 'y');
		
		if(result) {
			int price = 0;
			if(menuNo == 1) price = 5000;
			if(menuNo == 2) price = 3000;
			System.out.println("총 결제 금액은 " + (price * bottle) + "원 입니다.");
		}
		
		
	}
	
}
