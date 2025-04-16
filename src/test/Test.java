package test;

import java.util.Random;

//람다 + thread

public class Test {

	public static void main(String[] args) {
		Random ran = new Random();

		int x = ran.nextInt(100);
		int y = ran.nextInt(100);

		Runnable task1 = () -> {
			int result = x + y;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("덧셈 : %d + %d = %d\n", x, y, result);
		};

		Runnable task2 = () -> {
			int result = x - y;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("뺄셈 : %d - %d = %d\n", x, y, result);
		};

		Runnable task3 = () -> {
			int result = x * y;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("곱하기 : %d * %d = %d\n", x, y, result);
		};

		Runnable task4 = () -> {
			if (y != 0) {
				int result = x / y;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.printf("나누기 : %d / %d = %d\n", x, y, result);
			}
		};

		runTask(task1);
		runTask(task2);
		runTask(task3);
		runTask(task4);
	}
// 메인 메서드 바깥에 작성
	private static void runTask(Runnable task) {
		Thread t = new Thread(task);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
