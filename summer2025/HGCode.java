import java.util.Scanner;
public class HGCode
{
public static void main(String[]args)
{
	/*EXCERCISE 1
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int ui=scan.nextInt();
	for(int i=0;i<=ui;i++)
	{
		System.out.println(i);
	}*/
	/*EXCERCISE 1
	Scanner scan =  new Scanner(System.in);
	System.out.println("Enter a number");
	int userinput = scan.nextInt();
	int even=0;
	for(int i=1;i<=userinput;i++)
	{
		if(i%2==0)
		{
			System.out.println("Result:"+(i));
		}
	}*/
	/*EXCERCISE 2
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int userinput = scan.nextInt();
        for (int i = 1; i <= userinput; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("Result: " + i);
            }
        }
     */
     /*EXCERCISE 3
        int sum = 0;
		for (int i = 1; i <= 100; i++)
		{
			sum += i;
		}
        System.out.println("Sum:" + sum);*/
     /*EXCERCISE 4
     Scanner scan = new Scanner(System.in);
	 System.out.println("Enter a number");
	 int userinput = scan.nextInt();
	 for (int i = 1; i <= 10; i++)
	 {
		 System.out.println(userinput+" * "+i+" = "+(userinput*i));
     }*/
     /*EXCERCISE 5
     int count=0;
     Scanner scan = new Scanner(System.in);
     int number=scan.nextInt();
	 if (number == 0)
	 {
		 count = 1;
		 System.out.println("Number Count:"+count);
	 }
	 else
	 {
	 for (; number != 0; number /= 10)
	 {
		 count++;
	 }
	 System.out.println("Number Count:"+count);
   	 }*/
   	 /*EXCERCISE 6
   	 int facto=1;
   	 Scanner scan = new Scanner(System.in);
   	 System.out.println("Enter user input");
     int ui=scan.nextInt();
     for(int i=1;i<=ui;i++)
     {
		 facto*=i;
     }
     System.out.println(facto);*/
 	/*Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number ");
    int userinput = scan.nextInt();
    int i=0;
    int sum=0;
    while(i<=userinput)
    {
		 if(i%2==0)
		 {
			 sum+=i;
	     }
		 i+=1;
	}
	System.out.println("Sum:"+());*/
	/*for(int i =1;i<=100;i++)
	{
		if(i%2!=0)
		{
			System.out.println(i);
		}
	}*/
	/*for(int i=4;i<=20;i++)
	{
		System.out.println(i);
	}*/

	/*int seven=7;
	for(int i=1; i<=10;i++)
	{
		System.out.println(seven+"X"+i+"="+(seven*i));

	}*/


	/*int numbi=1;
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
	}*/
	/*Print even numbers from 1 to 50.
	for(int i=0;i<=50;i++)
	{
		if(i%2==0)
		{
			System.out.println(i+" is an even number");
		}
	}*/
	/*Print the sum of first n natural numbers
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter n");
	int n = scan.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		sum+=i;
	}
	System.out.println(sum);*/
	/*Find the factorial of a given number
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int userinput=scan.nextInt();
	int facto=1;
	for(int i=1;i<=userinput;i++)
	{
		facto*=i;

	}
	System.out.println("Factorial of user input "+userinput+" is "+facto);.*/
	/*Print the multiplication table of a given number.
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int userinput=scan.nextInt();
	for(int i=1;i<=100;i++)
	{
			System.out.println(userinput+" X "+(i)+"="+(userinput*i));
	}*/
	/*Print numbers from n to 1 (in reverse order).
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int userinput=scan.nextInt();
	for(int i=userinput;i>=1;i--)
	{
		System.out.print("The following:"+i);
	}*/
	/*Keep accepting numbers from the user until they enter 0, then print the sum
	int sum=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int userinput=scan.nextInt();
	while(userinput!=0)
	{
		sum+=userinput;
		System.out.println("Enter another number");
		userinput=scan.nextInt();
	}
	System.out.println("Sum:"+sum);*/
	/*Find the sum of digits of a number.
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int numbi = scan.nextInt();
	int sum=0;
	int digit=0;
	while(numbi>0)
	{
		digit=numbi%10;
		numbi=numbi/10;
		sum+=numbi;
	}
	System.out.println("Sum is "+(sum));*/
	/*Count the number of digits in a given number.
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int numbi = scan.nextInt();
	int numbicounter=0;
	while(numbi>0)
	{
		numbi/=10;
		numbicounter++;
	}
	System.out.println("There are "+(numbicounter)+" digits");*/
	/*int i =1;
	while(i<=10)
	{
		System.out.println(i);
		i++;
	}*/
	/*int i=1;
	while(i<=50)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
		i++;
	}*/
	/*int sum=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter n");
	int n=scan.nextInt();
	int i=0;
	while(i<=n)
	{
		sum+=i;
		i++;
	}
	System.out.println("Sum:"+(sum));*/
	/*Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int number=scan.nextInt();
	int r;
	int reverse=0;
	while(number>0)
	{
		r = number%10;
		reverse=reverse*10+r;
		number= number/10;
	}
	System.out.println(reverse);*/
/*Print numbers from n to 1 (in reverse order)
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number :");
int ui = scan.nextInt();
while(ui>=1)
{
	System.out.println("Number:"+(ui));
	ui--;
}*/
/*Keep accepting numbers from the user until they enter 0, then print the sum
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number :");
int ui = scan.nextInt();
int sum=0;
while(ui!=0)
{
	sum+=ui;
	System.out.println("Enter another number :");
	ui=scan.nextInt();
}
System.out.println("Sum:"+sum);
*/
/*Check whether a number is a perfect square
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number ");
double square_user_number=scan.nextDouble();
while(square_user_number!=0)
{
	double squared_numbi=Math.sqrt(square_user_number);
	if (squared_numbi - (int)squared_numbi == 0 )
   	{
		System.out.println("Its a perfect square");
		break
	}
	else
	{
		System.out.println("Its not a perfect square");
	}
	System.out.println("Try again");
	square_user_number=scan.nextDouble();
}*/
/*Find the smallest divisor of a number greater than 1
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number ");
int a =scan.nextInt();
int i=2;
while(a>1)
{
	if(a%i==0)
	{
		System.out.println(i+" is the smallest divisor");
		break;
	}
	else
	{
		i++;

	}
}*/
/*Count how many times digit 5 occurs in a number
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number ");
int anumbi=scan.nextInt();
int fivecounter=0;
while(anumbi>0)
{
	int remainder=anumbi%10;
	if(remainder==5)
	{
		fivecounter++;
	}
	anumbi/=10;
}
	System.out.println("There are "+fivecounter+" 5's on this number");*/
/*Scanner scan = new Scanner(System.in);
System.out.println("Enter a number");
int userinput=scan.nextInt();
int first=0;
int second=1;
int count=1;
while(count<=userinput)
{
	System.out.println(first+" ");
	int next =first+second;
	first=second;
	second=next;
	count++;
}*/
/*Scanner scan = new Scanner(System.in);
System.out.println("Enter the first number");
int numbi=scan.nextInt();
System.out.println("Enter the second number");
int numbidos=scan.nextInt();
int count=0;
int initiallynumbi=1;
for(int i=numbi;i<=numbidos;i++)
{
	if(numbi%i==0)
	{
		count++;
		initiallynumbi++;
	}
}
if(count==2)
	{
		System.out.println(numbi+",");
	}*/
	/*Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number");
	int ui=scan.nextInt();
	int sum=0;
	for(int i=1;i<=ui;i++)
	{
		sum=sum+i;
	}
	System.out.println("Sum:"+sum);*/
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a number:");
	int useri=scan.nextInt();
	int numbis=0;
	for(int i=1;i<=useri;i++)
	{
		if(useri%2==0)
		{
			numbis++;
		}
	}

	if(numbis==2)
	{
		System.out.println("Sum: "+useri+"is a prime number");
	}
	else
	{
		System.out.println("Sum: "+useri+" is not a prime number");
	}
}
}