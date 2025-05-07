package test2;

import java.io.IOException;
import java.io.PrintWriter;

public class Test {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = null; 
		pw = new PrintWriter("output3.txt");
		
		for (int i = 0; i < 10; i++) {
			String data = i + "번째 라인\n";
			pw.write(data);
		}
		pw.close();
	}
}