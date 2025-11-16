//Identifying and catergorzing Organization
import java.util.Scanner;
public class CompanyStation
{
  public static void main(String[] args)
  {
    final int MAXCHAR =1000;
    final double MIN =-3.56;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a company name");
    String companyName = scan.nextLine();
    switch(companyName.charAt(0))
    {
      case'A':
      case'a':
      System.out.println("American inc");
      break;
      case'B':
      case'b':
      System.out.println("Bearings ltd");
      break;
      default:
      System.out.println("Unknown Company");
      break;
    }
    System.out.println("Your company contains the letters " + companyName.length() );
    //h
    String garbage;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a user input");
    while(true)
    {
      while(!scan.hasNextDouble())
    {
      garbage = scan.nextLine();
      System.out.println("Please try again ");
    }
    double xy=scan.nextDouble();
    if(xy<=MIN)
    {
      System.out.println("Number too small");
    }
    else if(xy>MIN)
    {
      System.out.println("Thank you for giving a good number"+xy);
      break;
    }

    }

  }
  }
