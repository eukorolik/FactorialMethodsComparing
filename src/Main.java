import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Iteration iterator = new Iteration();
        Recursion recursor = new Recursion();
        System.out.println("Enter number from 1 to 16: ");
        Scanner sc = new Scanner(System.in);

        final int ITERATION = 1_000_000;
        int num;

        try {
            ParseValue parse = new ParseValue();
            if (!parse.ParseRPV(num = sc.nextInt())) {
                throw new Exception("trouble0 RPV");
            }

            int iteratorResult;
            int recursorResult;

            //bytecode warming-up
            for (int i = 0; i < ITERATION; i++) {
                recursorResult = recursor.fact(num);
            }
            for (int i = 0; i < ITERATION; i++) {
                iteratorResult = iterator.fact(num);
            }

            //iterative method
            long startTime = System.nanoTime();
            for (int i = 0; i < ITERATION; i++) {
                iteratorResult = iterator.fact(num);
            }
            long duration = (System.nanoTime() - startTime) / 1000;
            iteratorResult = iterator.fact(num);
            System.out.println("Final iterative result = " + iteratorResult);
            System.out.println("Time taken to count 1.000.000 factorials using iterative method : " + duration);

            //recursive method
            startTime = System.nanoTime();
            for (int i = 0; i < ITERATION; i++) {
                recursorResult = recursor.fact(num);
            }
            duration = (System.nanoTime() - startTime) / 1000;
            recursorResult = recursor.fact(num);
            System.out.println("Final recursive result = " + recursorResult);
            System.out.println("Time taken to count 1.000.000 factorials using recursive method : " + duration);

            System.out.println("\nIterative method takes less time than recursive method." +
                    "\nIncreasing the number increases the time of recursive method hardly when the time of" +
                    "\niterative method does not change");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
