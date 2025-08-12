package com.kh.chap02.model.vo;

public class RiceWineDrinker extends Drinker {
	
	private int age;
	
	public RiceWineDrinker() {
		
	}
	public RiceWineDrinker(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void drink() {
		System.out.println("막거리를 흔들어 마셔봐요");
	}
	
	@Override
	public void eat() {
		System.out.println("파전을 드셔보세요~");
	}
}
