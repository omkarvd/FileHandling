package com.randomaccessfile;

import java.io.RandomAccessFile;

public class RandomAccessDemo2 {

	public static void main(String[] args) {

		try {
			RandomAccessFile raf = new RandomAccessFile("D:\\FileDemo\\Mahacities.txt", "rw");
			raf.writeUTF("Nagar");
			raf.writeUTF("Pune");
			raf.writeUTF("Mumbai");
			raf.writeInt(100);

			raf.seek(0);
			// to reach beginning of file
			System.out.println(raf.readUTF());
			System.out.println(raf.readUTF());
			System.out.println(raf.readUTF());
			System.out.println(raf.readInt());

			raf.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
