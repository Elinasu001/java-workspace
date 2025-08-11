package com.kh.chap03.run;

import com.kh.chap03.model.vo.Book;
import com.kh.chap03.model.vo.ElectronicBook;
import com.kh.chap03.model.vo.LastTime;
import com.kh.chap03.model.vo.PaperBook;

public class Run {

	public static void main(String[] args) {
		
		Book book = new Book("그 많던 싱아는 누가 다 먹었을까", "웅진 지식하우스", "박완서", 16650);
		
		ElectronicBook eb = new ElectronicBook("저속노화 마인드셋", "웨일북", "정희원", 7550, "yse24");
		
		PaperBook pb = new PaperBook("혼모노", "창비", "성해나", 16200, 0);
		
		System.out.println(book.information());
		System.out.println(eb.information());
		System.out.println(pb.information());
		
		System.out.println(book); // com.kh.chap03.model.vo.Book@1ef7fe8e : 메소드 호출 반환값
		System.out.println(book.toString()); // com.kh.chap03.model.vo.Book@1ef7fe8e : toString 의 반환값
		// toStirng 만든 적이 없는데 ? 부모 클래스인 Object 클래스를 가진 메소드 : 풀클래스@16진수(해시코드 메소드의 반환값(메모리상 주소값) : 운영체제 c 언어 함수임(자바 안은 아님)  => 문자열 반환;
		
		// toString 이라는 이름으로 만들어진다면 자식 클래스가 더 높기 때문에 먼저 호출 되고 나머지 부모클래스가 나옴.
		System.out.println(eb);
		System.out.println(pb);
		
		LastTime lt = new LastTime();
		System.out.println(lt);
		
	}

}
