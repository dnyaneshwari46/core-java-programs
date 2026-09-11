package loops;

public class SumOfNumbers {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        // Calculate the sum of numbers from 1 to 10
        do {
            sum = sum + i;
            i++;

        } while (i <= 10);

        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}
