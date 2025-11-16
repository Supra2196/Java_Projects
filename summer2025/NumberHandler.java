import java.util.Scanner;

class NumberHandler {
    private int[] numbers;
    private final int SIZE = 5;

    // Constructor to initialize array
    public NumberHandler() {
        numbers = new int[SIZE];
    }

    // Method to take user input
    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter " + SIZE + " numbers:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
    }

    // Method to display the stored numbers
    public void showOutput() {
        System.out.println("\nYou entered:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // For clean output
    }
}

public class Main {
    public static void main(String[] args) {
        NumberHandler handler = new NumberHandler();
        handler.takeInput();
        handler.showOutput();
    }
}
