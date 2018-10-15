package com.eduapp.client.csv;

import com.eduapp.client.enums.ConceptType;
import com.eduapp.client.model.Concept;
import com.eduapp.client.model.Constant;

public class ConceptCSVReader extends CSVReader<Concept> {
	private long chapterId;
	
	public ConceptCSVReader(long chapterId) {
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
	public Concept getChapterFromCsvString(String csvString) {
		String[] conceptArray = csvString.split(Constant.CSVSPLITBY);
		Concept concept   = new Concept();
		if (conceptArray != null && conceptArray.length >= 3) {
			concept.setName(conceptArray[0]);
			concept.setDefination( conceptArray[1]);
			concept.setType( ConceptType.getByValue(conceptArray[2]));
			concept.setChapterId(getChapterId());
		}
		return concept;
	}

}
