package com.kh.controller;

import com.kh.run.Run;

public class StringController {

	//String 클래스 => 불변 (변하지 않음을 의미)
	/*
	 * String 클래스 사용방법
	 * 
	 * 1. new 연산자를 사용해서 String 클래스의 생성자를 호출하는 방법 [ 회사에서 쓰면 혼날수도...? ]
	 * 2. 대입연산자를 이용해서 문자열 리터럴값을 대입하는 방법 [ 우리가 자주 쓴 방법 ]
	 * 
	 */
	
	// 1. 생성자를 호출해서 문자열 객체를 생성하는 방법
	public void method1() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		Run run = new Run();
		//String str3 = "hello";
		System.out.println(str1.toString()); //hello // 참조자료형인데 toString 을 @override
		System.out.println(str2); //hello
		System.out.println(run); //com.kh.run.Run@7960847b => run.toString() 부모클래스의 run 클래스가 가지고 있는 걸 가져와서 호출
		// 1. String 클래스의 toString()의 경우
		// 실제 담겨있는 문자열 리터럴 value 값을 반환함으로 오버라이딩
		
		Run run2 = new Run();
		System.out.println(run.equals(run2)); //false
		// this(내주소) == obj(전달받은 주소)
		
		
		//equals
		System.out.println(str1.equals(str2)); //true
		// why true????
		// this(내주소) == obj(전달받은 주소) 주소값 비교는 물론이고 실제 value == value 문자열 값도 비교하도록 오버라이딩 하는구나
		
		// hasCode()
		System.out.println(str1.hashCode()); //99162322
		System.out.println(str2.hashCode()); //99162322
		// why == ?
		System.out.println("hello".hashCode()); //99162322
		// object hashCode 찍은게 아닌 자신의 value 값을 이용해서 오버라이딩
		// 즉, 주소값을 해싱하는 것이 아니라 실제 담긴 문자열값을 기반으로 해시코드 값을 만들도록 오버라이딩.
		
		
		// 진짜 저 참조형 변수들을 식별할 수 있는 값을 알아내는 법
		// System.identityHashCode(참조형변수)
		System.out.println(System.identityHashCode(str1)); //1785210046
		System.out.println(System.identityHashCode(str2)); //1552787810
		
		// 객체가 다른지 아닌지 비교하려면? (주소값을 가지고 비교)
		System.out.println(str1 == str2); // false
		
	}
	
	// 2. 문자열 리터럴 대입 방식
	public void method2() {
		String str1 = "hello";
		String str2 = "hello";
		
		//toString()
		System.out.println(str1); //hello
		System.out.println(str2); //hello
		
		//equals()
		System.out.println(str1.equals(str2)); //true
		
		//hasCode()
		System.out.println(str1.hashCode()); //99162322
		System.out.println(str2.hashCode()); //99162322
		
		
		// 똑같음 ... 이래서 1번 방법을 사용할 경우 문제가 됨.
		//System.identityHashCode()
		System.out.println(System.identityHashCode(str1)); //2036368507
		System.out.println(System.identityHashCode(str2)); //2036368507
		
		System.out.println(str1 == str1); //true
	}
	/*
	 * String Constant Pool : 
	 * - String 자바 9 버전 이상 부터는 byte 형으로 만듦. => 공간을 아끼기 위함.
	 * 
	 * - new로 객체 생성 시 객체라 heap에 올라감 만약, 생성자 호출(new) 2번 하게 되면 힙에 두개가 올라가는...
	 * 	=> 이럴 경우 공간을 많이 차지하게 됨.
	 * 	=> 그래서 String Constant Pool을 사용하여 heap 영역에 두어(똑같은 문자열은 들어갈 수 없음) 
	 * 		재사용 되게 만들어 공간 차지를 줄임.
	 */
	public void method3(){
		
		String exam = new String("hello");
		String str = "hello";
		
		// 문자열 리터럴은 대입 연산자를 사용해 대입할 때
		// String Constant Pool 영역에 등록됨
		// 특 : 동일한 내용의 문자열 리터럴이 존재할 수 없음
	}
}
