package com.kh.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;

public class ParkingTowerView {
	private Scanner sc = new Scanner(System.in);
	private ParkingTowerController ptc = new ParkingTowerController();
	
	public void mainMenu() {
		System.out.println("✓ 메뉴 구성");
		System.out.println("1. 차량 주차");
		System.out.println("2. 차량 출차");
		System.out.println("3. 주차된 차량 검색");
		System.out.println("4. 전체 출력");
		System.out.println("0. 프로그램 종료하기");
		System.out.println("메뉴 번호를 선택해주세요 > ");
		
		try {
			int menuNo = sc.nextInt();
			sc.nextLine();
			switch(menuNo) {
			case 1: insertCar(); break;
			case 2: deleteCar(); break;
			case 3: searchCar(); break;
			case 4: selectList(); break;
			case 0: return;
			}
		} catch (InputMismatchException e) {
			System.out.println("======== 번호로 선택해주세요 ========");
		}
	}
	
	private void insertCar() {
		System.out.println("주차할 차량을 선택해주세요 > ");
		int menuNo = sc.nextInt();
		
		
	}
	private void deleteCar() {
		
	}
	private void searchCar() {
		
	}
	private void selectList() {
		
	}
	
	
}
