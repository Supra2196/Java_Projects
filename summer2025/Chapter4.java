import java.util.Scanner;
public class Chapter4
{
	public static void main(String[] args)
	{
		/*4.1
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int loopnumber=scan.nextInt();
		int sum=0;
		for(int i=0;i<=loopnumber;i++)
		{
			sum+=i;
			System.out.println("Answer:"+(sum));
		}*/
		/*4.2
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a speed");
		int speed=scan.nextInt();
		Scanner scantwo = new Scanner(System.in);
		System.out.println("Enter a time");
		int time=scantwo.nextInt();
		for(int i=1;i<=time;i++)
		{
			int distance=speed*i;
			System.out.println("Hour:"+i+" "+"Distance:"+distance);
		}*/
		/*4.4
		Scanner scantwo = new Scanner(System.in);
		System.out.println("Enter how many days you want");
		int day = scantwo.nextInt();
		int penny = 1;
		for (int i = 1; i <= day; i++)
		{
			System.out.println("Day: " + i + " Penny: " + penny);
			penny *= 2;
        }*/
		/*4.5
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String userInput = scan.nextLine().toUpperCase();
		System.out.println("Enter a character (A-Z):");
		char targetChar = scan.nextLine().toUpperCase().charAt(0);
		int count = 0;
		for (int i = 0; i < userInput.length(); i++)
		{
			if (userInput.charAt(i) == targetChar)
			{
				count++;
			}
		}
		System.out.println("Character " + targetChar + " appeared " + count + " times.");*/
		/*4.11
		for(double i=0; i<=20;i++)
		{
			System.out.println(( (9/5*i)+32)+"°F");
		}*/



		/*4.12
		Scanner scanone = new Scanner(System.in);
		System.out.println("Enter sales for store 1:");
		int storeone=scanone.nextInt();
		Scanner scantwo = new Scanner(System.in);
		System.out.println("Enter sales for store 2:");
		int storetwo=scantwo.nextInt();
		Scanner scanthree= new Scanner(System.in);
		System.out.println("Enter sales for store 3:");
		int storethree=scanthree.nextInt();
		Scanner scanfour = new Scanner(System.in);
		System.out.println("Enter sales for store 4:");
		int storefour=scanfour.nextInt();
		Scanner scanfive = new Scanner(System.in);
		System.out.println("Enter sales for store 5:");
		int storefive=scanfive.nextInt();

		System.out.println("Store 1:"+"*".repeat(storeone/100));
		System.out.println("Store 2:"+"*".repeat(storetwo/100));
		System.out.println("Store 3:"+"*".repeat(storethree/100));
		System.out.println("Store 4:"+"*".repeat(storefour/100));
		System.out.println("Store 5:"+"*".repeat(storefive/100));*/

		/*Scanner scan = new Scanner(System.in);
		System.out.print("Enter your budget for this month:$");
		int budget= scan.nextInt();
		Scanner scano = new Scanner(System.in);
		System.out.print("Enter your purchase:$");
		int purchase = scano.nextInt();
		if(purchase<=budget)
		{
			System.out.println("Your budget remaining:$"+(budget-purchase));
		}*/

		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter the string");
		  String name = scan.nextLine();
		  for(int i=0;i<name.length();i++)
		  {
		    System.out.println(name.charAt(i));
		  }


	}
}