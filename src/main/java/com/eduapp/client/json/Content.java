package com.eduapp.client.json;

import java.sql.Timestamp;

public class Content {

	private int id;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String subject;

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	private String classz;

	public String getClassz() {
		return this.classz;
	}

	public void setClassz(String classz) {
		this.classz = classz;
	}

	private int videoCount;

	public int getVideoCount() {
		return this.videoCount;
	}

	public void setVideoCount(int videoCount) {
		this.videoCount = videoCount;
	}

	private int questionCount;

	public int getQuestionCount() {
		return this.questionCount;
	}

	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}

	private int conceptCount;

	public int getConceptCount() {
		return this.conceptCount;
	}

	public void setConceptCount(int conceptCount) {
		this.conceptCount = conceptCount;
	}

	private int sequence;

	public int getSequence() {
		return this.sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	private boolean resume;

	public boolean getResume() {
		return this.resume;
	}

	public void setResume(boolean resume) {
		this.resume = resume;
	}

	private Timestamp resumeTimestamp;

	public Timestamp getResumeTimestamp() {
		return this.resumeTimestamp;
	}

	public void setResumeTimestamp(Timestamp resumeTimestamp) {
		this.resumeTimestamp = resumeTimestamp;
	}

}
