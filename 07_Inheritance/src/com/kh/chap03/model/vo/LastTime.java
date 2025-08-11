package com.kh.chap03.model.vo;

// 1절 
/*
import java.lang.String;
import java.lang.Object;
import java.lang.System;
import java.loan.*; 생략되어있음.
*/
public class LastTime extends Object {
	// 모든 클래스의 최상위 부모클래스 => Object => 생략가능
	private String name;
	
	public LastTime() {
		/*super();*/
	}
	public LastTime(String name) {
		/*super();*/
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		/*return;*/
	}
	
	/*
	 * Overriding(오버라이딩)
	 * 
	 * - 상속받고 있는 부모클래스의 메소드를 자식 클래스에서 재정의(다시씀)
	 * - 부모클래스가 제공하고 있는 메소드를 자식이 고쳐서 사용하겠다는 의미
	 * - 자식클래스에 존재하는 오버라이딩 된 메소드가 우선권을 가져서 호출되게 됨.
	 * 
	 * 오버라이딩 성립 조건!
	 * 1. 부모메소드와 메소드명 동일 (toString을 tostring 으로 쓰지 말것)
	 * 2. 매개변수의 자료형, 개수, 순서가 동일 (변수명과는 무관함)
	 * 3. 반환형이 동일(private 로 호출 하지 말것)
	 * 4. 부모메소드의 접근제하자보다 공유범위가 같거나 넓게 선언
	 * 
	 * -- 개발자들끼리의 약속 --
	 * ★ 오버라이딩한 메소드에는 반드시 @Override 애노테이션을 붙여주자
	 */
	@Override
	public String toString() {
		return "LastTime [name=" + name + "]";
	}
}
