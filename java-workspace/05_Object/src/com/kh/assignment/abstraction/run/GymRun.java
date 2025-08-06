package com.kh.assignment.abstraction.run;

import java.time.LocalDate;
import java.util.Scanner;

import com.kh.assignment.abstraction.vo.GymUser;

public class GymRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		GymUser user = new GymUser();
		
		// 1.회원 아이디 입력받기
		System.out.println("회원 아이디를 입력해주세요. > ");
		String memberId = sc.nextLine();
		user.setUserId(memberId);
		
		// 2..회원 이름 입력받기
		System.out.println("회원 이름을 입력해주세요. > ");
		String userName = sc.nextLine();
		user.setUserName(userName);
		
		// 3. 사용자에게 시작일 입력받기
		System.out.println("시작일을 입력하세요. (예: 2025-08-06) > ");
		String inputDate = sc.nextLine();
		LocalDate startDate = LocalDate.parse(inputDate);
		user.setStartDate(startDate);
		
		// 4. 사용자에게 이용일수 입력받기
		System.out.println("이용일수를 입력하세요. (예: 30 / 90 / 180 / 360) > ");
		int usage = sc.nextInt();
		user.setUsageDays(usage);
		
		// 5. 사용자에게 연장일수 입력받기
		System.out.println("연장할 일수를 입력하세요. (예: 30 / 90 / 180 / 360) >");
		int extend = sc.nextInt();
		user.setExtensionDays(extend);
		
		// 6. 7일 남았으면 연장 안내 메시지 출력
		user.printExtensionNotice();
		
		// 7. 전체 결과 출력
		System.out.println("=========== 결과 ===========");
		user.printAllDates(90);
		
	}

}
