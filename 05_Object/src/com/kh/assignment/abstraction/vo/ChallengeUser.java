package com.kh.assignment.abstraction.vo;

import java.util.Scanner;

public class ChallengeUser {
	
	//[필드부]
	private String name;		// 사용자이름
	private String title;		// 챌린지이름
	private String period;		// 챌린지기간
	private String status;		// 챌린지 상태 : 대기중 or 참여중
	private int count;			// 하루인증횟수
	private int points;			// 포인트
	
	//[생성자부]
	// 기본 생성자
	public ChallengeUser() {}
	// 모든 필드 매개변수로 갖는 생성자
	public ChallengeUser(String name, String title, String period, String status, int count, int points){
		this.name = name;
		this.title = title;
		this.period = period;
		this.status = status;
		this.count = count;
		this.points = points;
	}
	
	//[메소드부]
	//getter()
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public String getPeriod() {
		return period;
	}
	public String getStatus() {
		return status;
	}
	public int getCount() {
		return count;
	}
	public int getPoints() {
		return points;
	}
	
	//setter()
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	// 인증 체크 및 사용자 응답 처리 메소드 (9시 전 3회 미만일 경우)
	public void checkAndAskForAuth() {
		System.out.println(" 오늘 9시 기준 인증 횟수 : " + count + "회");
		
		if(this.count < 3) {
			System.out.println("※ 인증이 부족합니다. 하루 3회 인증이 필요합니다.");
			System.out.println("현재까지 인증 " + count + "회 입니다. 추가 인증을 진행하시겠습니까? (Y / N) > " );
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			
			if(answer.equals("Y") || answer.equals("y")) {
				this.count++;
				System.out.println("인증 1회가 추가되었습니다. 현재 인증 횟수 : " + count + "회");
			} else {
				System.out.println("인증 추가를 건너 뛰었습니다.");
			}
		} else {
			System.out.println("오늘 인증을 모두 완료했습니다.");
		}
		
		
	}
	
	// 사용자정보 메소드
	public String info() {
		String info = "[사용자 이름 : " + name 
						+ ", 챌린지 제목 : " + title 
						+ ", 챌린지 기간 : " + period 
						+ ", 챌린지 상태 : " + status 
						+ ", 오늘 인증 횟수" + count
						+ "획득 포인트 : " + points
						+ "]";
		return info;
	}
	
}
