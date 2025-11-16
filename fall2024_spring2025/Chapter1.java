import java.util.Scanner;

public class Chapter1
{
public static void main(String[]args)
{
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter your first test result(0-100):");
   int testone= scan.nextInt();

   System.out.print("Enter your second test result(0-100):");
   int testtwo= scan.nextInt();

   System.out.print("Enter your third test result(0-100):");
   int testthree= scan.nextInt();

   System.out.print("Enter your fourth test result(0-100):");
   int testfour= scan.nextInt();

   System.out.print("Enter your fifth test result(0-100):");
   int testfive= scan.nextInt();

   int average = ((testone+testtwo+testthree+testfour+testfive)/5);
   System.out.println("Average is "+average +"/100");
}
}
