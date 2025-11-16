/*//SUPERCLASS-PARENT CLASS
class Fruit
{
    String color;
    String type;

    Fruit(String x, String y)
    {
        color = x;
        type = y;
    }

    void juicability()
    {
        System.out.println("JUICEEEEE");
    }
// SUBCLASS - CHILD CLASS
class GrapeFruit extends Fruit
{
    Boolean isBitter;
    Boolean usability;
    GrapeFruit()
    {
    	super("Red", "Citrus");
    	isBitter = true;
        usability = true;
   	}

    void juicability()
        {
            System.out.println("Grapefruit");
            super.juicability();
        }
    }
}*/
//SUPERCLASS
class Car
{
    String color;
    String fueltype;

    Car(String x,String y)
    {
    	color=x;
    	fueltype=y;
    	System.out.println("Color:"+color);
    	System.out.println("Fuel:"+fueltype);
    }
    void carfunc()
    {
    	System.out.println("Car is ready to go");
    }
}
//SUBCLASS
class Jeep extends Car
{
   int year;
   boolean isawd;
   Jeep()
   {
    	super("Grey", "Gasoline");
    	year = 2025;
        isawd = true;
   }
	void carfunc()
   {
       	super.carfunc();
       	System.out.println("Jeep is ready to go,Driver");
   }

   void nitromode()
   {
   	System.out.println("It adds 50 miles to its current speed");
   }

}
public class JBCODE
{
    public static void main(String args[])
    {
        Jeep cj = new Jeep(); // ✅ Correct subclass instantiation
	    cj.carfunc();
        cj.nitromode();
    }
}

