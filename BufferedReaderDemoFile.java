package com.readerwriter2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedReaderDemoFile {

	public static void main(String[] args) {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw = new FileWriter("D:\\FileDemo\\WrittenNotes.txt");

			System.out.println("Enter the date (Press enter if you finish):");

			String data = "";
			while (true) {
				data = br.readLine();
				// System.out.println(data);
				if (data == "")
					break;
				fw.write(data);
				fw.write("\n");

			}

			br.close();
			fw.close();

			BufferedReader reader = new BufferedReader(new FileReader("D:\\Java10Jan\\MyFiles\\JavaNotes.txt"));

			System.out.println("============================");

			int ch;
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
			reader.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
