package com.objectinputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookTransientDemo {

	public static void readBook(File f1) {

		try {
			if (f1.exists()) {
				FileInputStream fin = new FileInputStream(f1);
				ObjectInputStream oin = new ObjectInputStream(fin);

				Book2 b1 = (Book2) oin.readObject();
				System.out.println(b1);

				oin.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void addBook(File f1) {
		Book2 b = new Book2(102, "Secret", 900f);
		try

		{
			// if(!f1.exists())
			// {
			// f1.createNewFile();
			FileOutputStream fout = new FileOutputStream(f1);
			ObjectOutputStream oout = new ObjectOutputStream(fout);

			oout.writeObject(b);
			oout.close();
			System.out.println("Book added");
			// }
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\FileDemo\\BooksTData.txt");

		addBook(f);
		readBook(f);

	}

}
