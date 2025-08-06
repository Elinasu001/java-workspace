package com.kh.assignment.abstraction.vo;

public class CreateChallenge {
	//[필드부]
	private String userName;			// 사용자 이름
	private String challengeTitle;		// 챌린지 제목
	private String checkInFrequency;	// 인증 빈도
	private String challengeDuration;	// 챌린지 기간
	private String startDate;			// 시작일
	private String checkInMethod;		// 인증방식
	
	//[메소드부]
	public void setUserName(String name) {
		userName = name;
	}
	public void setChallengeTitle(String title) {
		challengeTitle = title;
	}

	public void setCheckInFrequency(String frequency) {
		checkInFrequency = frequency;
	}

	public void setChallengeDuration(String duration) {
		challengeDuration = duration;
	}

	public void setStartDate(String date) {
		startDate = date;
	}

	public void setCheckInMethod(String checkIn) {
		checkInMethod = checkIn;
	}
	
	// 제목 수정하기 (newTitle 문자열이 null이 아니고, 공백이 아닌 실제 값이 들어있을 경우)
	public void updateChallengeTitle(String newTitle) {
	    if (newTitle != null && !newTitle.trim().isEmpty()) {
	        this.challengeTitle = newTitle;
	        System.out.println("챌린지 제목이 '" + newTitle + "'(으)로 수정되었습니다.");
	    } else {
	        System.out.println("유효하지 않은 제목입니다. 수정이 취소되었습니다.");
	    }
	}
	public void printChallengeInfo() {
		System.out.println("======= 챌린지 개설 정보 =======");
		System.out.println("사용자 이름: " + userName);
		System.out.println("챌린지 제목: " + challengeTitle);
		System.out.println("인증 빈도: " + checkInFrequency);
		System.out.println("챌린지 기간: " + challengeDuration);
		System.out.println("시작일: " + startDate);
		System.out.println("인증 방식: " + checkInMethod);
	}
}
