import java.util.*;

class InputFailureExample 
{
	public static void main(String[] args) 
	{
		int numE;
		String garbage;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Integer: ");
		while (!scan.hasNextInt())
		{
			garbage = scan.nextLine();
			System.out.println("Please try again.");
			System.out.print("Enter Integer: ");
		}
		numE = scan.nextInt();
		System.out.println("You entered: " + numE);
	}
}
