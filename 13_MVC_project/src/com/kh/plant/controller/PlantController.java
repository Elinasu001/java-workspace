package com.kh.plant.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.plant.model.vo.Plant;

// Controller : 사용자가 View 를 통해 요청했을 때
// 요청을 받아 처리해준 뒤 다시 처리결과를 View 로 반환해줌
public class PlantController {
	
	// 식물저장소
	private List<Plant> plants = new ArrayList(); // List : 타입부를 ArrayList 말고 List로 하는게 좋음
												  // <Plant> : 혹시나 다른 타입이 들어갈 수 있으니 Generic 사용
	
	// 초기화 블록 :: 순서 (first ! 생성자 블록 이전에 호출)
	{
		plants.add(new Plant("안시리움" , "분재"));
	}
	
	// View 에서 식물 추가 요청을 할 때마다 호출되는 메소드
	public void createPlant(String name, String type) {
		// 1절 => 객체 생성
		Plant plant = new Plant(name, type);
		
		// 식물 저장소에 새로운 식물을 추가
		// 필드로 가지고 있는 List 의 필드로 가지고 있는 Object[]의 요소로 추가
		plants.add(plant);
		
		//true false/ 받아 주면 좋긴한데 없으니 ... 
	}
	
	// View 에서 전체 식물조회 요청이 왔을 때 호출되는 메소드 (getter)
	public List<Plant> readAll() {
		// Plant 타입의 객체들의 주소가 요소로 존재하는 Objectp[] View에게 반환
		return plants;
	}
	
}
