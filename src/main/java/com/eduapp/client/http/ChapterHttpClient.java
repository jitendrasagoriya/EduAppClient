package com.eduapp.client.http;

import java.util.List;

import com.eduapp.client.model.Chapter;
import com.eduapp.client.responce.ChapterResponce;
import com.google.gson.Gson;

public class ChapterHttpClient extends HttpClientGet<Chapter> {

	@Override
	public List<Chapter> createObjectFromJson(String output) {
		ChapterResponce responce = null;
		responce = new Gson().fromJson(output,ChapterResponce.class);
		//System.out.println(responce.getContent().get(0));
		return responce.getContent();
	}
	
	
	public static void main(String[] args) {
		ChapterHttpClient httpClient = new ChapterHttpClient();
		List<Chapter> chapters = httpClient.getContent("chapter/?size=200");
	}

}
