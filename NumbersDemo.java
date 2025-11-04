public class NumbersDemo
{
    public static void main(String[] args)
    {
		int number=6;
		int twice=displayTwiceTheNumber(number);
		System.out.println(number+"*2 ="+twice);
		int plusfive=displayNumberPlusFive(number);
		System.out.println(number+"+5 ="+plusfive);
		int squared=displayNumberSquared(number);
		System.out.println(number+"^2 ="+squared);

    }
    static int displayTwiceTheNumber(int twicey)
    {
		return twicey*2;
	}
	static int displayNumberPlusFive(int addfive)
	{
		return addfive+5;
	}
	static int displayNumberSquared(int squared)
	{
		return squared*squared;
	}
}