package com.kh.assignment.abstraction.vo;

public class LectureProgress {
	// [필드]
	private String userName; // 사용자 이름
	private String title; // 강의 이름
	private String startDate; // 강의 시작 날짜
	private String endDate; // 강의 종료 날짜
	public int progressPercent; // 현재 강의 진도율 (0~100%)

	// [생성자부]
	//기본생성자
	public LectureProgress() {}
	//모든 필드를 매개변수로 가지고 있는 생성자
	public LectureProgress(String userName, String title, String startDate, String endDate, int progressPercent) {
		this.userName = userName;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.progressPercent = progressPercent;
	}
	
	// [메소드]
	// getter()
	public String getUserName() {
		return userName;
	}
	public String getTitle() {
		return title;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public int getProgressPercent() {
		return progressPercent;
	}
	
	// setter()
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public void setProgressPercent(int progressPercent) {
		this.progressPercent = progressPercent;
	}

	// 강의 진도율이 20 미만이면 출력 메소드
	public void lowProgressMessage() {
		if (progressPercent < 20) {
			System.out.println("!! 현재 강의 진도율은 " + progressPercent + "% 입니다. 더 듣는 것을 추천해요.");
		}
	}

	// 강의 수강으로 진도 증가 메소드
	public void plusProgress() {
		if (progressPercent < 100) {
			progressPercent += 4;
			if (progressPercent > 100) {
				progressPercent = 100;
			}
			System.out.println("강의를 들었습니다! 진도율이 올랐습니다.");
			System.out.println("현재 강의 진도율: " + progressPercent + "%");
		} else {
			System.out.println("** 모든 강의를 완료했습니다! **");
		}
	}
	
	// 사용자정보 메소드
	public String info() {
		String info = "[사용자 이름 : " + userName 
						+ ", 강의 이름 : " + title 
						+ ", 강의 날짜 : " + startDate 
						+ ", 강의 과목 : " + endDate 
						+ ", 현재 강의 진도율 : " + progressPercent
						+ "]";
		return info;
	}
	

}
