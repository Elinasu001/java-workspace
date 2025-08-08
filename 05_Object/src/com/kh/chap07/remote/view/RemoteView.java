package com.kh.chap07.remote.view;

import java.util.Scanner;

import com.kh.chap07.remote.controller.RemoteController;

// 사용자에게 값을 입력받고 내용을 출력해주는 메소드를 넣어둘 클래스
public class RemoteView {
	//*2
	private Scanner sc = new Scanner(System.in); // 필드
	RemoteController rc = new RemoteController(); // : 프로그램 실행과 동시에 생성되고 프로그램 종료 해야 삭제됨. (이 필드로 있어야 주소값이 안날라가고 잘 연결됨.)
	
	// 프로그램 시작 시 보여질 메인메뉴를 출력해주는 메소드
	public void mainMenu() {
		
		while(true) {
			System.out.println("리모콘 조작 프로그램입니다.");
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
			case 1 : powerOn(); //*3
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : System.out.println("리모콘 조작하기는 즐거우셨나요? 안녕히가세요:) "); return;
			default: System.out.println("없는 메뉴를 선택하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	// 전원켜기 //*4
	private void powerOn() {
		//RemoteController rc = new RemoteController();
		System.out.println("===========================");
		System.out.println("전원 켜기 메뉴이니다.");
		System.out.println("===========================");
		
		int result = rc.powerOn(); // remoteController에서 int 로 받아왔음.
		if(result > 0) { //on/off 알려면 remoteController에서 반환값을 받아와야됨.
			//꺼져있었을 경우
			System.out.println("\n전원이 켜졌습니다 축하드립니다~~~:)\n");
		} else {
			//켜져있었을 경우
			System.out.println("\n이미 전원이 켜져있습니다.");
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
}
