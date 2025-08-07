package com.kh.chap05.constructor.model.vo;

public class Member {
	
	// [필드부]
	// 아이디, 비밀번호, 닉네임
	private String userId;
	private String userPwd;
	private String nickName;
	
	//[생성자부]
	/*
	 * 생성자(Constructor) : 객체를 생성하는데 사용하는 특수한 유형의 메소드
	 * 
	 * [표현법]
	 * 접근제한자 클래스식별자 (매개변수(생략가능)){
	 * 		해당 생성자를 통해서 객체 생성 시 실행하고자 하는 코드;
	 * }
	 * 
	 * 생성자의 역할
	 * -- 기술적인 관점 : 객체가 생성될 때 어떤 상태로 시작을 해야하는가
	 * -- 개념적인 관점 : 객체가 처음부터 유효한 상태를 가지도록 강제
	 * 
	 * 생성자의 종류
	 * 1. 매개변수가 없는 생성자 => 기본생성자
	 * 2. 매개변수가 존재하는 생성자 => 객체를 생성과 동시에 유효하게 만들기 위함.
	 */
	
	// 회원가입 성공한 회원의 정보를 여기다가 담는다.
	// 기본 생성자(매개변수 없음)
	//public Member () {
		// System.out.println("rrrr");
		// 기본생성자는 객체를 생성할 목적으로 호출해서 사용
		// 기본생성자는 생략해도 에러가 발생하지 않음
		// 클래스 내부에 생성자를 하나도 작성하지 않으면 JVM이 기본생성자를 자동으로 만들어줌!
		// 기본생성자를 항상 작성하자 !!! ★★★★★★★	
		
	//}
	
	// 	public member() <-- 메소드라고 인식
	//	public void Member(); <-- 메소드라고 인식
	
	public Member() {} //<-- 얘는 무조건꼭 있어야함! ( 이게 있을 경우 매개변수가 있는 생성자가 있어도 메인에 객체 생성이 빨간 불이 안그어짐)
	
	// 매개변수가 존재하는 생성자
	public Member(String userId) {
		System.out.println("매개변수가 한 개인 생성자");
	}
	
	public Member(String userId, String userPwd) {
		System.out.println("매개변수가 두 개인 생성자");
		System.out.println("전달받은 아이디 값 : " + userId);
		System.out.println("전달받은 비밀번호 값 : " + userPwd);
	}
	
	//[메소드부]
	//getter()
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getNickName() {
		return nickName;
	}
	
	// setter()
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	//info()
	public String info() {
		String info = "[사용자 아이디 : " + userId + ", 사용자 패스워드 : " + userPwd + ", 사용자 닉네임 : " + nickName + "]"; 
		return info;
	}
	
	
}
