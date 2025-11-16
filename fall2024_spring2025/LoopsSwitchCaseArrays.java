import java.util.Scanner;
import java.util.Random;
public class LoopsSwitchCaseArrays
{
public static void main(String[] args)
{
	/*Write a for loop that prints the first 10 even numbers (0, 2, 4, …).
	int n =0;
	for(int i =0; i<=10; i++)
	{
		if(i%2==0)
		{
			System.out.println("Answer is"+i);
		}
		n++;
	}
	System.out.println(n);*/
	/*Using a while loop, write a program that asks the user to input numbers and sums them. Stop when the user inputs -1.
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int ui = scan.nextInt();
	while(ui>-1 || ui<-1)
	{
		System.out.println(ui);
		if(ui==-1)
		{
			System.out.println("Wrong Input");
		}
	}
	*/

	/*Write a switch statement that takes an integer (1-5) and prints the corresponding day of the week (e.g., 1 = Monday, 2 = Tuesday, etc.).
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int ui = scan.nextInt();
	switch(ui)
	{
		case 1:
		System.out.println("Monday");
		break;
		case 2:
		System.out.println("Tuesday");
		break;
		case 3:
		System.out.println("Wednesday");
		break;
		case 4:
		System.out.println("Thursday");
		break;
		case 5:
		System.out.println("Friday");
		break;
		default:
	}*/
	/*Using a switch statement, take the user's grade as input (A, B, C, D, F) and print the corresponding message ("Excellent", "Good", "Average", "Poor", "Fail").
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a letter(A,B,C,D,F)");
	String ui = scan.nextLine();
	switch(ui)
	{
		case "A":
		System.out.println("Excellent");
		break;
		case "B":
		System.out.println("Good");
		break;
		case "C":
		System.out.println("Average");
		break;
		case "D":
		System.out.println("Poor");
		break;
		case "F":
		System.out.println("Fail");
		break;
		default:
	}
	*/
	/*Exercise 1: Create and print an array of 10 random numbers
	Random rand = new Random();
	int[] nums = new int[10];
	for(int i =0; i<nums.length;i++)
	{
		nums[i] = rand.nextInt(100)+1;
	}
	for(int num: nums)
	{
		System.out.println(num);
	}*/
	int[]numbi= {10, 25, 7, 39, 18, 51, 60, 8, 33, 42};
	int numbihopper = numbi[0];
	for(int i =0; i<numbi.length; i++)
	{
		if(numbi[i] >numbihopper)
		{
			numbihopper=numbi[i];
		}
	}
	System.out.println("The largest number is:"+numbihopper);


}
}