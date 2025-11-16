public class klassy{
public static void main(String[] args)
{
//Program 1
   /*int a=1;
   while(a<=10)
   {
	   System.out.println("Numbers are "+a++);
   }*/
   //Program 2
   Scanner scan = new Scanner();
   System.out.println("Enter a number");
   int userinput = scan.nextInt();
   while(userinput>=0)
   {
	   System.out.println("Result is"+userinput*(userinput+userinput));
   }

}
}
