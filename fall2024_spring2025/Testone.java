import java.util.Scanner;
public class Testone
{
public static void main(String[] args)
{
	//final int START =-7;
	//int num1=20;
	//int num2=3;
	//int num3;
	//num3=START;
	//System.out.println("num3 is:"+num3);
	//num3 = num1/num2;
	//System.out.println("num3 is:"+num3);
	//num3 = (num1%num2) + 3;
	//System.out.println("num3 is:"+num3);
	//num3 = 17 + START *num2;
	//System.out.println("num3 is: "+num3);
	//num3++;
	//System.out.println("num3 is:"+num3);
	final int MIN=317;
	final int MAX=617;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your last name ");
	String lastName= scan.nextLine();
	System.out.println("Enter an integer");
	int numE = scan.nextInt();
	if(numE>MIN && numE<MAX)
	{
		System.out.println(numE + " is in range");
		System.out.println("Thank you "+lastName);
	}

}
}
