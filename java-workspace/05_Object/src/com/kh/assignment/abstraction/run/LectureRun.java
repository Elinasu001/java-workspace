package com.kh.assignment.abstraction.run;

import java.util.Scanner;

import com.kh.assignment.abstraction.vo.LectureProgress;

public class LectureRun {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 LectureProgress lecture = new LectureProgress();
		 
		 System.out.println("==== 강의 등록을 시작합니다 ====");
		 
		 System.out.print("이름을 입력하세요 > ");
		 lecture.setUserName(sc.nextLine());

		 System.out.print("강의 이름을 입력하세요 > ");
		 lecture.setLectureTitle(sc.nextLine());

		 System.out.print("강의 시작 날짜를 입력하세요 (예: 2025-08-10) > ");
		 lecture.setStartDate(sc.nextLine());

		 System.out.print("강의 종료 날짜를 입력하세요 (예: 2025-08-10) > ");
		 lecture.setEndDate(sc.nextLine());

		 System.out.print("현재 강의 진도율을 입력하세요 (0~100) > ");
		 int progress = sc.nextInt();
		 sc.nextLine();
		 lecture.setProgressPercent(progress);
		 
		 // 강의 진도율이 20 미만이면 출력하기
		 lecture.checkLowProgressMessage();
		 
		 // 강의 진도율 채우기
		 boolean exit = false;
	        while (!exit) {
	            System.out.println("==== 메뉴 ====");
	            System.out.println("1. 현재 강의 진도율 보기");
	            System.out.println("2. 강의 듣기 (4% 증가)");
	            System.out.println("3. 종료하기");
	            System.out.print("선택 > ");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1:
	                    lecture.printLectureInfo();
	                    break;
	                case 2:
	                    lecture.listenLecture();
	                    break;
	                case 3:
	                    exit = true;
	                    System.out.println("프로그램을 종료합니다.");
	                    break;
	                default:
	                    System.out.println("올바른 번호를 선택해주세요.");
	            }
	        }
		 
	}

}
