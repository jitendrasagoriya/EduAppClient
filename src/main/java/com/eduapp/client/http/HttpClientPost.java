package com.eduapp.client.http;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.eduapp.client.model.Chapter;
import com.eduapp.client.model.Constant;
import com.google.gson.Gson;

public class HttpClientPost {

	public static int postRequest(String url, String jsonString) {
		StringEntity entity = new StringEntity(jsonString, ContentType.APPLICATION_JSON);
		HttpClient httpClient;
		HttpPost request;
		HttpResponse response = null;
		try {
			httpClient = HttpClientBuilder.create().build();
			request = new HttpPost( Constant.getBaseUrl()+url);
			request.setEntity(entity);

			response = httpClient.execute(request);
			
			int responceCode = response.getStatusLine().getStatusCode();
			
			//System.out.println("STATUS :"+responceCode);
			return responceCode;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		Chapter chapter = new Chapter();
		chapter.setName("Chapter client");
		chapter.setSubject("3");
		chapter.setClassz("X1");
		chapter.setResume(Boolean.FALSE);
		
		Gson gson = new Gson();
		
		String json = gson.toJson(chapter);
		
		System.out.println( json );
		
		System.out.println( HttpClientPost.postRequest("chapter/", json));
		
	}

}
