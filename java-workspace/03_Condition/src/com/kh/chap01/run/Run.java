package com.kh.chap01.run;

import com.kh.chap01.condition.A_If;
import com.kh.chap01.condition.A_If_Asignmt;
import com.kh.chap01.condition.B_Else;

public class Run {
	
	public static void main(String[] args) {
		
		A_If a = new A_If();
		//a.method1();
		//a.method2();
		//a.lunchMenu();
		
		//a.method3();
		//a.method4();
		
		B_Else b = new B_Else();
		//b.method1();
		//b.method2();
		b.ageCheck();
		
		
		A_If_Asignmt t = new A_If_Asignmt();
		//t.menuOrder();
	}
	
}
