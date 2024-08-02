class abc
{
	int x,y;
	void set()
	{
		x=10;
		y=20;
	}
	void put()
	{
		System.out.print("x="+x);
		System.out.print("y="+y);
	}
	
}
class xyz extends abc{
	int x,z;
	void inti()
	{
		x=40;
		z=50;
	}
	void put()
	{
		System.out.print("x="+x);
		System.out.print("z="+y);
	}
	void cal()
	{
		int sum=x+y+x+z;
		System.out.print("sum="+sum);
	}
}
class def
{
	public static void main(String[]ar)
	{
		xyz x1=new xyz();
		x1.set();
		x1.put();
		x1.inti();
		x1.put();
		x1.cal();
	}
}