package com.kh.hw.member.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();

	public MemberMenu() {}
	
	public void mainMenu() {
		
		while (true) {
			int count = mc.existMemberNum(); // 현재 등록 회원 수

			System.out.println("현재 등록 가능한 회원 수는 " + mc.SIZE + "명입니다." );
			System.out.println("현재 등록된 회원 수는 " + count + "명입니다.");
			
			if (count != 10) {
				// 전체 메뉴
				System.out.println("1. 새 회원 등록");
			} else {
				System.out.println("회원 수가 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호  > ");
			
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다:) ");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	/* 과제 : public -> private 변경 */
	private void insertMember() {
		
		String id = " ";
		
		while(true) {
			
			System.out.println("아이디를 입력해주세요 > ");
			id = sc.nextLine();
			
			// 중복 아이디가 있다 == true
			// 중복 아이디가 없다 == false
			boolean result = mc.checkId(id);
			if(result) {
				System.out.println("중복아이디가 존재합니다. 다시 입력하세요.");
			} else {
				break;
			}
		}
		
		// 이름
		System.out.println("이름을 입력해주세요 > ");
		String name = sc.nextLine();
		
		// 비밀번호
		System.out.print("비밀번호를 입력해주세요 >  ");
		String password = sc.nextLine();
		
		// 이메일
		System.out.print("이메일 입력해주세요 >  ");
		String email = sc.nextLine();
		
		// 성멸 => M, m, F, f 가 아니면 다시 입력받아서
		char gender = ' ';
		
		while(true) {
			
			System.out.print("성별을 입력해주세요 >  ");
			gender = sc.nextLine().charAt(0);

			if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {
				break;
			}
			
			System.out.println("성별을 다시 입력해주세요! (M 또는 F) : ");
		}
		
		// 나이 
		int age = 0;
		boolean validInput = false;
		while(true) {
			try {
				if(!validInput) {
					System.out.print("나이 입력해주세요 >  ");
					age = sc.nextInt();
					sc.nextLine();
					
				} else {
					break;
				}
				
			} catch(InputMismatchException e){
				System.out.println("\n잘못 입력하셨습니다. 정수로 입력해주세요.\n");
				sc.nextLine();
				continue;
			}
			break;
		}
		
		
//		System.out.print("나이 입력해주세요 >  ");
//		int age = sc.nextInt();
//		sc.nextLine();
	
		mc.insertMember(id, name, password, email, gender, age);
		System.out.println("회원 등록이 완료되었습니다.\n");
		
	}

	private void searchMember() {

		while (true) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일으로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");

			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				searchId();
				break;
			case 2:
				searchName();
				break;
			case 3:
				searchEmail();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}

		}
	}
	
	// 아이디 검색 메소드
	private void searchId() {
		// 검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchId() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		// 회원 검색 결과 출력
		
		System.out.println("검색할 아이디를 입력해주세요 > ");
		String id = sc.nextLine();
		
		String res = mc.searchId(id);
		
		if(res == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(res);
		}

	}
	
	// 이름 검색 메소드
	private void searchName() {
		// 검색할 이름을 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchName() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		// 회원 검색 결과 출력

	}
	
	// 이메일 검색 메소드
	private void searchEmail() {
		// 검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchEmail() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		// 회원 검색 결과 출력
		
		
	}

	private void updateMember() {
		//1. 비밀번호 수정하기 ➔ updatePassword()
		//2. 이름 수정하기 ➔ updateName()
		//3. 이메일 수정하기 ➔ updateEmail()
		//9. 메인으로 돌아기기
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감

		
		while (true) {
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인으로 돌아가기");

			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				updatePassword();
				return;
			case 2:
				updateName();
				return;
			case 3:
				updateEmail();
				return;
			case 9:
				System.out.println("메인으로 돌아가기");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		}
	}
	
	// 비밀번호 수정 메소드
	private void updatePassword() {
		// 수정할 회원 id와 비밀번호를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 updatePassword() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
		// 검색 결과가 있으면 “수정이 성공적으로 되었습니다.” 출력 후
		// mainMenu()로 돌아감
		
		

	}

	// 이름 수정 메소드
	private void updateName() {
		// 수정할 회원 id와 이름을 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 updateName() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
		// 검색 결과가 있으면 “수정이 성공적으로 되었습니다.” 출력 후
		// mainMenu()로 돌아감

		

	}

	// 이메일 수정 메소드
	private void updateEmail() {
		// 수정할 회원 id와 이메일을 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 updateEmail() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
		// 검색 결과가 있으면 “수정이 성공적으로 되었습니다.” 출력 후
		// mainMenu()로 돌아감
		
		

	}
	
	private void deleteMember() {
		//1. 특정 회원 삭제하기 ➔ deleteOne()
		//2. 모든 회원 삭제하기 ➔ deleteAll()
		//9. 메인으로 돌아기기
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감
		
		while (true) {
			System.out.println("1. 특정 회원 삭제하기");
			System.out.println("2. 모든 회원 삭제하기");
			System.out.println("9. 메인으로 돌아가기");

			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				deleteOne();
				return;
			case 2:
				deleteAll();
				return;
			case 9:
				System.out.println("메인으로 돌가갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		}

	}
	
	// 특정 회원 삭제 메소드
	private void deleteOne() {
		// 삭제할 회원 id를 사용자에게 입력 받고 정말 삭제할 것인지 사용자에게
		// 물어본 뒤, Y나 y를 사용자가 입력할 경우 입력 받은 id를
		// mc의 delete() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
		// 검색 결과가 있으면 “성공적으로 삭제하였습니다.” 출력 후
		// mainMenu()로 돌아감
		

	}

	// 모든 회원 삭제 메소드
	private void deleteAll() {
		// 정말 삭제할 것인지 사용자에게 물어본 뒤, Y나 y를 사용자가 입력할 경우
		// mc의 delete() 메소드 호출, “성공적으로 삭제하였습니다.” 출력 후
		// mainMenu()로 돌아감
		
		System.out.println("정말 삭제하시겠습니까? (Y / N) > ");
		String ans = sc.nextLine();

		if (ans.equals("Y") || ans.equals("y")) {
			
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
			
			// 전체 목록 출력
			printAll();
			return;
			
		} else {
			System.out.println("삭제를 취소했습니다.");
		}
	}
	
	
	// 모든 회원 정보 메소드
	private void printAll() {
		// mc의 printAll() 메소드의 반환 값을 가지고 저장된 회원을 출력하는데
		// 저장된 회원의 수가 0명이면 “저장된 회원이 없습니다.” 출력,
		// 0명이 아니면 저장된 모든 회원의 정보 출력


	}
}
