package com.kh.idol.view;

import java.util.List;
import java.util.Scanner;

import com.kh.idol.controller.IdolController;
import com.kh.idol.model.vo.Board;
import com.kh.idol.model.vo.Fan;
import com.kh.idol.model.vo.Idol;

public class IdolView {
	
	//필드부
	private Scanner sc = new Scanner(System.in);	// 스캐너가 필드일 때 단점 : 반납 안됨.
	private IdolController ic = new IdolController();
	// 로그인에 성공한 회원의 정보를 담아줄 필드
	private Fan loginFan;
	
	
	//생성자
	
	
	//메소드부
	//프로그램을 실행했을 때 가장 먼저 보여질 화면을 출력해주는 기능
	public void mainMenu() {
		
		System.out.println("\n\n 🎈aespa 커뮤니티에 오신것을 환영합니다🎈");
		
		while(true) {
			System.out.println("이용하실 서비스를 선택해주세요.");
			System.out.println("1. 에스파 정보보기");
			System.out.println("2. 회원 가입");
			System.out.println("3. 로그인");
			System.out.println("4. 게시판 서비스");
			System.out.println("5. 프로그램 종료");
			System.out.println("메뉴 번호 입력 > ");
			
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : infoMenu(); break;
			case 2 : signUp(); break;
			case 3 : login(); break;
			case 4 : boardMenu(); break;
			case 5 : break;
			default : System.out.println("잘못된 메뉴를 선택하셨스니다.");
			}
		}
	}
	
	// 에스파 정보보기
	private void infoMenu() {
		System.out.println();
		System.out.println("정보보기 서비스입니다.");
		System.out.println("이용하실 메뉴를 선택해두세요!");
		System.out.println("1. 카리나의 정보보기");
		System.out.println("2. 지젤의 정보보기");
		System.out.println("3. 윈터의 정보보기");
		System.out.println("4. 닝닝의 정보보기");
		System.out.println("5. 모든 멤버 정보보기");
		System.out.println("6. 메인메뉴로 돌아가기");
		System.out.println("이용하실 메뉴를 입력해주세요 > ");
		
		int menuNo = sc.nextInt();
		sc.nextLine();
		switch(menuNo) {
		case 1, 2, 3, 4 : findMember(menuNo); break; // 정보를 받아오기위함
		case 5 : findAll(); break;
		case 6 : return;
		}
	}
	
	// 멤버 정보보기
	private void findMember(int menuNo) {
		//특정 멤버의 주소값을 반환 해줄래?
		Idol idol = ic.findMember(menuNo); // controller 에 값을 받아오기 위함.
		
		System.out.println();
		System.out.println("💜                   "+ idol.getName() +"                   💜");
		System.out.println("🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣");
		System.out.println(idol.getImage());
		System.out.println("🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣");
		System.out.println("포지션 : " + idol.getPosition());
		System.out.println("전투 기술 : " + idol.getSkill());
		System.out.println("🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣🟣");
		System.out.println();
	}
	
	// 모든 멤버 정보보기
	private void findAll() {
		// 1. controller 에서 정보를 받아옴 = 메소드 호출
		// 모든 멤버의 접근할 수 있는 값을 줘
		// controller 갔다오니 주소값 옴~
		// 제네릭을 달아줘야됨
		List<Idol> aespa = ic.findAll();
		
		// 에스파가 없을 수도 있으니
		if(aespa.isEmpty()) {
			System.out.println("멤버가 남아있지 않습니다.");
		} else {
			// 에스파가 한명이라도 있으면~
			for(Idol i : aespa) {
				System.out.println();
				System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
				System.out.println();
				System.out.println("프로필 이미지 : " + i.getImage());
				System.out.println();
				System.out.println("이름 : " + i.getName());
				System.out.println("포지션 : " + i.getPosition());
				System.out.println("전투기술 : " + i.getSkill());
				System.out.println();
				}
			System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
		}	
	}	
	
	public void signUp() {
		//Fan 이라는 자료형에 맞춰 필드에 set 할 값 3개를 사용자에게 입력받음
		System.out.println("\n에스파 커뮤니티에 오신것을 환영합니다.");
		System.out.println("회원가입 서비스입니다.");
		
		//입력 => userId, userPwd, nickName;
		
		//제약조건 => 아이디는 4글자에서 10글자 사이일 것
		//		=> 아이디는 다른 Fan 의 아이디와 중복되면 안될 것
		
		String userId;
		while(true){
			System.out.print("가입하실 아이디를 입력해주세요 > ");
			userId = sc.nextLine();
			
			// 하나의 메소드는 하나의 기능만을 수행해야한다.
			// 하지만 지금 이 회원가입 메소드는
			// 회원 가입 뿐만 아니라 아이디값에 대한 유효성 검증을 진행하고 있다.
			// 이렇게 되면 이 메소드는 하는 일이
			// 1. 유효성 검증
			// 2. 회원가임
			// 두 개가 되어버리기 때문에 하는 일이 너무 많은 것이다.
			// 분리를 하는 것이 올바르지만 아직은 너무 이른 것 같아 나중에 다시 돌아오겠음
			
			// 1. 아이디는 4글자에서 10글자 사이만 가능 // 길이 메소드
			if(!(3 < userId.length() && userId.length() < 11)) {
				System.out.print("아이디는 4글자에서 10자 사이만 사용 가능합니다.");
				continue;
			}
			
			// 2. 중복체크
			boolean duplicateId = ic.checkId(userId);
			
			if(duplicateId) {
				System.out.println("이미 존재하는 아이디입니다. 다시 입력해주세요!");
			} else {
				System.out.println("사용 가능한 아이디입니다.");
				break;
			}
		}
		System.out.print("비밀번호를 입력해주세요 > ");
		String userPwd = sc.nextLine();
		
		System.out.print("닉네임을 입력해주세요 > ");
		String nickName = sc.nextLine();
		// 뷰는 일단 자신의 할일을 1절까지 마무리함
		
		// 사용자가 입력한 아이디와 비밀번호와 닉네임을 가지고 Fan 객체를 생성해서 필드에 담아서
		// Controller 에 있는 fans 라는 List 의 요소로 추가
		boolean result = ic.signUp(userId, userPwd, nickName);// controller 야 (userId, userPwd, nickName); 값을 줄게~~
		if(result) {
			System.out.println("회원가입에 실패했습니다. 다시 시도해주세요~"); // true 중복있어~
		} else {
			System.out.println("추카추카포카");
		}
	}
	
	//로그인
	private void login() {
		System.out.println("\n로그인 서비스 입니다.");
		
		// 대전제 : 회원가입 되어있고 받은 값을 전달
		System.out.println("아이디를 입력해주세요 > ");
		String userId = sc.nextLine();
		
		System.out.println("비밀번호를 입력해주세요 > ");
		String userPwd = sc.nextLine();
		
		// 값을 전달 해서 중복 하는지 확인
		Fan fan = ic.login(userId, userPwd);
		
		if(fan != null) {
			System.out.println(fan.getNickName() + "님 환영합니다~");
			loginFan = fan; // 로그인 유무를 위해 로그인 된 값을 담음. // 얕은 복사 :: 같은 주소 값 가리킴
		} else {
			System.out.println("로그인 실패 아이디 또는 비밀번호를 확인해주세요...");
		}
	}
	
	private void boardMenu() {
		while(true) {
			System.out.println("\n 에스파 게시판입니다.");
			System.out.println("이용하실 메뉴를 선택해주세요.");
			System.out.println("1. 게시글 작성");
			System.out.println("2. 게시글 전체 조회");
			System.out.println("3. 게시글 상세 조회");
			System.out.println("4. 메인 메뉴로 돌아가기");
			System.out.println("번호를 선택해주세요  > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1: post(); break;
			case 2: selectBoardList(); break;
			case 3: break;
			case 4: return;
			}
		}
	}
	
	private void post() {
		
		System.out.println("\n 게실글 작성 서비스입니다.");
		// 전제조건 : 로그인할 사용자만 게시글을 작성할 수 있음
		// 객관식~~ 내가 무엇을 사용해야될지 생각부터 하자
		// 1. 변수?
		// 2. if?
		// 3. for?
		
		if(loginFan != null) {
			
			System.out.println("게시글 제목을 입력해주세요 > ");
			String boardTitle = sc.nextLine();
			
			System.out.println("게시글 내용을 입력해주세요 > ");
			String boardContent = sc.nextLine();
			
			// 입력 받은 값 전달 : 메소드 호출하면서 인자값 전달
			ic.post(boardTitle, boardContent, loginFan.getUserPwd());
			
			System.out.println("게시글 작성 성공 ~!");
		} else {
			System.out.println("로그인 후 이용가능한 서비스입니다.");
		}
		
	}
	
	private void selectBoardList() {
		
		System.out.println();
		System.out.println("\n전체 게시글 목록입니다.");
		System.out.println();
		
		// 게시글 목록 전달 받기
		List<Board> boardList = ic.selectBoardList();
		
		if(boardList.isEmpty()) {
			System.out.println("게시글이 아직 존재하지 않습니다.");
			System.out.println();
		} else {
			for(Board board : boardList) { // 게시글이 여러개일 수 있으니 반복문 사용
				
				// StringBuilder 사용이 더 좋음.
				System.out.println("글 번호 : " + board.getBoardNo() + "\t");
				System.out.println("글 제목 : " + board.getBoardTitle() + "\t");
				System.out.println("작성자 : " + board.getUserId() + "\t");
				System.out.println("작성일 : " + board.getCreateDate() + "\t");
				System.out.println();
				
			}
		}
		
		
	}
}
