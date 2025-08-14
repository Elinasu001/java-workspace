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
			// folder == makedirectory == mkDir()
			File folder = new File("folder");
			folder.mkdir();
			
			// 경로지정까지
			File file2 = new File("folder/test.txt");
			file2.createNewFile();
			
			// 파일클래스에서 제공하는 메소드
			System.out.println("파일 맞니? "+ file2.isFile()); // 파일 맞니? true
			System.out.println("파일명 : " + file2.getName()); // 파일명 : test.txt
			System.out.println("파일명 : " + file2.getParent()); // 파일명 : folder
			System.out.println("파일명 : " + file2.getAbsoluteFile()); //파일명 : C:\javaKh\java-workspace\11_Input_Output\folder\test.txt
			System.out.println("파일명 : " + file2.length()); // 파일명 : 0
			
		} catch(IOException e) {
			e.printStackTrace(); // stack 추적 어디서 에러가 났는 지 알 수 있는데 얘는 개발단계에서만 넣고 개발이 끝나면 삭제 필요
		}
	}
	
	/*
	 * => IO(Input & Output), 입/출력
	 * 
	 * 프로그램 상의 데이터를 외부매체(모니터, 스피커, DB, 프로세스, 콘솔, "파일")로 출력하거나
	 * 입력장치(마우스, 키보드, 마이크, "파일")로 입려갇는 과정
	 * 
	 * IO를 진행하고 싶으면,
	 * 우선적으로 반드시 프로그램과 외부매체간의 "통로"를 만들어야함
	 * => 스트림(Stream)
	 * 
	 * 스트림의 특징
	 * 
	 * - 단방향 : 입력이면 입력 / 출력이면 출력
	 * 			입력용과 출력용 스트림이 각각 따로 존재함
	 * 
	 * - 선입선출(First In First Out) ==> 시간 지연 문제가 발생할 수 있음
	 * 
	 * 스트림의 구분
	 * 
	 * - 스트림의 사이즈
	 * 	 ＊ 바이트스트림 : 1Byte 짜리가 이동할 수 있는 통로
	 * 				=> 입력(XXXInputStream) / 출력(XXXOutputStream)
	 * 
	 * 	 ＊ 문자스트림 : 2Byte 짜리가 이동할 수 있는 통로
	 * 				=> 입력(XXXReader) / 출력(XXXWriter)
	 * 
	 * - 외부매체와의 직접적인 연결 여부
	 *   ＊ 기반 스트림 : 외무매체와 직접적으로 연결되는 스트림
	 *   ＊ 보조 스트림 : 기반스트림만으로 부족한 성능을 향상시켜주는 용도로 만들어진 스트림
	 *   			=> 단독 사용 불가(반드시 기반 스트림이 존재해야만 사용이 가능함)
	 *   			=> 속도 향상, 자료형에 맞춰서 변환, 객체단위로 입출력, 바이트 <==> 문자
	 * 
	 */
	
	

}
