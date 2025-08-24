package cm.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import cm.kh.practice.list.music.model.vo.Music;

public class MusicController {
	
	List<Music> list = new ArrayList();
	
	public int addList(Music music) {
		// 마지막 리스트에 객체 저장, 1 리턴
		
		list.add(music);
		
	    return 1;  
	
	}
	
	public int addAtZero(Music music) {
		// 첫 번째 리스트에 객체 저장, 1 리턴

		list.add(0, music);
		return 1;
	}
	
	public List<Music> printAll() {
		// List 반환
		return list;
	}
	
	public Music searchMusic(String title) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 리턴, 없으면 null 리턴
		
		for(Music music : list) {
			if(music.getTitle().equals(title)) {
				return music;
			}
		}
		
		return null;
		
	}
	
	
	public Music removeMusic(String title) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 삭제, 없으면 null 리턴
		
		for(int i = 0; i < list.size(); i++) {
			if(title.equals(list.get(i).getTitle())) {
				return list.remove(i);
			}
		}
		
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(music) && list.get(i).getSinger().equals(music)) {
				Music updatedMusic = list.get(i);
				return updatedMusic;
			}
		}
		
		return null;
	}
	public int ascTitle() {
		// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
		
		return 1;
	}
	
	public int descSinger() {
		// 리스트 가수 명 내림차순 정렬, 1 리턴
		return 1;
	}

	
}
