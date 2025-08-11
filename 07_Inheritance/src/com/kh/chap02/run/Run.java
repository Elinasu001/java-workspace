package com.kh.chap02.run;

import com.kh.chap02.model.vo.ItalianFood;
import com.kh.chap02.model.vo.JapanessFood;
import com.kh.chap02.model.vo.KoreanFood;

public class Run {

	public static void main(String[] args) {
		
		KoreanFood kf = new KoreanFood();
		kf.setFoodName("비빔밥");
		System.out.println(kf.getFoodName());
		
		// 호출을 하는 메소드가 해당 클래스에 존재하지 않는다면
		// 자동으로 해당 클래스의 부모클래스에 있는 메소드를 호출
		ItalianFood yf = new ItalianFood("기름파스타", "기름", 15, 5);
		System.out.println(yf.information());
		
		JapanessFood jf = new JapanessFood("스시", "밥", 20, 5);
		System.out.println(jf.information());
		
		// 자식 클래스에 메소드를 재정의 했을 경우
		// 자식 클래스에 존재하는 메소드가 우선권을 가져서 호출됨! ★★★★★★★★★★★★★★
		
		/*
		 * 상속
		 * 
		 * 기존에 클래스를 사용해서 새로운 클래스를 만든다.
		 * - 중복된 코드 공통으로 관리
		 * => 보다 적은양의 코드로 새로운 클래스를 만들 수 있음
		 * => 생산성 향상, 가독성 향상
		 * - 객체간의 결합도가 높아짐
		 * 
		 * ==> 과거보다 오늘 날의 개체지향의 상속이 중요함 : Composition(합성)
		 * 
		 * 상속의 특징
		 * - 클래스간의 다중상속은 불가능하다(단일 상속만 가능)
		 * - 명시되어있지는 않지만 모든 클래스는 Object 클래스의 후손 클래스
		 * 	(내가 만든 클래스, 자바에서 원래 제공하는 클래스)
		 * => Object 클래스에 있는 멤버를 사용할 수 있음
		 * => Object 클래스에 있는 메소드가 마음에 안든다면 재정의를 할 수 있음
		 * 
		 */
		
	}

}
