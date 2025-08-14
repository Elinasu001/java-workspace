package com.kh.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

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
		System.out.println(System.identityHashCode(str)); // 1221555852
		
		str = "bye";
		System.out.println(System.identityHashCode(str)); // 1785210046
		
		str += "!!";
		System.out.println(System.identityHashCode(str)); // 707806938
		
		
		// 문자열 가지고 연산을 하지 않음 
		String a = "a";
		String b = "a";
		System.out.println("결과 : " + a == b); // false why? 문자와 합쳐서 == 해버림
		// 그럼 더 나은 방법은? method4메소드에서 확인
	}
	
	public void method4(){
		
		// 문자열 가지고 연산을 하지 않음 
		String a = "a";
		String b = "a";
		System.out.println("결과 : " + a == b); // false why? 문자와 합쳐서 == 해버림
		// 그럼 더 나은 방법은? method4메소드에서 확인
		
		// StringBuffer
		// Buffer == 임시저장공간
		// 문자열은 불변객체라서 내용물이 변경될 때 마다 새로운 공간을 할당해서 집어넣는다.
		// 이를 해결하기 위해서 임시공간(Buffer)을 준비해서
		// 임시공간에 차곡차곡 담았다가 한번에 처리해주는 클래스
		StringBuffer sb = new StringBuffer();
		// System.out.println("Hello" + "World");
		// 더하기는 메모리낭비가 심해서 append 사용
		sb.append("Hello ");
		sb.append("World! ");
		System.out.println(sb); // Hello World! 
		
		//StringBuilder
		StringBuilder sr = new StringBuilder();
		
		sr.append("Hello ");
		sr.append("World! ");
		System.out.println(sr); // Hello World! 
		
		// 동시제어기능 :: 동일한 시간에 append 가 두번해서 두개가 붙어있을 경우 두개 중에 누가 먼저?
		// => StringBuffer에 들어가 있음 StringBuilder에는 없음 하지만 속도는 StringBuilder가 더 빠르다.
		
		// 동시제어기능(Thread-Safe)이 외부에서 제공이 많이 되고 있기 때문에
		// 충돌환경이 아니라면 굳이 구현할 필요가 없음.
	}
	
	// 문자열과 관련된 메소드들
	public void stringMethod() {
		
		String str1 = "경실련하이텔 아카데미";
		
		// 1. 문자열.length() : int (길이반환)
		// 문자열의 길이를 반환
		System.out.println("str1의 길이 : " + str1.length()); // str1의 길이 : 11
		
		
		// 2. 문자열.charAt(int index) : char (추출)
		char ch = str1.charAt(3);
		System.out.println("하 : " + ch); // 하 : 하
		
		// 3. 문자열.substring(int beginindex) : String (자르기)
		// => 문자열의 beginindex 위치에서 문자열 끝까지의 문자열을 추출해서 반환
		String phoneNumber = "010-1234-5678";
		
		System.out.println(phoneNumber.substring(4));// 1234-5678
		
		//substring 은 오버로딩이 잘되어있어 메소드를 호출 할때 begin index 와 end index 동시 호출 가능
		System.out.println(phoneNumber.substring(4, 8)); // 1234
	
		// 4. 문자열.indexOf(str) : int (몇번인덱스?)
		System.out.println(str1.indexOf("텔")); // 5
		
		//3., 4. ex ) @ 뒤부터 관심없고 사용자 아이디 부분만 가져다 사용하고 싶을 경우 
		String[] emails = {"hog@kh.com", "kim@kh.com", "hite@kh.com", "hahaho@kh.com"};
		
		for(int i = 0; i < emails.length; i++) {
			System.out.println(emails[i].substring(0, emails[i].indexOf("@")));
		}
		/*
		 	hog
			kim
			hite
			hahaho
		 */
		
		// 5. 문자열.toCharArray() : char[] (한행 씩 출력)
		// 문자열의 각 문자들을 char[]로 반환해주는 메소드
		char[] chArr = emails[0].toCharArray();
		
		//=> 0번째 배열의 요소를 한행 씩 출력하고 싶을 경우
		for(int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		/*
		 	h
			o
			g
			@
			k
			h
			.
			c
			o
			m
		 */
		// 5.의 다른 방법의 반복문
		for(char c : chArr) {
			System.out.println(c);
		}
		new String(chArr).chars().mapToObj(c -> (char)c).forEach(System.out::println);
	
		
		// char[] -> String
		System.out.println(String.valueOf(chArr)); // hog@kh.com
		
		// 6. 문자열.replace(char old, char new) : String (치환)
		System.out.println(emails[0].replace("kh", "naver")); // hog@naver.com
		
		
		// 7. 문자열.trim() : (String 공백문자 날리기)
		String str3 = "                          JAVA     ";
		System.out.println(str3.trim()); // JAVA
		
		// 8. 문자열.toUpperCase() : String -> 싹다 대문자로 바꾸기
		//	  문자열.toLowerCase() : String -> 싹다 소문자로 바꾸기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정말 하시겠어요? (Y/N) > ");
		String answer = sc.nextLine();//sc.nextLine().toUpperCase();
		//String upperAnswer = answer.toUpperCase();
		
		if(answer.toUpperCase().equals("Y") || answer.equals("y")) { // 메소드 체이닝 혹은 콜백 함수
			System.out.println("나 찐으로 해야겠다 참을 수가 없다");
		}
		
		
	}
	
	
	public void split() {
		
		//문자열 분리시키기
		String str = "배고파요,졸려요,즐거워요,재밌다";
		
		
		// 문자열.split(String 구분자) : String[]
		String[] arr = str.split(",");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		/*
	  	배고파요
		졸려요
		즐거워요
		재밌다
		 */
		System.out.println();
		
		// 향상된 for문
		// 초기식, 조건식, 증감식 안씀
		//for(값을 받아줄 변수 선언 : 순차적으로 요소에 접근할 배열 || 컬렉션) { }
		// 배열의 요소를 수정할 순 없음 : 보통 출력할 때나 옮겨 담을 때 사용
		for(String s : arr) {
			System.out.println(s);
		}
		
		// java.util.StringTokenizer 클래스를 사용하는 방법
		StringTokenizer stn = new StringTokenizer(str, ",");
		//System.out.println(stn); 아무 의미 없음
		/*
		System.out.println("토크나이저로 뽑아야지!"); 
		System.out.println(stn.nextToken()); // 배고파요
		System.out.println(stn.nextToken()); // 졸려요
		System.out.println(stn.nextToken()); // 즐거워요
		System.out.println(stn.nextToken()); // 재밌다
		System.out.println(stn.nextToken()); // NoSuchElementException 토큰 다 씀
		*/
		// 보통 전체 토큰을 사용하고 싶을 경우 사용 why? 몇갠지 모르기 떄문이다
		while(stn.hasMoreTokens()) {
			// 남아있는 토큰이 있다면 true / 토큰 다 뽑혔다면 false
			System.out.println(stn.nextToken());
		}
		
	}
	
	
	
	
	
}
