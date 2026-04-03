package com.tenzies.model;

import java.time.LocalDateTime;

public class TenziesUser {
	private String userId;
	private double timeSpentSeconds;
	private int rollsQtty;
	private LocalDateTime time;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public double getTimeSpentSeconds() {
		return timeSpentSeconds;
	}
	public void setTimeSpentSeconds(double timeSpentSeconds) {
		this.timeSpentSeconds = timeSpentSeconds;
	}
	public int getRollsQtty() {
		return rollsQtty;
	}
	public void setRollsQtty(int rollsQtty) {
		this.rollsQtty = rollsQtty;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public TenziesUser(String userId, double timeSpentSeconds, int rollsQtty, LocalDateTime time) {
		super();
		this.userId = userId;
		this.timeSpentSeconds = timeSpentSeconds;
		this.rollsQtty = rollsQtty;
		this.time = time;
	}
	@Override
	public String toString() {
		return "TenziesUser [userId=" + userId + ", timeSpentSeconds=" + timeSpentSeconds + ", rollsQtty=" + rollsQtty
				+ ", time=" + time + "]";
	}
	
	
	
}
