package com.kh.model.vo;

import java.util.Objects;

public class Car {
	private int parkingNum;
	private int carNum;
	private int carType;
	private String owner;
	
	public Car() {
		super();
	}
	
	public Car(int parkingNum, int carNum, int carType, String owner) {
		super();
		this.parkingNum = parkingNum;
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}
	
	public int getParkingNum() {
		return parkingNum;
	}

	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}



	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	@Override
	public String toString() {
		String carTypeStr = "";
		switch(carType) {
		case 1 : carTypeStr = "경차"; break;
		case 2 : carTypeStr = "세단"; break;
		case 3 : carTypeStr = "SUV"; break;
		case 4 : carTypeStr = "트럭"; break;
		default : carTypeStr = "알 수 없음"; break;
		}
		return "주차번호 : " + parkingNum + ", 차량번호 : " + carNum + ", 차량종류" + carTypeStr + ", 소유자" + owner;
	}

}
