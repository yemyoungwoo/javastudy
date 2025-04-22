package test3;

import java.util.Random;

public class App extends Test {

	public App() {

	}

	public void Run() {
		Random ran = new Random();

		Dto.x = ran.nextInt(100);
		Dto.y = ran.nextInt(100);

		RunTask(task1);
		RunTask(task2);
		RunTask(task3);
		RunTask(task4);
	}

	private static void RunTask(Runnable task) {
		Thread t = new Thread(task);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
