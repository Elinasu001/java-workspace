package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.vo.Plant;

public class GenericRun {

	public static void main(String[] args) {
		/*
		 * 제네릭 <Generic>
		 * 
		 * 컬렉션을 사용하면서 다룰 타입들을 미리 지정할 수 있는 기능
		 * 	=> 명시적으로 <Integer>, <Plant>
		 * 	=> 특정 타입의 요소들만 컬렉션에 담을 수 있도록 지정할 수 있다
		 * 
		 * 별도의 제네릭 없이 컬렉션 객체 생성 (E == Object)
		 * 
		 * 1. 다룰 요소의 타입을 제한할 수 있음 => 실수를 줄일 수 있음
		 * 2. 매 번 형변환하는 절차를 없앨 수 있음 => 코드 짤 때 좀 편함
		 * 
		 */
		/*ArrayList plants = new ArrayList();
		plants.add("eee");
		plants.add(new Plant());
		plants.add(1); 
		plants.add(1.1);
		//int i = 1;
		//System.out.println(((Object)i).toString()); 
		// 기본 자료형을 참조 자료형으로 바꾸고 싶다면? Wrapper Class 사용하기
		*/
		
		// 1. 다룰 요소의 타입을 제한할 수 있음 => 실수를 줄일 수 있음
		//ArrayList<Plant> plants = new ArrayList(); // Plant 타입만 제한 할 경우
		List<Plant> plants = new ArrayList();  // 인터페이스에 프로그래밍 시 :  변수 타입 List로 두면 구현체 교체 쉬움
		
		plants.add(new Plant("관엽", "산세베리아"));
		//plants.add("식물시작~"); // Plant 아닌 타입 아니고 String? 더이상 담을 수가 없다
		plants.add(new Plant("관엽", "폴리샤스"));
		
		System.out.println("2.====================================");
		// 2. 매 번 형변환하는 절차를 없앨 수 있음 => 코드 짤 때 좀 편함
		//String name = ((Plant)plants.get(0)).getName();
		//어차피  Plant 밖에 못넣어 뽑히는 것도 Plant 임.
		Plant p = plants.get(0);
		for(Plant plant : plants) {
			System.out.println(plant);
		}
		//식물정보 [이름 = 산세베리아 종류 = 관엽]
		//식물정보 [이름 = 폴리샤스 종류 = 관엽]

	}
}
