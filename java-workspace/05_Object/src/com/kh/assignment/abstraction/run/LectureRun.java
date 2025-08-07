package com.kh.assignment.abstraction.run;

import java.util.Scanner;

import com.kh.assignment.abstraction.vo.LectureProgress;

public class LectureRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LectureProgress lecture = new LectureProgress();

		System.out.println("==== 강의 등록을 시작합니다 ====");

		// 1. 이름 입력받기
		System.out.print("이름을 입력하세요 > ");
		lecture.setUserName(sc.nextLine());

		// 2. 강의 이름 입력받기
		System.out.print("강의 이름을 입력하세요 > ");
		lecture.setTitle(sc.nextLine());

		// 3. 강의 시작 날짜 입력받기
		System.out.print("강의 시작 날짜를 입력하세요 (예: 2025-08-10) > ");
		lecture.setStartDate(sc.nextLine());

		// 4. 강의 종료 날짜 입력받기
		System.out.print("강의 종료 날짜를 입력하세요 (예: 2025-08-10) > ");
		lecture.setEndDate(sc.nextLine());

		// 5. 현재 강의 진도율 입력받기
		System.out.print("현재 강의 진도율을 입력하세요 (0~100) > ");
		int progress = sc.nextInt();
		sc.nextLine();
		lecture.setProgressPercent(progress);

		// 6. 강의 진도율이 20 미만이면 출력하는 메소드 호출
		lecture.lowProgressMessage();

		// 7. 강의 진도율 채우기
		boolean exit = false;
		
		while (!exit) {
			System.out.println("======== 메뉴 ========");
			System.out.println("1. 현재 강의 진도율 보기");
			System.out.println("2. 강의 듣기 (4% 증가)");
			System.out.println("3. 종료하기");
			System.out.print("선택해주세요. > ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				//사용자정보 메소드 호출
				System.out.println(lecture.info());
				break;
			case 2:
				// 강의 수강 진도 증가 메소드 호출
				lecture.plusProgress();
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
