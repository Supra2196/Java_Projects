import java.util.Scanner;

public class MethodTesting
{
    public static void add(double a,double b)
	{
		System.out.println("Sum is"+(a+b));
	}
	public static void sub(double a,double b)
	{
		System.out.println("Difference is"+(b-a));
	}
    public static void multiply(double a,double b)
	{
		System.out.println("Product is "+(a*b));
	}
    public static void quotient(double a,double b)
	{
		System.out.println("Quotient is "+(b/a));
	}
	public static void main(String[] args)

	{

			add(3.0,5.0);
			sub(11,3);
			multiply(2,5);
			quotient(3,9);

	}


}
