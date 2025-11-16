import java.util.Scanner;
public class StringTestSPJB
{
public static void main(String[] args)
{
	String a = "aaWelcome to java";
	System.out.println(a.length());
	/*System.out.println(a.indexOf('p'));
	System.out.println(a.indexOf('p',a.indexOf('p')+1));*/
	for(int i=0,index =-1;i<=a.length()  ;i++)
	{
		index=a.indexOf('a',index+1);
		//System.out.println(" index "+index);

		if ( index==-1) { System.out.println("i=" +i); break; }
		/*if(i>3)
		{
			index=-1;
		}*/
	}

}
}
