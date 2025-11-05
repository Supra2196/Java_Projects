import java.util.Scanner;
public class GradeProject
{
public static void main(String[]args)
{
	String grade="";
	Scanner scan = new Scanner(System.in);
	System.out.print("Name:");
	String name=scan.nextLine();
	System.out.print("Enter your score for first exam:");
	double exam_uno=scan.nextDouble();
	System.out.print("Enter your score for second exam:");
	double exam_dos=scan.nextDouble();
	System.out.print("Enter your score for third exam:");
	double exam_tres=scan.nextDouble();
	System.out.println("=============");
	System.out.println("Name:"+name);
	System.out.println("Exam 1:"+ exam_uno);
	System.out.println("Exam 2:"+ exam_dos);
	System.out.println("Exam 3:"+ exam_tres);
	System.out.println("Score:"+average(exam_uno,exam_dos,exam_tres));
	if(average(exam_uno,exam_dos,exam_tres)>=90)
	{
		System.out.println("Grade:A");
	}
	else if(average(exam_uno,exam_dos,exam_tres)>80&&average(exam_uno,exam_dos,exam_tres)<=89)
	{
		System.out.println("Grade:B");
	}
	else if(average(exam_uno,exam_dos,exam_tres)>=60&&average(exam_uno,exam_dos,exam_tres)<=79)
	{
		System.out.println("Grade:C");
	}
	else if(average(exam_uno,exam_dos,exam_tres)>40&average(exam_uno,exam_dos,exam_tres)<=59)
	{
		System.out.print("Grade:D");
	}
	else
	{
		System.out.println("Grade:F");
	}

}
	public static double average(double exam_one,double exam_dos,double exam_tres)
	{
		return ((exam_one+exam_dos+exam_tres)/3);
	}

}