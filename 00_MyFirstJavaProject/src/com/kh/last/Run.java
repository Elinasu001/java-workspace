package com.kh.last;

import java.util.Arrays;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("홍길동", "고길동", "짱구");
		for(String name : names) {
			System.out.println(name + "은(는) 정말 못말려~");
		}
		
		System.out.println("==========람다식 호출=========");
		// Stream API + 람다식
		// 반복문을 돌릴 때 for 문을 사용하지 않고 데이터를 동일하게 출력 할 수 있다.
		names.stream().map(name -> name + "은(는) 못말려~~").forEach(System.out::println);
		
		// 스트림(Stream)
		// 컬렉션, 배열 등의 데이터를 선언적으로 처리해주는 API == 함수형 프로그래밍
		// for문 -> 어떻게 반복하는지가 구체적
		// 함수형 -> 무엇을 할지 행위에 집중
		// 파이프라이닝 -> 여러 연산을 연결
		
		System.out.println("===================");
		// 60점 이상인 점수의 평균을 구해봐야 겠다.
		int[] scores = {88, 50, 72, 90, 100, 20, 40};
		int sum = 0;
		int count = 0; // 60이상 개수
		
		for(int score : scores) {
			if(score >= 60) {
				sum += score;
				count++;
			}
		}
		
		double average = (double)sum / count;
		System.out.println(average);
		System.out.println("==========람다식 호출=========");
		double streamAvg = Arrays.stream(scores).filter(score -> score >= 60).average().orElse(0.0);
		System.out.println(streamAvg);
		// filter : 조건을 적는다.
		// 람다식 : score -> score >= 60 
		
		/*
		 * 메소드식별자(매개변수){
		 * 		return 값;
		 * }
		 * 
		 * print(int a){
		 * 		return a;
		 * }
		 * 
		 * ==> 이름이 없는 함수 쓸 경우 사용 가능
		 * (int a) -> {
		 *   	return a;
		 * }
		 * 
		 * ==> 중괄호 생략도 가능
		 * (int a) -> return a;
		 * 
		 * ==> 리턴도 생략 가능
		 * (int a) -> a;
		 * 
		 * ==> 매개변수 타입 생략 가능
		 * (a) -> a;
		 * 
		 * ==> 매개변수가 하나밖에 없을 경우 괄호도 생략 가능
		 * a -> a;
		 * 
		 * 
		 */
		
		System.out.println("===================");
		
		// SimpleSum adder = new SimpleSum() 이것만 할 경우 클래스가 없어 객체 생성 불가능
		// 익명클래스 -> 선언과 동시에 객체를 생성하는 것
		SimpleCal adder = new SimpleCal() {
			@Override 
			public int cal(int a, int b) { // 익명 클래스 선언
				return a + b;
			}
		};
		SimpleCal minuser = new SimpleCal() {
			@Override
			public int cal(int a, int b) { // 익명 클래스 선언
				return a - b;
			}
		};
		
		System.out.println("5 + 3 = " + adder.cal(5, 4));
		System.out.println("5 - 3 = " + minuser.cal(5, 3));
		
		
		System.out.println("==========람다식 호출=========");
		// 람다식 호출
		SimpleCal adder2 = (a, b) -> a + b; // a, b를 호출 하여 a + b로 리턴
		SimpleCal minuser2 = (a, b) -> a -b;
		System.out.println("2 + 4 = " + adder2.cal(2,  4));
		System.out.println("2 - 4 = " + minuser2.cal(2, 4));
		
	}
	
	// 함수형 인터페이스 선언
	@FunctionalInterface // 클래스 내부에 인터페이스 
	interface SimpleCal{
		int cal(int a, int b); // 추상 메소드
	}
	

}
