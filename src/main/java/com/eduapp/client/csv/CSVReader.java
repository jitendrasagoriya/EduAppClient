package com.eduapp.client.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class CSVReader<T> {

	public abstract T getChapterFromCsvString(String csvString);

	public List<T> readAndbuildObject(String csvUrl) {
		String line = "";
		ArrayList<T> arrayList = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(csvUrl))) {
			while ((line = br.readLine()) != null) {
				if (line.startsWith("--")) {
					continue;
				}
				arrayList.add(getChapterFromCsvString(line));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return arrayList;

	}

}
