package com.kh.assignment.abstraction.vo;

public class UserPoint {
	
	// [필드부]
	private String name;		// 사용자 이름
	private int totalPoints;	// 총 획득 상금 포인트
	private int withdrawal;			// 출금
	private int cashConverted;		// 포인트 현금 전환
	private int currentBalance;		// 현재 보유 상금 포인트
	
	//[생성자부]
	//기본생성자
	public UserPoint() {}
	//모든 필드를 매개변수로 가지고 있는 생성자
	public UserPoint(String name, int totalPoints, int withdrawal, int cashConverted, int currentBalance) {
		this.name = name;
		this.totalPoints = totalPoints;
		this.withdrawal = withdrawal;
		this.cashConverted = cashConverted;
		this.currentBalance = currentBalance;
	}
	
	//[메소드부]
	//getter()
	public String getName() {
		return name;
	}
	public int getTotalPoints() {
		return totalPoints;
	}
	public int getWithdrawal() {
		return withdrawal;
	}
	public int getCurrentBalance() {
		return withdrawal;
	}
	
	
	//setter()
	public void setUserName(String name) {
		this.name = name;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	public void setWithdrawal(int withdrawal) {
		this.withdrawal = withdrawal;
	}
	
	public void setCashConverted(int cashConverted) {
		this.cashConverted = cashConverted;
	}
	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	// 출금 메소드 (포인트 전환액이 1,000원 이상이어야 하며, 출금 금액은 전환액보다 작거나 같아야 합니다.)
	public void withdrawCash(int withdrawal) {
		if(cashConverted >= 1000 && withdrawal >= 1000 && withdrawal <= cashConverted) {
			cashConverted -= withdrawal;
			withdrawal += withdrawal;
			System.out.println("========== 출금이 완료되었습니다. ==========");
			System.out.println("출금 금액 : " + withdrawal + "원");
		} else {
			System.out.println("출금이 불가합니다.");
			if(cashConverted < 1000) {
				System.out.println("포인트 전환액이 1,000원 이상이어야 합니다.");
			}
			if(withdrawal < 1000) {
				System.out.println("출금 금액이 1,000원 이상이어야 합니다.");
			}
			if (withdrawal > cashConverted) {
				System.out.println("출금 금액이 전환액보다 작습니다.");
			}
		}
	}
	
	
	// 사용자 정보 메소드
	public String info() {
		String info = "[사용자 이름 : " + name 
						+ ", 총 획득 상금 포인트 : " + totalPoints + "원" 
						+ ", 출금 : " + "-" + withdrawal + "원" 
						+ ", 포인트 현금 전환 " + cashConverted 
						+ "현재 보유 상금 포인트 : " + currentBalance + "원" +"]";
		return info;
	}
	
	
}
