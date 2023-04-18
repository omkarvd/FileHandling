package com.ImportantQuestions;

import java.io.BufferedReader;
import java.io.FileReader;

public class FindWordsLinesCharacters {
	public static void main(String[] args) {
		BufferedReader reader = null;

		int charCount = 0;

		int wordCount = 0;

		int lineCount = 0;

		try {

			reader = new BufferedReader(new FileReader("D:\\FileDemo\\MergedFile.txt"));

			String currentLine = reader.readLine();

			while (currentLine != null) {

				lineCount++;

				String[] words = currentLine.split(" ");

				wordCount = wordCount + words.length;

				for (String word : words) {

					charCount = charCount + word.length();
				}

				currentLine = reader.readLine();
			}

			System.out.println("Number Of Chars In  File : " + charCount);

			System.out.println("Number Of Words In  File : " + wordCount);

			System.out.println("Number Of Lines In  File : " + lineCount);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
