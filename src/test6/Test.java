package test6;

import java.io.*;

public class Test {
	final static String File_Name = "output4.txt";

	public static void main(String[] args) {
		// 쓰기
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(File_Name))) {
			bw.write("hello world");
			bw.newLine();
			bw.write("welcome to java file");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 읽기
		try (BufferedReader br = new BufferedReader(new FileReader(File_Name))) {
			String line;
			while ((line = br.readLine()) != null)
				System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
