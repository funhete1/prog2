import static java.lang.System.*;

import java.util.Arrays;

public class Fibonacci {
    private static int[] fiboarr = new int[50];    
    public static void main(String[] args) {
        if (args.length < 1) {
        out.println("USO: java -ea Fibonacci N [N ...]");
        exit(1);
        }

        // Alguns testes:
        assert fibonacci(0) == 0;
        assert fibonacci(1) == 1;
        assert fibonacci(2) == 1;
        assert fibonacci(5) == 5;

        for(int i = 0; i < args.length; i++) {
        int n = Integer.parseInt(args[i]);
        int f;
        long time;

        time = nanoTime();   // System.nanoTime() gives the time in ns.
        f = fibonacci(n);
        time = nanoTime() - time; // Compute elapsed time.
        out.printf("fibonacci(%d) = %d (%d ns)\n", n, f, time);

        time = nanoTime();
        f = fibonacciMemo(n);
        time = nanoTime() - time; // Compute elapsed time.
        out.printf("fibonacciMemo(%d) = %d (%d ns)\n", n, f, time);
        }
    }

    // a)
    public static int fibonacci(int n) {
        assert n >= 0;
        assert n < 47;  // fibonacci(47) would overflow an int!
        if(n==0||n==1)return n;
        fiboarr[n] = fibonacci(n - 2) + fibonacci(n - 1);
        return fiboarr[n];
    }
    // b)
    public static int fibonacciMemo(int n) {
        assert n >= 0;
        assert n < 47;
        try {
            if(fiboarr[n] != 0)return fiboarr[n];
        } catch (IndexOutOfBoundsException e) {
            fiboarr = Arrays.copyOf(fiboarr, n+1);
        }
        return fibonacci(n);
    }
}