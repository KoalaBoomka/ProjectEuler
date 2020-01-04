package koalaboomka.projecteuler.problem2;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        sumOfEvenNumbers();
    }


    public static ArrayList<Integer> fibonacciSequence() {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int a = 0, b = 1, c;
        int n = 10;

        for (int i = 0; i < n; i++) {
            c = a + b;
            fibonacci.add(c);
            a = b;
            b = c;
        }
        System.out.println("Fibonacci sequence of " + n + " elements is: " + fibonacci.toString());
        return fibonacci;
    }

    public static int sumOfEvenNumbers() {
        ArrayList<Integer> fibonacci = fibonacciSequence();
        int sum = 0;

        for (Integer integer : fibonacci) {
            if (integer % 2 == 0) {
                sum = sum + integer;
            }
        }
        System.out.println("The sum of even numbers in Fibonacci sequence is: " + sum);
        return sum;
    }
}
