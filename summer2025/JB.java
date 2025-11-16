class Prabhu//SUPERCLASS
{
String college;
String major;
Prabhu()
{
	System.out.println("Prabhu Default constructor");
}
Prabhu(String x,String y)
{
   college=x;
   major=y;
   System.out.println(college);
   System.out.println(major);
}
void listenmusic()
{
   System.out.println("Prabhu prefers Semi Western Classical");
}

}
class Sudarshan extends Prabhu//SUBCLASS
{

Sudarshan(String a,String b)
{
	super(a,b);
}
void listenmusic()
{
   System.out.println("Sudarshan prefers Hip Hop/Pop");
   super.listenmusic();
}
}
public class JB
{
   public static void main(String[] args)
   {
   Prabhu obj= new Prabhu("SASTRA","Electrical Engineering");
   obj.listenmusic();
   Sudarshan sushi=new Sudarshan("NORTHWESTERN","Finance");
   sushi.listenmusic();
   }
}