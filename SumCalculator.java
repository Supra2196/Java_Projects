import java.util.Scanner;
public class SumCalculator
{
	public static int sum(int numbione,int numbitwo)
	{
		return numbione+numbitwo;
	}
	public static double sum(double numbione,double numbitwo)
	{
		return numbione+numbitwo;
	}
	public static int sum(int numbione,int numbitwo,int numbithree)
	{
		return numbione+numbitwo+numbithree;
	}
    public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		System.out.print("Number:");
		int numberone=scan.nextInt();
		System.out.print("Number:");
		int numbertwo=scan.nextInt();
		System.out.println("Sum using two integers:"+sum(numberone,numbertwo));
		System.out.println("Sum using two integers in a decimal number:"+sum(numberone,numbertwo));
		System.out.println("Sum using thre integers in a whole number:"+sum(numberone,numbertwo,numberone));

    }

}