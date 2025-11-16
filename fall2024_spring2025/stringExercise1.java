import java.util.Scanner;

class stringExercise1
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		//System.out.println(str);

		//Split the string to char
		System.out.println ("String to Char split ");
		for ( int i=0;i< str.length();i++)
		{
			System.out.println (str.charAt(i));
		}
		String reverse=new String();
		System.out.println ("String to Char reverse ");
		for ( int i=str.length()-1;i>=0 ;i--)
		{
			System.out.println (str.charAt(i));
			reverse=reverse+str.charAt(i);
		}
		System.out.println ("Given String "+str);
		System.out.println ("Reversed String "+reverse);
	}
}