public class Percentages
{
    public static void main(String[] args)
    {
		double numberone=2.0;
		double numbertwo=5.0;
		double answer=computePercent(numberone,numbertwo);
		System.out.println(numberone+" is "+answer+" percent of "+numbertwo);
    }
    static double computePercent(double numbone,double numbtwo)
    {
		double div=numbone/numbtwo;
		return div*100;

    }
}