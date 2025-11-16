import java.util.*;

public class ExamThreeQuestion2
{
    public static void main(String[] args)
    {
		//Variables
        boolean movieRet;
        double movieCost;
        String movieName, badData;
        //Ask user for movie name
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a movie name:");
        movieName = scan.nextLine();
		//Ask user for decimal number
        System.out.println("Enter a decimal:");
        //If its not a decimal try again and store in badData
        while (!scan.hasNextDouble())
        {
            System.out.println("Please enter a decimal number like 10.50");
            badData = scan.nextLine();
            System.out.println("Enter a decimal:");
        }
        //Store it in movieCost
        movieCost = scan.nextDouble();
		// Calling variable and its parameters
        movieRet = movieInfo(movieName, movieCost);
        if (movieRet)
            System.out.println("Success!");
        else
            System.out.println("Failure!");

        scan.close(); // good practice to close Scanner
    }
    //Uses a boolean to call parameters
    public static boolean movieInfo(String sPassed, double dPassed)
    {
        System.out.println("In movieInfo()");
        return true;
    }
}
