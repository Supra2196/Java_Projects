import java.util.Scanner;
public class ForLoopDivisibleBy7
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter your first string: ");
String inputOne = scan.nextLine();
System.out.println("Enter your second string: ");
String inputTwo = scan.nextLine();
/*if (inputOne.length() < inputTwo.length())
{
	System.out.println("Shorter string: " + inputOne);
}
else if (inputTwo.length() < inputOne.length())
{
	System.out.println("Shorter string: " + inputTwo);
}
else
{
	System.out.println("Both strings have the same length.");
}*/
/*Clean If Not Else code*/
String strcomparison =inputOne.length()>inputTwo.length()?inputTwo:inputOne;
System.out.print(strcomparison + " length is  "+ strcomparison.length());

}
}
