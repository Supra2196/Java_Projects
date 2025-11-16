import java.util.Scanner;
import java.util.Random;

public class person2 {
    public static void main(String[] args)
    {
        // JAVA BANKING PROGRAM
        /*double balance = 0;
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        while (isRunning) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit(scanner);
                    break;
                case 3:
                    double withdrawalAmount = withdraw(scanner, balance);
                    balance -= withdrawalAmount;
                    break;
                case 4:
                    System.out.println("EXIT");
                    isRunning = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }

        scanner.close(); // Closing the scanner*/

    }

    /* Method to show balance
    static void showBalance(double balance) {
        System.out.printf("Your balance is: $%.2f%n", balance);
    }

    // Method for deposit
    static double deposit(Scanner scanner) {
        System.out.print("Enter an amount to be deposited: ");
        double amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

    // Method for withdraw
    static double withdraw(Scanner scanner, double balance) {
        System.out.print("Enter an amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
            return 0;
        } else {
            return amount;
        }
}*/