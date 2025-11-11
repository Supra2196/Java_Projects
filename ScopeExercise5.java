public class ScopeExercise5
{
    public static int printNumbers(int XD, int YD)
    {
        int x = 5;
        int y = 5;
        return x + y;
    }

    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;  // initialize

        if (printNumbers(x, y) > 0)
        {
            System.out.println("Sum = " + printNumbers(x, y));
        }

    }
}
