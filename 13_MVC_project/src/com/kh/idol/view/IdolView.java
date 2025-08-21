package com.kh.idol.view;

import java.util.List;
import java.util.Scanner;

import com.kh.idol.controller.IdolController;
import com.kh.idol.model.vo.Idol;

public class IdolView {
	
	//필드부
	private Scanner sc = new Scanner(System.in);	// 스캐너가 필드일 때 단점 : 반납 안됨.
	IdolController ic = new IdolController();
	
	//생성자
	
	
	
	//메소드부
	//프로그램을 실행했을 때 가장 먼저 보여질 화면을 출력해주는 기능
	public void mainMenu() {
		
		System.out.println("\n\n 🎈aespa 커뮤니티에 오신것을 환영합니다🎈");
		
		while(true) {
			System.out.println("이용하실 서비스를 선택해주세요.");
			System.out.println("1. 에스파 정보보기");
			System.out.println("2. 회원 가입");
			System.out.println("3. 로그인");
			System.out.println("4. 게시판 서비스");
			System.out.println("5. 프로그램 종료");
			System.out.println("메뉴 번호 입력 > ");
			
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : infoMenu(); break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			default : System.out.println("잘못된 메뉴를 선택하셨스니다.");
			}
		}
	}
	
	private void infoMenu() {
		System.out.println();
		System.out.println("정보보기 서비스입니다.");
		System.out.println("이용하실 메뉴를 선택해두세요!");
		System.out.println("1. 카리나의 정보보기");
		System.out.println("2. 지젤의 정보보기");
		System.out.println("3. 윈터의 정보보기");
		System.out.println("4. 닝닝의 정보보기");
		System.out.println("5. 모든 멤버 정보보기");
		System.out.println("6. 메인메뉴로 돌아가기");
		System.out.println("이용하실 메뉴를 입력해주세요 > ");
		
		int menuNo = sc.nextInt();
		sc.nextLine();
		switch(menuNo) {
		case 1, 2, 3, 4 : findMember(menuNo); break; // 정보를 받아오기위함
		case 5 : findAll(); break;
		case 6 : return;
		}
	}
	
	private void findMember(int menuNo) {
		//특정 멤버의 주소값을 반환 해줄래?
		ic.findMember(menuNo); // controller 에 값을 받아오기 위함.
	}
	private void findAll() {
		
		// 1. controller 에서 정보를 받아옴 = 메소드 호출
		// 모든 멤버의 접근할 수 있는 값을 줘
		// controller 갔다오니 주소값 옴~
		// 제네릭을 달아줘야됨
		List<Idol> aespa = ic.findAll();
		
		// 에스파가 없을 수도 있으니
		if(aespa.isEmpty()) {
			System.out.println("멤버가 남아있지 않습니다.");
		} else {
			// 에스파가 한명이라도 있으면~
			for(Idol i : aespa) {
				System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
				System.out.println();
				System.out.println("프로필 이미지 : " + i.getImage());
				System.out.println();
				System.out.println("이름 : " + i.getName());
				System.out.println("포지션 : " + i.getPosition());
				System.out.println("전투기술 : " + i.getSkill());
				System.out.println();
				}
			System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
		}	
	}	
}
