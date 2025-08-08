package com.kh.chap07.remote.model.vo;

// 필요한 값들을 저장하는 역할
public class Television {
		
	/*
	 * 채널 어떡하지?
	 * 1.정수형
	 * 2.String[] [v]
	 */
	
	// [필드]
	private boolean on;		// getter() setter()
	private String[] channel; 	// getter()
	
	// [생성자]
	// 내가 가지고 있는 필드 초기화
	public Television() {
		channel = new String[5];
		channel[0] = "대한민국 24 뉴스채널";
		channel[1] = "시니어토크쇼";
		channel[2] = "스튜디오K";
		channel[3] = "EBS 평생학교 2교시";
		channel[4] = "꾸러기TV";
	}
	
	public String[] getChannel() {
		return channel;
	}
	
	// getter() 은 get 대신에 is 를 붙인다.
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	
	
}
