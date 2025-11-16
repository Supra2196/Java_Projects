import java.util.Scanner;
class  stringExcercise1
{
   public static void main(String args[])
   {
	   /*Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the String");
	   String str = scan.nextLine();
	   System.out.println(str);

	   //Split the string to char
	   System.out.println("String to Char split	");
	   for(int i=0; i<str.length();i++)
	   {
		   System.out.println(str.charAt(i));
	   }
	   String reverse = new String();
	   System.out.println("String to Char reverse ");
	   for(int i =str.length()-1; i>=0; i--)
	   {
		   System.out.println(str.charAt(i));
		   reverse=reverse+str.charAt(i);
	   }
	   System.out.println("Given String"+str);
	   System.out.println("Reversed String"+reverse);
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the String");
	   String str = scan.nextLine();
	   System.out.println("Enter the Char to be searched");
	   char ch = scan.next().charAt(0);
	   int i=0,index=0;
	   System.out.println ("indexOf  "+ str.indexOf(ch));
	   System.out.println ("lastIndexOf  "+str.lastIndexOf(ch));
	   if (str.indexOf(ch) != str.lastIndexOf(ch) && str.indexOf(ch) !=-1)
	   {
	   while(true)
	   {
		   if (str.indexOf(ch,index)!=-1)
		   {
			   index=str.indexOf(ch,index);
			   System.out.println(" Index " + index);
			   index++;
	   			i++;
	   	   }
	   	   else if (str.indexOf(ch,index)==-1)
	   	   break;
	   	   }
	   }
	      else if (str.indexOf(ch) !=-1)
	      {
	   			i++;
	   	  }
	   	  System.out.println ("Number of "+ch+ " is " + i + " in "+ str);
	   	  Scanner scan = new Scanner(System.in);
	   	  System.out.println("Enter the first String");
	   	  String str = scan.nextLine();
	   	  System.out.println("Enter the second String");
	   	  String str1 = scan.nextLine();
	   	  str1=str.concat(str1);
	   	  System.out.println("Lower Case:"+str1.toLowerCase());
	   	  System.out.println("Upper Case:"+str1.toUpperCase());
	   	  System.out.println("String length:"+str1.length());
	   	  System.out.println("Enter the first index for substring functionality");
	   	  int index1= scan.nextInt();
	   	  System.out.println("Enter the second index for substring functionality");
	   	  int index2= scan.nextInt();
	   	  System.out.println(str1.substring(index1,index2));
		String str = new String("This1234 testing1234 program");
		System.out.println("Original Str "+str);
		String[] words= str.split("\\s");
		System.out.println("\n\nSplited Lines displayed");
		String[] lines =str.split("\\n");
		for(int i =0; i<lines.length;i++)
		{
			System.out.println(lines[i]);
		}
		System.out.println("Number of characters in String: "+str.length());
		System.out.println("Number of words in String: "+words.length);
		System.out.println("Number of lines in String: "+lines.length);

		String[] tabs = str.split("\\t");
		System.out.println(" Tabs "+ tabs.length);
		String[] digits = str.split("\\d{4}");
		System.out.println("Digits "+ digits.length);
		for(int i=0; i<digits.length;i++)
		{
			System.out.println(digits[i]);
		}
		Scanner scan1 = new Scanner(str).useDelimiter("\\s*testing\\s*");
		while(scan1.hasNext())
		{
			System.out.println(scan1.next());
		}
		Scanner scan = new Scanner(System.in);
		String str  = "This is testing program, this is for testing the program";
		String str1 = "This testing program";
		String str2 = "This123 testing123 program TESTING Testing tESTING";
		System.out.println("Original String "+str);
		System.out.println(str.replace(" is "," are "));
		System.out.println(" Original String "+str1);
		System.out.println(str1.replaceAll("\\s", "_"));
		System.out.println("Original String "+str2);
		System.out.println(" Digit replace " +str2.replaceAll("(?i)\\d{3}",""));
		System.out.println(" 123 replace "+str2.replaceAll("123",""));
		System.out.println(" testing replace " +str2.replaceAll("(?i)testing","Java"));
		int[] a = {10,20,30,40,50,60};
		int minInd, minVal;
		for(int i=0; i<a.length-1;i++)
		{
			minInd=i;
			minVal=a[i];
			System.out.println("I:"+i);
			System.out.println("Before min Index :"+minInd);
			System.out.println("Before min Index value :"+minVal);
			for(int j=i+1; j<a.length;j++)
			{
				if(a[j]<minVal)
				{
					minInd=j;
					minVal=a[j];
				}
			}
			System.out.println("After min Index: "+minInd);
			System.out.println("After min Index value: "+minVal);
			a[minInd]=a[i];
			a[i]=minVal;
		}
		for(int x:a)
		System.out.println(x);
		int [] a = {30,20,50,40,10};
		int b;
		//Before Sort
		for(int i =0; i<a.length;i++)
		System.out.println(a[i]);
		//Sort
		for(int i =0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					System.out.println("Before value  a["+i+"]=" +a[i] + " a["+j+"] "+a[j] );
					b=a[j];
					a[j]=a[i];
					a[i]=b;
					System.out.println ("After value  a["+i+"]="+ a[i]+" a["+j+"]=" + a[j]);
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		int a[] = {10,20,30,50,40,60,70,-1,-5};
		int min=0;
		int max=0;
		int sum=0;
		int avg=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the search element");
		int search = scan.nextInt();
		for(int i =0; i<a.length;i++)
		{
			if(search == a[i])
			{
				System.out.println("Search valu is found in "+i+"index of array value is"+a[i]);
			}
			if(i==0)
			{
				min=a[0];
				max=a[0];
			}
			if(min<a[i])
			min=a[i];
			if(max>a[i])
			max=a[i];
			sum+=a[i];
			System.out.println(a[i]);
		}
		System.out.println("Min value is: "+min);
		System.out.println("Max value is: "+max);
		System.out.println(" Sum is:  "+sum);
		System.out.println(" Avg is:  "+sum/a.length);

   }
}