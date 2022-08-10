package com.rpprojects.goalmgmt.service.model;

import java.util.List;

public class GoalDocument {
	
	private String _id;
	private String goalId;
	private String goal;
	private String startDate;
	private String endDate;
	private double target;
	private String unitOfMeasurement;
	private double progress;
	private boolean isDeleted;
	private List<RecentActivityDocument> recentActivity;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getGoalId() {
		return goalId;
	}
	public void setGoalId(String goalId) {
		this.goalId = goalId;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public double getTarget() {
		return target;
	}
	public void setTarget(double target) {
		this.target = target;
	}
	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}
	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}
	public double getProgress() {
		return progress;
	}
	public void setProgress(double progress) {
		this.progress = progress;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public List<RecentActivityDocument> getRecentActivity() {
		return recentActivity;
	}
	public void setRecentActivity(List<RecentActivityDocument> recentActivity) {
		this.recentActivity = recentActivity;
	}
	
	

}
