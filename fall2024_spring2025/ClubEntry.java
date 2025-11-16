import java.util.Scanner;

public class ClubEntry {
//Exponent Method
public static double power(double base,double exponent)
	{
		return(Math.pow(base,exponent));
	}
//Exponent Method
public static double facto(double number)
	{
		double prod=1.0;
		for(double j = 1; j<= number; j++)
		{
			prod=prod*j;
		}
		return prod;
	}
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter number");
double userinput =scan.nextInt();
double eseries=1.0;
for(double i = 1; i<=15; i++)
		{
		//Calculating numerator
		System.out.println("Exponent:"+i);
		double numr=power(userinput,i);
		System.out.println("Numerator Result:"+numr);
		//Calculating denominator
		double denr =facto(i);
		System.out.println("Denominator Result:"+denr);
		double nbyr=numr/denr;
		System.out.println("Numer/Denr is:"+nbyr);
		eseries+=nbyr;
		System.out.println(eseries);
		}
		System.out.println("Answer is:"+eseries);



    }
}
