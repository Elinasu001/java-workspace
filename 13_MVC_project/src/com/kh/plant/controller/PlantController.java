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
	
	// 1. View 에서 식물 추가 요청을 할 때마다 호출되는 메소드
	public void createPlant(String name, String type) {
		// 1절 => 객체 생성
		Plant plant = new Plant(name, type);
		
		// 식물 저장소에 새로운 식물을 추가
		// 필드로 가지고 있는 List 의 필드로 가지고 있는 Object[]의 요소로 추가
		plants.add(plant);
		
		//true false/ 받아 주면 좋긴한데 없으니 ... 
	}
	
	// 2. View 에서 전체 식물조회 요청이 왔을 때 호출되는 메소드 (getter)
	public List<Plant> readAll() {
		// Plant 타입의 객체들의 주소가 요소로 존재하는 Object[] View 에게 반환
		return plants;
	}
	
	// 4. View 에서 식물 삭제 요청이 왔을 때 호출되는 메소드
	public int detetePlant(String name, String type) {
		/*
		 * 사용자가 입력한 식물 이름 + 식물 종류와 일치하는 필드값을 가진 Plant 객체를 제거
		 * 
		 * case 1. 동일한 이름 및 종류를 가진 식물이 존재하지 않았다
		 * case 2. 동일한 이름 및 종류를 가진 식물이 딱 한 개 존재했다.
		 * case 3. 동일한 이름 및 종류를 가진 식물이 여러 개 존재했다.
		 * 
		 * 성공 / 실패에 따라서 View 에게 반환 값을 다르게 돌려 주어야 함.
		 */
		
		/*
		 * 내 생각으로 써본 코드 ...
		for(Plant p : plants) {
			if(p.getName().equals(name) && p.getType().equals(type)) {
				return 1;
			}
		}
		return 0;
		*/
		
		//Plant p = plants.remove(2);
		//List returnList = new ArrayList();
		//returnList.add(p);
		//return returnList;
		
		/*
		 * 요소가 삭제 될 때마다 정수값을 증가 시키고
		 * 증가된 정수만 반환
		 */
		int count = 0;// 지워진 개수 만큼 돌아감
			
		// 요청 처리 
		for(int i = 0; i < plants.size(); i++) {
			// 방어적으로 작성하기
			if(name.equals(plants.get(i).getName()) &&
				type.equals(plants.get(i).getType())) {
				plants.remove(plants.get(i)); // 요소를 제거
				i--; // 2절
				count++; // 지워질 때마다 ++
			}
		}
		
		return count;
	}
	
}
