package com.kh.chap02_byte.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object)
// 데이터가 보관되어있는 공간에 직접 접근해서
// 입력/출력하는 메소드들을 만들어줌
public class FileByteDao {
	
	// 파일에 데이터를 출력(Byte Stream 사용) 파일 
	public void outputToFile() {
		
		// 출력 : 프로그램 내의 데이터 밖으로 내보내겠다.
		// 프로그램 --> 외부(파일)
		// FileOutputStream : "파일"로 데이터를 출력할 때, 파일과 연결하는 1Byte 단위의 스트림
	
		// 1. FileOutputStream 객체 생성
		// 파일과 연결하는 스트림을 생성하는 과정
		
		try {
			// fos : 파일과 연결된 통로
			FileOutputStream fos = new FileOutputStream("a_byte.txt");
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
			
		} catch(FileNotFoundException e ) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
