package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun {

	public static void main(String[] args) {
		
		/*
		 * Properties : 
		 * 	- Map 계열 -> Key + Value 세트로 저장함
		 * 
		 * 사용 목적 :
		 * 	- 외부파일에 입/출력을 하기위한 용도
		 * 	
		 * => 확장자가 .properties 파일로 입/출력
		 * 
		 * 변경하지 않는 설정 정보
		 * 해당 프로그램이 기본적으로 가져야 할 정보들을 담는 파일
		 * 
		 */
		Properties prop = new Properties();
		// prop.put("키", new Fish());
		// mypop.put
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		
		System.out.println(prop);
		
		// text 파일은 key 과 value 를 string string 으로 나가야 되는데 여기에 string 이 아닌 다른 자료형태가 들어가 문제가 발생할 수도 있음
		// 이유는 properties 가 map 을 상속 받고 있기 때문이다.
		try {
			/* 출력
			 * store(OutputStream os, String comment) : 파일에 출력할 때 사용
			 */
			//store(OutputStream os, String comment) : 파일에 출력할 때 사용
			//prop.store(new FileOutputStream("test.properties"), "쓰고싶은거");
			
			/* 입력
			 * load(inputStream is): 입력 받을 때 씀
			 */
			//prop.load(new FileInputStream("test.properties"));
			//System.out.println(prop.get("Map")); // null
			
			//XML로 출력
			prop.storeToXML(new FileOutputStream("test.xml"), null);
			
			// XML 에서 입력 loadFromXML(InputStream is);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
