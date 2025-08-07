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
		
		System.out.println("챌린지기간은 어떻게 되나요?  > ");
		String period = sc.nextLine();
		challenge.setPeriod(period);
		
		System.out.println("챌린지 상태가 어떻게 되나요? > ");
		String status = sc.nextLine();
		challenge.setStatus(status);
		
		System.out.println("현재 인증 횟수는 ? > ");
		String count = sc.nextLine();
		challenge.setStatus(count);
		
		System.out.println("포인트 어떻게 되나요?  > ");
		int points = sc.nextInt();
		challenge.setPoints(points);
		
		
		challenge.setName("박수현");
		challenge.setTitle("다이어트 챌린지");
		challenge.setPeriod("2025-08-01 ~ 2025-08-31");
		challenge.setStatus("참여중");
		challenge.setCount(2); // 현재 인증 2회
		challenge.setPoints(1500);
		
		// 2. 인증 체크 및 사용자 응답 처리
		challenge.checkAndAskForAuth();
		
		System.out.println("========= 챌린지 정보 =========");
		challenge.info();
		
	}
}
