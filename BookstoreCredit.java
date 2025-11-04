import java.util.Scanner;
public class BookstoreCredit
{
    public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name= scan.nextLine();

		Scanner scantwo = new Scanner(System.in);
		System.out.print("Enter your gpa:");
		double gpa = scantwo.nextDouble();

		double moneybaby=gpaToCash(gpa);
		System.out.println("Hello "+name+" You have earned  $"+moneybaby);

    }
    static double gpaToCash(double gpainput)
    {
		return gpainput*10;
    }
}