package cm.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import cm.kh.practice.list.music.controller.MusicController;
import cm.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	//사용자가 직접 메인 메뉴를 선택할 수 있음. 종료 전까지 반복 실행. 각 메뉴를 누를 시 해당 메소드로 이동
	public void mainMenu() {
		
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 추가");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			
			System.out.println("번호를 선택해 주세요");
			int menuNo = sc.nextInt();
			sc.nextLine();
			switch(menuNo) {
			case 1 : addList(); break;
			case 2 : addAtZero(); break;
			case 3 : printAll();break;
			case 4 : searchMusic();break;
			case 5 : removeMusic(); break;
			case 6 : setMusic(); break;
			case 7 : ascTitle(); break;
			case 8 : descSinger(); break;
			case 9 : return;
			}
		}
	}
	
	
	private void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		// MusicController에 addList()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
		
		System.out.println("곡 명을 입력해주세요");
		String title = sc.nextLine();
		
		System.out.println("가수 명을 입력해주세요.");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		
		int result = mc.addList(music);
		
		if(result != 0) {
			System.out.println("추가 성공");
			System.out.println("곡 명 : " + music.getTitle());
			System.out.println("가수 명 : " + music.getTitle());
		} else {
			System.out.println("추가 실패");
		}
		
	}
	
	private void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		
		System.out.println("곡 명을 입력해주세요");
		String title = sc.nextLine();
		
		System.out.println("가수 명을 입력해주세요.");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		
		int result = mc.addList(music);
		
		if(result != 0) {
			System.out.println();
			System.out.println("==========================");
			System.out.println("추가 성공");
			System.out.println("곡 명 : " + music.getTitle());
			System.out.println("가수 명 : " + music.getTitle());
			System.out.println("==========================");
			System.out.println();
		} else {
			System.out.println("추가 실패");
		}
	}
	
	private void printAll() {
		List<Music> music = mc.printAll();
		
		if(music.isEmpty()) {
			System.out.println("곡 목록이 없습니다.");
		} else {
			for(Music i : music) {
				System.out.println();
				System.out.println("==========================");
				System.out.println("성공");
				System.out.println("곡 제목 : " + i.getTitle());
				System.out.println("가수 명 : " + i.getSinger());
				System.out.println("==========================");
				System.out.println();
			}
		}
				
	}
	
	private void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.println("삭제 할 곡 제목을 입력해주세요 > ");
		String title = sc.nextLine();
		
		Music searched = mc.searchMusic(title);
		
		if(searched != null) {
			System.out.println();
			System.out.println("==========================");
			System.out.println("검색한 곡은" + searched.getTitle() + "입니다.");
			System.out.println("==========================");
			System.out.println();
		} else {
			System.out.println();
			System.out.println("==========================");
			System.out.println("검색한 곡이 없습니다.");
			System.out.println("==========================");
			System.out.println();
		}
		
	}
	
	private void removeMusic() {
		
	}
	
	private void setMusic() {
		
	}
	
	
	private void ascTitle() {
		
	}
	
	private void descSinger() {
		
	}
	
}
