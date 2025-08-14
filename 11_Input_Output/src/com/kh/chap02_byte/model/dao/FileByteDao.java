package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object)
// 데이터가 보관되어있는 공간에 직접 접근해서
// 입력/출력하는 메소드들을 만들어줌
public class FileByteDao {
	
	// 파일에 데이터를 출력(Byte Stream 사용) 파일 
	public void outputToFile() {
		//Scanner sc = new Scanner(System.in);
		//sc.close();
		
		// 출력 : 프로그램 내의 데이터 밖으로 내보내겠다.
		// 프로그램 --> 외부(파일)
		// FileOutputStream : "파일"로 데이터를 출력할 때, 파일과 연결하는 1Byte 단위의 스트림
	
		// 1. FileOutputStream 객체 생성
		// 파일과 연결하는 스트림을 생성하는 과정
		
		FileOutputStream fos = null;
		// 메소드로 빼야함 .close()로 인해서
		
		try {
			// fos : 파일과 연결된 통로
			fos = new FileOutputStream("a_byte.txt");
			// 생성자 호출 시 인자값으로 파일명을 전달하는데 파일명이 존재하지 않을 경우
			// 해당 파일을 생성하면서 통로를 연결 즉, 파일이 중간에 삭제 되었을 수 있기 때문이다. ==> 예외 처리 필요
			// FileOutputStream fos = new FileOutputStream("a_byte.txt", true);
			// 두 번째 인자로 true값을 전달한다면 => 해당 파일 내용에 이어서 작성 //abcefgabcefgabcefgabcefgabcefg
			// 안쓰면 => 덮어쓰기 //abcefg
			
			// 2. 연결통로를 가지고 데이터 출력 : write() 호출
			fos.write(97);
			fos.write(98);
			fos.write(99);
			// a_btye.txt : abc출력
			
			byte[] arr = {101, 102, 103};
			fos.write(arr);
			// a_btye.txt : abcefg출력
			
			fos.write('A'); // abcefgA
			fos.write('B'); //abcefgAB
			
			fos.write('박');
			fos.write('수');
			fos.write('현');
			//abcefgAB : 와장창창
			// 1Byte의 범위 : -128 ~ 127
			// 한글은 2Byte기 때문에 깨짐
			// 바이트스트림으로는 한글 / 일어 / 한자 해결이 안됨
			// 문자스트림을 사용해야 해결 가능
			
			// 3. 스트림 사용이 끝났다면 반드시 꼭 무조건 절대로 너무너무 해야하는 작업이 있음
			// 코드상에서 사용이 전부 종료되었다면 자원 반납을 해주어야함 <-- 약속 ★★★★★★
			// 너무 정말정말정말정말정말정말중요중요중요중요한 약속
			
			// 자원 반납 하는 방법 ::
			//.close()
			//fos.close(); 만약 try~catch 하게 되면 아래 예외처리 후 반납이 안되니 밖으로 빼야됨.
			
		} catch(FileNotFoundException e ) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
			return;
		} finally {
			// ★★★★★★★★★★★★
			// 어디서든 return 해도 무조건 지킬 수 있는 방법은? finally 처리 (finally 블럭 구문을 수행)
			try {
				if(fos != null) {
					fos.close(); // 만약 객체 생성이 안되어 변수가 null 로 되어있을 경우 nullpointException 발생될 수 있음
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	// 프로그램 <== 외부매체(파일)
	// 입력 : 파일로부터 데이터를 가지고 오겠다.
	// FileInputStream
	// 파일로부터 데이터를 가져와서 입력 받을건데, 1Byte 단위로 입력받겠다.
	public void inputFromFile() {
		
		FileInputStream fis = null;
		
		try {
			
			// 1. 객체 생성 => 스트림연결하기
			fis = new FileInputStream("a_byte.txt");
			
			// 2. 스트림으로 입력받기
			// read()호출
			// 1Byte단위로 읽어옴
			// 정수로 반환된 걸 문자로 보고 싶다면? (char)으로 반환
			
		
			System.out.println((char)fis.read()); //a
			
			/*
			System.out.println(fis.read()); //98
			System.out.println(fis.read()); //99
			System.out.println(fis.read()); //101
			System.out.println(fis.read()); //102
			System.out.println(fis.read()); //103
			System.out.println(fis.read()); //65
			System.out.println(fis.read()); //66
			System.out.println(fis.read()); //21
			System.out.println(fis.read()); //24
			System.out.println(fis.read()); //4
			System.out.println(fis.read()); //-1
			//... 이렇게 읽어 오는 거긴 하지만 중복 제거 하려면 ?
			*/
			/*
			while(true) {
				int value = fis.read();
				
				if(value != -1) {
					System.out.println(value);
				}else {
					break;
				}
			}
			*/
			
			// 축약 버전
			int value = 0;
			while((value = fis.read()) != -1) {
				System.out.println((char)value);
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally { // 3. 마지막으로 꼭 해야할 일 // 문자열 비교
			try {
				if(fis != null) {
					fis.close();	
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
