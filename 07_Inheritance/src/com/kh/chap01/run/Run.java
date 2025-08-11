package com.kh.chap01.run;

import com.kh.chap01.model.vo.ItalianFood;
import com.kh.chap01.model.vo.JapanessFood;
import com.kh.chap01.model.vo.KoreanFood;

public class Run {

	public static void main(String[] args) {
		
		// foodName, material, cookingTime, spicy
		KoreanFood kf = new KoreanFood("비빔밥", "밥", 5, 2);
		// foodName, material, cookingTime, oil
		ItalianFood yf = new ItalianFood("기름파스타", "기름", 15, 5);
		// foodName, material, cookingTime, fresh
		JapanessFood jf = new JapanessFood("스시", "밥", 10, 10);
		
		System.out.println(kf.information());
		System.out.println(yf.information());
		System.out.println(jf.information());
		
		/*
		 * 매 클래스마다 중복된 코드들을 하나하나 기술하다보면
		 * 코드의 추가 또는 수정과 같은 유지보수 시 전부 한땀한땀 찾아서 고쳐야하는 번거로움이 생김
		 * 
		 * 상속이라는 개념을 적용해서
		 * 매 클래스마다 중복된 필드, 매소드들을
		 * 해당 부모 클래스가 가지고 있는 요소를 상속받아서 사용하는 형태로 진행
		 */
		
		
		
	}

}
