import java.util.Scanner;
import java.lang.Math;
public class JAVAPROGRAMS
{
    public static void main(String[] args) {
		/*32
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first integer");
        int userinputone = scan.nextInt();
        System.out.println("Input second integer");
        int userinputtwo = scan.nextInt();
        if (userinputone != userinputtwo)
		{
			System.out.println(userinputone+"!="+userinputtwo);
		}
       else if(userinputone < userinputtwo)
        {
			System.out.println(userinputone+"<"+userinputtwo);
			System.out.println(userinputone+"<="+userinputtwo);
		}*/
		/*34
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the length of a side:");
		double length = scan.nextDouble();
		double s = length;
		double area = (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is: " + area);*/
        /*35
        Scanner scan = new Scanner(System.in);
		System.out.println("Input the number of sides on the polygon: ");
		int n = scan.nextInt();
		System.out.println("Input the length of one of the sides: ");
		int s = scan.nextInt();
		System.out.println("The area is "+  (n*(s*s))/(4*Math.tan(Math.PI/n))   );*/
		/*36
		Scanner scan = new Scanner(System.in);
		//Declare User Input
		Scanner scan = new Scanner(System.in);
		// Declare Radius of the Earth in kilometers
		double radius = 6371.01;
		// Latitude and Longitude of Coordinate 1
		System.out.println("Input the latitude of coordinate 1 (in degrees):");
		double x1 = scan.nextDouble();
		double lati1 = Math.toRadians(x1);
		System.out.println("Input the longitude of coordinate 1 (in degrees):");
		double y1 = scan.nextDouble();
		double long1 = Math.toRadians(y1);
		// Latitude and Longitude of Coordinate 2
		System.out.println("Input the latitude of coordinate 2 (in degrees):");
		double x2 = scan.nextDouble();
		double lati2 = Math.toRadians(x2);
		System.out.println("Input the longitude of coordinate 2 (in degrees):");
		double y2 = scan.nextDouble();
		double long2 = Math.toRadians(y2);
		// Calculation using the Haversine formula
		double calculation = Math.acos(Math.sin(lati1) * Math.sin(lati2)+ Math.cos(lati1) * Math.cos(lati2) * Math.cos(long1 - long2));
		double d = radius * calculation;
		System.out.println("The distance between those points is: " + d + " km");*/
		/*37
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a string: ");
		String userinput = scan.nextLine();
		String originalStr = userinput;
		String reversedStr = "";
		for (int i = 0; i < originalStr.length(); i++)
		{
		  reversedStr = originalStr.charAt(i) + reversedStr;
		}
		System.out.println("Reversed string: "+ reversedStr);*/

		/*48
		for (int i = 1; i < 100(); i++)
		{
			if(i%2 !=0)
			System.out.println(i):
		}*/

		/*49
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number:");
		int n = in.nextInt();
		if(n%2 == 0)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}*/

        /*52
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number");
        int userinputone = scan.nextInt();
        System.out.println("Input the second number");
        int userinputtwo= scan.nextInt();
		System.out.println("Input the third number");
        int userinputhird= scan.nextInt();
        if(userinputhird == userinputone+userinputtwo)
        {
			System.out.println("The result is:true");
		}
        else
        {
			System.out.println("The result is:false");
		}*/
		/*53
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the first number");
		int userinputone = scan.nextInt();
		System.out.println("Input the second number");
		int userinputtwo = scan.nextInt();
		System.out.println("Input the third number");
		int userinputthird = scan.nextInt();
		if(userinputthird==userinputone+userinputtwo)
		{
			System.out.println("The result is: true");
		}
		else
		{
			System.out.println("The result is: false");
		}*/
		/*58
		Scanner scan = new Scanner(System.in);

        System.out.println("Input a word:");
        String wordone = scan.nextLine().toUpperCase();

        System.out.println("Input a word:");
        String wordtwo = scan.nextLine().toUpperCase();

        System.out.println("Input a word:");
        String wordthree = scan.nextLine().toUpperCase();

        System.out.println("Input a word:");
        String wordfour = scan.nextLine().toUpperCase();

        System.out.println("Input a word:");
        String wordfive = scan.nextLine().toUpperCase();

        System.out.println("Input a word:");
        String wordsix = scan.nextLine().toUpperCase();*/

		/*61
		Scanner scan = new Scanner(System.in);
        System.out.print("Input a word: ");
        String userinput = scan.nextLine();

        String result = ""; // Store the reversed word
        for (int i = userinput.length() - 1; i >= 0; i--)
        {
            result += userinput.charAt(i);
        }

        System.out.println("Reverse word: " + result);
        scan.close();*/

        /*62
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int userinputone = scan.nextLine();
        System.out.print("Input a second number: ");
        int userinputone = scan.nextLine();
        System.out.print("Input a third number: ");
        int userinputone = scan.nextLine();
        if((userinputone-userinputtwo-userinputthree)>20 )
        {
			System.out.println("True");
		}

		else if((userinputone-userinputtwo-userinputthree)<20 )
		{
			System.out.println("False");
		}*/
		/*62
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int userinputone = scan.nextLine();
        System.out.print("Input a second number: ");
        int userinputtwo = scan.nextLine();
        if((userinputtwo-userinputone) < 20)
        {
			System.out.print("False");
		}
		else
		{
			System.out.print("True");
		}*/
		/*63*/
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Input a first number: ");
		 int userinputone = scan.nextInt();

		 System.out.print("Input a second number: ");
		 int userinputtwo = scan.nextInt();

		 if (userinputone > userinputtwo)
		 {
		   System.out.println(userinputone);
		 }
		 else if (userinputtwo > userinputone)
		 {
		   System.out.println(userinputtwo);
		 }
		 else
		 {
		    System.out.println("0");
		 }
		 System.out.println("Userinputone remainder is: " + (userinputone % 6));
		 System.out.println("Userinputtwo remainder is: " + (userinputtwo % 6));

        scan.close();

		/*SPECIAL PROGRAM
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user input: ");
		int userinput = scan.nextInt();
		for(int i =1;  i<=userinput; i++)
		{
			for(int power =2; power<=50; power++)
			{
				System.out.print(","+ (Math.pow(i, power)));
			}
			System.out.println();
		}*/





    }
}
