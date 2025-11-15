import java.util.Scanner;
class Details
{
	String name;
	String category;
	int height;
	int weight;
	int bench;
	int squat;
	int deadlift;
}
public class MiniProjectone
{
    public static void main(String[] args)
    {
		Details PDOBJ= new Details();
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter your name");
		String username=scan.nextLine();
		PDOBJ.name=username;

		System.out.print("Enter your category");
		String category=scan.nextLine();
		PDOBJ.category=category;2

		System.out.println("Enter your height");
		int height=scan.nextInt();
		PDOBJ.height=height;

		System.out.println("Enter your weight");
		int weight=scan.nextInt();
		PDOBJ.weight=weight;

		System.out.println("Enter your bench");
		int bench=scan.nextInt();
		PDOBJ.bench=bench;

		System.out.println("Enter your squat");
		int squat=scan.nextInt();
		PDOBJ.squat=squat;

		System.out.println("Enter your deadlift");
		int deadlift=scan.nextInt();
		PDOBJ.deadlift=deadlift;

    }
 }