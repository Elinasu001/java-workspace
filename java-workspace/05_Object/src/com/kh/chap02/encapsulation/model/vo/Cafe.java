package com.kh.chap02.encapsulation.model.vo;

// 필드부, 생성자부, 메소드부
public class Cafe {

	// 필드(Field)부
	
	/*
	 * 객체가 가질 수 있는 속성
	 * 
	 * 정보(Data)를 담는 부분
	 * 
	 * 필드 == 멤버변수
	 * 
	 * 접근제한자 자료형 필드식별자;
	 */
	// private : 외부에서 여기로 접근할 수 없다.
	private String name;
	private String address;
	//private String signatureMenu;
	private int signatureMenuPrice; // 최소한 1 이상의 정수값이 들어가야됨. // 필드명 너무 김... 
	
	// 생성자(Constructor)부
	
	// 메소드(Method)부
	/*
	 * 기능(method)를 구현하는 부분
	 * - 상단 값과 관련된 기능을 구현해야됨.
	 * 
	 * - static 과 매개변수는 있을 수도 없을 수도 있음.
	 * 
	 * 접근제한자 (예약어(있을 수도 없을 수도 있음) ex) static) 반환명 메소드식별자(매개변수){
	 * 		메소드 호출 시 실행할 코드;
	 * }
	 * 
	 * 접근제한자	: 호출할 수 있는 범위를 제한할 수 있음.
	 * 반환형 	: void => return 할 때 돌려줄 값이 없음. 
	 * 				반환 시 결과 값의 자료형을 명시해준다.(즉, 값을 돌려주고 싶을 경우)
	 * 매개변수	: 메소드 호출 시 전달 값을 받아주는 변수
	 * 				메소드 범위에서만 사용 가능.(즉, 생략도 가능하다.)
	 * 
	 */
	
	public void open() {
		dishWash();
		cleaning();
		windowCleaning();
	}
	
	private void dishWash() {
		System.out.println("깨끗하게 빡빡!");
	}
	
	private void cleaning() {
		System.out.println("청소도 빡빡!");
	}
	
	private void windowCleaning() {
		System.out.println("유리도 빡빡!");
	}
	
	// setter()
	
	// 데이터를 기록 및 수정하는 기능의 메소드 : setter()
	/*
	 * DTO(Data Transfer Object) -> setter 를 만들어줌
	 * VO(Value Object) -> 일반적으로 setter 메소드를 구현하지 않음(공간만 만들어줌.)
	 * 
	 * DTO는 2달뒤에 배울 건데 DTO학습 전까지만 VO클래스에 setter 를 구현해서 사용.
	 * 
	 * setter 만들기 규칙
	 * 1. setter 메소드는 외부에서 접근이 가능해야 하기 때문에 접근제한자 public 사용.
	 * 2. set 필드명으로 식별자를 작성하며 낙타봉표기법(camelCase)를 꼭 지키도록 한다.
	 * 
	 * 3.(예외상황) 우리는 당분간 항상 모든 필드에 대해서 setter 를 구현합니다.
	 */
	
	// 고유 메뉴의 가격정보를 기록 및 수정할 수 있는 메소드
	// signatureMenuPrice
	public void setSignatureMenuPrice(int signatureMenuPrice) { // 매개변수 식별자는 필드명과 동일하게 작성한다.
		
		System.out.println("setter에서 전달 받은 정수 값 : " + signatureMenuPrice);
		
		// signatureMenuPrice = signatureMenuPrice;
		// scope 안에서는 해당 여역안에 있는 지역변수에 대한 우선권이 있음. 즉, 나의 주소를 알아야됨.
		// 주소 볼 수 있는 방법은? this
		// this : 해당 객체의 주소값을 가리키는 역할
		System.out.println("내 주소가 뭐지 ? > " + this);
		// 전달받은 매개변수 값이 1000원 보다 작을 경우 제어하기.
		if(signatureMenuPrice < 1000) {
			System.out.println("정상적이지 않은 값을 입력하셨습니다. 1000 이상의 정수를 입력하세요.");
		} else {
			this.signatureMenuPrice = signatureMenuPrice;
		}
	}
	
	// name 필드를 기록 및 수정할 수 있는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	/*
	 * 관례 위반 : 두 개 이상의 필드값을 변경하는 메소드는 set 이 붙으면 안된다 !!!!
	public void setNameAddress(String name, String address) {
		setName(name);
		setAddress(address);
	}
	*/
	
	
	// getter()
	// 데이터를 반환해주는 기능의 메소드 : getter()
	/*
	 * 규칙!
	 * 1. getter()는 접근제한자 public 사용한다.
	 * 2. get 필드명으로 짓되, 낙타봉표기법(camelCase)를 사용한다.
	 * 3. 모든 필드에 대해서 반드시 무조건 꼭 다 절대로 만들어주세용!
	 * 
	 * 
	 */
	// 메소드를 호출한 곳으로 name 필드값을 돌려주고 싶음.
	// getter() 메소드는 void 를 사용할 수 없다. 즉. 반환명 자리니깐 String 으로 사용한다.
	public String getName() {
		return name;
	}
	// 주소지를 반환해주는 메소드
	public String getAddress() {
		return address;
		// return value; 
		// value 를 메소드 호출 부분으로 반환하겠다.
		// 메소드의 반환형과 반환하고자 하는 값의 자료형이 일치하는가를 꼭 잘 확인해야함.
	}
	
	public int getSignatureMenuPrice() {
		return signatureMenuPrice;
	}
	
	// getter() / setter() 다만들었을 경우 ! ==> 캡슐화 끝남.
	/*
	 * 1. 값을 숨긴다 => 필드의 접근제한자를 public 대신 private 으로 선언한다.
	 * 2. 메소드를 통해 필드에 접근할 수 있도록 만들어준다 => getter() / setter() 구현
	 * 
	 * 데이터를 숨김 => 객체간의 결합도를 낮춤 => 책임을 분리시킨다.
	 */
	
	
	// 모든 필드 값을 확인할 수 있도록 반환해주는 메소드 (필드 하나하나 다 받아오면 출력하기 힘듦)
	
	public String info() {
		
		// name, address, signatureMenuPrice
		
		// return name, address, - x
		// ** return 할 떄 반환할 수 있는 값은 단 한계다 !
		String info = "[name 필드값 : " + name + ", addrss 필드값 : " + address
					+ ", signatureMenuPrice : " + signatureMenuPrice + "]";
		
		return info;
	}
	
}
