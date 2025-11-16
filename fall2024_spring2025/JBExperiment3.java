import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
class JBExperiment3
{
	public static void main (String args[])
	{
		int counter =0;
		double sum =0.0;
		 char[] array = new char[100];
		 Scanner scan1 = new Scanner(System.in);

		 /*System.out.println ( "Enter the file name along with path");
		 String fileName=scan1.nextLine();*/

		 File file = new File("C:\\Users\\supra\\OneDrive\\Pictures\\JAVAPROGRAMS\\Input.txt");
		 try
		 {
		 FileReader scan = new FileReader(file);
		 scan.read(array);
		 System.out.println(array);

	 	 }
	 	catch ( IOException e)
	 	{
			System.out.println(e);


	}

		}
}