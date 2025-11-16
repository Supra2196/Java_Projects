import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class JBExperiment2
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
		 FileWriter filePrint = new FileWriter(file1);
		 while(scan.hasNextLine())
		 {
		 str=scan.nextLine();
		 counter++;
		 String vari = counter+":"+str.length() + " "+ str + "\n";
		 filePrint.write(vari,0,vari.length());
	 	 }
	 	String varidos = "Total number of lines are "+counter +"\n";
	 	filePrint.write(varidos,0,varidos.length());
		filePrint.close();
	 	}
	 	catch (IOException e)
	 	{
			System.out.println(e);
		}



	}

}