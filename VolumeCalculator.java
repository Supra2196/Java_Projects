import java.util.Scanner;

public class VolumeCalculator
{
	public static double volume(double length)
	{
		return length*length*length;
	}
	public static double volume(double length,double width,double height)
	{
		return length*width*height;
	}
	public static double volume(double length,double height)
	{
		return length*length*3.14*height;
	}

    public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		System.out.print("Length:");
		double lengthy=scan.nextInt();
		System.out.print("Width:");
		double widthy=scan.nextInt();
		System.out.print("Extra Number(Height,Radius):");
		double extra=scan.nextInt();

		System.out.println("Volume of Cube:"+volume(lengthy,widthy));
		System.out.println("Volume of Cuboid"+volume(lengthy,widthy,extra));
		System.out.println("Volume of Cylinder:"+volume(lengthy,extra));
    }
}
