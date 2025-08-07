package com.kh.assignment.abstraction.run;

import java.util.Scanner;

import com.kh.assignment.abstraction.vo.UserPoint;

public class UserPointRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		UserPoint point = new UserPoint();
		
		// 사용자 포인트 정보 매개변수 입력
		point.setUserName("박수현");
		point.SetTotalPoints(100200);
		point.setWithdrawal(0);
		point.setCashConverted(10000);
		point.setCurrentBalance(90200);
		
		// 출금할 금액 입력받기
		System.out.println("💰 출금 가능한 금액: " + 10000 + "원");
		System.out.println("출금할 금액을 입력해주세요. > ");
		int withdrawAmount = sc.nextInt();
		// 출금 메소드 호출
		point.withdrawCash(withdrawAmount);
		
		// 사용자 포인트 정보 출력
		System.out.println(point.info());
	}
}
