import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class JBExperiment
{
	public static void main (String args[])
	{
		 Scanner scan1 = new Scanner(System.in);
		 /*System.out.println ( "Enter the file name along with path");
		 String fileName=scan1.nextLine();*/
		 File file = new File("C:\\Users\\supra\\OneDrive\\Pictures\\JAVAPROGRAMS");
		 try
		 {

		 Scanner scan = new Scanner(System.in);
		if(file.exists() && file.canRead() && file.canWrite()&&!file.isDirectory())
		{
			System.out.println("Do you want to delete this file? Yes or No");
			String str = scan.nextLine();
			if(str.equals("Yes"))
			{
				if(file.delete())
				System.out.println("File is deleted");
				else
				System.out.println("Problem has been detected!");
			}

		}
		else if(!file.exists())
		{
			file.createNewFile();
			System.out.print("File didnt exits. I made a file for u"+file);
		}
		else if(file.isDirectory())
		{
			String[] listI=file.list();
			for(int i =0; i < listI.length; i++)
			{
				System.out.println(listI[i]);
			}
		}

		 //System.out.println(scan.nextDouble());
	 	}
	 	catch (Exception e)
	 	{
			System.out.println(e);
		}


	}

}