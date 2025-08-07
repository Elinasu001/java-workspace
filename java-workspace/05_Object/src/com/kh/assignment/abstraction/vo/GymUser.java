package com.kh.assignment.abstraction.vo;

import java.time.LocalDate;

public class GymUser{

	// [필드부]
	private String userId;			// 회원 아이디
	private String name;			// 이름
	private LocalDate startDate;	// 시작일
	private int usageDays;			// 이용 일수
	private int extensionDays;		// 연장 일수
	
	// [메소드부]
	//getter()
	
	//setter()
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserName(String name) {
		this.name = name;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public void setUsageDays(int usageDays) {
		this.usageDays = usageDays;
	}
	public void setExtensionDays(int days) {
		extensionDays = days;
	}
	
	// 이용일수가 7일 미만남았으면 연장 메세지 보여주기
	public void printExtensionNotice() {
		if(usageDays > 7) {
			System.out.println("※ 헬스장 이용기간이 끝나가니 더 이용하시려면 연장해주세요.");
		}
	}
	
	// 기간 연장 메서드
	public void dateInfo(int addDays) {
		LocalDate endDate = startDate.plusDays(usageDays);				// 종료일자 = 사용일자.더한(이용일자)
		LocalDate extendedEndDate = endDate.plusDays(extensionDays);	// 연장일자 = 종료일자.더한(연장일자)
		
		System.out.println("회원 아이디 : " + userId);
		System.out.println("회원 이름 : " + name);
		System.out.println("시작일 : " + startDate);
		System.out.println("이용일수 : " + usageDays + "일");
		System.out.println("종료일 : " + endDate);
		System.out.println("연장된 종료일 : " + extendedEndDate);
	}
	
}
