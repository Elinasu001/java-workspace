package com.kh.chap07.remote.view;

import java.util.Scanner;

// 사용자에게 값을 입력받고 내용을 출력해주는 메소드를 넣어둘 클래스
public class RemoteView {
	
	private Scanner sc = new Scanner(System.in); // 필드
	
	// 프로그램 시작 시 보여질 메인메뉴를 출력해주는 메소드
	public void mainMenu() {
		
		while(true) {
			System.out.println("\n리모콘 조작 프로그램입니다.");
			System.out.println("이렇게 저렇게 조작을 열심히 해보세요.");
			System.out.println("이용하실 메뉴를 선택해주세요.");
			System.out.println("1. 전원켜기");
			System.out.println("2. 채널 바꾸기 ↑");
			System.out.println("3. 채널 바꾸기 ↓");
			System.out.println("4. 전원끄기");
			System.out.println("5. 프로그램 종료");
			System.out.println("어떤 기능을 이용하시겠습니까 > ");
			
			int menuNo = sc.nextInt();
			sc.nextLine(); // 입력 버퍼 비워두기
			
			// 피연산자 두 정수로 동등비교 : switch(v) or if
			switch(menuNo) {
			case 1 : break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : System.out.println("리모콘 조작하기는 즐거우셨나요? 안녕히가세요:) "); return;
			default: System.out.println("없는 메뉴를 선택하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
}
