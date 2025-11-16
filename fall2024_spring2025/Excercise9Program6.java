import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class Excercise9Program6
{
	public static void main (String args[])
	{
		int counter =0;
		double sum =0;
		 Scanner scan1 = new Scanner(System.in);
		 File file = new File("C:\\Users\\supra\\OneDrive\\Pictures\\JAVAPROGRAMS\\Grade Calculator.txt");
		 try
		 {
		 Scanner scan = new Scanner(file).useDelimiter("\\s*,\\s*");
		 while(scan.hasNextDouble())
		 {
			 sum=sum+scan.nextDouble();
			 System.out.println(sum);
			 counter++;
		 }
		double average =sum/counter;
		System.out.println("No of grades are  "+counter);//
		System.out.println("The average is "+(average));//
		 //System.out.println(scan.nextDouble());
	 	}
	 	catch ( FileNotFoundException e)
	 	{
			System.out.println(e);
		}


	}

}
