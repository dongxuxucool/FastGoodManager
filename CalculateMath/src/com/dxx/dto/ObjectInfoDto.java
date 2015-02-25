package com.dxx.dto;

import java.util.List;

public class ObjectInfoDto {

	private String name;
	
	private Integer type;
	
	private List<NameValuePair> member;
	
	private String dimName;
	
	private String groupName;
	
	public void setGroupName(String groupName){
		this.groupName = groupName;
	}
	
	public String getGroupName(){
		return groupName;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setType(Integer type){
		this.type = type;
	}
	
	public Integer getType(){
		return type;
	}
	
	public void setMember(List<NameValuePair> member){
		this.member = member;
	}
	
	public List<NameValuePair> getMember(){
		return member;
	}
	
	public void setDimName(String dimName){
		this.dimName = dimName;
	}
	
	public String getDimName(){
		return dimName;
	}
}

