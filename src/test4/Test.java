package test4;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("in1.txt");
		byte[] b = new byte[1024];
		input.read(b);
		System.out.println(new String(b));
		input.close();
	}
}