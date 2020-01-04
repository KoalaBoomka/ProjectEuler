package koalaboomka.projecteuler.problem1;

public class MultiplesOf3And5 {
    public static void main(String[] args) {
        System.out.println("The sum of all the multiples of 3 or 5 below the provided parameter is: " + multiplesOf3and5(1000));
    }

    public static int multiplesOf3and5(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i%3 == 0 || i%5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}