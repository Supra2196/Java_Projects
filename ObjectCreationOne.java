class PlayerDetails
{
	String name;
	String position;
	String college;
	double height;
	double weight;
	double speed;
}
public class ObjectCreationOne
{
    public static void main(String[] args)
    {
		PlayerDetails PDOBJ= new PlayerDetails();
		PDOBJ.name="Deo Shawn";
		PDOBJ.position="WR";
		PDOBJ.college="Michigan State University";
		PDOBJ.height=182.88;
		PDOBJ.weight=85;
		PDOBJ.speed=4.5;
		System.out.println("Name:"+PDOBJ.name);
		System.out.println("Position:"+PDOBJ.position);
		System.out.println("College:"+PDOBJ.college);
		System.out.println("Height:"+PDOBJ.height);
		System.out.println("Weight:"+PDOBJ.weight);
		System.out.println("Speed:"+PDOBJ.speed);
    }
 }