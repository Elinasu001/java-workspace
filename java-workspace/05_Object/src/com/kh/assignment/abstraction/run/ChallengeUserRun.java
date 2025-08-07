package com.kh.assignment.abstraction.run;

import java.util.Scanner;

import com.kh.assignment.abstraction.vo.ChallengeUser;

public class ChallengeUserRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ChallengeUser challenge = new ChallengeUser();

		// 1. 기본 정보 입력
		System.out.println("이름이 뭔가요?  > ");
		String name = sc.nextLine();
		challenge.setName(name);
		
		System.out.println("챌린지 제목이 뭔가요?  > ");
		String title = sc.nextLine();
		challenge.setTitle(title);
		
		System.out.println("챌린지기간은 어떻게 되나요?  (예: 2025-08-01 ~ 2025-08-31) > ");
		String period = sc.nextLine();
		challenge.setPeriod(period);
		
		System.out.println("챌린지 상태가 어떻게 되나요? (예: 진행중 or 참여중) > ");
		String status = sc.nextLine();
		challenge.setStatus(status);
		
		System.out.println("현재 인증 횟수는 ? > ");
		int count = sc.nextInt();
		challenge.setCount(count);
		
		System.out.println("포인트 어떻게 되나요?  > ");
		int points = sc.nextInt();
		challenge.setPoints(points);
		
		// 2. 인증 체크 및 사용자 응답 호출
		challenge.checkAndAskForAuth();
		
		System.out.println("========= 챌린지 정보 =========");
		// 사용자정보 메소드 호출
		System.out.println(challenge.info());
		
	}
}
