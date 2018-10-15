package com.eduapp.client.model;

import java.util.List;

public class Result {
	
	private Integer successfullCount;
	private Integer unsuccessfullCount;
	private List<String> nameList;
	public Result(Integer successfullCount, Integer unsuccessfullCount, List<String> nameList) {
		super();
		this.successfullCount = successfullCount;
		this.unsuccessfullCount = unsuccessfullCount;
		this.nameList = nameList;
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the successfullCount
	 */
	public Integer getSuccessfullCount() {
		return successfullCount;
	}
	/**
	 * @param successfullCount the successfullCount to set
	 */
	public void setSuccessfullCount(Integer successfullCount) {
		this.successfullCount = successfullCount;
	}
	/**
	 * @return the unsuccessfullCount
	 */
	public Integer getUnsuccessfullCount() {
		return unsuccessfullCount;
	}
	/**
	 * @param unsuccessfullCount the unsuccessfullCount to set
	 */
	public void setUnsuccessfullCount(Integer unsuccessfullCount) {
		this.unsuccessfullCount = unsuccessfullCount;
	}
	/**
	 * @return the nameList
	 */
	public List<String> getNameList() {
		return nameList;
	}
	/**
	 * @param nameList the nameList to set
	 */
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
	
	
}
