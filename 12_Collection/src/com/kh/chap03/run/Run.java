package com.kh.chap03.run;

import java.util.HashSet;
import java.util.Set;

import com.kh.chap03.model.vo.MBTI;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * HashSet
		 * Value 값만 저장, index 개념 없음 == 순서 보장 X, 중복 X
		 * 
		 * [표현법]
		 * HashSet 객체명 = new HashSet(); // 빈 HashSet 만들어짐
		 */
		
		// 문자열만 담을 수 있는 HashSet
		Set<String> set = new HashSet();
		
		// 요소 추가
		// add(추가할 요소)
		set.add("안녕하세여"); // 중복안됨
		set.add("반갑습니다");
		set.add("점심 맛있게 드셨나요?");
		set.add(new String("반갑습니다"));
		set.add(new String("안녕하세여"));// 중복안됨
		set.add("순서 언제 고장남?");
		set.add("왜 계속 넣은대로 나옴?");
		
		System.out.println(set); // 저장 순서 보장 x, 중복 허용 x
		
		// 요소 개수 구하기 size()
		System.out.println("set의 요소 개수 : " + set.size());
		
		// 1. MBTI 16개를 다뤄야겠다.
		Set<MBTI> mbti = new HashSet();
		
		MBTI istj = new MBTI("I", "S", "T", "J");
		MBTI isfj = new MBTI("I", "S", "F", "J");
		MBTI estj = new MBTI("E", "S", "T", "J");
		MBTI estp = new MBTI("E", "S", "T", "P"); // 주소값 다름
		
		// 2. mbti 를 set 에 담아주기.
		mbti.add(istj);
		mbti.add(isfj);
		mbti.add(estj);
		mbti.add(estp);
		mbti.add(new MBTI("E", "S", "T", "P")); // 주소값 다름
		
		System.out.println("ABC".equals(new String("ABC"))); // true
		System.out.println(new String("ABC").hashCode()); // 64578
		System.out.println("ABC".hashCode()); // 64578
		/* ↑
		 * HashSet => set 에 요소를 추가할 때마다
		 * equals()와 hasCode()의 반환값을 기준으로 일치하는 요소가 있는지 비교함
		 */
		
		System.out.println(mbti); // 저장 순서 보장 x
				
		
	}

}
