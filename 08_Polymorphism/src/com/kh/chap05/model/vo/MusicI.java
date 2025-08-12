package com.kh.chap05.model.vo;
/*
 * interface
 * [표현법]
 * 
 * 접근제한자 interface 인터페이스식별자 {
 * 
 * }
 * 
 * 구체 클래스 : public ~
 * 추상 클래스 : abstract
 * 인터페이스 : interface
 * - interface cannot have constructors (객체 생성 불가능)
 * 
 * - 추상클래스보다 더욱 강한 규칙성, 강제성을 가짐
 * - 인터페이스의 필드는 상수 필드
 * - 인터페이스의 메소드 키워드를 붙이지 않는 이상 추상 메소드
 * - 인터페이스는 다중 구현을 허용한다. <=> 상속은 단일 상속만 가능하다.
 * - "무조건 구현해야하는 기능이 있을 경우 인터페이스를 사용해서
 * 	  사용법만 만들어주고 구현하는 쪽에서 실체화하게 만듦" ==> 오버라이딩
 */
public interface MusicI {
	
	// 인터페이스로 객체 생성이 불가능하기 때문에 생성자를 기술할 수 없음
	//public MusicI() {}
	
	// 인터페이스에서는 암묵적으로 public static final => 대문자 및 초기화 필요
	/*public static final*/ int NUM = 1;
	// 인터페이스의 모든 필드들은 암묵적으로 public static final
	
	/*
	 * public void hi(){
	 * 
	 * {
	 * 
	 * */
	
	/*public abstract*/ void play();
	// 인터페이스의 메소드들은 기본적으로 추상 메소드
	
	default void stop() {
		System.out.println("음악을 멈춥니다.");
	}
	// 인터페이스를 구현한 모든 클래스가 동일하게 수행해야하는 메소드에는 default 키워드를 붙임
	// 너무 남발하기 보다는 적당히! 키워드임 접근제한자의 default 랑 다름.
	
}
