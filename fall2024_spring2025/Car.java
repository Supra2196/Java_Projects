import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        boolean carr;
        int year;
        String carname;
        int realyear;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a car name:");
        carname = scan.nextLine();

        System.out.println("Enter a year:");
        while (!scan.hasNextInt()) {
            System.out.println("Please enter a valid year (number only):");
            scan.next(); // Clear wrong input
        }
        realyear = scan.nextInt();

        carr = carInfo(carname, realyear); // Added missing semicolon
        if (carr) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure!");
        }
        scan.close(); // Always close Scanner
    }

    public static boolean carInfo(String name, int year) {
        // Dummy check for example
        return year > 2000 && !name.isEmpty();
    }
}
