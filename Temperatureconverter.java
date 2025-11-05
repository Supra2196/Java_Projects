import java.util.Scanner;

public class Temperatureconverter
{


    public static void main(String[] args)
    {
	   Scanner scan = new Scanner(System.in);
	   System.out.print("Input celsius:");
       double celsius=scan.nextDouble();
       System.out.println("Its "+celsiusToFahrenheit(celsius)+"°F");
    }
  public static double celsiusToFahrenheit(double tempereature)
  {
 	 return((tempereature*1.8)+32);
  }
}