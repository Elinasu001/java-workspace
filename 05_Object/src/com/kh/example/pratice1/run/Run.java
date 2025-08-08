package com.kh.example.pratice1.run;
import com.kh.example.pratice1.model.vo.Member;
public class Run {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.changeName("홍길동");
		member.printName();
	}

}
