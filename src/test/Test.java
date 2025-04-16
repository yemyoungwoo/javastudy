//람다

package test;

import java.util.Random;

public class Test extends Thread{
    public static void main(String[] args) {
    	
    	Random ran = new Random();
        int x = ran.nextInt(100);
        int y = ran.nextInt(100);

        Runnable add = () -> {
            int result = x + y;
            System.out.printf("%d + %d = %d\n", x,  y, (x+y));
        };

        Runnable sub = () -> {
            int result = x - y;
            System.out.printf("%d - %d = %d\n", x, y, (x-y));
        };

        Runnable mul = () -> {
            int result = x * y;
            System.out.printf("%d * %d = %d\n", x, y, (x*y));
        };

        Runnable div = () -> {
            int result = (y != 0) ? x / y : 0;
            System.out.printf("%d / %d =  %d\n", x, y, (x/y));
        };

        Thread a = new Thread(add);
        a.start();
        Thread s = new Thread(sub);
        s.start();
        Thread m = new Thread(mul);
        m.start();
        Thread d = new Thread(div);
        d.start();
    }
}