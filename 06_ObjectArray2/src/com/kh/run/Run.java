package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class Run {

	public static void main(String[] args) {
		
		// 1절
		// 사용자에게 식당의 정보를 입력받아서
		// 입력받은 식당의 정보를 출력해주는 프로그램
		// 3개의 식당정보를 입력받겠다고 가정
		Scanner sc = new Scanner(System.in);
		
		Restaurant[] restaurants = new Restaurant[3];
		
		for(int i = 0; i < restaurants.length; i++) {
			System.out.println( "====== "+ (i+1) + "번째 식당 정보를 입력해 주세요 ======");
			System.out.println("식당 상호명을 입력해주세요 > ");
			String storeName = sc.nextLine();
			
			System.out.println("식당 주소를 입력해주세요 > ");
			String address = sc.nextLine();
			
			System.out.println("식당의 대표메뉴를 입력해주세요 > ");
			String mainMenu = sc.nextLine();
			
			restaurants[i] = new Restaurant(storeName, address, mainMenu);
			
		}
		
		for(Restaurant r : restaurants) {
			System.out.println(r.information());
		}
		
		// 상호명 검색
		
		while(true) {
			System.out.println("검색할 식당 상호명을 입력해주세요 > ");
			String searched = sc.nextLine();
			
			boolean found = false;
			
			for(Restaurant r : restaurants) {
				if(searched.equals(r.getStoreName())) {
					System.out.println("대표 메뉴 : " + r.getMainMenu());
					found = true;
					break;
				}
			}
			
			if(found) {
				break;
			} else {
				System.out.println("일치하는 식당 상호명이 없습니다. 다시 입력해주세요.");
			}
		}
		
		
		
	}

}
