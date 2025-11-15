class PlayerDetails
{
	String name;
	String batstyle;
	String bowlstyle;
	String club;
	int jerseynumber;
	String nationality;
}
public class ObjectCreationFour
{
    public static void main(String[] args)
    {
	PlayerDetails PDOBJ= new PlayerDetails();
	PDOBJ.name="Renesh Casyap";
	PDOBJ.batstyle="Right";
	PDOBJ.bowlstyle="Right arm Medium";
	PDOBJ.club="Chennai Super Kings";
	PDOBJ.nationality="Guyana";


	System.out.println("Name:"+PDOBJ.name);
	System.out.println("Batting Style:"+PDOBJ.batstyle);
	System.out.println("Bowling Style:"+PDOBJ.bowlstyle);
	System.out.println("Team:"+PDOBJ.club);
	System.out.println("Nationality:"+PDOBJ.club);

    }
 }