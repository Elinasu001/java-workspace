package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Car;

public class ParkingTowerController {
	
	ArrayList<Car> carList = new ArrayList();
	private int nextParkingNum;
	
	{
		nextParkingNum = 1;
	}
	
	// 차량 출차 : 내부 일련번호 nextParkingNum 발급 후 삽입
	public void insertCar(int carNum, int carType, String owner) {
		Car newCar = new Car(nextParkingNum++, carNum, carType, owner);
		
		carList.add(newCar);
	}
	
	// 차량번호로 찾아 삭제
	public int deleteCar(int carNum) {
		return 0;
	}
	// 소유자명으로 필터링
	public ArrayList<Car> searchCar(String owner){
		return null;
	}
	// 전체 목록 반환
	public ArrayList<Car> selectList(){
		return null;
	}
	
	
}
