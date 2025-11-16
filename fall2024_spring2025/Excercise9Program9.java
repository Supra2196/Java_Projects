import java.util.Scanner;
public class Excercise9Program9
{
  public static void main (String[] args)
  {

  	   /*WHILE LOOPS
	   int a=1;
	   while(a<=10)
	   {
		   System.out.println("Numbers are "+a++);
	   }

	   Program 2
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter a number");
	   int userinput = scan.nextInt();
	   while(userinput>=0)
	   {
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter another number");
		   int userinputwo = scanner.nextInt();
		   if(userinputwo <0)
		   break;
   	   }
   	   */

   	   /*FOR LOOPS
   	   //Program 1
   	   for(double i =0; i<=20; i++)
   	   {
		  if(i % 2==0)
		  {
			  System.out.println(ebri + " is even");
	      }
	   }

	   // Program 2
	  double sum =0;
	  for(double i =0; i<=100;i++)
	  {
		  sum += i;
		  System.out.println("Sum of all numbers is "+ sum);
	  }
	  */

	  /*DO WHILE LOOPS
	  Scanner scan = new Scanner(System.in);
	  int userinput;
	  do
	  {
		  System.out.println("Enter a number greater than 10:");
		  userinput = scan.nextInt();

	  }while(userinput<=10);
	  System.out.println("Valid user input");


	  Scanner scanner = new Scanner(System.in);
	  String input;
	  do{
		  System.out.print("Enter yes to continue  ");
		  input = scanner.nextLine();
    }
    while(input.equals("no"));*/


    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number(1,2,3):");
    int userinput = scan.nextInt();
    switch(userinput){
		case 1:
			System.out.println("small");
			break;
		case 2:
			System.out.println("MediuM");
			break;
		case 3:
			System.out.println("Large");
			break;
		default:
			System.out.println("Wrong number");
	}


  }
}
