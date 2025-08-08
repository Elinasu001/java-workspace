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
		System.out.println(member3.info()); //[사용자 아이디 : user01, 사용자 패스워드 : 1234, 사용자 닉네임 : null]
		
		Member member4 = new Member("user02", "pass02", "홍길동");
		System.out.println(member4.info());
		
		
	}

}
