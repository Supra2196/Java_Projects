import java.util.Scanner;

public class AreaCalculator
{
	public static double area(double number_one)
	{
		return number_one*number_one;
	}
	public static double area(double number_one,double number_two)
	{
		return number_one*number_two;
	}
	public static double Circlearea(double number_one)
	{
		return number_one*number_one*3.14;
	}

    public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		System.out.print("Number:");
		double numbione=scan.nextInt();
		System.out.print("Number:");
		double numbitwo=scan.nextInt();
		System.out.println("Area of Square:"+area(numbione));
		System.out.println("Area of Circle:"+Circlearea(numbione));
		System.out.println("Area of Rectangle:"+area(numbione,numbitwo));
    }
}
