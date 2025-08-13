package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	// 메인 메뉴를 출력하는 메소드
	public void mainMneu() {
		System.out.println("호출됐지롱~~");
		//학생은 최대 3명까지 저장할 수 있습니다.
		//현재 저장된 학생은 M명입니다.
		//사원은 최대 10명까지 저장할 수 있습니다.
		//현재 저장된 사원은 N명입니다.
		// M과 N에 들어가는 숫자는 PersonController(pc)클래스에 있는
		// personCount()메소드의 반환 값을 이용하여 출력
		
		//1. 학생 메뉴 ➔ studentMenu()
		//2. 사원 메뉴 ➔ employeeMenu()
		//9. 끝내기 ➔ “종료합니다.” 출력 후 종료
		//메뉴 번호 :
		// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		while(true) {
			int studentCount = pc.sudentCount();
			int	employeeCount = pc.employeeCount();
			System.out.println("학생은 최대 " + pc.SIZE1 + "명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + studentCount + "명입니다.");
			System.out.println("사원은 " + pc.SIZE2 + "명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + employeeCount + "명입니다.");
			
			System.out.println("메뉴를 선택해주세요. > ");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			
			int menuNo = sc.nextInt();
			sc.nextLine();
			switch(menuNo) {
			case 1 : studentMenu(); break;
			case 2 : employeeMenu(); break;
			case 9 : System.out.println("종료합니다. "); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); return;
			
			}
		}
		
	}
	
	// 학생 메뉴를 출력하는 메소드
	public void studentMenu() {
		//1. 학생 추가 ➔ insertStudent()
		//2. 학생 보기 ➔ printStudent()
		//9. 메인으로 ➔ “메인으로 돌아갑니다.” 출력 후 메인으로
		// 만일 학생 객체 배열에 담긴 데이터의 수가 3개 일 때
		// “학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상
		// 활성화 되지 않습니다.”를 출력 후 메뉴 번호를 담음
		// 실제로 1번을 누르면 “잘못 입력하셨습니다. 다시 입력해주세요.”를 출력
		// 학생 객체 배열에 담긴 데이터의 수가 3개가 아닐 때는
		// 위에 출력한 메뉴 모두 받을 수 있게 함
		//메뉴 번호 :
		// 잘못 입력했을 경우, “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		while(true) {
			
			int count = pc.sudentCount();
			
			System.out.println("학생 메뉴를 출력할 수 있는 서비스입니다.");
			if(count != 3) {
				System.out.println("1. 학생 추가");
			} else {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더이상 활성화 되지 않습니다.");
			}
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.println("메뉴 번호를 클릭해주세요 > ");
			
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : insertStudent(); break;
			case 2 : printStudent(); break;
			case 9 : System.out.println("메인으로 돌아갑니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); return;
			
			}
		}

	}
	
	// 사원 메뉴를 출력하는 메소드
	public void employeeMenu() {
		//1. 사원 추가 ➔ insertEmployee()
		//2. 사원 보기 ➔ printEmployee()
		//9. 메인으로 ➔ “메인으로 돌아갑니다.” 출력 후 메인으로
		// 만일 사원 객체 배열에 담긴 데이터의 수가 10개 일 때
		// “사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상
		// 활성화 되지 않습니다.”를 출력 후 메뉴 번호를 담음
		// 실제로 1번을 누르면 “잘못 입력하셨습니다. 다시 입력해주세요.”를 출력
		// 사원 객체 배열에 담긴 데이터의 수가 10개가 아닐 때는
		// 위에 출력한 메뉴 모두 받을 수 있게 함
		//메뉴 번호 :
		// 잘못 입력했을 경우, “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		
		int count = pc.employeeCount();
		if(count != 10) {
			System.out.println("");
		}
	}
	
	// 사용자에게 객체배열에 저장할 학생 데이터를 받는 메소드
	public void insertStudent() {
		//학생 이름 :
		//학생 나이 :
		//학생 키 :
		//학생 몸무게 :
		//학생 학년 :
		//학생 전공 :
		// 위의 데이터를 모두 사용자에게 입력 받아 pc의 insertStudent()메소드의
		// 매개변수로 넘겨 줌
		// 이 때 학생 객체 배열에 담긴 데이터의 수가 3개가 되지 않았을 때는
		// “그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : “를 출력해
		// N 또는 n이 아니면 위의 데이터를 받는 것을 반복하고
		// N 또는 n이라면 반복을 멈춤
		// 만일 학생 객체 배열에 담긴 데이터의 수가 3이 되었을 때는
		// “학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고
		// 학생 메뉴로 돌아갑니다.”를 출력 후 반복 종료
	}
	
	// 객체배열에 저장된 학생 데이터를 출력하는 메소드
	public void printStudent() {
		// pc의 printStudent() 메소드의 반환 값을 이용하여 학생 객체 배열에 저장된
		// 모든 데이터 출력
	}
	
	// 사용자에게 객체배열에 저장할 사원 데이터를 받는 메소드
	public void insertEmployee() {
		//사원 이름 :
		//사원 나이 :
		//사원 키 :
		//사원 몸무게 :
		//사원 급여 :
		//사원 부서 :
		// 위의 데이터를 모두 사용자에게 입력 받아 pc의 insertEmployee()메소드의
		// 매개변수로 넘겨 줌
		// 이 때 사원 객체 배열에 담긴 데이터의 수가 10개가 되지 않았을 때는
		// “그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : “를 출력해
		// N 또는 n이 아니면 위의 데이터를 받는 것을 반복하고
		// N 또는 n이라면 반복을 멈춤
		// 만일 사원 객체 배열에 담긴 데이터의 수가 10이 되었을 때는
		// “사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고
		// 사원 메뉴로 돌아갑니다.”를 출력 후 반복 종료
	}
	
	//객체배열에 저장된 사원 데이터를 출력하는 메소드
	public void printEmploye() {
		// pc의 printEmployee() 메소드의 반환 값을 이용하여 사원 객체 배열에 저장된
		// 모든 데이터 출력
	}
	
}
