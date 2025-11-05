import java.util.Scanner;

public class Stringrepeater
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input String: ");
        String stringy = scan.nextLine();
        System.out.print("Input Number: ");
        int number = scan.nextInt();
        System.out.println("Output: " + repetition(stringy, number));
        scan.close();
    }

    public static String repetition(String text, int times)
    {
        return text.repeat(times);
    }
}