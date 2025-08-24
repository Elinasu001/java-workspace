package com.kh.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;
import com.kh.model.vo.Car;

public class ParkingTowerView {
	private Scanner sc = new Scanner(System.in);
	private ParkingTowerController ptc = new ParkingTowerController();
	
	// 메뉴 루프, 입력값 수집, 간단검증, controller 호출 , 결과 출력
	public void mainMenu() {
		
		while(true) {
			System.out.println();
			System.out.println("✓ 메뉴 구성");
			System.out.println();
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
				case 0: System.out.println("서비스가 종료되었습니다."); return;
				}
			} catch (InputMismatchException e) {
				System.out.println("======== 번호로 선택해주세요 ========");
			}
		}
	}
	
	// 주차 : view 입력 -> controller.inserCar -> parkingNum 자동 부여 -> 리스트에 add -> 성공 메시지
	private void insertCar() {
		System.out.println("======== 차량 주차 ========");
		
		int carNum = 0;
		int carType = 0;
		
		while(true) {
			try {
				System.out.println("차량번호를 입력하세요 > ");
				carNum = sc.nextInt();
				sc.nextLine();
				break;
				
		        
			} catch (InputMismatchException e) {
				System.out.println("숫자로 입력해주세요 :) ");
				sc.nextLine();
			}
		}
		while(true) {
			try {
				System.out.println("차량 종류를 선택해주세요 > ");
				System.out.println("1. 경차  2. 세단  3. SUV  4. 트럭");
				carType  = sc.nextInt();
		        sc.nextLine();
		        break;
		        
			} catch (InputMismatchException e) {
				System.out.println("숫자로 입력해주세요 :) ");
				sc.nextLine();
			}
		}
		
		System.out.println("소유자 이름을 입력하세요 > ");
		String owner = sc.nextLine();
        
        ptc.insertCar(carNum, carType, owner);
        
        System.out.println();
        System.out.println("차량이 성공적으로 주차되었습니다!");
        System.out.println("============================");
        System.out.println("차량 번호 : " + carNum);
        System.out.println("차량 종류 : " + carType);
        System.out.println("차량 소유주 : " + owner);
        System.out.println("============================");

        
	}
	// 출차 : 차량번호로 검색 -> 존재하면 remove -> 1반환, 없으면 0
	private void deleteCar() {
		System.out.println("\n========== 차량 출차 ==========");
		
		int carNum = 0;
		while(true) {
			try {
				 System.out.println();
				 System.out.print("출차할 차량번호를 입력하세요 > ");
				 carNum = sc.nextInt();
				 sc.nextLine();
				 break;
			        
			} catch (InputMismatchException e) {
				System.out.println("숫자로 입력해주세요 :) ");
				sc.nextLine();
			}
		}
		
		int result = ptc.deleteCar(carNum);
        
        if(result == 1) {
        	System.out.println("차량이 성공적으로 출차되었습니다!");
        } else {
        	System.out.println("해당 번호를 찾을 수 없습니다.");
        }
       
	}
	// 검색(read 조건) : 소유자명으로 필터 -> 결과 리스트 반환
	private void searchCar() {
		System.out.println("\n========== 주차된 차량 검색 ==========");
        System.out.print("검색할 소유자 이름을 입력하세요 : ");
        String owner = sc.nextLine();
        
        ArrayList<Car> searchResult = ptc.searchCar(owner);

        if(searchResult.isEmpty()) {
            System.out.println("해당 소유자의 차량을 찾을 수 없습니다.");
        } else {
            System.out.println("\n검색 결과:");
            for(Car car : searchResult) {
                System.out.println(car.toString());
            }
        }
        
	}
	// 전체조회(read 전체) : 리스트 반환 -> view 에서 순회 출력
	private void selectList() {
		
		 System.out.println("\n========== 전체 주차 현황 ==========");
		 ArrayList<Car> allCars = ptc.selectList();
		 
		 if(allCars.isEmpty()) {
			 System.out.println("주차된 차량이 없습니다.");
		 } else{
			 System.out.println("전체 주차된 차량 결과입니다.");
			 System.out.println(allCars.toString());
		 }
	}
	
	
}
