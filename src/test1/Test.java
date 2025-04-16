package test1;

import java.util.Random;

public class Test {
	
	public static int op(OpraDao Opra, int x, int y) {
		return Opra.Opra(x,y);
	}
	public static void main(String[] args) {
		Random ran = new Random();
		
		int x = ran.nextInt(100);
		int y = ran.nextInt(100);
		
		OpraDao add = (a,b) -> a + b;
		System.out.println("add result = " + op(add, x,y));
		
		OpraDao subtract = (a,b) -> a - b;
		System.out.println("subtract result = " + op(subtract, x,y));
		
		OpraDao multiply = (a,b) -> a * b;
		System.out.println("multiply result = " + op(multiply, x,y));
		
		OpraDao divide = (a,b) -> {
			if ( b != 0) return a / b;
			else return 0;
		};
		System.out.println("divide result = " + op(divide, x,y));
	}
}
