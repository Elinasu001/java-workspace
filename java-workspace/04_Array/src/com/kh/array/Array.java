package com.kh.array;

public class Array {
	
	// 변수(Variable)
	// 변수란 ?
	// 메모리(RAM) 공간에 DATA(VALUE)값을 저장하는 공간
	
	// 변수의 특징
	// 1. 고유한 식별자를 가진다.
	// 2. 공간에 새로운 값을 대입해서 사용할 수 있다.
	// 3. 자료형이 정해져있다. (원시 자료형)
	// 4. 지역변수의 경우 메모리의 Stack 영역에 올라간다.
	// 5. ** 하나의 변수공간에는 하나의 값만 대입할 수 있다. **
	// 6. 초기화는 한 번만 가능하다.
	// 7. 초기화를 해야만 사용이 가능하다.
	// 8. 자료형은 크기가 정해져있다.
	// 9. 자료형끼리의 변환이 가능하다.
	// 10. 선언된 Scope 안에서만 사용이 가능하다.
	// 11. 변수끼리 연산도 가능하다.
	
	/* ex) 서점
	 * 배열(Array) : 하나의 배열에 여러 개의 값을 담을 수 있음.
	 * 				단, "같은 자료형의 값들" 만 담을 수 있음
	 * 				동종 모음(homogeneous collection) 이라고도 함
	 * 
	 * 				자바라는 **언어 자체**에 내장된 "유일"한 자료구조(값을 어떻게 저장????)
	 *
	 *				=> 배열의 각 인덱스에 실제 값이 담김
	 *				   index는 '0'부터 시작한다.
	 */
	public void method1() {
		
		// 임의의 정수 5개를 선언하고 초기화를 진행해야지!
		/*
		int num1 = 12;
		int num2 = 32;
		int num3 = 42;
		int num4 = 62;
		int num5 = 13;
		
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println(sum);
		
		for(int i = 1; i <= 5; i ++) {
			sum += numi // 안됨...
		}
		
		System.out.println(sum);
		*/
		
		// 배열
		
		// 1. 배열 선언
		
		/*
		 * 변수 선언 방법
		 * 자료형 변수식별자;
		 * 
		 * 배열 선언 방법 2가지
		 * 1) 자료형 배열식별자[]; 
		 * 2) 자료형[] 배열식별자; --> 요 방법을 사용할 것 !!!!!
		 */
		
		// 변수 선언!
		//int num;
		
		// 배열 선언!
		//int[] nums; 
		
		//int[] nums = 0; //--> 이렇게 사용 못함. mismatch
		
		// 2. 배열 할당
		
		/*
		 * 배열에 몇 개의 값이 들어갈지 배열의 크기를 정해주는 과정 
		 * 지정한 개수만큼 값이 들어갈 공간이 할당됨.
		 * 
		 * [표현법]
		 * 
		 * int[] numbers;			// 배열 선언
		 * numbers = new int[5];	// 할당
		 * 
		 * int[] arr = new int[5];	// 선언과 동시에 할당
		 * 
		 * 배열은 참조 자료형이다.
		 * 
		 */
		
		//int[] nums = new int[2];
		
		//nums 라는 정수형 배열을 선언하고 5칸 할당받아보기 
		int[] nums = new int[5];
		
		// 배열의 5칸에 값을 담아보기.
		// 3. 배열의 각 인덱스에 값 대입 
		/*
		 * [표현법]
		 * 
		 * 배열식별자[인덱스] = 값;
		 */
		
		nums[0] = 15;
		nums[1] = 23;
		nums[2] = 32;
		nums[3] = 22;
		nums[4] = 77;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		// 현시점에서 우리가 배열을 사용해서 얻을 수 있는 장점 : 반복문 사용 가능
		
	}
	
	public void methodA() {
		
		// 배열을 공부해보자.
		
		// 1. 배열 선언 및 할당
		int i;
		int[] integers = new int[3];/*Heap : 12byte*/ 			// 0, 1, 2
		//double[] doubles = new double[2]; 	// 0, 1

		// 배열식별자.length : 배열의 크기(길이) => 정수
		System.out.println(integers.length);		//3
		//System.out.println(doubles.length);		//2
		
		//System.out.println(i); : localvariable == 초기화를 진행하지 않으면 사용할 수 없음.
		i = 1;
		System.out.println(i);				//1
		System.out.println(integers);		//[I@7960847b
		System.out.println(integers[0]);	//0
		
		//integers = 1;		// x
		integers[0] = 1;	// o
		
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double
		 * 			=> 변수 공간에 실제 값을 바로 담을 수 있음 : 지역 변수 (scope)
		 * 
		 * 참조자료형 : boolean[], char[], byte[], int[] ... String
		 * 			=> 주소값을 담고 있는 변수 : 참조 변수 (레퍼런스(reference))
		 */
		
		// 인포, A강의장, B강의장, C강의장, 사무실
		/*
		String[] KH정보교육원종로지원;
		
		KH정보교육원종로지원 =  new String[5];
		
		System.out.println("종로점 주소 : " + KH정보교육원종로지원); // 주소값이지만 자바에서는 실제 주소값을 알지 못한다.
			
		// heap : 각각 주소값이다르니 변수명의 주속를 가지고 heap에 있는 주소값을 찾아간다.
		KH정보교육원종로지원[0] = "인포";
		KH정보교육원종로지원[1] = "A강의장";
		KH정보교육원종로지원[2] = "B강의장";
		KH정보교육원종로지원[3] = "C강의장";
		KH정보교육원종로지원[4] = "사무실";
		
		System.out.println("======== [3] index =========");
		
		System.out.println(KH정보교육원종로지원[3]);// 1. 남대문로 120 찾아 변수로 가기.
		
		System.out.println("======== 반복문 =========");
		
		for(int index = 0; index < 5; index++) {
			System.out.println(KH정보교육원종로지원[index]);// 인포 A강의장 B강의장 C강의장 사무실
		}
		*/
	}
	
	
}
