package test3;

public class Test {

	public static Runnable task1 = () -> {
		int result = Dto.x + Dto.y;
		sleep();
		System.out.printf("덧셈 : %d + %d = %d\n", Dto.x, Dto.y, result);
	};

	public static Runnable task2 = () -> {
		double result = Dto.x - Dto.y;
		sleep();
		System.out.printf("뺄셈 : %d - %d = %.0f\n", Dto.x, Dto.y, result);
	};

	public static Runnable task3 = () -> {
		int result = Dto.x * Dto.y;
		sleep();
		System.out.printf("곱하기 : %d * %d = %d\n", Dto.x, Dto.y, result);
	};

	public static Runnable task4 = () -> {

//		Random random = new Random();
		Dto dto = new Dto();
//		dto.x = random.nextInt(100);
//		dto.y = random.nextInt(100);

		if (dto != null && dto.x != 0 && dto.y != 0) {
			int big;
			int small;

			if (dto.x > dto.y) {
				big = dto.x;
				small = dto.y;
			} else {
				big = dto.y;
				small = dto.x;
				System.out.println("x랑 y랑 위치 바꿔서");
			}

			int result = (int) big / small;

			sleep();
			System.out.printf("나누기 : %d / %d = %d\n", big, small, result);
		} else {
			System.out.println("0으로 나눌 수 X");
		}
	};

	private static void sleep() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
