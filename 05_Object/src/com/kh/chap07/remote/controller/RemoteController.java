package com.kh.chap07.remote.controller;

import com.kh.chap07.remote.model.vo.Television;

// 데이터(VO)와 화면(View)의 중간다리 역할
public class RemoteController {
	
	//*1
	private Television tv = new Television(); // 기본 생성자 호출
	
	//*5
	// tv를 true 로 변경 : setOn 메소드를 불러서 true 로 변경해주기
	public void powerOn() {
		tv.setOn(true);
	}
}
