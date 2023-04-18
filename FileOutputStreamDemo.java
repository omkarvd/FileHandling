package com.fileinputoutput;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		String data = "I am omkar";
		try {
			File f = new File("D:\\FileDemo\\Output.txt");
			if (!f.exists()) {
				f.createNewFile();
				FileOutputStream fout = new FileOutputStream(f);
				byte[] array = data.getBytes();
				fout.write(array);
				fout.close();
				System.out.println("Data added");
			} else {
				System.out.println("file already exists");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
