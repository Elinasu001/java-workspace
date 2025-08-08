package com.kh.chap07.remote.controller;

import com.kh.chap07.remote.model.vo.Television;

// 데이터(VO)와 화면(View)의 중간다리 역할
public class RemoteController {
	
	//*1
	private Television tv = new Television(); // 기본 생성자 호출
	
	// 채널명 몇번인지 저장해야됨.
	//private int channelNo = 0;
	private int channelNo; // 필드에서는 기본값으로 = 0 필요 없음
	
	
	//*5
	// 보통 반환해줄때는 true/false int 자료형을 사용
	// tv 를 true 로 변경 : setOn 메소드를 불러서 true 로 변경해주기
	public int powerOn() {
		
		// 티비가 꺼져 있을 경우에만 사용
		if(!tv.isOn()) { // !tv.isOn() >> tv.isOn() == false :: TV가 꺼져 있는가? 
			tv.setOn(true);
			return 1;
			
		} else {
			return 0;
		}
	}
	
	// view == television > channel type > String
	public String channelUp() {
		
		// getter 메소드를 호출해서 받아오기 > 문자열 배열 주소값 저장
		String[] channel = tv.getChannel(); // channel 지역변수
		if(channelNo < (channel.length -1)) { // 5 -1
			return channel[++channelNo];// channel[1] : 무조건 1번 돌리고 싶을 경우 // channel 인덱스 접근, 주소값 반환(string)
		}
		
		// 0번 인덱스로 돌려줄 거면 channelNo = 0로 바꿔줘야 됨.
		channelNo = 0;
		return channel[0];
	}
	
	public int getChannelNo() {
		return channelNo;
	}
}
