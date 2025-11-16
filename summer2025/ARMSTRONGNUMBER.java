import java.util.Scanner;
public class ARMSTRONGNUMBER
{
    public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input:");
		int numbi=scan.nextInt();
		int armstrongnumbi=numbi;
		int sum=0;

		while(numbi>0)
		{
			int digit=numbi%10;
			sum+=digit*digit*digit;
			numbi=numbi/10;
		}

		if(sum == armstrongnumbi)
		{
			System.out.print("Armstrong number confirmed");
		}
		else
		{
			System.out.print("Armstrong number denied");
		}
	}
}