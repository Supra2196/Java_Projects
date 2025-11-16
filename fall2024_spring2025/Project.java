import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        try
        {
            // File setup
            File file = new File("C:\\Users\\supra\\OneDrive\\Pictures\\JAVAPROGRAMS\\inputdos.txt");
            PrintWriter filePrint = new PrintWriter(new FileWriter(file, true));

            // User input
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int numOne = scan.nextInt();
            System.out.println("Enter the second number:");
            int numTwo = scan.nextInt();

            // Calculations
            int sum = numOne + numTwo;
            int diff = numTwo - numOne;
            int prod = numOne * numTwo;
            int quot_one = numOne / numTwo;
			int quot_two = numTwo / numOne;

            // Output to console

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + diff);
            System.out.println("Product: " + prod);
            if(numOne > numTwo)
            {
				System.out.println("Quotient: " + quot_one);
			}
            if(numTwo > numOne)
			{
				System.out.println("Quotient: " + quot_two);
			}
            // Output to file
            filePrint.println("Sum: " + sum);
            filePrint.println("Difference: " + diff);
            filePrint.println("Product: " + prod);
            filePrint.println("Quotient: " + quot_one);
            filePrint.println("Quotient: " + quot_two);
            // Close resources
            filePrint.close();
            scan.close();
        }
        catch (IOException e)
        {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
