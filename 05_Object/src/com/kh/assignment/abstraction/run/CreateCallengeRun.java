package com.kh.assignment.abstraction.run;

import java.util.Scanner;

import com.kh.assignment.abstraction.vo.CreateChallenge;

public class CreateCallengeRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CreateChallenge challenge = new CreateChallenge();
		
		System.out.println("===== 챌린지 개설을 시작합니다. =====");
		
		// 1. 사용자 이름 입력받기
		System.out.println("1. 사용자 이름을 입력하세요. > ");
		String name = sc.nextLine();
		challenge.setName(name);
		
		// 2.챌린지 제목 입력받기
		System.out.print("2. 챌린지 제목을 입력하세요. > ");
		String title = sc.nextLine();
		challenge.setTitle(title);
		
		// 3.인증 빈도 선택받기
		System.out.println("3. 아래 인증 빈도를 선택하세요. > ");
		
		System.out.println("\n1) 매일");
		System.out.println("2) 평일 매일");
		System.out.println("3) 주말 매일");
		System.out.println("4) 주 1일");
		System.out.println("5) 주 2일");
		System.out.println("6) 주 3일");
		
		// 인증 빈도 선택 메소드 호출
		int frequencyChoice = sc.nextInt();
		sc.nextLine();
		challenge.setFrequencyByChoice(frequencyChoice);
		
		// 4. 챌린지 기간 선택받기
		System.out.println("챌린지 기간을 선택하세요:");
		System.out.println("   1) 1주일");
		System.out.println("   2) 2주");
		System.out.println("   3) 3주");
		System.out.println("   4) 4주");
		System.out.println("   5) 5주");
		
		// 인증 기간 선택 메소드 호출
		int duarationChoice = sc.nextInt();
		sc.nextLine();
		challenge.setDurationByChoice(duarationChoice);
		
		// 5. 챌린지 시작일 입력받기
		System.out.print("6. 챌린지 시작일을 입력하세요 (예: 2025-08-10) > ");
		String startDate = sc.nextLine();
		challenge.setStartDate(startDate);
		
		// 7. 인증 방식 선택받기
		System.out.println("7. 인증 방식을 선택하세요 > ");
		System.out.println("   1) 하루에 한 번 인증");
		System.out.println("   2) 하루에 여러 번 인증");
		System.out.println("   3) 시작과 마무리 인증샷 (하루에 2번)");
		
		// 인증 방법 선택 메소드 호출
		int methodChoice = sc.nextInt();
		sc.nextLine();
		challenge.setCheckInMethodByChoice(methodChoice);
		
		// 8. 제목 수정 유무 입력받기
		System.out.print("챌린지 제목을 수정하시겠습니까? (Y / N) > ");
		String ans = sc.nextLine();
		if (ans.equals("Y") || ans.equals("y")) {
		    System.out.print("새 제목을 입력하세요. > ");
		    String newTitle = sc.nextLine();
		    // 제목수정 메소드 호출
		    challenge.updateChallengeTitle(newTitle);
		} else {
			// 9. 챌린지정보 메소드 출력
			System.out.println(challenge.info());
		}
		
		
	}
}
