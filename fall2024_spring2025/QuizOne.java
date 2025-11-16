import java.util.Scanner;

public class QuizOne {
    public static void main(String[] args) {
        final double FIRST = -42.5;
        double totalSum = FIRST;
        double average;
        int numValues = 1;
        double newValue;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = scan.nextLine();

        System.out.println("Thank You " + firstName);
        System.out.println("Enter a number ");
        newValue = scan.nextDouble();

        totalSum += newValue;
        numValues++;

        System.out.println("The sum is " + totalSum);
        System.out.println("Start is " + FIRST);
        average = totalSum / numValues;
        System.out.println("The average is " + average);
        System.out.println("Where "+firstName+" should output whatever name was entered in above "+totalSum+ " is the sum of numbers that were entered"+FIRST+" is the FIRST constant value declared in main(), and"+ average+" is the average of the numbers entered and FIRST");
    }
}
