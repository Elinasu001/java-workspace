package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// 정말 간단하게 소스코드를 이용해서 파일을 만들어보자
		// File 클래스를 가지고 작업
		// java.io 패키지에 존재
		
		// 파일클래스를 이용해서 객체 생성
		File file1 = new File("test.txt");
		
		// 파일 만들기
		//file1.createNewFile(); // output 하니 checkedExcepiton 이니 무조건 예외처리 필수 !!
		// createNewFile() : 파일 생성 메소드
		
		
		try {
			
			// 파일 만들기
			file1.createNewFile();
			
			// 폴더 만들기
			// folder == directory
			
		} catch(IOException e) {
			e.printStackTrace(); // stack 추적 어디서 에러가 났는 지 알 수 있는데 얘는 개발단계에서만 넣고 개발이 끝나면 삭제 필요
		}
		
		
	}

}
