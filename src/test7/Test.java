package test7;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		long start = 0;
		long end = 0;

		FileInputStream fi = new FileInputStream("cc.jpg");
		start = System.currentTimeMillis();
		while (fi.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("not used : " + (end - start) + "ms");
		fi.close();

		FileInputStream fi1 = new FileInputStream("cc.jpg");
		BufferedInputStream bi = new BufferedInputStream(fi1);
		start = System.currentTimeMillis();
		while (bi.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("not used : " + (end - start) + "ms");
		bi.close();
		fi1.close();
	}
}
//사진 FileInputStream, BufferedInputStream 두 방식으로 속도 비교
//BufferedInputStream이 더 빠른 듯