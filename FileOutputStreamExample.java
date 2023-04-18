package com.ImportantQuestions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FileOutputStreamExample {
	public static void main(String[] args) {
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter data(enter stop if you finish)");

			String data = " ";
			String output = " ";
			while (!data.equalsIgnoreCase("stop")) {
				data = br.readLine();
				output = output.concat(data);
			}
			System.out.println(output);
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
