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
	
	public List<Plant> findByKeyword(String keyword) {
		
		/*
		 * 1. Plant[] => 배열 몇칸으로 해야될 지 알 수 없다.
		 * 2. List<Plant> => 그래서 식물들을 담을 수 있는 List를 담고 <Plant>만 담을 수 있게 해준다.[v]
		 */
		List<Plant> searched = new ArrayList();
		
		/*
		 * 식물의 이름 또는 타입에 사용자가 입력한 키워드가 포함되어있을 경우
		 * 싸그리 몽땅 다 들고가서 출력 해줄 것
		 * 
		 * 조회 => 사용자가 입력한 keyword 가 포함된 Plant 객체의 필드값을 확인
		 * plants 의 요소를 전부 다 하나하나 확인하면서 체크체크
		 */
		
		//1. plants의 요소의 개수만큼 반복
		for(int i = 0; i < plants.size(); i++) {
			
			// 2. 요소를 변수에 대입 (기본 자료형이나 참조 자료형(대문자 및 주소값)인지 생각부터 하기, 공간에 대입 꼭 잊지말기)
			Plant plant = plants.get(i);
			// 2.2. plant 객체의 name 필드 또는 type 필드에
			//  	사용자가 입력한 keyword 가 포함되어 있다면 !
			
			// contains : 포함되어 있는지 없는지 사용할 경우 (boolean),
			// || 파이프라인
			if(plant.getName().contains(keyword) || 
			   plant.getType().contains(keyword)) {
				searched.add(plant); // 담아담아
			}
		}
		return searched;
		
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
	
	// 5.
	// 일반적으로는 int 일단, 안해본걸로 진행
	public boolean updatePlant(String name, String type, String newName, String newType) {
		
		// 요청 처리
		for(int i = 0; i < plants.size(); i++) {
			Plant p = plants.get(i); // 주소를 빼서 담기
			if(name.equals(p.getName()) && type.equals(p.getType())) {
				// 일치하는 식물 존재한다.
				
				// 방법 1.
				// 사용자가 입력한 새 이름 및 새 타입으로 갱신!!
				// set => 첫번째 인자인 인덱스 위치에 요소를
				// 		  두번째 인자로 바꿔주는 메소드
				// plants.set(i, new Plant());
				
				// 방법 2.[v]
				p.setName(newName);
				p.setType(newType);
				return true;
			}
		}
		return false;
	}
	
}
