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
	public String searchId(String id) {
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				return m[i].inform();
						
			}
		}
		return null;
	}

	// 이름으로 회원을 조회하는 메소드
	public Member[] searchName(String name) {
		return null;
	}

	// 이메일로 회원을 조회하는 메소드
	public Member[] searchEmail(String email) {
		return null;
	}

	// 비밀번호 변경 메소드
	public boolean updatePassword(String id, String password) {
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

	// Member 객체 반환 메소드
	public Member[] printAll() {
		return null;
	}
}
