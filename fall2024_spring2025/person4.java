import java.util.Scanner;
public class person4
{
public static void main(String[] args)
{
	/*QUIZ-1
	//Variable Declaration
	final double FIRST =-42.5;
	int numValues=1;
	double newValue =0.0;
	String firstName="NoNameYet";
	Scanner scan = new Scanner(System.in);
	//Username
	System.out.println("Enter your name");
	String username = scan.nextLine();
	//Floating Point Value
	System.out.println("Enter a floating point value");
	double floatpointingnumber = scan.nextDouble();
	//Calculations
	double totalSum = newValue+numValues+0.0;
	double average =totalSum/numValues;
	//Output
	System.out.println("Thank you " +username);
	System.out.println("The sum is "+totalSum);
	System.out.println("Start is "+FIRST);
	System.out.println("The average is "+ average);

	//TEST-1
	final int MIN=317;
	final int MAX=617;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Last Name");
	String lastName = scan.nextLine();
	System.out.println("Enter an integer");
	int numE=scan.nextInt();
	if(numE>MIN && numE<MAX)
	{
		System.out.println(numE+" is in range");
		System.out.println("Thank you "+lastName);
	}*/

	//QUIZ 2
	final int MAXCHAR=1000;
	final double MIN=-3.56;
	Scanner scan = new Scanner();
	System.out.println("Enter company name");
	String companyName = scan.nextLine();
	switch(companyName.charAt(0))
	{
		case 'A':
		System.out.println("American Inc");
		break;
		case 'B':
		System.out.println("Bearings ltd");
		break;
		case 'C':
		break;
		default:
	}
	Scanner scan = new Scannner(System.in);
	System.out.println("Enter a number");
	double userinput = scan.nextDouble();
	if(userinput!=0.0)
	{
		System.out.println("Please try again");
	}
	double garbage = userinput;
	else if(userinput<=MIN)
	{
		System.out.println("Number too small!");
	}
	else if(userinput>MIN)
	{
		System.out.println("Thank you for entering a number");
	}



}
}