package com.fileinputoutput;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		String data = "I am omkar";
		try {
			File f = new File("D:\\FileDemo\\Output.txt");
			if (f.exists()) {
				f.createNewFile();
				FileInputStream fin = new FileInputStream(f);
				int i = 0;
				while ((i = fin.read()) != -1) {
					System.out.print((char) i);

				}
				fin.close();
				System.out.println();
				System.out.println("file completed");
			} else {
				System.out.println("file doesn't exists");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
