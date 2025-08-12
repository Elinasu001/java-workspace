package com.kh.chap05.model.vo;

// 인터페이스를 구현
public class Hiphop extends Music implements MusicI, MultipleInterface {
	
	@Override
	public void play() {
		System.out.println("힙합을 재생합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("음악을 멈춥니다.");
	}
	
}
