import java.util.Scanner;
public class LetterCounter
{
    public static void main(String[] args)
    {
		int wordcounter =0;
		int sentencecounter=0;
		int a_counter =0;
		int e_counter =0;
		int i_counter =0;
		int o_counter =0;
		int u_counter =0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a paragraph");
		String input = scan.nextLine();
		input = input.trim();
		for(int i=0; i<input.length();i++)
		{
			if(input.charAt(i)==' ')
			{
				wordcounter=wordcounter+1;
			}
			if(input.charAt(i)=='.')
			{
				sentencecounter=sentencecounter+1;
			}
			/*System.out.println("\n Alphabet is "+input.charAt(i));
			switch(input.charAt(i))
			{
				//Captial Letters
				case 'A':
				{
				a_counter=a_counter+1;
				System.out.print("\nA");
				break;
				}
				case 'E':
				{
				e_counter=e_counter+1;
				/*System.out.print("\nE");
				break;
				}
				case 'I':
				{
				i_counter=i_counter+1;
				System.out.print("\nI");
				break;
				}
				case 'O':
				{
				o_counter=o_counter+1;
				System.out.print("\nO");
				break;
			    }
				case 'U':
				{
				u_counter=u_counter+1;
				System.out.print("\nU");
				break;
			    }
				case 'a':
				{
				a_counter=a_counter+1;
				System.out.print("\na");
				System.out.print("\n"+a_counter);
				break;
				}
				case 'e':
				{
				e_counter=e_counter+1;
				System.out.print("\ne");
				break;
				}
				case 'i':
				{
				i_counter=i_counter+1;
				System.out.print("\ni");
				break;
				}
				case 'o':
				{
				o_counter=o_counter+1;
				System.out.print("\no");
				break;
				}
				case 'u':
				{
				System.out.print("\nu");
				u_counter=u_counter+1;
				System.out.print("\n"+u_counter);
				break;
				}
			}
			//System.out.println("\n fetching next character");*/
		}
		int lastletter =input.length()-1;
		if(input.charAt(lastletter)!=' ')
			{
				wordcounter=wordcounter+1;
			}
		System.out.println("Total number of words "+wordcounter);
		System.out.println("Total number of sentences "+sentencecounter);
		//int total_counter=a_counter+e_counter+i_counter+o_counter+u_counter;
		/*System.out.println("The total number of vowels are "+total_counter);*/
    }
}