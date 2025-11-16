import java.util.Scanner;
public class SwitchArray
{
public static void main(String[] args)
{
	/*Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number between 1 and 10");
	int jerseynumber = scan.nextInt();
	switch(jerseynumber)
	{
		case 1:
		System.out.println("KL Rahul");
		break;
		case 2:
		System.out.println("Arshdeep Singh");
		break;
		case 3:
		System.out.println("Suresh Raina");
		break;
		case 4:
		System.out.println("T Natarajan	");
		break;
		case 5:
		System.out.println("Washington Sundar");
		break;
		case 6:
		System.out.println("Wriddhiman Saha");
		break;
		case 7:
		System.out.println("MS Dhoni");
		break;
		case 8:
		System.out.println("R Jadeja");
		break;
		case 9:
		System.out.println("Sanju Samson");
		break;
		case 10:
		System.out.println("Sachin Tendulkar");
		break;
		default:
		//System.out.println("Thank u for using");
		//break;
		}*/


	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a position(ALR,BAT,BOW,WIK)");
	String position = scan.nextLine();
	String ALR[] = {"L Livingstone","R Ashwin", "V Iyer"};
	String BAT[] = {"A Markram", "R Tripathi", "A Manohar"};
	String BOW[] = {"K Rabada", "A Singh", "M Starc"};
	String WIK[] = {"J Butler", "KL Rahul", "I Kishan"};


	if(position.equals("ALR"))
	{
		for(String i:ALR)
		{
			System.out.println(i);
		}
	}
	else if(position.equals("BAT"))
	{
		System.out.println(BAT[0]);
		System.out.println(BAT[1]);
		System.out.println(BAT[2]);
	}
	else if(position.equals("BOW"))
	{
		System.out.println(BOW[0]);
		System.out.println(BOW[1]);
		System.out.println(BOW[2]);
	}
	else if(position.equals("WIK"))
	{
		System.out.println(WIK[0]);
		System.out.println(WIK[1]);
		System.out.println(WIK[2]);
	}

}
}