import java.util.Scanner;
public class SWITCHIF
{
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	String c =scan.nextLine();
	if (c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e")||c.equalsIgnoreCase("I")|| c.equalsIgnoreCase("o") || c.equalsIgnoreCase("u"))
	System.out.println ("Vowels");
	else
	System.out.println("Contests");

}
}
