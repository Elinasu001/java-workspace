package com.kh.chap03.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chap03.model.vo.MBTI;

public class Run {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		/*
		 * HashSet
		 * Value 값만 저장, index 개념 없음 == 순서 보장 X, 중복 X
		 * 
		 * [표현법]
		 * HashSet 객체명 = new HashSet(); // 빈 HashSet 만들어짐
		 */
		
		// 문자열만 담을 수 있는 HashSet
		Set<String> set = new HashSet();
		
		// 요소 추가
		// add(추가할 요소)
		/*
		set.add("안녕하세여"); // 중복안됨
		set.add("반갑습니다");
		set.add("점심 맛있게 드셨나요?");
		set.add(new String("반갑습니다"));
		set.add(new String("안녕하세여"));// 중복안됨
		set.add("순서 언제 고장남?");
		set.add("왜 계속 넣은대로 나옴?");
		
		System.out.println(set); // 저장 순서 보장 x, 중복 허용 x
		
		// 요소 개수 구하기 size()
		System.out.println("set의 요소 개수 : " + set.size());
		*/
		// 1. MBTI 16개를 다뤄야겠다.
		Set<MBTI> mbti = new HashSet();
		
		MBTI istj = new MBTI("I", "S", "T", "J");
		MBTI isfj = new MBTI("I", "S", "F", "J");
		MBTI estj = new MBTI("E", "S", "T", "J");
		MBTI estp = new MBTI("E", "S", "T", "P"); // 주소값 다름
		
		// 2. mbti 를 set 에 담아주기.
		mbti.add(istj);
		mbti.add(isfj);
		mbti.add(estj);
		mbti.add(estp);
		mbti.add(new MBTI("E", "S", "T", "P")); // 주소값 다름
		
		/*
		System.out.println("ABC".equals(new String("ABC"))); // true
		System.out.println(new String("ABC").hashCode()); // 64578
		System.out.println("ABC".hashCode()); // 64578
		*/
		/* ↑
		 * HashSet => set 에 요소를 추가할 때마다
		 * equals()와 hasCode()의 반환값을 기준으로 일치하는 요소가 있는지 비교함
		 */
		
		System.out.println(mbti); // 저장 순서 보장 x
				
		//istj.equals(isfj);
		
		/*
		 * equals() 호출의 결과가 == true 이고 hasgCode()의 반환값을 동등비교 연산자를 통해 비교했을 때
		 * 값이 일치하다면 => 동일객체로 판단(중복저장을 하지 않음)
		 * 
		 * 필드의 값은 같은데 주소값이 달라서 동일객체가 아닌것으로 판단하기 때문에
		 * VO클래스는 내부에 equals()와 hashCode()를 오버라이딩 한다.
		 */
		System.out.println("========================================================================================");
		
		// set 의 요소를 반복문을 통해 사용해보자
		/*
		 * 일반적으로 set은 get,즉, index가 없음
		for(int i = 0; i < mbti.size(); i++) {
			System.out.println(mbti.get이 업음;;);
		}
		*/
		// 그럼 인덱스가 필요없는 반복문을 사용
		for(MBTI e : mbti) {
			System.out.println(e);
		}
		System.out.println("========================================================================================");
		
		// 근데 인덱스 개념을 사용하고 싶다면?
		// addAll(Collection c) 사용 : 해당 리스트에 다른 컬렉션에 있는 요소들을 몽땅 추가해주는 메소드
		// 2. Set 의 요소들을 List 에 옮겨담아 인덱스를 활용
		//List list = new ArrayList();
		//list.addAll(mbti);
		List list = new ArrayList(mbti); //이것도 똑같음
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("========================================================================================");
		// 좀 더 고급진 방법~
		
		// 3. Iterator(반복자)
		// StringTokenizer 와 비슷한 느낌 ★ (3달 뒤 배울 예정)
		
		Iterator it = mbti.iterator(); // java.uiil
		
		// 하나씩 뽑힘
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		// 문제는 요소가 다 뽑히면 NoSuchElementException 발생
//		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*
		 * List 도 그렇고 Set 도 그렇고 전부 다 iterator 구현중
		 * 
		 * 모든 실제 객체를 Iterator 타입으로 사용할 수 있음(다형성 적용)
		 * 
		 * => List 계열과 Set 계열은 전부다 iterator()를 호출해서 반복을 시킬 수 있음.
		 * => Map 계열에서는 바로는 불가능
		 */
		
		
		
	}

}
