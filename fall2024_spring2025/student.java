public class student
{
  private int sid;
  private String sname;
  private course studentcourse;
public student(int sid,String sname,int courseid, String courseName)
{
    this.sid=sid;
    this.sname=sname;
    this.studentcourse= new course(courseid,courseName);
}
public int getsid()
{
	return this.sid;
}
public String getsname()
{
  return this.sname;
}
public course getstudentCourse()
{
	return this.studentcourse;
}
public void setsid(int sid)
{
	this.sid=sid;
}
public void setsname(String sname)
{
	this.sname=sname;
}
public void setstudentCourse(course c)
{
	this.studentcourse= c;
}

}




