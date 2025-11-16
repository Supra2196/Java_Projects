import java.util.Scanner;
public class SWITCHIFTWO
{
public static void main(String args[])
{
	int i = 0;

	for (i = 0; i < 3; i++)
	   System.out.println("Hello");


Scanner scan = new Scanner(System.in);
 System.out.println("Enter a month");
 String userinput =scan.nextLine();

switch(userinput)
{
	case "January":
	System.out.println ("31 Days");
	break;
	case "February":
	System.out.println ("28 in regular years and 29 in leap year");
	break;
	case "March":
	System.out.println ("31 Days");
	break;
	case "April":
	System.out.println ("30 Days");
	break;
	case "May":
	System.out.println ("31 Days");
	break;
	case "June":
	System.out.println ("30 Days");
	break;
	case "July":
	System.out.println ("31 Days");
	break;
	case "August":
	System.out.println ("31 Days");
	break;
	case "September":
	System.out.println ("30 Days");
	break;
	case "October":
	System.out.println ("31 Days");
	break;
	case "November":
	System.out.println ("30 Days");
	break;
	case "December":
	System.out.println ("31 Days");
	break;

}
}
}
