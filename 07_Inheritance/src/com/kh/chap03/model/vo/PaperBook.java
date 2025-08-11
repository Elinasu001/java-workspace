package com.kh.chap03.model.vo;

public class PaperBook extends Book {
	
	private int lostPage;
	
	public PaperBook() {}
	public PaperBook(String title, String publisher, String author, int price, int lostPage) {
		super(title, publisher, author, price);
		this.lostPage = lostPage;
	}
	
	public int getLostPage() {
		return lostPage;
	}
	public void setLostPage(int lostPage) {
		this.lostPage = lostPage;
	}
	// 1. 자식 2. 부모
	public String information() {
		return super.information() + ", 잃어버린 페이지 : " + lostPage + "]";
	}
	
}
