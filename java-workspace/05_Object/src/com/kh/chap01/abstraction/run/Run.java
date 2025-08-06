package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.vo.Puppy;

public class Run {

	public static void main(String[] args) {
		/*
		 * 객체 지향 프로그래밍 : 현실세계에서 독립적인 존재(개체)를 속성과 행위를 가진 객체로 만들어서
		 * 					  객체 간의 상호작용을 통해 프로그래밍 하는 기법
		 *
		 * 구현하고자 하는 프로그램에 객체를 만들기 위해서는(생성하기 위해서는)
		 * => 클래스를 먼저 생성해야함!
		 * 
		 * 클래스란? 각 객체들의 정보(속성, 행위)들을 담아내는 그릇 또는 틀 또는 설계도 또는 명세
		 */
		
		// 현실세계
		// 동물 => 강아지
		
		// 강아지
		// 정보 (프로그래밍 설계의 필요한 정보들만 뽑아 오기 => 추상화(구체적인))
		// 
		// 종 : 포메라니안
		// 이름 : 똘똘이
		// 나이 : 4살
		// 성별 : 암컷
		// 색상 : 갈색
		// 몸무게 : 3kg
		
		// 객체 생성해보기
		// 강자지 객체 생성
		Puppy smart = new Puppy(); // 객체생성
					  // new 라는 예약어를 생성
					  // Memory의 heap영역에 데이터를 생성
		smart.sniff();
		//System.out.println(smart); //com.kh.chap01.abstraction.vo.Puppy@48cf768c
		// smart 속성값을 보고 싶을 경우는?
		//System.out.println(smart.name);
		//값대입 > 공간(heap > naeme) = "똘똘이";
		smart.name = "똘똘이";
		//System.out.println(smart.name);
		smart.species = "포메라니안";
		smart.age = 4;
		smart.gender = "암컷";
		smart.color = "갈색";
		smart.weight = 3;
		
		System.out.println(smart.name + "는 " 
							+ smart.color + " "
							+ smart.species + "입니다.");
		System.out.println(smart.age + "살 "
							+ smart.gender + "에 " 
							+ smart.weight + "kg입니다.");
		
		
	}

}
