package com.kh.idol.model.vo;

import java.util.Objects;

public class Fan {
	private String userId;
	private String userPwd;
	private String nickName;
	
	public Fan() {
		super();
	}
	public Fan(String userId, String userPwd, String nickName) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getNickName() {
		return nickName;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nickName, userId, userPwd);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fan other = (Fan) obj;
		return Objects.equals(nickName, other.nickName) && Objects.equals(userId, other.userId)
				&& Objects.equals(userPwd, other.userPwd);
	}
	@Override
	public String toString() {
		return "Fan [userId=" + userId + ", userPwd=" + userPwd + ", nickName=" + nickName + "]";
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}
