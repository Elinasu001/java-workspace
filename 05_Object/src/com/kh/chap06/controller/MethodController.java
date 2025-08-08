package com.kh.chap06.controller;

public class MethodController {
			/* 자료형 */
	
	/*
	 * 메소드(Method) == 멤버 함수 : 입력 값을 가지고 특정동작을 수행한 뒤 결과물을 내놓는다.
	 * 
	 * 프로그래밍 언어에서의 함수 : 특정 작업을 수행하기 위해서 만들어진 코드 블록
	 * 1. 재사용성
	 * 2. 모듈화
	 * 
	 * 객체지향 프로그래밍에서의 메소드란? : 객체가 수행할 수 있는 행동을 정의한 코드 블록
	 * 
	 * 특정 자료형에서만 사용이 가능한 함수
	 * 
	 * [표현법]
	 * 
	 * 접근제한자 예약어 반환형 메소드식별자(매개변수의 자료형 매개변수의 식별자){
	 * 
	 * 		수행할 코드;
	 * 		
	 * 		return 반환값;
	 * 
	 * }
	 *  생략 가능한 것 : 예약어, 매개변수, return 문(void 일 경우에만 생략 가능)
	 * 	반환형 : return 반환할 값의 자료형
	 * 	호출할 때 메소드 전달 인자값 => 매개변수의 자료형과 개수가 정확하게 !!! 일치해야함.★★★	
	 *  
	 *  한 번 정의해두면 필요할 때마다 언제든 호출이 가능 ~~
	 *  
	 *  
	 */
	
	// 더하기를 해서 결과를 반환해주는 코드 블럭을 만들고 싶다.
	public int add(int a, int b) { // 메소드 시그니처
		int sum = a+ b; // 메소드 바디
		return sum; // 반환값
	}
	
	
	// 1. 매개변수가 존재하지 않고 반환값도 존재하지 않는 메소드
	public void method1() {
		
		System.out.println("매개변수와 반환값이 둘 다 존재하지 않습니다.");
		
		//return; // returnType이 void 일 경우 클래스의 기본생성자와 같다.(JVM이 만들어준 것 == 생략가능)
	}
	
	// 2. 매개변수는 존재하지 않지만 반환값은 존재하는 메소드
	/*
	public String getName() {
		return name;
	}
	*/
	public String method2() {
		System.out.println("매개변수는 존재하지 않지만 반환값은 존재합니다.");
		//String method2 = "returnValue";
		
		return "returnValue";
	}
	public String method3() {
		return method2();
	}
	
	public void println(String parameter) {
		System.out.println(parameter);
	}
	
	
	// 3. 매개변수는 존재하지만 반환값은 존재하지 않는 메소드 
	/*
	public void setName(String name) {
		this.name;
	}
	*/
	public void method4(int num) {
		System.out.println("매개변수는 존재하고 반환값은 존재하지 않습니다.");
		System.out.println("전달받은값 + 100" + (num + 100));
	}
	
	// 4. 매개변수도 존재하고 반환값도 존재하는 메소드
	public int method5(int num) {
		System.out.println("매개변수도 있어요~ 반환값도 있어요~");
		return num + 50;
	}
	
	// 메소드 사용시 주의_재귀호출
	public void a() {
		System.out.println("메소드 a호출!");
		//a(); // 하면 계속 스택에 쌓이는 오류가 발생. (a 와 b 서로 부르다가 터져버림)
	}
	public void b() {
		System.out.println("메소드 b호출!");
		//b(); // 하면 계속 스택에 쌓이는 오류가 발생.
	}
	
	// 얕은 복사
	public void test(MethodController mc) {
		mc.method1();
	}
	
	public static void staticMethod() {
		System.out.println("안녕 나는 스택틱 메소드임");
	}
	
//	public void haha(String mc) {
//		
//	}
	
	
}
