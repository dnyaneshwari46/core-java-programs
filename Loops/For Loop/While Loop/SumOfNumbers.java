package loops;

public class SumOfNumbers {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        // Calculate sum of numbers from 1 to 10
        while (i <= 10) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}
