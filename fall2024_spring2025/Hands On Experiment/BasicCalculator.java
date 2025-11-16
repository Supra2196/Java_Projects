import java.util.Scanner;

public class BasicCalculator {

    public static int add(int a, int b)
    {
        return a + b;
    }

    public static int subtract(int a, int b)
    {
        return a - b;
    }

    public static int multiply(int a, int b)
    {
        return a * b;
    }

    public static int division(int a, int b)
    {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scan.nextInt();
        System.out.println("Enter second number:");
        int b = scan.nextInt();
        int sum = add(a, b);
        int difference = subtract(a, b);
        int product = multiply(a, b);
        int quotient = division(a, b);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

    }
}
