package com.eduapp.client.model;

import java.io.Serializable;

/**
 * @author jitendra sagoriya
 *
 */
public class Video implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;
	
	private String description;
	
	private String link;

	private Long chapterId;
	
	private Integer sequence;
	

	public Video() {
		super();
	}

	
	

	public Video(Long id, String name,Long chapterId) {
		super();
		this.id = id;
		this.name = name;
		this.chapterId = chapterId;
	}




	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	public Long getChapterId() {
		return chapterId;
	}


	public void setChapterId(Long chapterId) {
		this.chapterId = chapterId;
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




	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		if (id != other.id)
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Video [id=" + id + ", name=" + name + ", description=" + description + ", link=" + link + ", chapterId="
				+ chapterId + "]";
	}
	
	
	public String toCSVString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(this.getId());
		buffer.append(Constant.COMMA_DELIMITER);

		buffer.append(this.getName());
		buffer.append(Constant.COMMA_DELIMITER);

		buffer.append(this.getDescription());
		buffer.append(Constant.COMMA_DELIMITER);

		buffer.append(this.getLink());
		buffer.append(Constant.COMMA_DELIMITER);
		
		buffer.append(this.getSequence());
		buffer.append(Constant.COMMA_DELIMITER);

		buffer.append(this.getChapterId());
		buffer.append(Constant.NEW_LINE_SEPARATOR);

		return buffer.toString();
	}

}
