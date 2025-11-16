import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class Excercise9Program7
{
	public static void main (String args[])
	{
		int counter =0;
		int sum =0;
		 Scanner scan1 = new Scanner(System.in);
		 /*System.out.println ( "Enter the file name along with path");
		 String fileName=scan1.nextLine();*/
		 File file = new File("C:\\Users\\supra\\OneDrive\\Pictures\\JAVAPROGRAMS\\Grade Calculator.txt");
		 try
		 {
		 Scanner scan = new Scanner(file);
		 while(scan.hasNextInt())
		 {
			 sum=sum+scan.nextInt();
			 counter++;
		}
		double average =sum/counter;
		if(average>=90)
		{
			System.out.println("You got an A");
		}
		else if(average>75 && average<=89)
		{
			System.out.println("You got an B");
		}
		else if(average>60 && average<=75)
		{
			System.out.println("You got an C");
		}

	    else if(average<60)
		{
			System.out.println("You got an D");
		}

		System.out.println("The average is "+(average));
		//System.out.println(scan.nextDouble());
	 	}
	 	catch ( FileNotFoundException e)
	 	{
			System.out.println(e);
		}


	}

}
