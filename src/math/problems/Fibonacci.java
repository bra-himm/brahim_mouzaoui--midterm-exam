package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int count = 40;

        int[] fib = new int[count];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < count; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i : fib) {
            System.out.println(i);
        }

    }
}
