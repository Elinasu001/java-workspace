package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04.model.vo.Fish;

class Run {

	public static void main(String[] args) {
		// Map
		// key + Value 세트로 저장
		
		/*
		 * HashMap
		 * 
		 * [표현법]
		 * Map 객체이름 = new HasMap();
		 * 
		 * 키 == 식별자 => 생선이름
		 * 벨류 == 생선객체
		 */
		
		
		Map<String, Fish> aquarium = new HashMap();
		// 비어있는 맵에 요소를 추가해보기
		/*
		 * List, Set => add()
		 *  Collection 을 구현한 클래스 (즉, 맵은 두 컬렉션과 다른 동떨어진 느낌이지만 개념적으로는 동등)
		 *  aquarium.add x
		 */
		
		/*
		 * HashMap => put()
		 * => key + value 함께 요소로 추가
		 */
		
		// 1. put(K key, V value) : Map 에 key + value 세트로 요소로 추가해줌
		// toString / equals 오버라이딩
		aquarium.put("농어", new Fish("단맛", "회"));
		aquarium.put("대방어", new Fish("기름맛", "회"));
		aquarium.put("연어", new Fish("담백한맛", "스테이크"));
		aquarium.put("고등어", new Fish("맛있음", "구이"));
		aquarium.put("메기", new Fish("흙맛", "매운탕"));
		System.out.println(aquarium); // 저장 순서 고장남, 보장 x
		aquarium.put("참치", new Fish("기름맛", "회"));
		System.out.println(aquarium); // Value 갑의 경우 중복 저장 o
		aquarium.put("참치", new Fish("감칠맛", "후토마키"));
		System.out.println(aquarium); // key == 식별자 --> 중복이 발생하면 덮어씌어짐
		// 즉, key 가 식별자 역할을 하기 때문에 중복이 발생할 수 없음.
		
		// 2. get(Object key) : Object :: map 좋은법
		// 전달된 key 값에 해당하는 value 값을 반환해주는 메소드
		// key -> value 를 찾아옴
		System.out.println(aquarium.get("농어")); // Fish [taste=단맛, recipe=회]
		System.out.println(aquarium.get("메기")); // Fish [taste=흙맛, recipe=매운탕]
		System.out.println(aquarium.get("광어")); // null
		
		
		// 3. size() : Map 에 담겨있는 요소의 개수
		System.out.println(aquarium.size()); // 6
		
		// 4. replace(K key, V value) : 키값으로 요소를 찾아서 Value 값으로 바꿔줌
		//System.out.println(aquarium)
		aquarium.replace("참치", new Fish("고소한맛", "구이"));
		aquarium.replace("없는거", null);
		System.out.println(aquarium);
		// 중복 하면 덮어 씌어지는데 저걸 쓰지 이걸 왜 쓰는지?
		// put과 다르게 replace 사용 시 없는 값을 넣게 되면 새로운 값을 추가하지 않음.
		// 기존에 존재하지 않는 키값을 인자로 전달하면 추가하지 않는 다는 것이 put 과 차이점이다.
		
		// 5. remove(Object key) => 해당 키 값을 찾아서 => 키 + 벨류 세트로 지워주는 메소드
		aquarium.remove("참치");
		System.out.println(aquarium);
		
		System.out.println("=========================================================================================");
		
		// Map 에 들어있는 모든 요소들에 순차적으로 접근해야 한다면??
		// for 문 x, 향상된 for 문 x, while x
		// addAll(Collection c) => map 은 collection 구현 안해서 x
		// Iterator => List 와 Set 만 사용이라 x
		
		aquarium.forEach((key, value) -> {
			System.out.println(key + ": " + value);
		});
		
		/*
		 * Map 이 Key - Value 를 가지고 있는데
		 * Key 값들만 Set 으로 바꿀 수 있음
		 * Set 으로 바꾸면 Iterator 를 사용할 수 있기 때문에 반복
		 */
		
		// 1) keySet() 호출하기
		
		// 1_1) Map 이 가지고 있는 Key 들만 Set 에 담는다.
		Set<String> fishSet = aquarium.keySet();
		System.out.println(fishSet); // [농어, 메기, 대방어, 연어, 고등어]
		
		// 1_2) Set 를 Iterator 에 담기
		Iterator<String> itKey = fishSet.iterator();
		
		// 1_3) 반복문 사용하기
		while(itKey.hasNext()){
			String key = itKey.next();
			System.out.println(key + "-----" + aquarium.get(key));
		}
		System.out.println("=========================================================================================");
		// 가장 권장하는 방법
		// 2) entrySet() 를 이용하는 방법
		
		// 2_1) Map 이 가지고 있는 Key-Value 세트를 Set 에 담기
		Set<Entry<String, Fish>> entrySet = aquarium.entrySet();
		
		System.out.println(entrySet);
		
		for(Entry<String, Fish> e : entrySet) {
			System.out.println(e.getKey() +  ":::::" + e.getValue());
		}
		
	}

}
