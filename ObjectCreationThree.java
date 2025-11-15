class PlayerDetails
{
	String name;
	String position;
	double height;
	String club;
	String nationality;
}
public class ObjectCreationThree
{
    public static void main(String[] args)
    {
	PlayerDetails PDOBJ= new PlayerDetails();
	PDOBJ.name="Manvik Phillips";
	PDOBJ.position="FW";
	PDOBJ.height=182.88;
	PDOBJ.club="LA Galaxy";
	PDOBJ.nationality="Trinidad and Tobago"


	System.out.println("Name:"+PDOBJ.name);
	System.out.println("Position:"+PDOBJ.position);
	System.out.println("Height:"+PDOBJ.height);
	System.out.println("Team:"+PDOBJ.club);
	System.out.println("Nationality:"+PDOBJ.club);

    }
 }