import java.util.Scanner;
public class STRINGCOUNTER {
public static void main(String[] args)
{

	Scanner scan = new Scanner(System.in);
	String stringinput;
	do
	{
	System.out.println("Do you want to enter a Value?(Yes or No)");
	stringinput= scan.nextLine();
	if (stringinput.equals("Yes"))
	{
		int prod =1;
		Scanner scannner = new Scanner(System.in);
		System.out.println("Enter the  number");
		int uione = scannner.nextInt();
		for (int i = prod; i <= uione; i++)
	{
			prod*=i;
	}
		System.out.println("Answer is "+prod);

	}
	}while(stringinput.equals("Yes"));

}
}
