package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If_Asignmt {
	public void menuOrder() {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 메뉴판 보여주기 (2개만)
		System.out.println("====== 음료 메뉴판 ======");
		System.out.println("1. 파인선셋스무디");
		System.out.println("2. 빅포즈 아메리카노");
		System.out.println("3. 논산에서 온 수박주스");
		
		// 2. 메뉴번호로 메뉴 입력받기
		// Scanner 사용해서 nextInt()
		System.out.println("\n메뉴번호를 입력해주세요 > ");
		int menuNo = sc.nextInt();
		
		// 유효성 검사
		if(menuNo >= 1 && menuNo <= 3) {
			
			// 3. 수량 입력받기
			System.out.println("수량을 입력해주세요 > ");
			int bottle = sc.nextInt();
			System.out.println("주문한 수량 : " + bottle);
			
			// 4. 조건문
			// if 문을 이용해서 입력한 메뉴번호에 따라 메뉴명 대입하기
			// 혹시 없는 메뉴 번호를 입력했다면 없는 메뉴라고 대입하기
			// 만약에 사용자가 입력한 메뉴번호가 1번이라면
			// if 			menuNo == 1
			String menuName = ""; 
			int price = 0;
			
			if(menuNo == 1) {
				menuName = "파인선셋스무디";
				price = 6000;
			}else if(menuNo == 2){
				menuName = "빅포즈 아메리카노";
				price = 3500;
			}else if(menuNo == 3) {
				menuName = "논산에서 온 수박주스";
				price = 6500;
			}
			// 5. xxx메뉴를 xxx잔 주문하셨습니다. 출력해주기 print()
			System.out.println("\n" + menuName + "메뉴를" + bottle + "잔 주문하셨습니다.");
			
			// 6. 진짜 주문할건지 물어보기
			// Y / N 입력받아서 확인하기
			System.out.println("주문하시겠습니까? (Y / N) > ");
			char confirm = sc.next().charAt(0);
			
			
			// 7. 6.번에서 입력받은 단일 문자가 'Y'또는 'y'와 일치하다면
			// 메뉴명과 수량과 가격 출력하기
			if (confirm == 'Y' || confirm == 'y') {
				int total = price * bottle;
				
				System.out.println("\n======= 주문 내역 =======");
				System.out.println("메뉴명 : " + menuName);
				System.out.println("수량 : " + bottle + "잔");
				System.out.println("가격 : " + total + "원");
			}else {
				System.out.println("주문을 취소하였습니다.");
			}
			
		}else {
			System.out.println("선택한 메뉴 번호는 없는 메뉴 번호입니다.");
		}
		
		

	}
}
