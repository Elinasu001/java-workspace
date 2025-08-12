package com.kh.chap01.run;

import com.kh.chap01.model.vo.Child1;
import com.kh.chap01.model.vo.Child2;
import com.kh.chap01.model.vo.Parent;

public class Run {
	/*
	 * 상속이란 무엇인가?
	 * 
	 * 	상속구조
	 * 
	 * 필드 / 메소드  => 별로 안중요함
	 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	 * 자식 구조는 부모구조에게 type(타입 == 자료형)을 물려 봤는다!!!!!!! => 중요함!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		// 1. 부모 타입 자료형으로부모 타입 객체를 다룸
		Parent p1 = new Parent();
		p1.printParent();
		// p1.printChild1();  : 자식이 가지고 있는 멤버는 부모가 사용할 수 없음
		// p1 변수로는 Parent 에만 접근 가능
		
		// 2. 자식 타입 자료형으로 자식 타입 객체를 다룸
		Child1 c1 = new Child1();
		c1.printChild1(); // 내껀 내꺼~~~
		c1.printParent(); // 부모것도 내꺼~~~
		// c1 변수로는 Child1, Parent 랑 둘 다 접근 가능
		
		// = <-- 얘를 기준으로 양변의 자료형이 같아야한다.
		// 3. 부모 타입 자료형으로 자식 타입 객체를 다룸 !!!!! 절대 자료형의 형변환 하지마!!!바꾸지마!!
		//Parent p2 = new Child1(); // 즉, 오른쪽 객체가 Parent 타입이어야만 들어갈 수 있다
		//p2.printParent();
		// 올바르게 바꾸려면?
		Parent p2 = /*(Parent)*/new Child1();
		p2.printParent();
		// 하지만 자료형을 자식 클래스는 부모 클래스의
		// 자료형을 물려 받기 때문에 (Parent)가 없어도 들어갈 수 있었던 것 !
		// p2.printChild1(); : Parent 타입으로는 자식 클래스 호출 안됨
		// p2 로는 Parent 타입만 접근할 수 있음.
		
		// 양쪽의 자료형이 다름에도 불구하고 에러가 발생하지 않는 이유는
		// 부모 클래스인 Parent 가 자식 클래스인 Child1에게 타입을 물려주서어서
		// 클래스 형변환이 일어났기 때문
		
		/*
		 * 클래스 형 변환
		 * 
		 * "상속 구조"일 경우에만 가능
		 * 
		 * 1. Up Casting
		 * 자식타입 => 부모타입
		 * : 생략이 가능함
		 * 
		 * 2. Down Casting
		 * 부모타입 => 자식타입
		 * : 생략이 불가능하다.
		 * 
		 */
		((Child1)p2).printChild1();
		
		// Child1 타입의 객체 두 개
		// Child 타입의 객체 두 개
		// 총 네개의 객체를 다뤄볼 것
		/*
		Child1 child1 = new Child1();
		Child1 child2 = new Child1();
		Child2 child3 = new Child2();
		Child2 child4 = new Child2();
		
		child1.printChild1();
		child2.printChild1();
		child3.printChild2();
		child4.printChild2();
		*/
		
		// 배열을 사용해보자
		// 배열 == 한 종류의 자료형인 값들을 묶어서 관리할 수 있음
		/*
		Child1[] arr1 = new Child1[2];
		Child2[] arr2 = new Child2[2];
		arr1[0] = new Child1();
		arr1[1] = new Child1();
		arr2[0] = new Child2();
		arr2[0] = new Child2();
		
		arr1[0].printChild1();
		arr1[1].printChild1();
		arr2[0].printChild2();
		arr2[0].printChild2();
		*/
		
		System.out.println("\n\n\n 다형성을 적용해보자");
		Parent[] arr = new Parent[4];
		arr[0] = (Parent)new Child1();
		arr[1] = (Parent)new Child2();
		arr[2] = new Child2();
		arr[3] = new Child1();
		
		//arr[0].printChild1(); : x
		for(int i = 0; i < arr.length; i++) {
			arr[i].printParent(); // 부모는 o
		}
		
		System.out.println("\n\n\n");
		
		for(int i = 0; i < arr.length; i++) {
			/*
			if(i == 0 || i == 3) {
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
			*/
			/*
			if(arr[i] instanceof Child1) { // Child1 타입이면 true 아니면 false
				//instanceof => true / false
				// 현재 참조변수가 실질적으로 어떤 클래스타입을 참조하고 있는지 확인할 때 사용
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
			*/
			arr[i].print();
			// 변수, 객체 배열, 다형성
			// 부모클래스 머시기 x 4
			
			/*
			 * 동적바인딩 : 프로그램 "실행 전" 컴파일 시점에 정적바인딩 수행(자료형의 메소드를 가리킴)
			 * 			실질적으로 참조하고 있는 객체가 해당 메소드를 오버라이딩 했다면
			 * 			프로그램 "실행 시점" 동적으로 자식클래스의 오버라이딩된 메소드를 실행
			 * 				  (Runtime)
			 * 
			 * 다형성 : 부모클래스 자료형으로 여러 자시클래스를 다루는 기술
			 * 
			 */
		}
		
		
		
	}

}
