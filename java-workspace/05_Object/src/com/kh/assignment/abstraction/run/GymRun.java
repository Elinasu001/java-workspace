package com.kh.assignment.abstraction.run;

import java.time.LocalDate;
import java.util.Scanner;

import com.kh.assignment.abstraction.vo.GymUser;

public class GymRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		GymUser user = new GymUser();
		
		// 1. 사용자에게 시작일 입력받기
		System.out.println("시작일을 입력하세요. (예: 2025-08-06) > ");
		String inputDate = sc.nextLine();
		LocalDate startDate = LocalDate.parse(inputDate);
		user.setStartDate(startDate);
		
		// 2. 사용자에게 이용일수 입력받기
		System.out.println("이용일수를 입력하세요. (예: 30 / 90 / 180 / 360) > ");
		int usage = sc.nextInt();
		user.setUsageDays(usage);
		
		// 3. 사용자에게 연장일수 입력받기
		System.out.println("연장할 일수를 입력하세요. (예: 30 / 90 / 180 / 360) >");
		int extend = sc.nextInt();
		user.setExtensionDays(extend);
		
		// 연장 안내 메시지 출력
		user.printExtensionNotice();
		
		// 전체 결과 출력
		System.out.println("=========== 결과 ===========");
		user.printAllDates(90);
		
	}

}
