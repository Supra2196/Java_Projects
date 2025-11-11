public class ScopeExercise2
{
  static int number=100;
  public static String numberzmason(int numbery,int numberz)
  {
	  return "Static int number: "+numbery+" Main int number: "+numberz;
  }
  public static void main(String[] args)
  {
    int number=50;
    System.out.println("Results:"+numberzmason(number,number));

  }
}