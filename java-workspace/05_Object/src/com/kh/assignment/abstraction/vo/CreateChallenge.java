package com.kh.assignment.abstraction.vo;

public class CreateChallenge {
	//[필드부]
	private String name;			// 사용자 이름
	private String title;			// 챌린지 제목
	private String frequency;		// 인증 빈도
	private String duration;		// 챌린지 기간
	private String startDate;		// 시작일
	private String checkInMethod;	// 인증방식
	
	//[메소드부]
	// getter()
	public String name() {
		return name;
	}
	public String title() {
		return title;
	}
	public String frequency() {
		return frequency;
	}
	public String duration() {
		return duration;
	}
	public String startDate() {
		return startDate;
	}
	public String checkInMethod() {
		return checkInMethod;
	}
	
	// setter()
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public void setCheckInMethod(String checkInMethod) {
		this.checkInMethod = checkInMethod;
	}
	
	// 제목 수정하기 (newTitle 문자열이 null 이 아니고, 공백이 아닌 실제 값이 들어있을 경우)
	public void updateChallengeTitle(String newTitle) {
	    if (newTitle != null && !newTitle.trim().isEmpty()) {
	        this.title = newTitle;
	        System.out.println("챌린지 제목이 '" + newTitle + "'(으)로 수정되었습니다.");
	    } else {
	        System.out.println("유효하지 않은 제목입니다. 수정이 취소되었습니다.");
	    }
	}
	
	// 챌린지 정보
	public String info() {
		String info = "[사용자 이름 : " + name 
						+ ", 챌린지 제목 : " + title 
						+ ", 인증 빈도 : " + frequency 
						+ ", 챌린지 기간 : " + duration 
						+ " 시작일" + startDate
						+ "인증 방식 : " + checkInMethod
						+ "]";
		return info;
	}
}
