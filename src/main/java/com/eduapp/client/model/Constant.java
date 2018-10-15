package com.eduapp.client.model;

public class Constant {
	
	public static final String COMMA_DELIMITER = ",";
	public static final String NEW_LINE_SEPARATOR = "\n";
	public static final String BASE_URL_QA = "http://localhost:8484/api/";
	public static final String BASE_URL_DEV = "http://localhost:8383/api/";
	public static final String BASE_URL_PROD = "http://dev-edu-app.herokuapp.com/api/";	
	public static final String CSVSPLITBY = ",";
	
	public static final String PROFILE = "QA";
	
	public static String getBaseUrl() {
		if(PROFILE.equalsIgnoreCase("DEV")) {
			return BASE_URL_DEV;
		}else if(PROFILE.equalsIgnoreCase("QA")) {
			return BASE_URL_QA;
		}else if(PROFILE.equalsIgnoreCase("PROD")) {
			return BASE_URL_PROD;
		}
		return null;
	}

}
