package com.rpprojects.goalmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rpprojects.goalmgmt.mapper.GoalResponseMapper;
import com.rpprojects.goalmgmt.mapper.MongoDataApiFilterMapper;
import com.rpprojects.goalmgmt.model.Activity;
import com.rpprojects.goalmgmt.model.GOAL_STATUS;
import com.rpprojects.goalmgmt.model.Goal;
import com.rpprojects.goalmgmt.model.GoalFilter;
import com.rpprojects.goalmgmt.service.GoalDataHandler;
import com.rpprojects.goalmgmt.service.model.GoalData;
import com.rpprojects.goalmgmt.service.model.MongoDataApiFilter;

@RestController(value = "/goalmanager")
public class GoalManagementController {
	
	@Autowired
	private MongoDataApiFilterMapper dataApiFilterMapper;
	
	@Autowired
	private GoalDataHandler dataHandler;
	
	@Autowired
	private GoalResponseMapper goalResponseMapper;
	
	@GetMapping("/goals")
	public List<Goal> getGoals(@RequestParam String user, @RequestParam GOAL_STATUS status) {
		
		MongoDataApiFilter dataApiFilter = dataApiFilterMapper.map("Gunaseelan", "GoalManagement", "Goals", new GoalFilter(user, status));
		GoalData goalData = dataHandler.getGoals(dataApiFilter);
		
		return goalResponseMapper.map(goalData);
	}
	
	@GetMapping("/activities")
	public List<Activity> getActivities(@RequestParam String user, @RequestParam String goalIds) {
		
		return null;
	}
	

}
