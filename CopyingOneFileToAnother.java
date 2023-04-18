package com.ImportantQuestions;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyingOneFileToAnother {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("D:\\FileDemo\\Output.txt");
			FileWriter writer = new FileWriter("D:\\FileDemo\\CopiedFile.txt");

			int i;
			while ((i = reader.read()) != -1) {
				writer.write(i);
			}

			reader.close();
			writer.close();
			System.out.println("File copied Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
