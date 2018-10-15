package com.eduapp.client.csv;

import com.eduapp.client.model.Constant;
import com.eduapp.client.model.Video;

public class VideoCsvReader extends CSVReader<Video> {
	
	private long chapterId;
	
	

	public VideoCsvReader(long chapterId) {
		super();
		this.chapterId = chapterId;
	}

	@Override
	public Video getChapterFromCsvString(String csvString) {
		String[] videoArray = csvString.split(Constant.CSVSPLITBY);
		Video video = new Video();
		if (videoArray != null && videoArray.length >= 3) {
			video.setName(videoArray[0]);
			video.setDescription(videoArray[1]);
			video.setLink(videoArray[2]);
			video.setChapterId(getChapterId());
		}
		return video;
	}

	/**
	 * @return the chapterId
	 */
	public long getChapterId() {
		return chapterId;
	}

	/**
	 * @param chapterId the chapterId to set
	 */
	public void setChapterId(long chapterId) {
		this.chapterId = chapterId;
	}
	
	

}
