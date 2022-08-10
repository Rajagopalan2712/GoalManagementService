package com.rpprojects.goalmgmt.model;

import java.time.LocalDate;
import java.util.List;

public class Goal {
	
	private String goalId;
	private String goalDescription;
	private LocalDate startDate;
	private LocalDate endDate;
	private String unitOfMeasurement;
	private double goalTarget;
	private GOAL_STATUS status;
	private double progress;
	private double progressPercentage;
	private List<Activity> recentActivity; 
	

}
