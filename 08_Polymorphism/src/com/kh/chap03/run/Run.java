package com.kh.chap03.run;

import com.kh.chap03.model.vo.BaseBall;
import com.kh.chap03.model.vo.FootBall;
import com.kh.chap03.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		
		FootBall fb = new FootBall();
		fb.rule();
		BaseBall bb = new BaseBall();
		bb.rule();
		
		
		// 이게 문제임 : 
		// 순전히 자식들에게 상속을 해줄 용도로 만든 클래스인데
		// 이것을 가지고 객체를 생성 하게 되면 문제가 될 수 있음.
		// 추상클래스로 선언되었기 때문에 객체 생성이 불가능함
		//Sports s = new Sports(); 
		//s.rule();
		// 다형성은 적용가능 !!
		Sports[] sports = new Sports[2];
		sports[0] = fb;
		sports[1] = bb;
		
		for(int i = 0; i < sports.length; i ++) {
			sports[i].rule();
		}
	}

}
