package com.kh.chap03_char.model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {
	// 프로그램 --> 외부매체 (파일)
	// 출력

	public void outputToFile() {
		// XXXWriter
		// FileWriter :: 파일로 데이터를 2Byte단위로 출력하는 스트림

		// 0. 스트림선언
		/*
		FileWriter fw = null;

		try {
			// 1. 스트림생성
			fw = new FileWriter("b_char.txt");

			// 2. 데이터출력 => write()
			fw.write("와....IO...신기하당...");
			fw.write("E");
			// 와....IO...신기하당...E

		} catch (IOException e) {

			System.out.println("다시 시도해주세요");

		} finally {
			// 3. 자원 반납 => 약속을 지키자 !
			try {

				if (fw != null) {
					fw.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		
		/*
		 * try ~ with ~ resource 구문
		 * 
		 * -jdk 7 이상부터 사용가능
		 * 
		 * try(스트림객체생성; ...){
		 * 		예외가 발생할 수도 있는 구문;
		 * } catch(예외클래스 e){
		 * 		예외가 발생했을 때 실행할 구문;
		 * }
		 * 블럭이 끝나는 시점에 close()를 호출해서 자동으로 반납해줌.
		 * 혹여나 할 수도 있는 실수를 줄일 수 있는 아주 훌륭한 문법
		 * 대전제 clseabe를 구현할 것
		 * 
		 */
		try(FileWriter fw = new FileWriter("c_char.txt"); Scanner sc = new Scanner(System.in)){
			fw.write("와...IO..ㅎㅎ");
			fw.write("E");
		} catch(IOException e) {
			e.printStackTrace();
		}
		// 자원 반납 알아서 해주는 간결한 코드... ㅎㅎ
		// closeable 구현된 인터페이스일 것 !!! 중요!!!
		
		
	}
	
	// [TIL]
	public void writeTil() {
		// FileWriter
		// 사용자에게 오늘 학습내용을 입력받아서
		// 외부 파일에 내용을 출력
		
		// 내보낼 파일명은 : 2025년 08월 14일 오늘의 학습일지
		
		 Date now = new Date();
		 //System.out.println(now); // Thu Aug 14 17:21:31 KST 2025
		 // 2025년 08월 14일
		 String titleDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(now);
		 //System.out.println(titleDate);
		 
		 //String fileName = titleDate + " 오늘의 학습일지.txt"; => 문자열과 문자열 더하기 안돼 !!!
		 // => StringBuilder을 사용 하여 메모리 낭비 하지 말기!
		 // String 객체는 변경 불가능 >  하나의 문자열을 다른 문자열과 연결하면 새 문자열이 생성되고, 이전 문자열은 가비지 컬렉터로 들어간다.
		 // 문자열끼리 연결하는 작업 시에는 내부적으로 여러 작업이 발생하고, 
		 // , 기존 문자열 값의 길이에 추가된 문자열의 크기를 더한 크기의 새로운 문자열이 생성된다.
		 //  100만 번 수행시, 메모리를 많이 잡아먹게 되니  변경 가능한 문자열을 만들어 주는 StringBuilder 사용
		 StringBuilder sb = new StringBuilder();
		 sb.append(titleDate);
		 sb.append(" 오늘의 학습일지.txt");
		 FileWriter fw = null;
		 Scanner sc = new Scanner(System.in);
		 try {
			 fw = new FileWriter(sb.toString()); // String에 StringBuilder를 그대로 넣을 순 없다. toString()을 붙여야 한다
			 System.out.println("어디 오늘 배운 내용을 한 번 작성해보시오 > ");
			 String content = sc.nextLine();
			 fw.write("오늘 학습한 내용 : \t" + content);
		 } catch (IOException e) {
			 System.out.println("비상 비상 문제발생");
		 } finally {
			 try {
				 if(sc != null) sc.close();
				 if(fw != null) fw.close();
			 }catch(IOException e) {
				 System.out.println("자원 반납 하다가 문제 발생 비상비상비상 ");
			 }
		 }
		 
	}
	
	public void writeTitle2() {
		
		Date now = new Date();
		
		String titleDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(now);
		
		StringBuilder sb = new StringBuilder();
		sb.append(titleDate);
		sb.append("연습 일지");
		
		try(FileWriter fw = new FileWriter(sb.toString()); Scanner sc = new Scanner(System.in)){
			System.out.println("어디 오늘 배운 내용을 한 번 작성해보시오 > ");
			String content = sc.nextLine();
			fw.write("오늘 학습한 내용 : \t" + content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	


}
