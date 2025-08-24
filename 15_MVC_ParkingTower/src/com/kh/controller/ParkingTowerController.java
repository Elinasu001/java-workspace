package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Car;

public class ParkingTowerController {
	
	ArrayList<Car> carList = new ArrayList();
	private int nextParkingNum;
	
	{
		nextParkingNum = 1;
	}
	
	// 차량 주차 : 내부 일련번호 nextParkingNum 발급 후 삽입
	public void insertCar(int carNum, int carType, String owner) {
		Car newCar = new Car(nextParkingNum++, carNum, carType, owner);
		
		carList.add(newCar);
	}
	
	// 차량 출차 : 차량번호로 찾아 삭제
	public int deleteCar(int carNum) {
		
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getCarNum() == carNum) {
				carList.remove(i);
				return 1;
			}
		}
		
		return 0;
	}
	// 소유자명으로 필터링
	public ArrayList<Car> searchCar(String owner){
		ArrayList<Car> searchResult = new ArrayList();
		for(Car car : carList) {
			if(owner.equals(car.getOwner())) {
				searchResult.add(car);
			}
		}
		
		return searchResult;
	}
	// 전체 목록 반환
	public ArrayList<Car> selectList(){
		
		return carList;
		
	}
	
	
}
