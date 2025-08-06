package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	// 변수(Variable)
	// 변수란 ?
	// 메모리(RAM) 공간에 DATA(VALUE)값을 저장하는 공간

	// 변수의 특징
	// 1. 고유한 식별자를 가진다.
	// 2. 공간에 새로운 값을 대입해서 사용할 수 있다.
	// 3. 자료형이 정해져있다. (원시 자료형)
	// 4. 지역변수의 경우 메모리의 Stack 영역에 올라간다.
	// 5. ** 하나의 변수공간에는 하나의 값만 대입할 수 있다. **
	// 6. 초기화는 한 번만 가능하다.
	// 7. 초기화를 해야만 사용이 가능하다.
	// 8. 자료형은 크기가 정해져있다.
	// 9. 자료형끼리의 변환이 가능하다.
	// 10. 선언된 Scope 안에서만 사용이 가능하다.
	// 11. 변수끼리 연산도 가능하다.

	/*
	 * ex) 서점 배열(Array) : 하나의 배열에 여러 개의 값을 담을 수 있음. 단, "같은 자료형의 값들" 만 담을 수 있음 동종
	 * 모음(homogeneous collection) 이라고도 함
	 * 
	 * 자바라는 **언어 자체**에 내장된 "유일"한 자료구조(값을 어떻게 저장????)
	 *
	 * => 배열의 각 인덱스에 실제 값이 담김 index는 '0'부터 시작한다.
	 */
	public void method1() {

		// 임의의 정수 5개를 선언하고 초기화를 진행해야지!
		/*
		 * int num1 = 12; int num2 = 32; int num3 = 42; int num4 = 62; int num5 = 13;
		 * 
		 * int sum = num1 + num2 + num3 + num4 + num5; System.out.println(sum);
		 * 
		 * for(int i = 1; i <= 5; i ++) { sum += numi // 안됨... }
		 * 
		 * System.out.println(sum);
		 */

		// 배열

		// 1. 배열 선언

		/*
		 * 변수 선언 방법 자료형 변수식별자;
		 * 
		 * 배열 선언 방법 2가지 1) 자료형 배열식별자[]; 2) 자료형[] 배열식별자; --> 요 방법을 사용할 것 !!!!!
		 */

		// 변수 선언!
		// int num;

		// 배열 선언!
		// int[] nums;

		// int[] nums = 0; //--> 이렇게 사용 못함. mismatch

		// 2. 배열 할당

		/*
		 * 배열에 몇 개의 값이 들어갈지 배열의 크기를 정해주는 과정 지정한 개수만큼 값이 들어갈 공간이 할당됨.
		 * 
		 * [표현법]
		 * 
		 * int[] numbers; // 배열 선언 numbers = new int[5]; // 할당
		 * 
		 * int[] arr = new int[5]; // 선언과 동시에 할당
		 * 
		 * 배열은 참조 자료형이다.
		 * 
		 */

		// int[] nums = new int[2];

		// nums 라는 정수형 배열을 선언하고 5칸 할당받아보기
		int[] nums = new int[5];

		// 배열의 5칸에 값을 담아보기.
		// 3. 배열의 각 인덱스에 값 대입
		/*
		 * [표현법]
		 * 
		 * 배열식별자[인덱스] = 값;
		 */

		nums[0] = 15;
		nums[1] = 23;
		nums[2] = 32;
		nums[3] = 22;
		nums[4] = 77;

		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		// 현시점에서 우리가 배열을 사용해서 얻을 수 있는 장점 : 반복문 사용 가능

	}

	public void methodA() {

		// 배열을 공부해보자.

		// 1. 배열 선언 및 할당
		int i;
		int[] integers = new int[3];/* Heap : 12byte */ // 0, 1, 2
		// double[] doubles = new double[2]; // 0, 1

		// 배열식별자.length : 배열의 크기(길이) => 정수
		System.out.println(integers.length); // 3
		// System.out.println(doubles.length); //2

		// System.out.println(i); : localvariable == 초기화를 진행하지 않으면 사용할 수 없음.
		i = 1;
		System.out.println(i); // 1
		System.out.println(integers); // [I@7960847b
		System.out.println(integers[0]); // 0

		// integers = 1; // x
		integers[0] = 1; // o

		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double => 변수 공간에 실제 값을
		 * 바로 담을 수 있음 : 지역 변수 (scope)
		 * 
		 * 참조자료형 : boolean[], char[], byte[], int[] ... String => 주소값을 담고 있는 변수 : 참조 변수
		 * (레퍼런스(reference))
		 */

		// 인포, A강의장, B강의장, C강의장, 사무실
		/*
		 * String[] KH정보교육원종로지원;
		 * 
		 * KH정보교육원종로지원 = new String[5];
		 * 
		 * System.out.println("종로점 주소 : " + KH정보교육원종로지원); // 주소값이지만 자바에서는 실제 주소값을 알지
		 * 못한다.
		 * 
		 * // heap : 각각 주소값이다르니 변수명의 주속를 가지고 heap에 있는 주소값을 찾아간다. KH정보교육원종로지원[0] = "인포";
		 * KH정보교육원종로지원[1] = "A강의장"; KH정보교육원종로지원[2] = "B강의장"; KH정보교육원종로지원[3] = "C강의장";
		 * KH정보교육원종로지원[4] = "사무실";
		 * 
		 * System.out.println("======== [3] index =========");
		 * 
		 * System.out.println(KH정보교육원종로지원[3]);// 1. 남대문로 120 찾아 변수로 가기.
		 * 
		 * System.out.println("======== 반복문 =========");
		 * 
		 * for(int index = 0; index < 5; index++) {
		 * System.out.println(KH정보교육원종로지원[index]);// 인포 A강의장 B강의장 C강의장 사무실 }
		 */

		int number1 = 3;
		int number2 = 3;

		System.out.println(number1 == number2); // true

		int[] numbers1 = new int[3];
		int[] numbers2 = new int[3];

		System.out.println(numbers1 == numbers2); // false : 주소값이 다르기 때문이다.

		// 참조자료형에서는 ==(동등비교 연산자) 사용 시
		// 주소값을 비교하기 때문에 원하는 결과를 얻을 수 없음
		// 문자열 == 문자열 x 문자열.equals("비교할 문자열");

		// 해시코드 : 주소값을 10진수(int형태) 형태로 나타낸 것.
		System.out.println(numbers1.hashCode()); // hashCode 란? 운영체제 내부에 있는걸 사용하는 것.
		System.out.println(numbers2.hashCode());

	}

	public void lotto() {

		// 로또번호생성기 ver0_2;
		int[] lottoNumbers = new int[6];
		/*
		 * lottoNumbers[0] = (int)(Math.random() * 45) + 1; lottoNumbers[1] =
		 * (int)(Math.random() * 45) + 1; lottoNumbers[2] = (int)(Math.random() * 45) +
		 * 1; lottoNumbers[3] = (int)(Math.random() * 45) + 1; lottoNumbers[4] =
		 * (int)(Math.random() * 45) + 1; lottoNumbers[5] = (int)(Math.random() * 45) +
		 * 1;
		 */

		// 배열의 요소(Elements) 6개가 들어있음.
		for (int i = 0; i > 6; i++) {
			lottoNumbers[i] = (int) (Math.random() * 45) + 1;
		}

		// Arrays.toString(배열식별자) : 메소드로 인자값 받아옴
		System.out.println(Arrays.toString(lottoNumbers));

	}

	public void methodB() {

		// 5개의 요소를 담을 수 있는 String 형 배열을 선언 및 할당하시오.
		// 동물 5총사
		// 1. 배열 선언 및 할당
		String[] animals = new String[5];

		// 2. 배열 인덱스에 동물 대입
		animals[0] = "쥐";
		animals[1] = "양";
		animals[2] = "소";
		animals[3] = "뱀";
		animals[4] = "개";
		// animals[5] = "말"; //Index 5 out of bounds for length 5
		// animals[5] = "토끼"; <-- 문법적으로 문제는 없음.

		// at com.kh.array.Array.methodB(Array.java:240)
		// ArrayIndexOutOfBounds
		// 배열의 인데스가 범위를 벗어남.

		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
		 * out of bounds for length 5 at com.kh.array.Array.methodB(Array.java:240) at
		 * com.kh.array.Run.main(Run.java:11)
		 */

		System.out.println(Arrays.toString(animals)); // 쥐, 양, 소, 뱀, 개

		// 생각 안해도 괜찮은것
		// 1. ;
		// 2. 어? 조건이다 if
		// 3. 어? 합계다 sum

	}

	public void methodC() {

		// 사용자에게 세 개의 정수를 입력받아서
		// 입력받은 정수 중 최소값 구하기

		// 현 시점에서 배열을 선택할 때의 기준
		// 1. 두 개 이상의 같은 자료형의 값을 다룰 것
		// 2. 다룰 값의 개수가 명확하게 정해져 있을 것

		// 1) 사용자로부터 값을 입력받아서 배열의 각 인덱스에 대임
		Scanner sc = new Scanner(System.in); // 입력도구
		int[] nums = new int[3]; // 저장소

		// 배열은 물리적인구조와 논리적인 구조가 동일합니다.
		/*
		 * System.out.println("첫 번째 정수를 입력해주세여 > ");
		 * 
		 * nums[0] = sc.nextInt(); System.out.println("nums라는 배열의 0번째 인덱스에 대입된 값 : " +
		 * nums[0]);
		 * 
		 * System.out.println("두 번째 정수를 입력해주세여 > "); nums[1] = sc.nextInt();
		 * System.out.println("nums라는 배열의 1번째 인덱스에 대입된 값 : " + nums[1]);
		 * 
		 * System.out.println("세 번째 정수를 입력해주세여 > "); nums[2] = sc.nextInt();
		 * System.out.println("nums라는 배열의 2번쨰 인덱스에 대입된 값 : " + nums[2]);
		 * 
		 * 
		 * System.out.println("nums 배열 : " + Arrays.toString(nums));
		 */

		// 중복된 부분 변수로 처리 int[]
		for (int i = 0; i < nums.length; i++) { // i < 3 3이 바뀌면 여기도 바꿔야 되기 때문에 확장성을 위해 length로 바꿔주기.
			System.out.println("정수를 입력하세요 > ");
			nums[i] = sc.nextInt();
			System.out.println("nums라는 배열의 " + i + "번째 인덱스 값 : " + nums[i]);
		}

		System.out.println(Arrays.toString(nums));

		// 2. 해당 배열의 요소 중 가장 작은값 == 최소값을 출력하는 것이 목적
		int min = nums[0];

//		if(min > nums[1]) {
//			min = nums[1];
//		}
//		
//		if(min > nums[2]) {
//			min = nums[2];
//		}

		// 중복 삭제
		for (int i = 1; i < nums.length; i++) { // 이미 초기값이 0이니 두 번째 인덱스인 1과 비교를 해서 최소값을 찾으면 된다.

			if (min > nums[i]) {
				min = nums[i];
			}
		}
		System.out.println("배열의 요소 중 가장 작은 값 : " + min);
	}

	public void methodD() {

		/*
		 * 한 번 할당 받은 배열의 크기를 변경할 수 없음 (값은 요소를 바꿔서 넣을 수는 있음)
		 */

		String[] name = new String[3];
		name[0] = "박";
		name[1] = "수";
		name[2] = "현";
		System.out.println(Arrays.toString(name)); // [박, 수, 현]
		name[2] = "옥";
		System.out.println(Arrays.toString(name)); // [박, 수, 옥]
		System.out.println(name.hashCode()); // 주소값이 다름.

		// 외자를 바꾸고 싶을 경우 ...? 그럼 두칸으로 변경 해야됨.
		// 큰거에서 작은걸로 _ 이럴 경우 바뀌지 않는다.
		name = new String[2];
		name[1] = "굿";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode()); // 주소값이 다름.
		// 작은거에서 큰걸로 _ 이럴 경우 바뀌지 않는다.
		name = new String[4];
		name[3] = "굿";
		System.out.println(Arrays.toString(name)); // [null, null, null, 굿]
		System.out.println(name.hashCode()); // 주소값이 다름.

		// 해시값이 같으면 해시충돌이 일어날 수 있다 다르면 충돌이 안생겨 참이다.

		/*
		 * --> 어셈블리어 형태의 언어 (LOW LEVEL) 101011 111 00 1111 111 11 -> 추상화 -> MOV -> AL
		 * 
		 * --> 3세대 언어 : 현시대 주류 언어 (HIGH LEVEL == 고급언어)_자바 (자바 이전에는 C언어)
		 * 
		 * 자바 : 하드웨어나 운영체제에 종속되지 않는다. 실제 프로그램을 동작할 때는 가상의 컴퓨터(JVM : Virtual Computer)
		 * 위에서 동작한다. 즉, JVM가 메인 메서드를 호출하여 동작한다. (unix > unix, web > web,,,)
		 * 
		 * 자바라는 특성 중 하나인 "자동 메모리 관리"라 한다.=> 주소 : aaa(rc : reference counter == 0) -> bbb
		 * (rc == 1)로 바뀔 때 기존 aaa는 쓰레기이기 때문에 (gc : garbage collector)가 가져가서 삭제 시켜 버린다.
		 */

		/*
		 * 연결이 끊긴 기존의 배열은 일정 시간이 지나면 G.C가 알아서 삭제 해준다.' : 자동 메모리 관리
		 * 
		 * 
		 * 기존배열식별자에 할당만 새롭게 한다면, => 기존 참조하고 있던 연결이 끊기고 새로운 배열을 참조함
		 * 
		 */

		// null : 아무것도 조재하지 않음을 의미하는 값.
		/*
		 * 기본값
		 * 
		 * 정수 = 0 실수 = 0.0 문자 = ''
		 * 
		 * 참조자료형 = null
		 * 
		 * 참조자료형 null이라는 값이 들어가는데 주소값이 존재하는가 그렇지 않은가
		 * 
		 */

		name = null; // 현재 연결고리를 끊고싶다.
		System.out.println(name);
		name[0] = "홍길동";
		/*
		 * ** 가리키고 있는 대상이 null인데 주소가 없는데 어디 접근함??
		 * 
		 * Exception in thread "main" java.lang.NullPointerException: Cannot store to
		 * object array because "name" is null at
		 * com.kh.array.Array.methodD(Array.java:406) at
		 * com.kh.array.Run.main(Run.java:13)
		 */
	}

	public void methodE() {
		System.out.println("rrrr");

		// 그래서 배열 어따씀?
		// 그래서 배열 보통 어케씀?

		// 설명을 위해 이렇게 쓴 것
		int[] arr = new int[3]; // 0, 1, 2
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(Arrays.toString(arr));

		// 보통 쓰는 배열 방법 : 배열 보통 선언과 동시에 요소를 대입해서 사용하곤함.
		int[] arr1 = new int[] { 1, 2, 3 };
		System.out.println(Arrays.toString(arr));

		// 원래 사용하는 방식 !
		int[] arr2 = { 100, 200, 300 };
		System.out.println(Arrays.toString(arr));
	}

	/*
	 * 배열 복사
	 * 
	 * 1. 얕은 복사 ★★★★
	 * 
	 * 2. 깊은 복사
	 * 
	 */
	public void methodF() {
		// 얘가 중요함
		int[] origin = { 1, 2, 3, 4, 5 };
		// new int[5];
		// origin[0] = 1; origin[1] = 2; ...
		System.out.println(Arrays.toString(origin)); // [1, 2, 3, 4, 5]

		// 얕은 복사로 배열을 복사
		int[] copy = origin;
		System.out.println(Arrays.toString(copy)); // [1, 2, 3, 4, 5]

		origin[2] = 33;
		System.out.println(Arrays.toString(origin)); // [1, 2, 33, 4, 5]
		System.out.println(Arrays.toString(copy)); // [1, 2, 33, 4, 5] : 왜 영향을 받는가?

		// 얕은 복사 ⇒ 주소값을 대입하는 것 이기 때문에 가리키고 있는 대상이 같다.

		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
	}

	// 2. 깊은 복사
	public void methodG() {

		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[6];
		System.out.println(Arrays.toString(origin)); // [1, 2, 3, 4, 5]
		/*
		 * copy[0] = origin[0]; copy[1] = origin[1]; copy[2] = origin[2]; copy[3] =
		 * origin[3]; copy[4] = origin[4];
		 */
		// 중복 제거
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}

		// 배열의 깊은 복사의 경우 기존 배열의 크기보다 큰 배열로 복사하는 경우가 많음

		System.out.println(Arrays.toString(copy)); //[1, 2, 3, 4, 5, 0]
		
		int[] copy2 = new int[10];
		
		// 배열 복사하는 메서드 : arraycopy
		System.arraycopy(origin, 0, copy2, 1, 5); // 1번째 인자로는 원본 배열, 2번째 인자로는 내가 복사하려는 시작 배열, 3번째 넣으려는 배열, 4번째 3번째 배열의 시작, 5번째 몇개 인자를 복사하는지 
		//[0, 0, 0, 0, 1, 2, 3, 4, 5, 0]
		System.out.println(Arrays.toString(copy2));
		/*
		 * 네이밍컨벤션 == 첫 글자가 대문자 == 클래스 / 인터페이스
		 * arraycopy() ==> System(참조)클래스
		 * 
		 * System.arraycopy(원본 배열 식별자, 원본배열에서 복사를 시작할 인덱스,
		 * 					복사본 배열 식별자, 복사본 배열에서 복사가 시작될 인덱스,
		 * 					복사할 개수);
		 */
		
		System.out.println(Arrays.toString(origin));
		
		//Arrays클래스에서 제공하는 copyOf()
		
		int[] copy3 = Arrays.copyOf(origin, 15);
		System.out.println(Arrays.toString(copy3)); //[1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		
		int[] copy4 = origin.clone();
		System.out.println(Arrays.toString(copy4)); //[1, 2, 3, 4, 5]
		
	}

}
