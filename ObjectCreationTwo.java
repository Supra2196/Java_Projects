class PlayerDetails
{
	String name;
	String position;
	String team;
	double height;
	double weight;
	String college;
}
public class ObjectCreationTwo
{
    public static void main(String[] args)
    {
		PlayerDetails PDOBJ= new PlayerDetails();
		PDOBJ.name="Narain Shawn";
		PDOBJ.position="SG";
		PDOBJ.team="San Antonio Spurs";
		PDOBJ.height=195.58;
		PDOBJ.weight=97.7;
		PDOBJ.college="University of Houston";
		System.out.println("Name:"+PDOBJ.name);
		System.out.println("Position:"+PDOBJ.position);
		System.out.println("College:"+PDOBJ.college);
		System.out.println("Height:"+PDOBJ.height);
		System.out.println("Weight:"+PDOBJ.weight);
		System.out.println("Team:"+PDOBJ.team);
    }
 }