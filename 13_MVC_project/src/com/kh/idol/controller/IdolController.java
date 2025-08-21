package com.kh.idol.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kh.idol.model.vo.Board;
import com.kh.idol.model.vo.Fan;
import com.kh.idol.model.vo.Idol;

public class IdolController {
	private List<Fan> fans = new ArrayList();
	private List<Board> boards = new ArrayList();
	private List<Idol> aespa = new ArrayList(); //1.
	private int boardNo; //static은 게시글에서만 하는 거라 빼주기
	
	// 아이돌들도 어디에 담아놓고 고걸 읽어와서 정보를 출력해줘야 하지않을까?
	{
		
		
		aespa.add(new Idol("카리나", "리더", "Rocket Puncher"));
		aespa.get(0).setImage("""
									⢿⡻⡯⣟⢿⢽⣻⢽⣻⣽⢿⣝⡯⣟⣽⡻⣽⡻⡽⣻⢽⡻⣯
									⡽⡽⣝⢾⢝⡷⣽⣻⣽⣾⢯⣗⢯⣳⡳⣽⡺⣺⢝⣗⢯⢯⢞
									⡽⡽⣺⢽⣝⢾⢽⠳⠱⠫⢟⣼⣳⣷⣽⣺⡺⡽⣝⢮⢯⢯⢯
									⣞⢽⣳⢽⢮⢏⠂⠅⡈⠨⠐⡈⡛⣿⣷⣷⢯⢯⡺⡽⡵⣫⢯
									⡮⣻⣪⢯⢿⠠⡁⡂⢐⠠⠡⢂⢂⠂⢿⡟⡫⣗⢯⢯⣫⢗⡯
									⡯⣳⢽⢽⡿⣍⢬⡨⡐⠨⢘⠪⠡⠡⡘⡎⢌⢾⢝⣵⡳⣫⣞
									⢯⢞⣽⣯⣟⢎⠂⡂⡂⠨⠠⠐⡀⠅⠢⡑⣼⢽⣝⢮⢞⣗⢵
									⢯⢯⣞⣷⣻⡧⡅⡂⠌⢌⠨⡀⡂⢅⢱⢹⢸⢷⢽⢕⡯⣺⢵
									⡽⣕⣯⣿⢽⣏⢳⣄⡑⠱⢑⢐⢐⠐⠅⣷⢽⢽⢽⣕⢯⡳⣝
									⣝⣞⢮⢯⣻⣿⣺⣿⣇⠣⡂⡂⡂⠅⠅⢿⡽⣕⣟⡮⣳⢝⣞
									⣞⢮⡳⣽⣺⣿⣻⣿⡇⡑⡐⡐⠠⠡⠡⢹⣽⣳⣗⣯⢗⡽⣪
									⢾⢝⣞⣞⣾⣻⣿⡻⡐⡐⢐⠠⠡⠨⢨⣾⣻⠘⠾⡽⣽⡺⡵
									⢝⣗⣟⣾⣽⣿⡟⡐⡐⢐⠠⠨⠠⢱⣻⣞⡇⢅⡵⠫⠡⡉⢯
									⣿⡽⣞⣯⣿⡟⡐⡐⢐⠀⡂⠅⢬⡯⣷⢯⣗⢏⠂⠅⢂⠂⡂
									⣿⣻⣿⣿⢿⢐⢀⠂⡐⢀⠂⢬⡯⣯⣯⢿⣺⢐⠨⠨⢐⠀⡂
									⣿⣟⣷⡿⣇⣐⡀⡂⡐⡐⣨⡯⣟⡷⣯⢿⣽⠐⠌⠌⡐⢐⠠
									⣟⣾⣯⣿⡿⣟⣿⣟⣿⡾⣷⢿⣻⣽⢿⣽⢿⠨⡈⠢⢐⢐⠐
							""");
		
		aespa.add(new Idol("지젤", "외국인1", "Xenoglossy"));
		aespa.get(1).setImage(""" 
									⠡⠡⠡⠡⠡⠡⠡⠡⠡⠡⠡⢡⢡⡣⣧⢧⡣⡅⠅⠅⠅⠅⠅⠅⠅⠅⠅⠅⠅⠅⠅⠅⠅⢕⢑
									⠨⠨⠨⠨⠨⠨⠨⠨⠨⠨⢨⢎⢮⢺⢽⢕⢕⢝⣜⢌⠌⠌⠌⠌⠌⠌⠌⠌⠌⠌⠌⠌⢌⠢⡑
									⠡⠡⠡⠡⠡⠡⠡⠡⠡⡁⡇⡇⡇⢇⠇⡇⡇⡧⡳⣕⢅⠅⠅⠅⠅⠅⠅⠅⠅⠅⠅⠅⠅⢕⠰
									⠡⠡⠡⠡⠡⠡⠡⠡⡑⠄⣗⡵⡕⡕⡕⡜⣜⢎⢯⡺⡸⡨⠨⠨⠨⠨⠨⠨⠨⠨⠨⠨⠨⠢⡑
									⠅⠅⠅⠅⠅⠅⢅⠑⢌⢂⢳⢝⢇⠣⢫⠫⡪⣳⢳⢝⢜⢜⠌⠌⠌⠌⠌⠌⠌⠌⠌⠌⢌⢌⠢
									⠡⠡⠡⠡⠡⡑⢄⢑⢐⢐⢕⡇⡇⡇⡣⡱⡱⡳⣝⢵⢱⢱⠡⠡⠡⠡⠡⠡⠡⠡⠡⠡⡑⡐⡑
									⠅⠅⠅⠅⠕⢌⢂⢂⢂⢂⢇⢧⢙⢎⢎⢮⢪⢫⢮⡳⡕⡕⠅⠅⠅⠅⠅⠅⢅⠅⢕⢑⢐⠌⢌
									⠨⠨⠨⠨⡈⡂⡂⡂⡂⡂⣇⢇⢇⢇⣇⢇⢕⢝⢎⢎⢮⡫⡹⠸⡨⡨⠪⠨⠢⠡⡑⡐⡐⠅⢕
									⠌⠌⠌⢌⢂⢂⢂⠢⡢⣳⣣⢇⢏⢎⢎⢎⢆⠕⡕⣕⢇⢇⢣⢑⢕⠥⡑⡑⡑⡑⢌⢂⠪⠨⠢
									⠡⡑⠅⢕⢐⢐⠅⣕⡽⡵⣝⣮⢪⢪⢪⡪⣎⢆⠌⣞⣮⢪⠢⡢⡱⡱⡨⡨⠨⡊⡢⡡⡑⡑⢕
									⠌⢌⢌⠢⡑⡐⢅⢷⢽⢝⡷⡽⣎⠆⡕⡵⣝⢷⢝⢮⡺⣝⢮⢂⢎⢎⠢⡪⠨⡢⠪⡂⡪⡨⠢
							""");
		aespa.add(new Idol("윈터", "불자", "Armamenter"));
		aespa.get(2).setImage(""" 
									⣝⢝⣝⢭⣫⢣⠁⢍⠯⠩⠨⡐⡌⢄⢐⠨⠐⢝⢭⡫⣝⢭⡫⢂⢑⢝
									⢮⢳⢕⣗⢕⡇⠅⡂⠅⡂⢕⢑⠑⡑⢌⠌⡂⡂⡑⣝⢎⢧⢃⠂⡂⡯
									⣝⢮⡳⡵⡝⣎⠂⡂⠅⡂⠅⠀⠂⡀⠂⠅⡂⡂⡂⠸⡭⡣⢑⠐⠠⡫
									⢗⢵⡳⡝⡮⣣⠡⠂⢅⠢⠡⡈⠠⢀⠢⢁⠢⡱⣕⠅⡏⢎⢐⠨⢈⢮
									⢯⡣⣗⣝⢮⡳⠨⡈⠄⢇⠳⢈⠐⢀⠓⠕⢂⠸⣸⠠⡙⠄⡂⠌⠄⢧
									⢵⢝⢮⡪⡧⡳⡁⠆⠅⡂⠐⠠⡈⢄⠀⠂⠄⡑⡌⡆⠌⡐⠠⡁⡊⢮
									⡳⣝⢵⢝⢮⡳⡈⢎⠢⡨⢐⠠⡨⡠⠠⠁⢌⢎⢎⢎⢐⠨⢐⠠⢂⢵
									⣚⢮⡳⣝⢵⢳⠨⡘⢌⠎⡆⡌⠂⢌⠨⠨⢪⢣⠣⡃⡂⠌⡐⠨⢐⠸
									⢄⢑⠨⠠⢑⢈⠢⡈⠢⡑⠌⢜⠸⡐⠅⡃⡑⢄⢑⠐⠄⠅⡂⠅⠢⢈
									⢐⢐⠨⠨⢐⢐⢐⠨⢐⣸⢮⣔⣄⣢⣡⢠⣂⡂⣆⡅⠅⢅⢂⠅⢅⠢
									⣕⢖⡵⣣⢗⣮⣲⢽⣺⣽⣻⣟⣿⣯⡿⣿⣽⡿⣯⡿⣯⣗⠳⠝⡝⠝
							""");
		aespa.add(new Idol("닝닝", "외국인2", "Hacker"));
		aespa.get(3).setImage(""" 
									⡔⡀⠁⠱⡰⡀⡁⢃⠡⣐⣄⣵⣵⣥⣕⣵⣥⡄⡢⡫⡳⢍⢣⠣⡹⡈
									⠕⠅⡂⡁⠑⢕⠢⠐⢼⣿⣳⣿⡳⢯⡿⣾⢽⡿⡜⡜⢜⠜⠜⠌⡊⠄
									⢈⢠⢐⢄⢌⠠⠈⢄⢹⡿⣞⠊⠄⠠⠙⢝⣯⣿⣗⢄⢢⢀⠅⢄⠀⢠
									⠐⠱⠱⠹⡪⠪⡐⠈⡜⣿⡇⠣⠡⠘⡘⠨⣺⣺⡽⠈⠆⡣⠃⠅⠀⢕
									⠰⡱⡸⡜⡜⣜⢆⢕⢼⣟⣯⡂⣑⡐⠠⡡⣻⣞⡎⠌⠢⡂⠕⠀⢰⡱
									⢁⠈⠈⢀⢁⠅⡁⡑⢽⣯⡷⣕⡐⡌⢌⡪⡓⣿⣿⢄⢑⠨⠐⢈⢐⠑
									⡣⠃⠡⡐⡕⡽⡘⠈⠅⢩⡪⡣⣃⢕⡜⡎⠍⡘⡙⡑⢐⠨⠈⠄⢸⠐
									⠁⠠⡣⣳⢱⢱⠀⡁⠨⢰⢕⢽⡸⡪⠊⠐⢐⠠⠠⠐⠠⠁⠌⠀⠕⡕
							""");
		
	}
	
