public class Footballer
{
public static void main(String[]Args)
{
	FootballPlayer player = new FootballPlayer();
	System.out.println(player.GetfirstName()+" "+player.GetlastName());
	System.out.println("Position:"+player.Getposition());
	System.out.println("Club:"+player.Getclub());
	System.out.println("Goals:"+player.Getgoals());
	System.out.println("Assists:"+player.Getassists());
}
}
class FootballPlayer
{
	//Attributes
	private String firstName= "Andrew";
	private String lastName= "Chanderpaul";
	private String position= "ST";
	private String club= "FC Barcelona";
	private int goals=150;
	private int assists=90;
	//Class
	public FootballPlayer()
{
	String firstName = "Andrew";
	String lastName= "Chanderpaul";
	String position= "ST";
	String club= "FC Barcelona";
	int goals=150;
	int assists=90;
}
	//Getters
	public String GetfirstName()
	{
		/*System.out.print("First Name[firstname() is called]:");*/
		return firstName;
	}
	public String GetlastName()
	{
		/*System.out.print("Last Name[lastname() is called]:");*/
		return lastName;
	}
	public String Getposition()
	{
		/*System.out.print("Position[position() is called]:");*/
		return position;
	}
	public String Getclub()
	{
		//System.out.print("Club[Club() is called]:");
		return club;
	}
	public int Getgoals()
	{
		//System.out.print("Goals[goals() is called]:");
		return goals;
	}
	public int Getassists()
	{
		//System.out.print("Assists[assists() is called]:");
		return assists;
	}



}