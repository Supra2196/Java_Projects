import java.util.Scanner;
public class CircleUserInput
{
public static void main(String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  System.out.print("Enter a number:");
	  int userinput = scan.nextInt();
	  if(userinput%5==0 && userinput%11==0)
	  {
		  System.out.println("It is divisible by 5 and 11");
	  }
	  else
	  {
		  System.out.println("It is not divisible by 5 and 11");
	  }
	}
}