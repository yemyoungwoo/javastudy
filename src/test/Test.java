package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		FileOutputStream op = null;
		try {
			op = new FileOutputStream("output1.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < 10; i++) {
			String data = i + "번째 라인\n";
			op.write(data.getBytes());
		}
		op.close();
	}
}