package com.kh.chap03.model.vo;

public class MBTI {
	
	private String introversionExtroversion;
	private String sensingiNtuition;
	private String thinkingFelling;
	private String judgingPerceiving;
	public MBTI() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MBTI(String introversionExtroversion, String sensingiNtuition, String thinkingFelling,
			String judgingPerceiving) {
		super();
		this.introversionExtroversion = introversionExtroversion;
		this.sensingiNtuition = sensingiNtuition;
		this.thinkingFelling = thinkingFelling;
		this.judgingPerceiving = judgingPerceiving;
	}
	public String getIntroversionExtroversion() {
		return introversionExtroversion;
	}
	public void setIntroversionExtroversion(String introversionExtroversion) {
		this.introversionExtroversion = introversionExtroversion;
	}
	public String getsensingiNtuition() {
		return sensingiNtuition;
	}
	public void setsensingiNtuition(String sensingiNtuition) {
		this.sensingiNtuition = sensingiNtuition;
	}
	public String getThinkingFelling() {
		return thinkingFelling;
	}
	public void setThinkingFelling(String thinkingFelling) {
		this.thinkingFelling = thinkingFelling;
	}
	public String getJudgingPerceiving() {
		return judgingPerceiving;
	}
	public void setJudgingPerceiving(String judgingPerceiving) {
		this.judgingPerceiving = judgingPerceiving;
	}
	
	@Override
	public String toString() {
		return "MBTI [introversionExtroversion=" + introversionExtroversion + ", sensingiNtuition=" + sensingiNtuition
				+ ", thinkingFelling=" + thinkingFelling + ", judgingPerceiving=" + judgingPerceiving + "]";
	}
	
}
