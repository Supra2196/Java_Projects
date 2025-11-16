import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class Excercise9Program8
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
		 while(scan.hasNext())
		 {

			 String str =scan.next();
			 System.out.println(str);
			 System.out.println(str.indexOf('.'));
			 if(str.indexOf('.')>0)
			 {
				 sum=sum+Double.parseDouble(str);
				 System.out.println(sum);
			 	 counter++;
			  }
			 else if(str.indexOf('.')==-1)
			 {
				 System.out.println("Invalid input in the file");
				 System.exit(0);
			 }

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
