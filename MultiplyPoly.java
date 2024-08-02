import java.util.Scanner;

class Mul
{
	Scanner s=new Scanner(System.in);
	int c1,c2,c3,x,y;
	
	void getData()
	{
		System.out.println("Enter the Coefficient of X: ");
		c1=s.nextInt();
		System.out.println("Enter the Coefficient of Y: ");
		c2=s.nextInt();
		System.out.println("Enter the Constatnt Part: ");
		c3=s.nextInt();		
	}
	void power()
	{
		System.out.println("Enter the Power of X: ");
		x=s.nextInt();
		System.out.println("Enter the Power of Y: ");
		y=s.nextInt();
	}
    Mul multiply(Mul obj)
	{
		Mul t1=new Mul();
		t1.c1=(this.c1*obj.c1);
		t1.c2=(this.c2*obj.c2);
		t1.c3=(this.c3*obj.c3);
		t1.x=this.x+obj.x;
		t1.y=this.y+obj.y;
		return t1;
	}
	void print()
	{
		System.out.println("Entered Polynomial: "+c1+"x^"+x+" + "+c2+"y^"+y+" + "+c3);
	}
	void put()
	{
		System.out.println("Multiplication :"+c1+"x^"+x+" + "+c2+"y^"+y+" + "+c3);
	}
}
class MultiplyPoly
{
	public static void main(String[]ar)
	{
		Mul m1=new Mul();
		Mul m2=new Mul();
		Mul m3=new Mul();
		
		m1.getData();
		m1.power();
		
		m2.getData();
		m2.power();
		
		m1.print();
		m2.print();
		
		m3=m1.multiply(m2);
		m3.put();
	}
}