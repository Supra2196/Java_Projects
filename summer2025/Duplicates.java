import java.util.Scanner;

public class Duplicates {

    // Palindrome check method using for loop
    public static String user_palindrome(String inputy)
    {
        String reversed = "";
        for (int i = inputy.length() - 1; i >= 0; i--)
        {
            reversed += inputy.charAt(i);
        }

        if (inputy.equals(reversed))
        {
            return "Palindrome Confirmed";
        }
        else
        {
            return "Palindrome Denied";
        }
    }

    public static void main(String[] args)
    {
        /*PALINDROME NUMBI
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a string: ");
        String userinput = scan.nextLine();
        String result = user_palindrome(userinput);
        System.out.println(result);*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int userinput=scanner.nextInt();

    }
}
