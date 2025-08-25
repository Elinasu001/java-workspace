package com.kh.last;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
	/*
	 * 스트림의 주요 중간 연산
	 * 
	 * 1. filter() : 조건에 맞는 요소만 필터링
	 * 2. map() : 요소를 반환할 때 사용하는 연산
	 * 3. distinct() : 요소의 중복을 제거할 때 사용
	 * 
	 * 스트림의 주요 최종 연산
	 * 
	 * 1. collect() : 결과를 컬렉션으로 변환
	 * 2. forEach() : 모든 요소에 대한 작업 수행
	 * 3. count() : 요소의 개수 반환
	 * 4. reduce() : 요소를 결합해서 단일 결과 만들어 낼 때
	 * 
	 */

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("홍길동", "고길동", "짱구");
		for(String name : names) {
			System.out.println(name + "은(는) 정말 못말려~");
		}
		
		System.out.println("==========람다식 호출 + map + forEach=========");
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
		System.out.println("==========람다식 호출 + filter + average + orElse =========");
		double streamAvg = Arrays.stream(scores).filter(score -> score >= 60)
												.average().orElse(0.0);
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
		
		
		System.out.println("----람다식 호출----");
		// 람다식 호출
		SimpleCal adder2 = (a, b) -> a + b; // a, b를 호출 하여 a + b로 리턴
		SimpleCal minuser2 = (a, b) -> a -b;
		System.out.println("2 + 4 = " + adder2.cal(2,  4));
		System.out.println("2 - 4 = " + minuser2.cal(2, 4));
		
		// map(), filter() ★★★★★★★ 많이 사용
		
		System.out.println("----filter_원래 방식----");
		// filter => 조건에 맞는 것만필터링 할 수 있음
		List<String> coffee = Arrays.asList("아메리카노", "라떼", "콜드브루", "에스프레소", "헤이즐넛");
		List<String> longNameCoffee = new ArrayList();
		
		for(String c: coffee) {
			if(c.length() == 5) {
				longNameCoffee.add(c);
			}
		}
		System.out.println(longNameCoffee); // [아메리카노, 에스프레소]
		
		System.out.println("----filter_스트림 방식 + collect----");
		List<String> coffeeList = coffee.stream().filter(c -> c.length() == 5)
				                                 .collect(Collectors.toList());
		System.out.println(coffeeList); // [아메리카노, 에스프레소]
		
		System.out.println("----map_원래 방식----");
		// map -> 스트림을 이용해서 데이터 변환하는 용도
		List<Integer> nameLength = new ArrayList();
		for(String name : coffee) {
			nameLength.add(name.length());
		}
		System.out.println(nameLength); // [5, 2, 4, 5, 4]
		
		System.out.println("----map_스트림 방식 + collect----");
		List<Integer> lengths = coffee.stream()
										//.map(c -> c.length())
										.map(String::length) // 람다식도 사용 안하고 싶을 경우 
										.collect(Collectors.toList());
	
		System.out.println(lengths); // [5, 2, 4, 5, 4]
		System.out.println("----map_스트림 방식 + collect_단독 출력----");
		// 단독 출력 람다식
		coffee.stream().map(c -> c + "의 길이 : " + c.length())
						//.forEach(1 -> System.out.println(1)); // 람다식도 사용 안하고 싶을 경우
						.forEach(System.out::println);
		
		
		System.out.println("==========다시 전체 써보기(Person)=========");
		List<Person> people = Arrays.asList(new Person("홍길동", "한양", 15),
											new Person("고길동", "서울", 40),
											new Person("춘향이", "남원", 20),
											new Person("콩쥐", "서울", 23));
		
		System.out.println("==서울 사람만 출력하기==");
		System.out.println("----원래 방식----");
		for(Person person : people) {
			if("서울".equals(person.getAddress())) {
				System.out.println(person);
			}
		}
		System.out.println("----스트림 방식----");
		people.stream().filter(person -> "서울".equals(person.getAddress()))
					   .forEach(System.out::println);
		
		// 이름과 주소 출력하기
		System.out.println("==이름과 주소 출력하기==");
		System.out.println("----원래 방식----");
		for(Person person : people) {
			System.out.println(person.getName() + "님은 " + person.getAddress() + "에 삽니다.");
		}
		System.out.println("----스트림 방식----");
		people.stream().map(person -> person.getName() + "님은 " + person.getAddress() + "에 삽니다.")
					   .forEach(System.out::println);
		
	}
	
	// 함수형 인터페이스 선언
	@FunctionalInterface // 클래스 내부 인터페이스 , 인터페이스 함수형으로 컴파일러가 아 이거 함수형 인터페이스구나 라고 인식함
	interface SimpleCal{
		int cal(int a, int b); // ** 하나의 추상 메소드만 가지고 있어야함
	}

}
