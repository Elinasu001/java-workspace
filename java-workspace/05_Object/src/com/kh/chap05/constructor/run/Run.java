package com.kh.chap05.constructor.run;

import java.util.Scanner;

import com.kh.chap05.constructor.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Member member = new Member();
						// new : 객체 생성 Member() : 객체 초기 상태
		System.out.println(member.info());
		
		Member member2 = new Member("하하호호");//매개 변수 하나 호출
		
		Member member3 = new Member("user01", "1234");// 매개 변수 하나 호출
		
		
//		System.out.println("사용자 아이디를 입력해주세요 > ");
//		String userId = sc.nextLine();
//		member.setUserId(userId);
//		
//		
//		
//		System.out.println("사용자 패스워드를 입력해주세요 > ");
//		String userPwd = sc.nextLine();
//		member.setUserPwd(userPwd);
//		
//		System.out.println("사용자 닉네임을 입력해주세요 > ");
//		String nickName = sc.nextLine();
//		member.setNickName(nickName);
		
		
	}

}
