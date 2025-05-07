package test9;

import java.io.*;

public class Filecopy {
	public static void main(String[] args) {
		FileInputStream input = null;
		FileOutputStream output = null;
		
		try {
			File file = new File("new.txt");
			input = new FileInputStream(file);
			output = new FileOutputStream("copy.txt");
			
			int readBuffer = 0;
			byte[] buff = new byte[1024];
			while((readBuffer = input.read(buff)) != -1)
				output.write(buff, 0, readBuffer);
			System.out.println("file copy complete");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {input.close();} catch (IOException e) {}
			try {output.close();} catch (IOException e) {}
		}
	}
}
//new 파일을 읽고 copy로 복사
