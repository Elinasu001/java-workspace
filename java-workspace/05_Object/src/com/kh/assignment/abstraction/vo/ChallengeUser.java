package com.kh.assignment.abstraction.vo;

import java.util.Scanner;

public class ChallengeUser {
	
	//[필드부]
	private String name;			// 사용자이름
	private String title;		// 챌린지이름
	private String period;		// 챌린지기간
	private String status;		// 챌린지 상태 : 대기중 or 참여중
	private int count;			// 하루인증횟수
	private int points;			// 포인트
	
	//[메소드부]
	// 사용자이름
	public void setName(String name) {
		this.name = name;
	}
	// 챌린지이름
	public void setTitle(String title) {
		this.title = title;
	}
	// 챌린지기간
	public void setPeriod(String period) {
		this.period = period;
	}
	// 챌린지 상태 : 대기중 or 참여중
	public void setStatus(String status) {
		this.status = status;
	}
	// 하루인증횟수
	public void setCount(int count) {
		this.count = count;
	}
	// 포인트
	public void setPoints(int points) {
		this.points = points;
	}
	
	// 인증 횟수 9시 전 3회 미만 시 사용자에게 물어보고 횟수 추가하기
	public void checkAndAskForAuth() {
		System.out.println(" 오늘 9시 기준 인증 횟수 : " + count + "회");
		
		if(count < 3) {
			System.out.println("※ 인증이 부족합니다. 하루 3회 인증이 필요합니다.");
			System.out.println("현재까지 인증 " + count + "회 입니다. 추가 인증을 진행하시겠습니까? (Y / N) > " );
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			
			if(answer.equals("Y") || answer.equals("y")) {
				count++;
				System.out.println("인증 1회가 추가되었습니다. 현재 인증 횟수 : " + count + "회");
			} else {
				System.out.println("인증 추가를 건너 뛰었습니다.");
			}
		} else {
			System.out.println("오늘 인증을 모두 완료했습니다.");
		}
		
		
	}
	
	// 사용자정보 출력
	public String info() {
		String info = "[사용자 이름 : " + name 
						+ ", 챌린지 제목 : " + title 
						+ ", 챌린지 기간 : " + period 
						+ ", 챌린지 상태 : " + status 
						+ " 오늘 인증 횟수" + count
						+ "획득 포인트 : " + points
						+ "]";
		return info;
	}
	
}
