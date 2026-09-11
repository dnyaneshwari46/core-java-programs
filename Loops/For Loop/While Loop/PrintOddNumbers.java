package loops;

public class PrintOddNumbers {

    public static void main(String[] args) {

        int i = 1;

        // Print odd numbers from 1 to 20
        while (i <= 20) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

            i++;
        }
    }
}
