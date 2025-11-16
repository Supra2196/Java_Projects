import java.util.Scanner;
class Employee
{
	private int id;
	private String name;
	private int salary;

	public void setDetails(int I, String N, int S)
	{
		if(I>=1 && I<=9999)
		{
			id=I;
		}
		name=N;
		if(S>=70000 && S<=270000)
		{
			salary=S;
		}
	}
	public Employee(int I, String N, int S)
		{
			setDetails(I,N,S);
		}

	public String showDetails()
	{
		return String.format("Id:"+id+" Name:"+name+" Salary:"+salary);
	}
}

public class EmployeeDetails
{

	public static void main(String[] args)
	{
		Employee wobj= new  Employee(5821,"Devaraj",171000);
		System.out.println(wobj.showDetails());

	}
}