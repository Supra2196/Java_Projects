import java.util.Vector;
import java.util.Scanner;
public class EXTRASTUFF
{
public static void main(String[] args)
{
	/*Vector<String>names = new Vector<>();
	names.add("John");
	names.add("Emma");
	names.add("Liam");
	System.out.println("Vector contents:"+names);
	System.out.println("First name:"+names.get(0));*/
	/*int numone=10;
	int numtwo=100;
	for(int i=numone;i<=numtwo;i++)
	{
		int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
		{
			count=count+1;
		}
		}
	if(count==2)
	{
		System.out.print(i+",");
	}*/
	Scanner scan = new Scanner(System.in);
	System.out.print("Input:");
	int ui=scan.nextInt();
	int b=1;
	for(int a=0;a<=ui;a++)
	{
		System.out.print(a+b);
	}
}
}