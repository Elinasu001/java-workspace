package com.kh.chpa04_assist.model.vo;

import java.io.Serializable;
// 직렬화(Serializable) : 객체(object)를 바이트(byte) 형태로 전환 하기 위함
public class Plant implements Serializable {
	
	private String name;
	private String type;
	
	public Plant() {
		super();
	}
	public Plant(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Plant [name=" + name + ", type=" + type + "]";
	}
	
}
