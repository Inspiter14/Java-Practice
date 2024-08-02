import java.util.Scanner;

class Boxq
{
	double width;
	double height;
	double depth;
	
	Boxq()
	{
		width=10;
		height=10;
		depth=10;
	}
	Boxq(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	double vol()
	{
		double v=width*height*depth;
		return v;
	}
}

class Box
{
	public static void main(String[]ar)
	{
		Boxq b1=new Boxq();
		b1.width=10;
		b1.height=10;
		b1.depth=10;
		System.out.println("Box: "+b1.width+" "+b1.height+" "+b1.depth);
        Boxq b2=new Boxq();
		System.out.println("Box: ")
	}
}