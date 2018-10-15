package com.eduapp.client.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.eduapp.client.http.ChapterHttpClient;
import com.eduapp.client.model.Chapter;
import com.eduapp.client.model.Result;

public class Client {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name;
		String filePath;
		String chapterId;

		do {

			try {
				System.out.println("What you want to post");
				System.out.println("1: Chapter");
				System.out.println("2: Question");
				System.out.println("3: Video");
				System.out.println("4: Concept");
				System.out.println("0: Exit");
				System.out.println("========================");
				System.out.println("");

				name = reader.readLine();
				// System.out.println(name);

				switch (name) {
				case "1": {
					System.out.println("Please input csv file path.");
					System.out.println("");
					filePath = reader.readLine();

					if (!filePath.endsWith(".csv")) {
						System.out.println("Invalid file. Please input csv file.");

						System.out.println("Press any key");
						filePath = reader.readLine();
						continue;
					}
					Result result = null;
					System.out.println("Please wait.... Data is uploading");

					result = ClientService.insertChapter(filePath);
					printResult(result);

					System.out.println("Press any key");
					filePath = reader.readLine();
				}
					break;
				case "3": {
					ChapterHttpClient httpClient = new ChapterHttpClient();
					List<Chapter> chapters = httpClient.getContent("chapter/?size=200");
					if (chapters != null && !chapters.isEmpty()) {
						System.out.println("-------------------------------------------");
						System.out.println("ID 				NAME");
						System.out.println("-------------------------------------------");
						for (Chapter chapter : chapters) {
							System.out.println(chapter.getId() + "				" + chapter.getName());
						}
						System.out.println("-------------------------------------------");
					}

					System.out.println("Enter chapter id");
					chapterId = reader.readLine();

					System.out.println("Please input csv file path.");
					System.out.println("");
					filePath = reader.readLine();

					if (!filePath.endsWith(".csv")) {
						System.out.println("Invalid file. Please input csv file.");

						System.out.println("Press any key");
						filePath = reader.readLine();
						continue;
					}

					Result result = null;
					System.out.println("Please wait.... Data is uploading");

					result = ClientService.insertVideo(filePath, Long.valueOf(chapterId.trim()));
					printResult(result);

					System.out.println("Press any key");
					filePath = reader.readLine();

				}
					break;

				case "4": {
					ChapterHttpClient httpClient = new ChapterHttpClient();
					List<Chapter> chapters = httpClient.getContent("chapter/?size=200");
					if (chapters != null && !chapters.isEmpty()) {
						System.out.println("-------------------------------------------");
						System.out.println("ID 				NAME");
						System.out.println("-------------------------------------------");
						for (Chapter chapter : chapters) {
							System.out.println(chapter.getId() + "				" + chapter.getName());
						}
						System.out.println("-------------------------------------------");
					}

					System.out.println("Enter chapter id");
					chapterId = reader.readLine();

					System.out.println("Please input csv file path.");
					System.out.println("");
					filePath = reader.readLine();

					if (!filePath.endsWith(".csv")) {
						System.out.println("Invalid file. Please input csv file.");

						System.out.println("Press any key");
						filePath = reader.readLine();
						continue;
					}

					Result result = null;
					System.out.println("Please wait.... Data is uploading");

					result = ClientService.insertConcept(filePath, Long.valueOf(chapterId.trim()));
					printResult(result);

					System.out.println("Press any key");
					filePath = reader.readLine();

				}
					break;

				case "2": {
					ChapterHttpClient httpClient = new ChapterHttpClient();
					List<Chapter> chapters = httpClient.getContent("chapter/?size=200");
					if (chapters != null && !chapters.isEmpty()) {
						System.out.println("-------------------------------------------");
						System.out.println("ID 				NAME");
						System.out.println("-------------------------------------------");
						for (Chapter chapter : chapters) {
							System.out.println(chapter.getId() + "				" + chapter.getName());
						}
						System.out.println("-------------------------------------------");
					}

					System.out.println("Enter chapter id");
					chapterId = reader.readLine();

					System.out.println("Please input csv file path.");
					System.out.println("");
					filePath = reader.readLine();

					if (!filePath.endsWith(".csv")) {
						System.out.println("Invalid file. Please input csv file.");

						System.out.println("Press any key");
						filePath = reader.readLine();
						continue;
					}

					Result result = null;
					System.out.println("Please wait.... Data is uploading");

					result = ClientService.insertQuestion(filePath, Long.valueOf(chapterId.trim()));
					printResult(result);

					System.out.println("Press any key");
					filePath = reader.readLine();

				}
					break;
				case "0":
					System.exit(0);
					break;

				default:

					break;
				}

			} catch (Exception e) {
				
				try {
					 
					System.err.println(e.getMessage());
					System.out.println(e.getMessage());
					System.out.println("Press any key");
					filePath = reader.readLine();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		} while (true);

	}

	public final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");

			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {
			// Handle any exceptions.
		}
	}

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void printResult(Result result) {
		if (result != null) {
			System.out.println("Data is uploading done....");
			System.out.println("RESULT");
			System.out.println("==========================");
			System.out.println("Success : " + result.getSuccessfullCount());
			System.out.println("Fail : " + result.getUnsuccessfullCount());
			System.out.println("List : " + result.getNameList());
		}
	}

}
