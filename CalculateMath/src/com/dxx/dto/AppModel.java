package com.dxx.dto;

import java.util.List;

public class AppModel {

	private String groupName;
	
	private List<ObjectInfoDto> dimension;
	
	private List<ObjectInfoDto> measure;
	
	public void setGroupName(String groupName){
		this.groupName = groupName;
	}
	
	public String getGroupName(){
		return groupName;
	}

	public void setDimension(List<ObjectInfoDto> dimension){
		this.dimension = dimension;
	}
	
	public List<ObjectInfoDto> getDimension(){
		return dimension;
	}
	
	public void setMeasure(List<ObjectInfoDto> measure){
		this.measure = measure;
	}
	
	public List<ObjectInfoDto> getMeasure(){
		return measure;
	}
	
}

