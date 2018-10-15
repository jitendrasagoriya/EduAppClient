package com.eduapp.client.csv;

import com.eduapp.client.enums.ConceptType;
import com.eduapp.client.enums.Difficuly;
import com.eduapp.client.enums.QuestionStatus;
import com.eduapp.client.enums.QuestionType;
import com.eduapp.client.model.Concept;
import com.eduapp.client.model.Constant;
import com.eduapp.client.model.McqAnswer;
import com.eduapp.client.model.Question;

public class QuestionCSVReader extends CSVReader<Question> {

	private long chapterId;

	public QuestionCSVReader(long chapterId) {
		super();
		this.chapterId = chapterId;
	}

	/**
	 * @return the chapterId
	 */
	public long getChapterId() {
		return chapterId;
	}

	@Override
	public Question getChapterFromCsvString(String csvString) {
		String[] questionArray = csvString.split(Constant.CSVSPLITBY);
		Question question = new Question();
		McqAnswer answer = new McqAnswer();
		if (questionArray != null && questionArray.length >= 14) {
			question.setQuestion(questionArray[0]);
			question.setAnswer(questionArray[1]);
			question.setType( QuestionType.getByValue(questionArray[2])) ;
			question.setImg(questionArray[3]);
			question.setLink(questionArray[4]);
			question.setVideoLink(questionArray[5]);
			question.setStatus(QuestionStatus.getByValue(questionArray[6]));
			question.setDifficuly(Difficuly.getByValue(questionArray[7]));
			question.setChapterId(getChapterId());
			if(question.getType().equals(QuestionType.MCQ)) {
				answer.setOption1(questionArray[8]);
				answer.setOption1(questionArray[9]);
				answer.setOption1(questionArray[10]);
				answer.setOption1(questionArray[11]);
				answer.setAnswer(questionArray[12]);
				answer.setDiscription(questionArray[13]);
				question.setMcqAnswer(answer);
			}
		}
		return question;
	}

}
