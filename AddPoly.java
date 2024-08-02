import java.util.Scanner;

class Poly
{
	Scanner s=new Scanner(System.in);
	int x,y,cnst;
	
	void getData()
	{
		System.out.println("Enter coefficient of x:");
	    x=s.nextInt();
	
	    System.out.println("Enter coefficient of y:");
	    y=s.nextInt();
		
		System.out.println("Enter a digit in Constant part of Poly:");
		cnst=s.nextInt();
	}
	
	void print()
	{
		System.out.println("Entered Polynomial: "+x+"x+"+y+"y+"+cnst);
	}
	
	Poly add(Poly obj)
	{
		Poly temp=new Poly();
		
		temp.x=this.x+obj.x;
		temp.y=this.y+obj.y;
		temp.cnst=this.cnst+obj.cnst;
		
		return temp;
	}
	
	void put()
	{
		System.out.println("\nAddition is: "+x+"x+"+y+"y+"+cnst);
	}
}

class AddPoly
{
	public static void main(String[]ar)
	{
		Poly a=new Poly();
		Poly b=new Poly();
		Poly c=new Poly();
		
		a.getData();
		b.getData();
		a.print();
		b.print();
		
		c=a.add(b);
		c.put();
	}
}