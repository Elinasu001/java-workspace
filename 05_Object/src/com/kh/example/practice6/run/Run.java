package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.inform();
		
		Book book2 = new Book("클라우드 컴퓨팅", "아무개출판사", "김아무개");
		book2.inform();
		
		Book book3 = new Book("클라우드 컴퓨팅", "아무개출판사", "김아무개", 15000, 30);
		book3.inform();
	}

}
