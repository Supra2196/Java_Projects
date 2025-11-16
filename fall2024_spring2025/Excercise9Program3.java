import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
class Excercise9Program3
{
	public static void main (String args[])
	{
		int counter =0;
		String str = new String();
		 Scanner scan1 = new Scanner(System.in);
		 /*System.out.println ( "Enter the file name along with path");
		 String fileName=scan1.nextLine();*/
		 File file = new File("C:\\Users\\supra\\OneDrive\\Pictures\\JAVAPROGRAMS\\Start.txt");
		 File file1 = new File("C:\\Users\\supra\\OneDrive\\Pictures\\JAVAPROGRAMS\\NewStart.txt");
		 try
		 {
		 Scanner scan = new Scanner(file);
		 PrintWriter filePrint = new PrintWriter(file1);
		 while(scan.hasNextLine())
		 {
		 str=scan.nextLine();
		 counter++;
		 filePrint.println(counter+":"+ " "+ str+ " Length of the string is "+str.length());

	 	 }

	 	 filePrint.close();
	 	}
	 	catch ( FileNotFoundException e)
	 	{
			System.out.println(e);
		}



	}

}