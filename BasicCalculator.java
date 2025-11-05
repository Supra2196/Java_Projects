import java.util.Scanner;

public class BasicCalculator
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.print("Number:");
       int numberone=scan.nextInt();
       System.out.print("Number:");
       int numbertwo=scan.nextInt();
       scan.nextLine();
       System.out.print("Operator(+,-,X,/):");
       String sign=scan.nextLine();

       if(sign.equals("+"))
       {
		   System.out.println("Sum:"+add(numberone,numbertwo,sign));
	   }
	   else if(sign.equals("-"))
	   {
		   System.out.println("Difference:"+sub(numberone,numbertwo,sign));
	   }
	   else if(sign.equals("X"))
	   {
		   System.out.println("Product:"+mult(numberone,numbertwo,sign));
	   }
	   else if(sign.equals("/"))
       {
		   System.out.println("Quotient:"+div(numberone,numbertwo,sign));
	   }
    }
    public static  double add(double numbione,double numbitwo,String operator)
    {
			return numbione+numbitwo;
	}
	public static  double sub(double numbione,double numbitwo,String operator)
	{
			return numbione-numbitwo;
	}
	public static  double mult(double numbione,double numbitwo,String operator)
	{
			return numbione*numbitwo;
	}
 	public static  double div(double numbione,double numbitwo,String operator)
 	{
		   return numbione/numbitwo;
	}
}
