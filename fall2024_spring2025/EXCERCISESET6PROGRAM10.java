import java.util.Scanner;
public class EXCERCISESET6PROGRAM10
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("Would like to enter a real number(Yes/No).  ");
String i = scan.nextLine();
int x=0;
int sum=0;
int j=0;
int min=0;
int max=0;
String temp = new String();
while (i.equals("Yes"))
{
   System.out.print("Enter a real Number : ");
   temp =scan.nextLine();
   x=Integer.parseInt(temp);
   System.out.println (x);
   sum+=x;
   j++;
   if(j==1)
   min=x;
   if(min>x)
   min=x;
   if(max<x)
   max=x;
   System.out.println("Would like to enter a real number(Yes/No).  ");
   i = scan.nextLine();
   System.out.println("value of "+i);
}
System.out.println("Average is " + (sum/j));
System.out.println("Minimum value is "+min);
System.out.println("Maximum value is "+max);
}
}