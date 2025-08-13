package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

/*
 * 값이 없을 경우 : -1
 * 삭제 / 갱신 : boolean
 * 성공 / 실패 : 1 과 0
 */

public class MemberController {
	
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	
	/* 	1. static 블럭 :: 
	 * 	- 객체는 여러 개를 생성하지만, 한 번만 호출되어야 하는 코드가 있다면 "static 블록"을 사용 
	 *	- 객체가 생성되기 전에 한 번만 호출
	 *	- 클래스 내에 선언 O
	 *	- 메소드 내에 선언 X
	 * - 클래스 초기화할 때 꼭 수행되어야 할 작업이 있을 경우 유용하게 사용됨.
	 */
	static{
		System.out.println("1. 호잇 나는 정말 빠르닷.");
	}
	
	
	// 2. 초기화 블럭 :: 어떤 생성자를 호출 하든 다 초기화 시켜줌 , 호잇 나는 3등이다.
	{
		m[0] = new Member("admin", "관리자", "aa", "aaa@aaa.aa", 'F', 100);
	}
	
	// 3.
	public MemberController() {
		System.out.println("호잇 나는 4등이다");
	}
	
	// 현재 존재하는 멤버 수 반환
	public int existMemberNum() {
		
		int count = 0;
		
		/*
		if(m[0] != null) count++;
		if(m[1] != null) count++; 
		...
		*/
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				count++;
			}
		}
		
		return count;
		
	}

	// 아이디 중복확인 하는 메소드
	public boolean checkId(String inputId) {
		
		/*
		if(m[0] != null && m[0].getId().equals(inputId)) return true;
		if(m[1] != null && m[1].getId().equals(inputId)) return true;
		...
		*/
		// false && short socket
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(inputId)) {
				return true;
			}
		}
		
		return false;
	}

	// Member 객체를 객체배열에 저장하는 메소드
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		
		/*
		if(m[0] == null) {
			m[0] = new Member(id, name, password, email, gender, age);
			return;
		}
		if(m[1] == null) {
			m[1] = new Member(id, name, password, email, gender, age);
			return;
		}
		...
		*/
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
		
	}

	// 내부 공통 : id 로 인덱스 찾기
	private int indexOfId(String id) {
		return -1;
	}

	// id 로 회원을 조회하는 메소드
	public Member searchId(String id) {
		
		// m[i] != null 안넣을 경우 RuntimeException 발생
		// 매개변수 id : 사용자가 입력한 검색하고자 하는 아이디 값
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				// 아이디 똑같은거 있음
				return m[i]; // 똑같은 아이디 필드가 존재하는 Member 객체의 주소를 반환
			}
		}
		return null;
	}

	// 이름으로 회원을 조회하는 메소드
	public Member[] searchName(String name) {
		
		int count = existMemberNum(); 			// 현재 등록된 회원의 수만 반환
		Member[] members = new Member[count]; 
		
		int index = 0;
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getName().equals(name)) {
				members[index++] = m[i];
			}
		}
		
		return members;
		
	}

	// 이메일로 회원을 조회하는 메소드
	public Member[] searchEmail(String email) {
		return null;
	}

	// 비밀번호 변경 메소드
	public boolean updatePassword(String userId, String userPw, String newPassword) {
		// 전달받은 3개의 값을 가지고 
		// 비밀번호를 바꿔주거나 바꿔주지 않거나
		
		// 배열의 첫번째 요소 아이디값 비교
		for(int i = 0; i < m.length; i++) {
			if(m[0] != null && m[0].getId().equals(userId) && m[0].getPassword().equals(userPw)) {
				m[0].setPassword(newPassword);
				return true;
			}
		}
		return false;
	}

	// 이름 변경 메소드
	public boolean updateName(String id, String name) {
		return false;
	}

	// 이메일 변경 메소드
	public boolean updateEmail(String id, String email) {
		return false;
	}

	// 한 회원만 삭제하는 메소드
	public boolean delete(String id) {
		return false;
	}

	// 전체 회원을 삭제하는 메소드
	public void delete() {
	}

	// Member 객체 반환 메소드 (필드값 반환)
	public Member[] getM() {
		return null;
	}
}
