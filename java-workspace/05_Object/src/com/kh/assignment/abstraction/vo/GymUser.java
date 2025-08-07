package com.kh.assignment.abstraction.vo;

import java.time.LocalDate;

public class GymUser{

	// [필드부]
	private String userId;			// 회원 아이디
	private String name;			// 이름
	private LocalDate startDate;	// 시작일
	private int usageDays;			// 이용 일수
	private int extensionDays;		// 연장 일수
	
	// [생성자부]
	// 기본생성자
	public GymUser(){}
	// 모든 필드를 매개변수로 가지고 있는 생성자
	public GymUser(String userId, String name, LocalDate startDate, int usageDays, int extensionDays){
		this.userId = userId;
		this.name = name;
		this.startDate = startDate;
		this.usageDays = usageDays;
		this.extensionDays = extensionDays;
	}
	
	
	// [메소드부]
	//getter()
	public String getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public int getUsageDays() {
		return usageDays;
	}
	public int getExtensionDays() {
		return extensionDays;
	}
	
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
		this.extensionDays = days;
	}
	
	// 연장 메세지 호출 메소드
	public void printExtensionNotice() {
		if(usageDays > 7) {
			System.out.println("※ 헬스장 이용기간이 끝나가니 더 이용하시려면 연장해주세요.");
		}
	}
	
	// 기간 연장된 정보 메소드
	public String dateInfo(int addDays) {
		LocalDate extension = startDate.plusDays(usageDays);				
		LocalDate extendedEndDate = extension.plusDays(extensionDays);	
		
		String info = "[회원 아이디 : " + userId 
					+ ", 회원 이름 : " + name 
					+ ", 시작일 : " + startDate
					+ ", 이용일수 : " + usageDays + "일"
					+ ", 종료일 : " + extension 
					+ ", 연장된 종료일 : " + extendedEndDate+ "]";
					
		return info;
		
	}
	
}
