package com.kh.assignment.abstraction.vo;

import java.util.Scanner;

public class ChallengeUser {
	
	//[필드부]
	private String userName;			// 사용자이름
	private String challengeName;		// 챌린지이
	private String challengePeriod;		// 챌린지기간
	private String challengeStatus;		// 챌린지 상태 : 대기중 or 참여중
	private int dailyAuthCount;			// 하루인증횟수
	private int earnedPoints;			// 포인트
	
	//[메소드부]
	public void setUserName(String name) {
		userName = name;
	}
	
	public void setChallengeName(String name) {
		challengeName = name;
	}
	
	public void setChallengePeriod(String period) {
		challengePeriod = period;
	}
	public void setChallengeStatus(String status) {
		challengeStatus = status;
	}
	public void setDailyAuthCount(int count) {
		dailyAuthCount = count;
	}
	public void setEarnedPoints(int points) {
		earnedPoints = points;
	}
	
	// 인증 부족 시 사용자에게 물어보고 늘려주는 메소드
	public void checkAndAskForAuth() {
		System.out.println(" 오늘 9시 기준 인증 횟수 : " + dailyAuthCount + "회");
		
		if(dailyAuthCount < 3) {
			System.out.println("※ 인증이 부족합니다. 하루 3회 인증이 필요합니다.");
			System.out.println("현재까지 인증 " + dailyAuthCount + "회 입니다. 추가 인증을 진행하시겠습니까? (Y / N) > " );
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			
			if(answer.equals("Y") || answer.equals("y")) {
				dailyAuthCount++;
				System.out.println("인증 1회가 추가되었습니다. 현재 인증 횟수 : " + dailyAuthCount + "회");
			} else {
				System.out.println("인증 추가를 건너 뛰었습니다.");
			}
		} else {
			System.out.println("오늘 인증을 모두 완료했습니다.");
		}
		
		
	}
	
	public void printChallengeInfo() {
		System.out.println("사용자 이름: " + userName);
		System.out.println("챌린지 이름: " + challengeName);
		System.out.println("챌린지 기간: " + challengePeriod);
		System.out.println("챌린지 상태: " + challengeStatus);
		System.out.println("오늘 인증 횟수: " + dailyAuthCount);
		System.out.println("획득 포인트: " + earnedPoints);
	}
	
}