	public List<Idol> findAll() {
		return aespa; // 1. 아이돌의 주소를 가지고있는 배열을 필드로 가진 리스트를 돌려줌.
	}
	
	public Idol findMember(int memberNo) { // 기본적으로는 똑같이 맞춰야 되는게 권장 사항이지만 의미로 안맞아서 바꿈
		
		/*
		if(memberNo == 1) {
			return aespa.get(0);
		} else if(memberNo == 2) {
			return aespa.get(1);
		} else if( memberNo == 3) {
			return aespa.get(2);
		} else {
			return aespa.get(3);
		}
		*/
		return aespa.get(memberNo -1);
	}
	
	// 사용자가 아이디를 입력했을 때 1. 입력한 아이디가
	// 2. fan 들이 들어가는 List 의 3. 요소의 userId 필드값과 중복되는게 있는지
	// 확인을 한 뒤에 결과를 View 로 다시 반환
	public boolean checkId(String userId) {
		
		// 1. userId
		// 2. fans
		// 3. fans.get(i).getUserId()
		// 4. equals()
		
		for(int i = 0; i < fans.size(); i++) {
			if(userId.equals(fans.get(i).getUserId())) {
				return true; // 중복있어~
			}
		}
		return false;
	}
	
	// 사용자가 입력한 아이디, 비밀번호, 닉네임을 View 로 부터 전달받아
	// 새로운 Fan 이라는 객체를 생성하면서 필드에 값을 대입해주고
	// 생성된 Fan 객체의 주소값을 내가 가지고 있는 Fan 들이 들어가는 List 의 요소로
	// 추가를 해주는 메소드를 구현을 해야함
	public boolean signUp(String userId, String userPwd, String nickName) {
		// 1. 데이터 가공 (하나 이상일 경우에만 데이터 단에서 가공처리함)
		Fan fan = new Fan(userId, userPwd, nickName);
		
		// 2. 요청 처리 (아직 요청 처리하는 계층을 안배웠으므로 컨트롤러에서 처리)
		boolean result = checkId(userId);
		if(!result) { // 중복된게 없을 경우만
			fans.add(fan); // true 중복있어~
		}
		
		//3. 결과값 반환
		return result;
		
	}
	
