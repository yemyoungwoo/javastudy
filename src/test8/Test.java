package test8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Test1 t1 = new Test1();
		t1.me();

		Test2 t2 = new Test2();
		t2.me();
	}
}

class Test1 {
	public void me() {
		try {
			InputStream in = new FileInputStream("cc.jpg");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class Test2 {
	public void me() throws FileNotFoundException {
		InputStream in = new FileInputStream("cc.jpg");
	}
}