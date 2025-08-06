package com.kh.assignment.abstraction.vo;

public class LectureProgress {
	//[필드]
	private String userName;		// 사용자 이름
	private String lectureTitle;	// 강의 이름
	private String startDate;		// 강의 시작 날짜
	private String endDate; 		// 강의 종료 날짜
	public  int progressPercent;	// 현재 강의 진도율 (0~100%)
	
	//[메소드]
	public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLectureTitle(String lectureTitle) {
        this.lectureTitle = lectureTitle;
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
    
    // 강의 진도 출력
    public void printLectureInfo() {
        System.out.println("========= 강의 정보 ==========");
        System.out.println("사용자 이름 : " + userName);
        System.out.println("강의 이름 : " + lectureTitle);
        System.out.println("강의 날짜 : " + startDate);
        System.out.println("강의 과목 : " + endDate);
        System.out.println("현재 강의 진도율 : " + progressPercent + "%");
    }
    
    // 강의 진도율이 20 미만이면 출력하기
    public void checkLowProgressMessage() {
        if (progressPercent < 20) {
            System.out.println("!! 현재 강의 진도율은 " + progressPercent + "% 입니다. 더 듣는 것을 추천해요.");
        }
    }
    
    // 강의 수강으로 진도 증가
    public void listenLecture() {
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
	
}
