package com.kh.chap03.run;

import com.kh.chap03.model.vo.Book;
import com.kh.chap03.model.vo.ElectronicBook;
import com.kh.chap03.model.vo.PaperBook;

public class Run {

	public static void main(String[] args) {
		
		Book book = new Book("그 많던 싱아는 누가 다 먹었을까", "웅진 지식하우스", "박완서", 16650);
		
		ElectronicBook eb = new ElectronicBook("저속노화 마인드셋", "웨일북", "정희원", 7550, "yse24");
		
		PaperBook pb = new PaperBook("혼모노", "창비", "성해나", 16200, 0);
		
		System.out.println(book.information());
		System.out.println(eb.information());
		System.out.println(pb.information());
		
		System.out.println(book);
	
	}

}
