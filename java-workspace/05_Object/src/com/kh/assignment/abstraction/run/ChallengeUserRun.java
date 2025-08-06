package com.kh.assignment.abstraction.run;

import java.util.Scanner;

import com.kh.assignment.abstraction.vo.ChallengeUser;

public class ChallengeUserRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ChallengeUser cu = new ChallengeUser();

		// 기본 정보 입력
		cu.setUserName("박수현");
		cu.setChallengeName("다이어트 챌린지");
		cu.setChallengePeriod("2025-08-01 ~ 2025-08-31");
		cu.setChallengeStatus("참여중");
		cu.setDailyAuthCount(2); // 현재 인증 2회
		cu.setEarnedPoints(1500);
		
		// 인증 체크 및 사용자 응답 처리 (클래스 내부)
		cu.checkAndAskForAuth();
		
		System.out.println("========= 챌린지 정보 =========");
		cu.printChallengeInfo();
		
		
	}
}
