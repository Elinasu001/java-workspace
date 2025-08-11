package com.kh.chap02.run;

import com.kh.chap02.model.vo.ItalianFood;
import com.kh.chap02.model.vo.KoreanFood;

public class Run {

	public static void main(String[] args) {
		
		KoreanFood kf = new KoreanFood();
		kf.setFoodName("비빔밥");
		System.out.println(kf.getFoodName());
		
		// 호출을 하는 메소드가 해당 클래스에 존재하지 않는다면
		// 자동으로 해당 클래스의 부모클래스에 있는 메소드를 호출
		ItalianFood yf = new ItalianFood("기름파스타", "기름", 15, 5);
		
		
	}

}
