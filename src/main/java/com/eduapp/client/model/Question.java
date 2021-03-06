package com.eduapp.client.model;

import java.io.Serializable;

import com.eduapp.client.enums.Difficuly;
import com.eduapp.client.enums.QuestionStatus;
import com.eduapp.client.enums.QuestionType;
/**
 * @author jitendra sagoriya
 *
 */


/**
 * 	{
 * 		"question":"",
 * 		"answer":"",
 * 		"type":"",
 * 		"status":"",
 * 		"difficuly":"",
 * 		"chapterId":""
 * 
 * 	}
 * */
public class Question implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String question;
	
	private String answer; 
	
	private QuestionType type;
	
	private String img;
	
	private String link;
	
	private String videoLink;
	
	private QuestionStatus status;
	
	private Difficuly difficuly;
	
	private Long chapterId;
	
	private McqAnswer mcqAnswer;
	
	private Integer sequence;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * @return the type
	 */
	public QuestionType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(QuestionType type) {
		this.type = type;
	}

	/**
	 * @return the img
	 */
	public String getImg() {
		return img;
	}

	/**
	 * @param img the img to set
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the videoLink
	 */
	public String getVideoLink() {
		return videoLink;
	}

	/**
	 * @param videoLink the videoLink to set
	 */
	public void setVideoLink(String videoLink) {
		this.videoLink = videoLink;
	}

	/**
	 * @return the status
	 */
	public QuestionStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(QuestionStatus status) {
		this.status = status;
	}

	/**
	 * @return the difficuly
	 */
	public Difficuly getDifficuly() {
		return difficuly;
	}

	/**
	 * @param difficuly the difficuly to set
	 */
	public void setDifficuly(Difficuly difficuly) {
		this.difficuly = difficuly;
	}
	
	

	public Long getChapterId() {
		return chapterId;
	}

	public void setChapterId(Long chapterId) {
		this.chapterId = chapterId;
	}
	
	

	/**
	 * @return the mcqAnswer
	 */
	public McqAnswer getMcqAnswer() {
		return mcqAnswer;
	}

	/**
	 * @param mcqAnswer the mcqAnswer to set
	 */
	public void setMcqAnswer(McqAnswer mcqAnswer) {
		this.mcqAnswer = mcqAnswer;
	}
	
	

	/**
	 * @return the sequence
	 */
	public Integer getSequence() {
		return sequence;
	}

	/**
	 * @param sequence the sequence to set
	 */
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + ((chapterId == null) ? 0 : chapterId.hashCode());
		result = prime * result + ((difficuly == null) ? 0 : difficuly.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((img == null) ? 0 : img.hashCode());
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((videoLink == null) ? 0 : videoLink.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (chapterId == null) {
			if (other.chapterId != null)
				return false;
		} else if (!chapterId.equals(other.chapterId))
			return false;
		if (difficuly != other.difficuly)
			return false;
		if (id != other.id)
			return false;
		if (img == null) {
			if (other.img != null)
				return false;
		} else if (!img.equals(other.img))
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (status != other.status)
			return false;
		if (type != other.type)
			return false;
		if (videoLink == null) {
			if (other.videoLink != null)
				return false;
		} else if (!videoLink.equals(other.videoLink))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", answer=" + answer + ", type=" + type + ", img="
				+ img + ", link=" + link + ", videoLink=" + videoLink + ", status=" + status + ", difficuly="
				+ difficuly + ", chapterId=" + chapterId + ", mcqAnswer=" + mcqAnswer + "]";
	}
	
	public String toCsvString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.getId());
		buffer.append(Constant.COMMA_DELIMITER);
		
		buffer.append(this.getQuestion());
		buffer.append(Constant.COMMA_DELIMITER);		
		
		buffer.append(this.getType());
		buffer.append(Constant.COMMA_DELIMITER);		
		
		buffer.append(this.getImg());
		buffer.append(Constant.COMMA_DELIMITER);		
		
		buffer.append(this.getAnswer());
		buffer.append(Constant.COMMA_DELIMITER);		
		
		buffer.append(this.getLink());
		buffer.append(Constant.COMMA_DELIMITER);
		
		buffer.append(this.getVideoLink());
		buffer.append(Constant.COMMA_DELIMITER);
		
		buffer.append(this.getStatus());
		buffer.append(Constant.COMMA_DELIMITER);
		
		buffer.append(this.getStatus());
		buffer.append(Constant.COMMA_DELIMITER);
		
		buffer.append(this.getSequence());
		buffer.append(Constant.COMMA_DELIMITER);
		
		buffer.append(this.getChapterId());
		buffer.append(Constant.NEW_LINE_SEPARATOR);

		return buffer.toString();
	}

}
