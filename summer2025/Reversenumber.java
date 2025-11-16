import java.util.Scanner;
public class Reversenumber
{
public int sudarshan(int inputy)
{
	int reversed=0;
	while(number!=0)
	{
		int digit= number%10;
		reversed=reversed*10+digit;
		number=number/10;
	}
	return reversed;

}
public static void main(String[]args)
{
	int number;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a number:");
	number=scan.nextInt();
	Reversenumber objcall= new Reversenumber();
	int value = objcall.sudarshan(number);
	System.out.println(value);
}
}