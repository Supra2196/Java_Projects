public class ScopeTest1
{

	public static String Variablereturn(int localVar,int globalVar)
	{
		return " Local Variable:"+localVar+" Global Variable:"+globalVar;
	}
	static int globalVar=10;
public static void main(String[] args)
{
	int localVar=5;
	System.out.println("Results:"+Variablereturn(localVar,globalVar));

}
}