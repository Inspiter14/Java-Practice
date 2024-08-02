import java.util.Scanner;

class Complex
{
	Scanner s=new Scanner(System.in);
	int real,img;
	
	void getData()
	{
		System.out.println("Enter a digit in Real Part of Poly:");
	    real=s.nextInt();
	
	    System.out.println("Enter a digit in Imagininary Part of Poly:");
	    img=s.nextInt();
	}
	
	void print()
	{
		System.out.println("Real Part: "+real);
		System.out.println("Imaginary Part: "+img+"i");
	}
	
	Complex add(Complex obj)
	{
		Complex temp=new Complex();
		
		temp.real=this.real+obj.real;
		temp.img=this.img+obj.img;
		
		return temp;
	}
	
	void put()
	{
		System.out.println("Addition is: "+real+"+"+img+" i");
	}
}

class ComplexAdd
{
	public static void main(String[]ar)
	{
		Complex a=new Complex();
		Complex b=new Complex();
		Complex c=new Complex();
		
		a.getData();
		b.getData();
		a.print();
		b.print();
		
		c=a.add(b);
		c.put();
	}
}