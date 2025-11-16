class grades
{
	//Attributes
	int studentid;
	String sname;
	int marks1;
	int marks2;
	int marks3;
	//Default Constructor
	grades()
	{
		int studentid=0;
		String sname=null;
		int marks1=0;
		int marks2=0;
		int marks3=0;
	}
	//Non Default Constructor
	grades(int studentid, String sname, int marks1, int marks2, int marks3)
	{
		this.studentid=studentid;
		this.sname=sname;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	//Getters or Acessors
	public int getstudentid()
	{
		return this.studentid;
	}
	public String getsname()
	{
		return this.sname;
	}
	public int getmarks1()
	{
		return this.marks1;
	}
	public int getmarks2()
	{
		return this.marks2;
	}
	public int getmarks3()
	{
		return this.marks3;
	}
	//Setters or Mutators
	public void setstudentid(int studentid)
	{
		this.studentid=studentid;
	}
	public void setsname(String sname)
	{
		this.sname=sname;
	}
	public void setmarks1(int marks1)
	{
		this.marks1=marks1;
	}
	public void setmarks2(int marks2)
	{
		this.marks2=marks2;
	}
	public void setmarks3(int marks3)
	{
		this.marks3=marks3;
	}
	public String toString()
	{
		return this.studentid+" "+this.sname+" "+this.marks1+" "+this.marks2+" "+this.marks3;
	}
	public static void main(String[] args)
	{
		grades grade= new grades(112001,"Ranga",95,85,75);
		System.out.println(grade);
	}
}