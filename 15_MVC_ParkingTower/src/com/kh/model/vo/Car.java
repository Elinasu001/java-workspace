package com.kh.model.vo;

import java.util.Objects;

public class Car {
	private int parkingNum;
	private int carNum;
	private int carType;
	private String owner;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
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
	public int hashCode() {
		return Objects.hash(carNum, carType, owner, parkingNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return carNum == other.carNum && carType == other.carType && Objects.equals(owner, other.owner)
				&& parkingNum == other.parkingNum;
	}
	
	@Override
	public String toString() {
		String carType = "";
		switch(carType){
			case 1: ListCar(); break;
		}
		return "[ carType=" + carType + "]";
	}

	private int ListCar(String carType) {
		return this.carType;
	}

}
