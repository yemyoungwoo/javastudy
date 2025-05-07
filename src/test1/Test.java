package test1;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null; 
		fw = new FileWriter("output2.txt");
		
		for (int i = 0; i < 10; i++) {
			String data = i + "번째 라인\n";
			fw.write(data);
		}
		fw.close();
	}
	
}