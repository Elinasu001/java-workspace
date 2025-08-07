package com.kh.assignment.abstraction.run;

import java.util.Scanner;

import com.kh.assignment.abstraction.vo.CreateChallenge;

public class CreateCallengeRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CreateChallenge challenge = new CreateChallenge();
		
		System.out.println("===== 챌린지 개설을 시작합니다. =====");
		
		// 1. 사용자 이름 입력하기
		System.out.println("1. 사용자 이름을 입력하세요. > ");
		String name = sc.nextLine();
		challenge.setName(name);
		
		// 2.챌린지 제목 입력하기
		System.out.print("2. 챌린지 제목을 입력하세요. > ");
		String title = sc.nextLine();
		challenge.setTitle(title);
		
		// 3.인증 빈도 선택하기
		System.out.println("3. 아래 인증 빈도를 선택하세요. > ");
		System.out.println("1) 매일");
		System.out.println("2) 평일 매일");
		System.out.println("3) 주말 매일");
		System.out.println("4) 주 1일");
		System.out.println("5) 주 2일");
		System.out.println("6) 주 3일");
		
		int menuNo = sc.nextInt();
		sc.nextLine(); // 개행 제거
		
		String selectedFrequency = "";
		
		switch(menuNo) {
		case 1: selectedFrequency = "1) 매일"; break;
		case 2: selectedFrequency = "2) 평일 매일"; break;
		case 3: selectedFrequency = "3) 주말 매일"; break;
		case 4: selectedFrequency = "4) 주 1일"; break;
		case 5: selectedFrequency = "5) 주 2일"; break;
		case 6: selectedFrequency = "6) 주 3일"; break;
		default :
				System.out.println("잘못된 번호입니다. '1) 매일'로 설정합니다.");
				selectedFrequency = "1) 매일";
		}
		
		challenge.setFrequency(selectedFrequency);
		
		// 4. 챌린지 기간 선택하기
		System.out.println("챌린지 기간을 선택하세요:");
		System.out.println("   1) 1주일");
		System.out.println("   2) 2주");
		System.out.println("   3) 3주");
		System.out.println("   4) 4주");
		System.out.println("   5) 5주");

		int durationChoice = sc.nextInt();
		sc.nextLine(); // 개행 제거

		String selectedDuration = "";
		switch (durationChoice) {
			case 1: selectedDuration = "1) 1주일"; break;
			case 2: selectedDuration = "2) 2주"; break;
			case 3: selectedDuration = "3) 3주"; break;
			case 4: selectedDuration = "4) 4주"; break;
			case 5: selectedDuration = "5) 5주"; break;
			default:
				System.out.println("잘못된 번호입니다. 기본값 '1) 1주일'로 설정됩니다.");
				selectedDuration = "1) 1주일";
		}

		challenge.setDuration(selectedDuration);
		
		// 5. 챌린지 시작일
		System.out.print("6. 챌린지 시작일을 입력하세요 (예: 2025-08-10) > ");
		String startDate = sc.nextLine();
		challenge.setStartDate(startDate);
		
		// 7. 인증 방식 선택 (배열 사용)
		System.out.println("7. 인증 방식을 선택하세요 > ");
		String[] methodOptions = {
			"",
			"1) 하루에 한 번 인증",
			"2) 하루에 여러 번 인증",
			"3) 시작과 마무리 인증샷 (하루에 2번)"
		};
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("   " + methodOptions[i]);
		}
		
		int methodChoice = sc.nextInt();
		sc.nextLine();
		if (methodChoice >= 1 && methodChoice <= 3) {
			challenge.setCheckInMethod(methodOptions[methodChoice]);
		} else {
			System.out.println("잘못된 번호입니다. 기본값 '1) 하루에 한 번 인증'으로 설정됩니다.");
			challenge.setCheckInMethod(methodOptions[1]);
		}
		
		// 8. 제목 수정
		System.out.print("챌린지 제목을 수정하시겠습니까? (Y / N) > ");
		String ans = sc.nextLine();
		if (ans.equals("Y") || ans.equals("y")) {
		    System.out.print("새 제목을 입력하세요. > ");
		    String newTitle = sc.nextLine();
		    challenge.updateChallengeTitle(newTitle);
		} else {
			// 9. 결과 출력하기
			System.out.println(challenge.info());
		}
		
		
	}
}
