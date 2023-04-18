package com.ImportantQuestions;

//2.Merged data of two file into another(SequenceStream)...
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class FileMerge {
	public static void main(String[] args) {

		try {
			FileInputStream fis1 = new FileInputStream("D:\\FileDemo\\file1.txt");
			FileInputStream fis2 = new FileInputStream("D:\\FileDemo\\file2.txt");

			SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

			FileOutputStream fos = new FileOutputStream("D:\\FileDemo\\MergedFile.txt");

			int i;
			while ((i = sis.read()) != -1) {
				fos.write(i);
			}

			sis.close();
			fos.close();
			fis2.close();
			System.out.println("Files merged successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
