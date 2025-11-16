import java.util.Scanner;
public class Chapter3
{
public static void main(String[] args)
	{	
	3.1
	Scanner scanone = new Scanner(System.in);
	System.out.println("Enter a roman number(I,II,III)");
	String userinput = scanone.nextLine();
	if(userinput.equals("I"))
	{
	   System.out.println("One");
	}
	else if(userinput.equals("II"))
	{
	System.out.println("Two");
	}
	else if(userinput.equals("III"))
	{
	  System.out.println("Three");
	}
	else if(userinput.equals("IV"))
	{
	  System.out.println("Four");
	}
	else if(userinput.equals("V"))
	{
	   System.out.println("Five");
	}
	else if(userinput.equals("VI"))
	{
	   System.out.println("Six");
	}
	else if(userinput.equals("VII"))
	{
	     System.out.println("Seven");
	}
	else if(userinput.equals("VIII"))
	{
	     System.out.println("Eight");
	}
	else if(userinput.equals("IX"))
	{
	   System.out.println("Nine");
	}
	else if(userinput.equals("X"))
	{
	    System.out.println("Ten");
	}
	else
	{
	   System.out.println("Invalid Input");
	}
		/*3.2
		Scanner scanone = new Scanner(System.in);
		System.out.println("Enter a month");
		int month = scanone.nextInt();
		Scanner scantwo = new Scanner(System.in);
		System.out.println("Enter a day");
		int day = scantwo.nextInt();
		Scanner scanthree = new Scanner(System.in);
		System.out.println("Enter a year(last 2 digits)");
		int year = scanthree.nextInt();
		if(month*day==year)
		{
			System.out.println("Date is magical!");
		}
		else
		{
			System.out.println("Not Magical");
		}*/
		/*3.3
		Scanner scanone = new Scanner(System.in);
		System.out.println("Enter your weight");
		int weight = scanone.nextInt();
		Scanner scantwo = new Scanner(System.in);
		System.out.println("Enter your height");
		int height = scantwo.nextInt();
		int bmi=((weight*703)/height);
		if(bmi<18.5)
		{
			System.out.println("Underweight");
		}
		else if(bmi>18.5 && bmi<=24.9)
		{
			System.out.println("Normal Weight");
		}
		else if(bmi>=25 && bmi<29.9)
		{
			System.out.println("OverWeight");
		}
		else if(bmi>=30)
		{
			System.out.println("Obese");
		}*/
		/*3.4
		Scanner scanone = new Scanner(System.in);
		System.out.println("Enter your first grade");
		int gradeone = scanone.nextInt();
		Scanner scantwo = new Scanner(System.in);
		System.out.println("Enter your second  grade");
		int gradetwo = scantwo.nextInt();
		Scanner scanthree = new Scanner(System.in);
		System.out.println("Enter your third  grade");
		int gradethree = scanthree.nextInt();
		int average=gradeone+gradetwo+gradethree;
		if(average>=90 && average<=100)
		{
			System.out.println("A");
		}
		else if(average>=80 && average<=89)
		{
			System.out.println("B");
		}
		else if(average>=70 && average<=79)
		{
			System.out.println("C");
		}
		else if(average>=60 && average<=69)
		{
			System.out.println("D");
		}
		else if(average<=59)
		{
			System.out.println("F");
		}*/
		/*3.5
		Scanner scanone = new Scanner(System.in);
		System.out.println("Enter your mass");
		int mass = scanone.nextInt();
		int weight=mass*9.8;
		if(weight>1000)
		{
			System.out.println("To heavy");
		}
		else
		{
			System.out.println("To light");
		}*/
		/*3.7
		Scanner scanone = new Scanner(System.in);
		System.out.println("Enter your number of seconds");
		int secondsone = scanone.nextInt();
		if(secondsone>=60)
		{
			System.out.println(secondsone);
		}
		Scanner scantwo = new Scanner(System.in);
		System.out.println("Enter your number of seconds");
		int secondstwo = scantwo.nextInt();
		if(secondstwo>=36000)
		{
			System.out.println(secondstwo);
		}
		Scanner scanthree = new Scanner(System.in);
		System.out.println("Enter your number of seconds");
		int secondsthree = scanthree.nextInt();
		if(secondsthree>=86400)
		{
			System.out.println(secondsthree);
		}*/

		/*3.7
		Scanner scanone = new Scanner(System.in);
		System.out.println("Enter your first name");
		String nameone = scan.nextLine();
		Scanner scantwo = new Scanner(System.in);
		System.out.println("Enter your second name");
		String nametwo = scan.nextLine();
		Scanner scanthree = new Scanner(System.in);
		System.out.println("Enter your third name");
		String namethree = scan.nextLine();
		System.out.println(nameone);
		System.out.println(nametwo);
		System.out.println(namethree);*/
		/*3.9
		double softwarepackage=99;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a how many packages you need");
		double packagecount = scan.nextInt();
		if(packagecount>=10&&packagecount<=19)
		{
			System.out.println("It will cost $"+(softwarepackage*0.2));
		}
		else if(packagecount>=20&&packagecount<=49)
		{
			System.out.println("It will cost $"+(softwarepackage*0.3));
		}
		else if(packagecount>=50&&packagecount<=99)
		{
			System.out.println("It will cost $"+(softwarepackage*0.4));
		}
		else if(packagecount>=100)
		{
			System.out.println("It will cost $"+(softwarepackage*0.5));
		}
		else
		{
			System.out.println("No discount given.Sorry");
		}*/
		/*3.9
		double milescovered=500;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how much weight is the package(2-10)");
		int packageweight=scan.nextInt();
		if(packageweight<=2)
		{
			System.out.println("Cost:$"+(milescovered*1.10));
		}
		else if(packageweight>2 &&packageweight<=6)
		{
			System.out.println("Cost:$"+(milescovered*2.20));
		}
		else if(packageweight>6 &&packageweight<=10)
		{
			System.out.println("Cost:$"+(milescovered*3.70));
		}
		else if(packageweight>10)
		{
			System.out.println("Cost:$"+(milescovered*3.80));
		}*/
		/*3.10
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number of fatcalories");
		double fatgrams=scan.nextDouble();
		double fatcalories= fatgrams*9;
		System.out.println("Enter your number of calories");
		double caloriecount=scan.nextDouble();
		double fatpercentage= fatcalories/caloriecount;
		double caltotal=fatcalories+caloriecount;
		if(fatpercentage<(0.3*100))
		{
			System.out.println("This has low fat");
		}
		if(fatcalories>caltotal)
		{
			System.out.println("Erorr 404");
		}*/
		/*3.11
		Scanner scanonename = new Scanner(System.in);
		System.out.println("Enter your name");
		String nameone=scanonename.nextLine();
		Scanner scanonenametime = new Scanner(System.in);
		System.out.println("Enter your time in seconds "+nameone+":");
		double nameonetime=scanonenametime.nextDouble();
		Scanner scantwoname = new Scanner(System.in);
		System.out.println("Enter your name");
		String nametwo=scantwoname.nextLine();
		Scanner scantwonametime = new Scanner(System.in);
		System.out.println("Enter your time in seconds "+nametwo+":");
		double nametwotime=scantwonametime.nextDouble();
		Scanner scanthreename = new Scanner(System.in);
		System.out.println("Enter your name");
		String namethree=scanthreename.nextLine();
		Scanner scanthreenametime = new Scanner(System.in);
		System.out.println("Enter your time in seconds "+namethree+":");
		double namethreetime=scanthreenametime.nextDouble();

		if(nameonetime<nametwotime && nameonetime<namethreetime)
		{
			System.out.println(nameone+":"+nameonetime+" seconds");
			System.out.println(nametwo+":"+nametwotime+" seconds");
			System.out.println(namethree+":"+namethreetime+" seconds");
		}
		else if(nametwotime<nameonetime && nametwotime<namethreetime)
		{
			System.out.println(nametwo+":"+nametwotime+" seconds");
			System.out.println(nameone+":"+nameonetime+" seconds");
			System.out.println(namethree+":"+namethreetime+" seconds");
		}
		else if(namethreetime<nameonetime && namethreetime<nametwotime)
		{
			System.out.println(nameone+":"+nameonetime+" seconds");
			System.out.println(nametwo+":"+nametwotime+" seconds");
			System.out.println(namethree+":"+namethreetime+" seconds");
		}*/
		/*3.12
		int airspeed=1100;
		int waterspeed=4900;
		int steelspeed=16400;
		Scanner scan = new System.in();
		System.out.println("Enter distance covered");
		int distance=scan.nextInt();
		Scanner scantwo = new System.in();
		System.out.println("Enter one of the following(air,water,steel)");
		String input=scantwo.nextLine();
		if(input.equals("air"))
		{
			System.out.println("Distance is:"+(distance/airspeed));
		}
		else if(input.equals("water"))
		{
			System.out.println("Distance is:"+(distance/waterspeed));
		}
		else if(input.equals("steel"))
		{
			System.out.println("Distance is:"+(distance/steelspeed));
		}*/
		/*3.13-3.14
		double package_a=9.95;
		double package_a_hours=10;
		double package_b=13.95;
		double package_b_hours=20;
		double package_c=19.95;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter(a,b,c)");
		String letter= scan.nextLine();
		if(letter.equals("a"))
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("How many hours do you use");
			int hours = scanner.nextInt();
			if(hours>10)
			{
				System.out.println((hours*2.00)+9.95);
			}
		}
		if(letter.equals("b"))
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("How many hours do you use");
			int hours = scanner.nextInt();
			if(hours>20)
			{
				System.out.println((hours*1.00)+13.95);
			}
		}
		if(letter.equals("c"))
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("How many hours do you use");
			int hours = scanner.nextInt();
			System.out.println("Cost is"+(hours*19.95));
		}*/
		/*3.15
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of checks you want");
		double checks = scan.nextDouble();
		if(checks<20)
		{
			System.out.println("Cost:"+(10+(checks*0.2)));
		}
		else if(checks>20 && checks<39)
		{
			System.out.println("Cost:"+(10+(checks*0.08)));
		}
		else if(checks>40 && checks<59)
		{
			System.out.println("Cost:"+(10+(checks*0.06)));
		}
		else if(checks>60)
		{
			System.out.println("Cost:"+(10+(checks*0.04)));
		}*/
		/*int points=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of books");
		int books=scan.nextInt();
		if(books==0)
		{
			System.out.println(points+1);
		}
		else if(books==1)
		{
			System.out.println(points+5);
		}
		else if(books==2)
		{
			System.out.println(points+15);
		}
		else if(books==3)
		{
			System.out.println(points+30);
		}
		else if(books==3)
		{
			System.out.println(points+30);
		}
		else if(books>=3)
		{
			System.out.println(points+50);
		}*/






	}
}