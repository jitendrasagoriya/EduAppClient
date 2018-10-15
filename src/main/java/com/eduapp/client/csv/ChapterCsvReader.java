package com.eduapp.client.csv;

import com.eduapp.client.model.Chapter;
import com.eduapp.client.model.Constant;

public class ChapterCsvReader extends CSVReader<Chapter> {

	@Override
	public Chapter getChapterFromCsvString(String csvString) {
		String[] chapterArray = csvString.split(Constant.CSVSPLITBY);
		Chapter chapter = new Chapter();
		if (chapterArray != null && chapterArray.length >= 4) {
			chapter.setName(chapterArray[0]);
			chapter.setSubject(chapterArray[1]);
			chapter.setClassz(chapterArray[2]);
			chapter.setResume( Boolean.valueOf(chapterArray[3]) );
			return chapter;
		}
		return null;
	} 

}
