import java.util.Scanner;
public class Factorial
{
public static void main(String[] args)
{

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter user input");
	int n = scan.nextInt();
	int facto=1;
	for(int i =1; i<=n;i++)
	{
			facto=facto*i;
	}
	System.out.print("The factorial of "+n+" is "+ facto +" ");

	/*int i =0;
	while(i<i)
	{
		System.out.println("Hello World");
	}

	int x =1;
	do
	{
		System.out.println(x);
		x++;
	}
	while(i<5);*/

}
}