package com.randomaccessfile;

import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args) {

		try {
			RandomAccessFile raf = new RandomAccessFile("D:\\FileDemo\\newfile.dat", "rw");
			raf.writeChar('O');
			raf.writeInt(12);
			raf.writeFloat(77.23f);

			System.out.println("Student added.........");

			raf.seek(0);

			System.out.println(raf.readChar());
			System.out.println(raf.readInt());
			System.out.println(raf.readFloat());

			raf.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
