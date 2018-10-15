package com.eduapp.client.client;

import java.util.ArrayList;
import java.util.List;

import com.eduapp.client.csv.ChapterCsvReader;
import com.eduapp.client.csv.ConceptCSVReader;
import com.eduapp.client.csv.QuestionCSVReader;
import com.eduapp.client.csv.VideoCsvReader;
import com.eduapp.client.http.HttpClientPost;
import com.eduapp.client.model.Chapter;
import com.eduapp.client.model.Concept;
import com.eduapp.client.model.Question;
import com.eduapp.client.model.Result;
import com.eduapp.client.model.Video;
import com.google.gson.Gson;

public class ClientService {
	
	public static Result insertChapter(String url) {
		Result result = new Result();
		Integer sucess = 0;
		Integer fail = 0;
		List<String> failNames = new ArrayList<>();
		ChapterCsvReader chapterCsvReader = new ChapterCsvReader();
		List<Chapter> chapters = chapterCsvReader.readAndbuildObject(url);
		int httpCode = 0;
		try {
			for (Chapter chapter : chapters) {
				httpCode = HttpClientPost.postRequest("chapter/", new Gson().toJson(chapter));
				if (httpCode == 200) {
					sucess++;
				} else {
					fail++;
					failNames.add(chapter.getName());
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		result.setSuccessfullCount(sucess);
		result.setUnsuccessfullCount(fail);
		result.setNameList(failNames);
		return result;
	}
	
	
	public static Result insertVideo(String url,Long chapterId) {
		Result result = new Result();
		Integer sucess = 0;
		Integer fail = 0;
		List<String> failNames = new ArrayList<>();
		VideoCsvReader videoCsvReader = new VideoCsvReader(chapterId);
		List<Video> videos = videoCsvReader.readAndbuildObject(url);
		int httpCode = 0;
		try {
			for (Video video : videos) {
				httpCode = HttpClientPost.postRequest("video/", new Gson().toJson(video));
				if (httpCode == 200) {
					sucess++;
				} else {
					fail++;
					failNames.add(video.getName());
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		result.setSuccessfullCount(sucess);
		result.setUnsuccessfullCount(fail);
		result.setNameList(failNames);
		return result;
	}
	
	public static Result insertConcept(String url,Long chapterId) {
		Result result = new Result();
		Integer sucess = 0;
		Integer fail = 0;
		List<String> failNames = new ArrayList<>();
		ConceptCSVReader conceptCSVReader = new ConceptCSVReader(chapterId);
		List<Concept> concepts = conceptCSVReader.readAndbuildObject(url);
		int httpCode = 0;
		try {
			for (Concept concept : concepts) {
				httpCode = HttpClientPost.postRequest("concept/", new Gson().toJson(concept));
				if (httpCode == 200) {
					sucess++;
				} else {
					fail++;
					failNames.add(concept.getName());
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		result.setSuccessfullCount(sucess);
		result.setUnsuccessfullCount(fail);
		result.setNameList(failNames);
		return result;
	}
	
	
	public static Result insertQuestion(String url,Long chapterId) {
		Result result = new Result();
		Integer sucess = 0;
		Integer fail = 0;
		List<String> failNames = new ArrayList<>();
		QuestionCSVReader questionCSVReader = new QuestionCSVReader(chapterId);
		List<Question> questions = questionCSVReader.readAndbuildObject(url);
		int httpCode = 0;
		try {
			for (Question question : questions) {
				httpCode = HttpClientPost.postRequest("question/", new Gson().toJson(question));
				if (httpCode == 200) {
					sucess++;
				} else {
					fail++;
					failNames.add(question.getQuestion());
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		result.setSuccessfullCount(sucess);
		result.setUnsuccessfullCount(fail);
		result.setNameList(failNames);
		return result;
	}

}
