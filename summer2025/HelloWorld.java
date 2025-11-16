import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args)
    {
		/*PRIME NUMBER COUNTER
		int numone=10;
		int numtwo=20;
		for(int i=numone;i<=numtwo;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				System.out.println(i+" is a prime number");
			}
			else
			{
				System.out.println(i+" is not a prime number");
			}
		}*/
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Enter a user input:");
		int ui=scan.nextInt();
		for(int i=1;i<=ui;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int numbi=scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i+" X "+j+" = "+ (i*j)+" ");

			}
			System.out.println();

		}*/
		/*Print numbers from 1 to 10.
		int a=1;
		while(a<=10)
		{
			System.out.println(a);
			a++;
		}*/
		/*Print the sum of first n natural numbers
		int b=50;
		for(int i=1;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}*/
		/*Print the sum of first n natural numbers
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int naturalnumbi=scan.nextInt();
		for(int i=0;i<=naturalnumbi;i++)
		{
			sum+=i;
		}
		System.out.println("Sum is:"+sum);*/
		/*Print the multiplication table of a given number.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int multinumbi=scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			int prod=i*multinumbi;
			System.out.println(i+" X "+multinumbi+" = "+(prod));
		}*/
		/*Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol;
		System.out.println("Enter # of rows:");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns:");
		columns = scanner.nextInt();
		scanner.nextLine(); // consume leftover newline
		System.out.println("Enter symbol to use:");
		symbol = scanner.nextLine();
		for (int i = 1; i <= rows; i++) {
		    for (int j = 1; j <= columns; j++) {
		        System.out.print(symbol);
		    }
		    System.out.println(); // move to next row
		}*/
		/*for(int i=10;i>=0;i--)
		{
			System.out.println(i);
			i-=2;
		}
		System.out.println("Happy new year!");*/
		/*Scanner scanner = new Scanner(System.in);
		String name= "";
		while(name.isBlank())
		{
			System.out.println("Enter your name:");
			name=scanner.nextLine();
		}
		System.out.println("Hello"+name);*/
		/*boolean isRainy=true;
		boolean hasUmberlla = true;
		if(isRainy == true && hasUmberlla == true)
		{
			System.out.println("Take your umbrella");
		}
		else if(isRainy == true && hasUmberlla == true)
		{
			System.out.println("It is either rainnining or you have an umberella or both");
		}
		else
		{
			System.out.println("It is not raining");
		}*/
		/*if(5<2)
		{
			System.out.println("The condition was true");
		}
		else if(5>3)
		{
			System.out.println("The else if condition was true");
		}
		else
		{
			System.out.println("The condition was false");
		}*/
		/*&
		int temp=25;
		if(temp>30)
		{
			System.out.println("It is hot outside");
		}
		else if(temp>=20 && temp<=30)
		{
			System.out.println("It is Warm outside");
		}
		else
		{
			System.out.println("It is Cold outside");
		}*/
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter your a number in units place");
		int unitsplace=scan.nextInt();
		System.out.println("Enter your a number in tens place");
		int tensplace=scan.nextInt();
		System.out.println("Enter your a number in hundreds place");
		int hundredsplace=scan.nextInt();
		System.out.println("Input:"+(hundredsplace+""+tensplace+""+unitsplace));

		int unitscube=unitsplace*unitsplace*unitsplace;
		int tenscube=tensplace*tensplace*tensplace;
		int hundredcube=hundredsplace*hundredsplace*hundredsplace;
		String threedigitsum=hundredcube+""+tenscube+""+unitscube;
		if(threedigitsum==(hundredsplace+""+tensplace+""+unitsplace))
		{
			System.out.println("Armstrong number");
		}*/
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number bigger than 0");
		int userinput=scan.nextInt();
		int s=0;
		while(userinput!=0)
		{
			int r=userinput%10;
			s+=r;
			userinput/=10;

		}
		System.out.println(s);*/
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Input:");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(j);
			}

		}*/
		/*SUM OF DIGITS
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number:");
		int ui=scan.nextInt();
		int s=0;
		while(ui!=0)
		{
			int units=ui%10;
			s=s+units;
			ui=ui/10;
		}
		System.out.println(s);*/

		/*MULTIPLICATION DIGITS
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number:");
		int ui=scan.nextInt();
		int s=1;
		while(ui!=0)
		{
			int units=ui%10;
			s=s*units;
			ui=ui/10;
		}
		System.out.println(s);*/

		/*PRIME NUMBER COUNTER
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number:");
		int ui=scan.nextInt();
		int counter=0;
		for(int i=1;i<=ui;i++)
		{
			if(ui%i==0)
			{
				counter+=1;
			}
		}
		if(counter==2)
		{
			System.out.println("Prime Number Confirmed");
		}
		else
		{
			System.out.println("Prime Number Denied");
		}*/
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number:");
		int firstnumber=scan.nextInt();
		System.out.print("Enter second number:");
		int secondnumber=scan.nextInt();
		//swaped values
		int secondnumbi=firstnumber;
		firstnumber=secondnumber;
		secondnumber=secondnumbi;
		System.out.println("Swaped values:"+firstnumber);
		System.out.println("Swaped values:"+secondnumber);*/
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Enter Fareheit:");
		double f=scan.nextInt();
		double celc= (f-32)*(5/9);
		System.out.print("Celsius: "+celc);*/
		//ALGORITHIM
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int ui = scan.nextInt();
		int temp=ui;
		int numbi=0;
		while(ui!=0)
		{
			int numbx=ui%10;
			numbi=numbi+(numbx*numbx*numbx);
			ui=ui/10;
		}
		if(numbi==temp)
		{
			System.out.println("Armstrong Number Confirmed");
		}
		else
		{
			System.out.println("Armstrong Number Denied");
		}



    }
    }
