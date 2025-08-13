package com.kg.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
/*
 * CheckedException
 * 
 * 문법적으로 반드시 예외처리를 해야하는 예외들
 * => 주로 외부 매체 입/출력 시
 * 
 * 
 */
	
	public void method1() throws IOException { // 사용 시 실행 클래스에서 문제가 되니 try catch 필요
		
		// 사용자에게 문자열을 하나 입력받아서
		// 입력받은 문자열의 길이를 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String str = br.readLine(); // 이것만 작성시 HEANDLING 이 안됐다는 것이다. 어떻게 해결하나???? 방법 1. 방법 2.
		// IOException 문제가 발생할 법한 것을 알려준다.
		// 그럼 왜 스캐너에서는 사용안함? 스캐너 자체에 try~catch 들어가있음.
		//Scanner sc = new Scanner(System.in);
		
		// 방법 1. try~catch 문을 작성한다.
		String str = " ";
		try {
			str = br.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(str.length());
		
		// 방법 2. throws : 코드 작성부 말고 메소드를 호출하는 부문으로 에외처리를 위임
		str  = br.readLine();
		System.out.println(str.length());
	}
}
