package test2;

import java.util.Random;

public class Test {

	public static int op(OpraDao dao, int x, int y) {
		return dao.dao(x, y);
	}

	public static void main(String[] args) {

		Random ran = new Random();

		int x = ran.nextInt(100);
		int y = ran.nextInt(100);

		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);

		OpraDao 더하기 = (a, b) -> a + b;
		System.out.println("더하기 = " + op(더하기, x, y));

		OpraDao 빼기 = (a, b) -> a - b;
		System.out.println("빼기 = " + op(빼기, x, y));

		OpraDao 곱셈 = (a, b) -> a * b;
		System.out.println("곱셈 = " + op(곱셈, x, y));

		OpraDao 나누기 = (a, b) ->{
			if (b != 0)
				return a / b;
			else
				return 0;
		};
		System.out.println("나누기 = " + op(나누기, x, y));
	}
}
