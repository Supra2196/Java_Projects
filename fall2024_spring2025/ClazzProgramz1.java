import java.util.Scanner;
public class ClazzProgramz1
{
public static void main(String[] args)
{
 	/*final double FIRST = -42.5;
    double totalSum = FIRST;
    double average = 0.0;
    int numValues = 1;
    double newValue = 1.0;
    String firstName = "no name yet";
    // Scanner object to take input from the user
	Scanner scanner = new Scanner(System.in);
        // Prompt the user for their name
  	System.out.print("Enter your name: ");
  	firstName = scanner.nextLine();
        // Prompt the user for a floating-point number
  	System.out.print("Enter a floating-point number: ");
  	newValue = scanner.nextDouble();
        // Add the new value to the total sum and increment numValues
    totalSum += newValue;
    numValues++;
        // Calculate the average
    average = totalSum / numValues;
        // Display the results
    System.out.println("Thank you  " +firstName);
	System.out.println("The sum is " +totalSum);
	System.out.println("Start is   " +FIRST);
    System.out.println("Average    " +average);*/

    /*final double FIRST=-42.5;
	double totalSum = FIRST;
	double average =0.0;
	int numValues=1;
	double newValue=0.0;
	String firstName = "NoNameYet";
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter first name ");
	String name=scan.nextLine();
	System.out.println("Enter a floating point number");
	double value=scan.nextDouble();
	totalSum += value;
	numValues++;
	System.out.println("Thank you	" +name);
	System.out.println("The sum is 	" +totalSum);
	System.out.println("Start is 	" +FIRST);
	System.out.println("Average 	" +(totalSum/numValues));*/
	/*Scanner scan = new Scanner(System.in);
	System.out.println("Enter a vowel(a,e,i,o,u,y) or (A,E,I,O,U,Y)");
	char userinput = scan.next().charAt(0);
	switch(userinput)
	{
	   case 'a':
	   System.out.println("a");
	   break;
	   case 'e':
	   System.out.println("e");
	   break;
	   case 'i':
	   System.out.println("i");
	   break;
	   case 'o':
	   System.out.println("o");
	   break;
	   case 'u':
	   System.out.println("u");
	   break;
	   case 'A':
	   System.out.println("A");
	   break;
	   case 'E':
	   System.out.println("E");
	   break;
	   case 'I':
	   System.out.println("I");
	   break;
	   case 'O':
	   System.out.println("O");
	   break;
	   case 'U':
	   System.out.println("U");
	   break;
	   default:
	}*/
	/*final int MAXCHAR = 1000;
	final double MIN=-3.56;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a company name");
	String companyName = scan.nextLine();
	switch(companyName)
	{
		case'A'
	}*/

	    Scanner scan = new Scanner(System.in);
		        System.out.println("Enter a number of array items:");
		        int userinput = scan.nextInt();

		        int[] arrayitems = new int[userinput];

		        for (int i = 0; i < arrayitems.length; i++) {
		            System.out.println("Enter the array element " + (i + 1) + ":");
		            arrayitems[i] = scan.nextInt();
		        }

		        System.out.println("Your array values are:");
		        for (int val : arrayitems) {
		            System.out.print(val + " ");
        }

}
}
