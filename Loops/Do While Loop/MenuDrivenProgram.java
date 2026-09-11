package loops;

import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("You selected Addition.");
                    break;

                case 2:
                    System.out.println("You selected Subtraction.");
                    break;

                case 3:
                    System.out.println("You selected Multiplication.");
                    break;

                case 4:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
