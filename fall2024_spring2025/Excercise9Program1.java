import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class Excercise9Program1
{
	public static void main (String args[])
	{
		int counter =0;
		double sum =0.0;
		 Scanner scan1 = new Scanner(System.in);
		 /*System.out.println ( "Enter the file name along with path");
		 String fileName=scan1.nextLine();*/

		 File file = new File("C:\\Users\\supra\\OneDrive\\Pictures\\JAVAPROGRAMS\\input.txt");

		 try
		 {
		 Scanner scan = new Scanner(file);
		 while(scan.hasNextDouble())
		 {
			 sum=sum+scan.nextDouble();
			 counter++;}
		System.out.println("The sum is "+sum);
		System.out.println("No of double values in the file are "+counter);//
		System.out.println("The average is "+(sum/counter));//
		 //System.out.println(scan.nextDouble());
	 	}
	 	catch ( FileNotFoundException e)
	 	{
			System.out.println(e);
		}


	}

}