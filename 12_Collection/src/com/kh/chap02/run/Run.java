package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.vo.Plant;

public class Run {

	public static void main(String[] args) {
		/*
		 * - 추상적이란?
		 * 		- 실체가 존재하지 않는다
		 * 			(ex , 추상 메소드 바디가 존재하지 않는다.
		 * 				  추상 클래스는 객체가 존재하지 않는다.)
		 * 
		 * - 자바에서 Interface 를 실체화(구현) 하려면?
		 * 		- Interface 구현하는 Class(클래스)가 필요하다.
		 * ==================================================
		 * 자바의 컬렉션(Collection Framework)
		 * --------------------------------------------------
		 * Abstract Data Type (ADT : 추상적 자료형) ==> Interface
		 * +
		 * 구현체 => Class
		 * +
		 * 알고리즘 => method
		 * --------------------------------------------------
		 * 
		 * 배열과 컬렉션의 차이점
		 * 
		 * - 배열의 아주 쬐에끔 불편한 점은?
		 * 		1. 배열을 사용하려고 할 때 꼭 크기를 할당을 해야함 => 한 번 지정된 크기는 변경이 불가능
		 * 		2. 배열 중간 위치에 새로운 요소를 추가하거나 삭제할 때 기존값을 밀어주거나 땡기는 코드를 써야함
		 * 
		 * - 컬렉션을 사용하는 이유는?
		 * 		1. 크기의 제약이 없음 
		 * 			=> 처음 컬렉션을 사용할 떄 크기를 지정하지 않더라도 사용할 수 있음
		 * 			=> 만약 요소가 추가되면서 크기를 넘어서는 상황이 발생하면 알아서 확장됨
		 * 		2. 중간에 값을 추가하거나 삭제하거나 경우 기존값을 밀어주거나 땡겨주는 로직이 이미 구현되어 있음
		 * 			=> 그때그때 필요한 메소드들을 호출해서 사용하면 됨
		 * 
		 * - 중립
		 * 		- 배열 : 하나의 타입의 자료형만 사용할 수 있음
		 * 		- 컬렉션 : 여러 타입의 데이터들을 관리할 수 있음 : 같은 타입의 데이터만 묶어서 사용가능
		 * 	
		 * - 용도
		 * 		- 배열 : 사용할 데이터의 개수가 명확히 정해져있고, 조회의 목적이 있을 경우
		 * 		- 컬렉션 : 데이터들의 추가, 수정, 삭제가 많이 일어날 경우
		 * 
		 * --------------------------------------------------
		 * 개념적인 컬렉션의 종류
		 * 
		 * List 추상적 자료형의 개념
		 * 
		 * 		- List 계열 : 다루고자 하는 값(Value)만 저장 / 저장 시 순서 유지(Index), 중복값 허용
		 * 					=> LinkedList[근본], ArrayList[v], Vector(좀 옛날거임)  는 구현이 되어있음
		 * 					=> ArrayList 배울 것!
		 * 
		 * 		- Set 계열 : 다루고자 하는 값(Value)만 저장 / 저장 시 순서 유지 X, 중복값 허용 X
		 * 					=> HashSet, TreeSet
		 * 					=> HashSet
		 * 
		 * 		- Map 게열 : 키(Key) - 값(Value) 세트로 저장 / 저장 시 순서 유지 X, 키 중복 X / 값 중복 O
		 * 					=> HashMap, TreeMap, MultiValueMap...
		 * 					=> HasMap, Properties
		 */
		
		
		/*
		 * ArrayList
		 * ArrayList 생성 방법
		 * 		-  ArrayList 식별자 = new ArrayList();
		 * 
		 * 1. 기본생성자 호출로 만들기 => 기본 크기 10칸
		 * 		- ArrayList 식별자 = new ArrayList(정수);
		 * 
		 * 2. 인자로 전달한 정수값 만큼의 크기르르 가진 리스트를 만들겠다.
		 */
		
		
		System.out.println("배열생성.====================================");
		ArrayList plants = new ArrayList(3);
		// 내부적으로 크기가 3칸짜리인 List를 만들겠다.
		// 배열타입[] arr = new 배열타입[3];
		
		System.out.println(plants);
		
		System.out.println("1.====================================");
		/*
		 * arr[0] = new Plants();
		 * arr[1] = new Plants();
		 * 
		 */
		/*
		 * 1. 비어있는 List에 요소를 추가 +1
		 * 		-  add(E e) : 해당 리스트 마지막에 인자로 전달된 요소를 추가해주는 메소드
		 * 			-  E -> element : 제네릭
		 */
		/*
		Plant[] p = new Plant[3];
		p[0] = new Plant("서양란", "호적란");
		p[1] = new Plant("도양란", "황룡관");
		p[2] = new Plant("관엽", "금전수");
		System.out.println(Arrays.toString(p));
		*/
		
		plants.add(new Plant("서양란", "호적란"));
		plants.add(new Plant("도양란", "황룡관"));
		plants.add(new Plant("관엽", "금전수"));
		plants.add("식물 끝!"); // 출력의 마지막에 들어가게 된다.(3칸짜리인데도 불구하고 문제 x)
		/*
		 * 기존 Object[]의 크기를 넘어서는 요소가 추가될 경우,
		 * Arrays.copyOf메소드를 이용하여 깊은 복사로 더 큰 배열로 할당함
		 * Object 타입으로 요소를 관리하기 때문에 여러 자료형의 요소를 하나의 리스트에 담을 수 있음
		 *  
		 */
		System.out.println(plants.toString()); // .toString() 들어가 있음.
		// child1 이랑 child2은 타입이 다른데 하나의 배열에 들어갈 수 있는 이유는?
		// 부모클래스로 동일한 부모클래스를 가지고 있어 UPCasting 되어 사용 될 수 있음.
		// 그럼 무슨 부모타임을 만들 줄 알고? Object 배열이라 가능.
		
		
		/*
		 * add 메소드 호출 시 오버로딩된 형태의 메소드를 사용
		 * add(int index, E e) : List 의 index 에 전달한 요소를 추가
		 */
		plants.add(0, "식물 시작~");
		plants.add(3, new Plant("관엽", "홍콩야자"));
		System.out.println(plants);
		// 중간 위치에 요소를 추가했을 때 기존의 요소들을 한 칸씩 밀어주는 작업이 내부적으로 구현되어있음.
	
		System.out.println("2.====================================");
		/*
		 * 2. 요소를 수정하는 메소드
		 * set(int index, E e) : List의 index 위치에 값을 전달된 요소(e)로 set 해주는 메소드
		 */
		plants.set(0, "시~~~작~~");
		System.out.println(plants);
		
		
		System.out.println("3.====================================");
		/*
		 * 3. 요소 삭제 -1
		 * remove(int index) : List의 index 위치에 담긴 요소를 삭제하는 메소드
		 */
		plants.remove(0);
		//plants.remove(5); // 주의 set으로 5번까지 있다가 remove 다시 0을 지웠을 경우 IndexOutOfBoundsException 발생
							// IndexOutOfBoundsException == index 값을 잘 고려해서 인자값을 전달해야함
		
		// "식물 끝!" :: 요소 제거 및 반환
		String str = (String)plants.remove(4); 	// E(요소)의 타입으로 반환(식물 끝!) 받으려면?
						  						// Object로 관리되어 Object로 관리되고 있었으니, (부모는 내가 무엇을 가지고 있는 지 모름)
						  						// String 으로 사용하려면 DownCasting을 해줘야 한다.
		System.out.println(str); // 식물 끝!
		System.out.println(plants);
		
		// "식물정보 [이름 = 홍콩야자 종류 = 관엽]" :: 제거 및 반환 다시 반복 연습해보기 
		plants.remove(1);
		
		Plant goldDragonCrown = (Plant)plants.remove(1);	
		System.out.println(goldDragonCrown); // 식물정보 [이름 = 홍콩야자 종류 = 관엽]
		
		
		System.out.println("4.====================================");
		/*
		 * 4. 리스트의 크기를 반환받기
		 * size() : 리스트에 담겨있는 요소의 개수
		 * add +1 remove -1
		 */
		System.out.println(plants.size()); // 2
		System.out.println("마지막 인덱스 : " + (plants.size() -1)); // 마지막 인덱스 : 1
		
		System.out.println("5.====================================");
		/*
		 * ★
		 * 5. List 의 해당 index 위치에 담긴 요소를 반환바든 메소드
		 * get(int index) : E
		 */
		System.out.println(plants); // [식물정보 [이름 = 호적란 종류 = 서양란], 식물정보 [이름 = 금전수 종류 = 관엽]]
		Plant plant = (Plant)plants.get(0);
		System.out.println(plant); // 식물정보 [이름 = 호적란 종류 = 서양란]
		
		/* 예시 
		 * + 상속과 다형성 클래스 형변환
		 * 1번 인덱스에 위치한 식물의 이름을 변수로 대입해서 활용하고 싶음
		 */
		String hongKongTree = ((Plant) plants.get(1)).getName(); // plant 으로 바꿔서 getName호출 왜? object 를 가르키고있기때문이다.
		System.out.println(hongKongTree); // 금전수
		
		for(int i = 0; i < plants.size(); i++) {
			System.out.println("식물 종류 : " + ((Plant)plants.get(i)).getType());
		}
		  //식물 종류 : 서양란
		  //식물 종류 : 관엽
		
		
		/*
		 * 향상된 for문 => 값을 조회하는 목적으로 사용가능
		 * for( : 순차적으로 요소에 접근할 배열 또는 컬렉션){
		 * 
		 * }
		 */
		
		for(Object p : plants) {
			System.out.println(p); // System.out.println(p.toString());
		}
		//식물정보 [이름 = 호적란 종류 = 서양란]
		//식물정보 [이름 = 금전수 종류 = 관엽]
		// 동적바인딩되어 출력
		
		
		System.out.println("6.====================================");
		/*
		 * 6. 리스트 자르기
		 * subList(int index1, int index2) : List
		 * index1 부터 index2 까지의 요소를 추출해서 새로운 리스트를 반환
		 */
		List sub = plants.subList(0, 1); //  0번 부터 1번까지 반환
		System.out.println(sub);
		
		
		System.out.println("7.====================================");
		/*
		 * 7. 리스트에 요소를 왕창 추가하기
		 * addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 요소들을 몽땅 추가해주는 메소드
		 * 
		 * - 다음 시간에 배울 내용 중
		 * list set 계열 (list 와 set 은 근본이 같아 동일하게 extends 하고 있음.)
		 * list 계열
		 * : ArrayList 1; , LinkedList i;
		 * 
		 * set 계열
		 * : HashSet
		 * 
		 */
		plants.addAll(sub);
		System.out.println(plants); // 리스트는 데이터 값 (Value)이 중복될 수 있음
		
		System.out.println("8.====================================");
		/*
		 * 8. 리스트에 현재 요소가 있는지 없는지 판별하는 메소드
		 * isEmpty() : 리스트에 요소가 존재하지 않다면 true / 요소가 하나라도 있다면 false
		 * System.out.println(plants.isEmpty());
		 */
		System.out.println(plants.isEmpty()); // false
		plants.clear();
		System.out.println(plants.isEmpty()); // true
		
		
	}

}
