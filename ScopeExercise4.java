public class ScopeExercise4
{
    public static int multiplyByTwo(int num)
    {
		return num*2;
        // Multiply num by 2 and print inside this method
        // Check if the original variable in main changes or not
    }

    public static void main(String[] args)
    {
        int number = 10;
        int changed=multiplyByTwo(number);
        if(changed==number)
        {
			System.out.println(number+"Has not changed");
		}
		else
		{
			System.out.println(number+" has changed and equals "+changed);
		}
        // Call multiplyByTwo(number)
        // Print number here to see if it changed
    }
}
