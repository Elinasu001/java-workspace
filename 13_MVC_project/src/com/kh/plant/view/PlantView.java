package com.kh.plant.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.plant.controller.PlantController;
import com.kh.plant.model.vo.Plant;

// View : 시각적인 부분 담당, 화면 입/출력
public class PlantView {
	private Scanner sc = new Scanner(System.in);
	private PlantController pc = new PlantController();
	
	// 프로그램 실행 시 보여줄 화면을 출력해주는 기능
	public void mainMenu() {
		
		// 저장소 : ArrayList
		while(true) {
			System.out.println();
			System.out.println("식물 관리 프로그램입니다");
			
			/*
			 * 식물 CRUD 하기
			 * CRUD
			 * 	- Create : 사용자에게 입력받은 값을 가지고 새로운 식물을 추가하는 작업
			 * 	- Read   : 만들어진 식물을 조회하는 작업
			 * 	- Update : 기존의 식물을 수정하는 작업
			 *  - Delete : 식물을 삭제하는 작업
			 */
			
			System.out.println("1. 식물 추가하기");
			System.out.println("2. 식물 전체조회");
			System.out.println("3. 특정 식물 검색");
			System.out.println("4. 특정 식물 삭제");
			System.out.println("5. 특정 식물 수정");
			System.out.println("6. 식물 목록을 파일로 저장");
			System.out.println("0. 식물 목록을 파일로 저장");
			System.out.println();
			
			System.out.println("어떤 기능을 이용하시겠어요 > ");
			
			try {
				int menuNo = sc.nextInt();
				sc.nextLine();
				switch(menuNo) {
				case 1: createPlant(); break;
				case 2: readAll(); break;
				case 3:break;
				case 4:break;
				case 5:break;
				case 6:break;
				case 0: System.out.println("프로그램을 종료합니다."); break;
				default : System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
				}
			}catch(InputMismatchException e) {
				System.out.println("====== 숫자만 입력해주세요 ======");
				sc.nextLine(); // 무한반복 막기
			}
		}
	}
	
	// 1. 새롭게 식물을 추가할 수 있는 화면을 보여주는 메소드
	private void createPlant() {
		
		System.out.println("\n🥦 식물 추가 서비스입니다.");
		System.out.println("식물 명을 입력하세요 > ");
		String name = sc.nextLine();
		System.out.println("종류를 입력해주세요 > ");
		String type = sc.nextLine();
		/*
		 * 식물 VO 클래스에 대입할 값 두 개를 입력받았음
		 * View 는 일단 할 일 끝남
		 */
		
		/*
		 * 사용자가 입력한 식물명이랑 종류를 가지고,
		 * 식물 목록에 추가해줘 => 요청
		 * 				  => 값 넘겨주기
		 */
		pc.createPlant(name, type);
		
		System.out.println("축하합니다.");
		System.out.println("새로운 식물이 추가되었습니다.");
	}
	
	// 2. 전체 식물 목록을 출력해주는 기능
	private void readAll() {
		
		System.out.println("\n 전체 식물 목록입니다.");
		
		List<Plant> plants = pc.readAll();
		
		// 경우의 수
		// case 1. 값이 없을 경우 
		// case 2. 값이 하나의 경우 
		// case 2. 값이 여러개일 경우 
		
		// List의 요소가 하나도 존재하니 않을 경우
		if(plants.isEmpty()) { // (plants.size() == 0) 이것보다 isEmpty() 을 더 선호
			System.out.println("식물이 존재하지 않습니다.");
			System.out.println("새로운 식물을 추가해보세요.");
		} else {
			// 최소한 하나라도 있을 경우
			for(Plant p : plants) {
				System.out.println("식물이름 : " + p.getName() + ", 식물종 : " + p.getType());
			}
		}
	}
}
