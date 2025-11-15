class PlayerDetails
{
	String name;
	double height;
	double weight;
	String Category;
	int Yearsoftraining;
	int Personalbestlift;
}
public class ObjectCreationFive
{
    public static void main(String[] args)
    {
	PlayerDetails PDOBJ= new PlayerDetails();
	PDOBJ.name="Garry Deo";
	PDOBJ.height=71;
	PDOBJ.weight=200;
	PDOBJ.Category="Classic Physique";
	PDOBJ.Yearsoftraining=6;
	PDOBJ.Personalbestlift=225;


	System.out.println("Name:"+PDOBJ.name);
	System.out.println("Height:"+PDOBJ.height);
	System.out.println("Weight:"+PDOBJ.weight);
	System.out.println("Category:"+PDOBJ.Category);
	System.out.println("Years of training:"+PDOBJ.Yearsoftraining);
	System.out.println("Personal best lift:"+PDOBJ.Personalbestlift);

    }
 }