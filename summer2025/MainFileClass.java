import java.util.Scanner;
import java.io.File;
public class MainFileClass
{
public static void main(String[]args)
{
	//Ask User for Location
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter File name15");
	String filename= scan.nextLine();
	FileCreator obj= new FileCreator(filename);

	Scanner scantwo= new Scanner(System.in);
	obj.WriteHeader();
	for(int i=0;i<5;i++)
	{
		//Location
		System.out.print("Location:");
		String location= scan.nextLine();
		//January Sales
		System.out.print("January Sales:");
		double janny = scantwo.nextDouble();
		// February Sales
		System.out.print("February Sales:");
		double febby = scantwo.nextDouble();
		// March Sales
		System.out.print("March Sales:");
		double marchy = scantwo.nextDouble();
		// April Sales
		System.out.print("April Sales:");
		double aprily = scantwo.nextDouble();
	obj.WriteFile(location,janny,febby,marchy,aprily);
	}
	obj.CloseFile();

}
}