package com.kh.chpa04_assist.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chpa04_assist.model.vo.Plant;

public class ObjectDao {
	
	// 출력
	// 객체 단위로 출력을 할 때 보조스트림이 필요!
	public void outputFile() {
		Plant plant = new Plant("홍콩야자" , "관엽");
		
		// 기반스트림 => FileOutputStram
		// 보조스트림 => ObjectOutputStream
		// 출력 => writeObject() / 직렬화(객체 -> 파일 저장)
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object.txt"))){
			oos.writeObject(plant);
			//NotSerializableException => 직렬화 해야됨.(객체(Object)를 바이트(byte) 형태로 변환하는 과정.) 
			//ex)  Plant.java => public class Plant implements Serializable
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 입력 / 역직렬화(파일 -> 객체 복원)
	public void inputFile() {
		
		// 기반스트림 => FileInputStream
		// 보조스트림 => ObjectInputStream
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"))){
			
			// readObject
			Plant plant = (Plant)ois.readObject(); // ois.readObject(); => ClassNotFoundException
												   // 업캐스팅
			System.out.println(plant);
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

