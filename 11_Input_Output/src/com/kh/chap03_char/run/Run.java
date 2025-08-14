package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharDao;

public class Run {

	public static void main(String[] args) {
		FileCharDao cd = new FileCharDao();
		//cd.outputToFile();
		cd.writeTil();
	}

}
