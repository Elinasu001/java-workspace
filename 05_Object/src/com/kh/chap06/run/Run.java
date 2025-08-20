package com.kh.chap06.run;

import java.util.Arrays;

import com.kh.chap06.controller.MethodController;
import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		
		/*
		MethodController mc = new MethodController();
		int a = mc.add(1, 2);
		int b = mc.add(2, 3);
		int c = mc.add(5, 6);
		int d = mc.add(a, b);
		int e = mc.add(c, d);
		System.out.println("총합 : " + e);
		*/
		
		MethodController mc = new MethodController();
		//mc.method1();
		//int[] dd = new int[3];
		//mc.method2(); // 매개변수는 존재하지 않지만 반환값은 존재합니다.
		//String returnValue = mc.method2(); 
		//System.out.println(returnValue); // 매개변수는 존재하지 않지만 반환값은 존재합니다.
		 								 // returnValue
		//System.out.println(mc.method2());// 매개변수는 존재하지 않지만 반환값은 존재합니다.
									     //	returnValue
		
		//mc.println("▶ method3 호출 결과 : " + mc.method3());//매개변수는 존재하지 않지만 반환값은 존재합니다.
														  // ▶ method3 호출 결과 : returnValue
		//System.out.println("▶ method3 호출 결과 : " + mc.method3());
		
		//mc.method4(30); // 매개변수는 존재하고 반환값은 존재하지 않습니다.
						// 전달받은값 + 100130
		//int result = mc.method5(5); // 매개변수도 있어요~ 반환값도 있어요~
		//System.out.println(result); // 55
		
		// 주의
		//mc.a(); // 메소드 a호출!
		//mc.b(); // 메소드 b호출!
		
		//MethodController mc = mc;
		//★★★★★★★ 얕은복사
		//mc.test(mc);
		
		
		// 객체를 생성하지 않고 메서드를 호출할 수 있음
		Math.random();
		int[] arr = {2, 3};
		//System.out.println(Arrays.toString(arr)); // [2, 3]
		//MethodController.staticMethod(); // 안녕 나는 스택틱 메소드임
		
		/*
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('a');
		System.out.println("어라?");
		System.out.println(mc);
		System.out.println();
		 */
		
		OverloadingController oc = new OverloadingController();
		
		// 정적 바인딩(Static Binding)
		// 컴파일이 끝난 시점 어떤 메소드가 호출될지 결정
		// 컴파일러가 알아서 코드를 분석해서 메소드 호출
		oc.test();
		oc.test(2);
		oc.test("3");
		oc.test(2, 2);
		oc.test(2, "erwer");
		oc.test("vvv", 4);
		System.out.println("==================");
	}

}
