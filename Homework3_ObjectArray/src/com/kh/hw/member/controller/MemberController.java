package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	private Member[] m = new Member[10];
	
	public MemberController() {
        m[0] = new Member("aaaaa","박신우","aa","aaa@aaa.aaa",'F',33);
        m[1] = new Member("bbbbb","강고결","bb","bbb@bbb.bbb",'M',34);
        m[2] = new Member("ccccc","남나눔","cc","ccc@ccc.ccc",'M',28);
        m[3] = new Member("ddddd","도대담","dd","ddd@ddd.ddd",'M',35);
        m[4] = new Member("eeeee","류라라","ee","eee@eee.eee",'F',17);
        m[5] = new Member("fffff","문미미","ff","fff@fff.fff",'F',20);
        m[6] = new Member("ggggg","박보배","gg","ggg@ggg.ggg",'M',26);
        m[7] = new Member("hhhhh","송성실","hh","hhh@hhh.hhh",'M',41);
//        m[8] = new Member("iiiii","윤예의","ii","iii@iii.iii",'F',28);
//        m[9] = new Member("jjjjj","정재주","jj","jjj@jjj.jjj",'M',23);
    }
	
	// 현재 존재하는 멤버 수 반환
	public int existMemberNum() {
		int cnt = 0;
		for(int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				cnt++;
			}
		}
		return cnt;
	}
	
	//아이디 중복확인 하는 메소드
	public boolean checkId(String inputId) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(inputId))
				return true; // 중복 o
		}
		return false; // 중복 x
	}
	
	// Member 객체를 객체배열에 저장하는 메소드
	public void insertMember(String id
							, String name
							, String password
							, String email
							, char gender
							, int age) {
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				return;
			}
		}
		
	}
	
	// id 로 회원을 조회하는 메소드
	public String searchId(String id) {
		if(id == null || id.trim().isEmpty()) {
			return null;
		}
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				return m[i].inform();
			}
		}
		return null;
	}
	
	// 이름으로 회원을 조회하는 메소드
	public Member[] searchName(String name) {
		if(name == null || name.trim().isEmpty()) {
			return new Member[0];
		}
		
		Member[] tmp  = new Member[m.length];
		int idx = 0;
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && name.equals(m[i].getName()))  {
				tmp[idx++] = m[i];
			}
		}
		return tmp ;
	}
	
	// 이메일로 회원을 조회하는 메소드
	public Member[] searchEmail(String email) {
		if(email == null || email.trim().isEmpty()) {
			return new Member[0];
		}
		
		Member[] tmp = new Member[m.length];
		int idx = 0;
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && email.equals(m[i].getEmail()))  {
				tmp[idx++] = m[i];
			}
		}
		return tmp;
	}
	
	
	// 비밀번호 변경 메소드
	public boolean updatePassword(String id, String password) {
		if(id != null && !id.trim().isEmpty()) {
			return false;
		}
		
		if(password != null && !password.trim().isEmpty()) {
			return false;
		}
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && id.equals(m[i].getId())) {
				m[i].setPassword(password); // real update
				return true;
			}
		}
		return false; // id x
	}
	
	// 이름 변경 메소드
	public boolean updateName(String id, String name) {
		
		if(id != null && !name.trim().isEmpty()) {
			return false;
		}
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && name.equals(m[i].getName())) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}
	
	// 이메일 변경 메소드
	public boolean updateEmail(String id, String email) {
		
		if(id != null && !email.trim().isEmpty()) {
			return false;
		}
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && email.trim().isEmpty()) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
		
	}
	
	// 한 회원만 삭제하는 메소드
	public boolean delete(String id) {
		return false;
	}
	
	// 전체 회원을 삭제하는 메소드
	public void delete() {
		return;
	}
	
	// Member 객체 반환 메소드
	public Member[] printAll() {
		return m;
	}
}
