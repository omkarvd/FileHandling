package com.datainputoutput;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {

	public static void main(String[] args) {

		try {
			File f = new File("D:\\FileDemo\\MyData.txt");

			if (!f.exists()) {
				f.createNewFile();
				DataOutputStream dout = new DataOutputStream(new FileOutputStream(f));

				dout.writeChars("Shuruti");

				System.out.println("Data added........");

				dout.flush();
				dout.close();
			} else {
				System.out.println("File already exists.............");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
