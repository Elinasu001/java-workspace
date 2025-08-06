package com.kh.assignment.abstraction.vo;

public class UserPoint {
	
	// [필드부]
	private String userName;		// 사용자 이름
	private int totalEarnedPoints;	// 총 획득 상금 포인트
	private int withdrawal;			// 출금
	private int cashConverted;		// 포인트 현금 전환
	private int currentBalance;		// 현재 보유 상금 포인트
	
	//[메소드부]
	// 사용자이름
	public void setUserName(String name) {
		userName = name;
	}
	// 총 획득 상금 포인트
	public void setTotalEarnedPoints(int points) {
		totalEarnedPoints = points;
	}
	// 출금
	public void setWithdrawal(int amount) {
		withdrawal = amount;
	}
	
	// 포인트 현금 전환
	public void setCashConverted(int amount) {
		cashConverted = amount;
	}
	
	// 현재 보유 상금 포인트
	public void setCurrentBalance(int balance) {
		currentBalance = balance;
	}
	
	public void printRewardInfo() {
		System.out.println("사용자 이름 : " + userName);
		System.out.println("총 획득 상금 포인트 : " + totalEarnedPoints + "원");
		System.out.println("촐금 : " + "-" + withdrawal + "원");
		System.out.println("포인트 현금 전환 : " + cashConverted + "원");
		System.out.println("현재 보유 상금 포인트 : " + currentBalance + "원");
	}
	
	
	// 출금 메서드
	public void withdrawCash(int amount) {
		if(cashConverted >= 1000 && amount <= cashConverted) {
			cashConverted -= amount;
			withdrawal += amount;
			System.out.println("========== 출금이 완료되었습니다. ==========");
			System.out.println("출금 금액 : " + amount + "원");
		} else {
			System.out.println("출금 불가 : 포인트 전환액이 1,000원 이상이어야 합니다.");
		}
	}
	
	
}
