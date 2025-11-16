import java.util.Arrays;
public class QuestionOne
{
public static void main(String[] args)
{
/*int a1[] = {10,20,30,40,50};
int a2[] = {1,2,3,4,5};
int Var =0;
int length[] = new int[a1.length+a2.length];
	for(int i =0; i<a1.length; i++)
	{
		length[Var]=a1[i];
		Var++;
	}
	for(int i =0; i<a2.length; i++)
	{
		length[Var] = a2[i];
		Var++;
	}
System.out.println(Arrays.toString(length));*/
//Array Reverse
int a[] = {1,2,3,4,5,6};
int max= a.length;
for(int i =0; i< max/2; i++)
{
	int temp = a[i];
	a[i] = a[max - i - 1];
	a[max - i - 1] = temp;
}
System.out.println(Arrays.toString(a));
}
}
