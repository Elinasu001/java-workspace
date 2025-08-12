package com.kh.chap02.model.vo;

public class BeerDrinker extends Drinker {
	
	private boolean gout;
	
	public BeerDrinker() {
	}
	public BeerDrinker(boolean gout) {
		this.gout = gout;
	}
	
	public boolean isGout() {
		return gout;
	}
	public void setGout(boolean gout) {
		this.gout = gout;
	}
	
	@Override
	public void drink() {
		System.out.println("맥주를 한 입 마십니다. 꿀꺽꿀꺾");
	}
	 
	@Override
	public void eat() {
		System.out.println("치킨을 한 입 먹습니다. 옴뇸뇸뇨");
	}
	
}
