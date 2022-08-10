package com.rpprojects.goalmgmt.model;

public class GoalFilter {
	
	
	private String userId;
	private GOAL_STATUS goalStatus;


	
	
	public GoalFilter(String userId, GOAL_STATUS goalStatus) {
		super();
		this.userId = userId;
		this.goalStatus = goalStatus;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public GOAL_STATUS getGoalStatus() {
		return goalStatus;
	}
	public void setGoalStatus(GOAL_STATUS goalStatus) {
		this.goalStatus = goalStatus;
	}
}
