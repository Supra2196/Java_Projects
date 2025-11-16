import java.util.Scanner;
public class EXCERCISESET6PROGRAM8
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("Would like to enter a real number(Yes/No).  ");
String i = scan.nextLine();
int x=0;
int sum=0;
int j=0;
String temp = new String();
while (i.equals("Yes"))
{
   System.out.print("Enter a real Number : ");
   temp =scan.nextLine();
   x=Integer.parseInt(temp);
   System.out.println (x);
   sum+=x;
   j++;
   System.out.println("Would like to enter a real number(Yes/No).  ");
   i = scan.nextLine();
   System.out.println("value of "+i);
}
System.out.println("Average is " + (sum/j));
}
}