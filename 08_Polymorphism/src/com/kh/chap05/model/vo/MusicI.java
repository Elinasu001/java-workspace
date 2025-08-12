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
 * 
 */
public interface MusicI {
	
	// 인터페이스로 객체 생성이 불가능하기 때문에 생성자를 기술할 수 없음
	//public MusicI() {}
	
	// 인터페이스에서는 암묵적으로 public static final => 대문자 및 초기화 필요
	/*public static final*/ int NUM = 1;
	// 인터페이스의 모든 필드들은 암묵적으로 public static final
	
}
