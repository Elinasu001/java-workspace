package com.kh.plant.run;

import com.kh.plant.view.PlantView;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * MVC 패턴(Model-View-Controller)
		 * 애플리켄이션을 만들 때,
		 * 애플리케이션 구조를 세가지 요소로 분리하자
		 * 라는 소프트웨어 아키텍쳐 디자인 패턴
		 * 
		 * GoF 디자인 패턴(정처기) :: 굉장히 많은 우리는 아래와 같이 정형화된 디자인 패턴을 알아두기
		 * 1. Model
		 * 		- 데이터 담당 => VO (value object)
		 * 		- 외부 매체와 상호작용 (다음 주에 배우는 데이터베이스, 값을 담음) => DAO(Data Access Object)
		 * 		- 아직은 없음 => 비지니스 로직 ★
		 * 
		 * 2. View
		 * 		- 사용자 인터페이스 담당 
		 * 		- 사용자에게 정보 표시 / 사용자의 입력값을 받아줌
		 * 		- 모델에서 만들어진 데이터를 시각적으로 표현
		 * 		- 모델과 직접 상호작용 하지 않음
		 * 
		 * 3. Controller
		 * 		- Model 하고 View 의 중간다리 역할
		 * 		- 사용자 입력을 처리하고 모델에 전달
		 * 		- 모델에서 일어난 처리작업을 뷰에 반영
		 */
		PlantView pv = new PlantView();
		pv.mainMenu();
		
		
	}

}
