package com.rpprojects.goalmgmt.service.model;

import java.util.Map;

public class MongoDataApiFilter {

	private String datasource;
	private String database;
	private String collection;
	private Map<String, String> filter;
	private Map<String, Integer> projection;
	private Map<String, Integer> sort;
	private int limit;
	private int skip;
	
	public String getDatasource() {
		return datasource;
	}
	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}
	public Map<String, String> getFilter() {
		return filter;
	}
	public void setFilter(Map<String, String> filter) {
		this.filter = filter;
	}
	public Map<String, Integer> getProjection() {
		return projection;
	}
	public void setProjection(Map<String, Integer> projection) {
		this.projection = projection;
	}
	public Map<String, Integer> getSort() {
		return sort;
	}
	public void setSort(Map<String, Integer> sort) {
		this.sort = sort;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getSkip() {
		return skip;
	}
	public void setSkip(int skip) {
		this.skip = skip;
	}
	
	
}
