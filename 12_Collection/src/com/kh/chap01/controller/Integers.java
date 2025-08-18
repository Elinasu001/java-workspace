package com.kh.chap01.controller;

import java.util.Arrays;

public class Integers {
	
	// 조건 : 정수를 가변적으로 사용하고 싶을 경우(즉, 몇개를 다룰지는 모름)
	private int[] integers;
	private int size;
	
	public Integers() {
		integers = new int[3]; // 3개로 지정 해놓을 경우 배열의 범위를 넘어가게됨.
							   // 그럼 배열을 늘린다면, 기존에 있던 값들이 날라가게 된다.
							   // 그래서 새로운 배열을 만들어 깊을 복사를 해준다.
		
	}
	
	public void add(int element) { // 1번째는 0번 인덱스 대입 2번째는 1번 인덱스 대입 ...
								   // add 메서드로 호출
		
		// 1) 공간이 꽉 찼는 지 확인
		if(integers.length == size +1) {
			integers = Arrays.copyOf(integers, (integers.length * 2)); // 복사 : 원본 배열 길이의 두배로 복사
																	   // 이것만 사용한다면 add 할때마다 늘어나기 때문에
																	   // 이럴 경우, 배열의 길이의 값이 꽉 찼을 경우 늘어나게 조건문을 사용해준다.
			
		}
		// 2) 뒤에 붙이고 size 증가
		integers[size++] = element;
	}
	
	public int get(int index) { // 값을 받아서 반환 해주기
		return integers[index];
	}
	
	
	@Override
	public String toString() {
		return Arrays.toString(integers);
	}
	
	
}