	// 사용자가 로그인 요청 시 호출되는 메소드
	public Fan login(String userId, String userPwd) {
		
		// 컨트롤러가 가지고 있는
		// Fan 정보를 필드에 저장하는 Fan 객체들의 주소를 가지고 있는
		// fans 라는 리스트의 요소에 하나하나 접근해서
		// Fan 객체의 userId 필드 및 userPwd 필드를
		// 사용자가 입력한 userId 값 + userPwd 값과 각각 비교하여
		// 둘 다 일치하는 Fan 객체가 존재한다면 사용자의 정보가 담겨있는 Fan 을 반환
		
		
		for(int i = 0; i < fans.size(); i++) {
			// 반복하면서 순차적으로 접근할 요소 객체를 변수로 선언
			Fan fan = fans.get(i);
			if(userId.equals(fan.getUserId()) && userPwd.equals(fan.getUserPwd())) {
				// 사용자가 입력한 아이디 & 비밀번호와 일치하는 Fan 객체가 존재함
				return fan;
			}
		}
		
		return null;
	}
	
	///////게시글/////////
	// 로그인에 성공한 사용자가 게시글 작성 요청 할 때 마다 호출이 되는 메소드
	public void post(String boadTitle, String boardContent, String userId) {
		
		// 기존 board 보다 1증가시킨 값과
		// 사용자가 입ㄺ한 게시글 제목, 내용 값과
		// 현재 로그인된 사용자의 아이디 값과
		// 현재 게시글 작성 요청이 들어온 시간 값을 가지고
		// Board 객체를 만들어서 Board 타입들이 들어가는 List 의 요소로 추가
		
		// 1. 데이터 가공
		Board board = new Board();
		board.setBoardTitle(boadTitle);
		board.setBoardContent(boardContent);
		board.setUserId(userId);
		board.setBoardNo(++boardNo);
		String createDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
		board.setCreateDate(createDate);
		
		// 2. 요청처리 _ 원래는 성공 실패도 해야함.
		boards.add(board);
	}
	
	
}