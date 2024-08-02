import java.util.*;
class Medicine
{
	String company,name;
	void getData()
	{
	    Scanner s=new Scanner(System.in);
	    System.out.print("\nPlease Enter Company Name:");
	    company=s.nextLine();
	    System.out.print("\nPlease Enter Your Name:");
	    name=s.nextLine();
	}
	void dis()
	{
		System.out.print("\nCompany Name: \n"+company);
		System.out.print("\nClient's Name: \n"+name);
	}
}
class Dealer extends Medicine
{
	String product;
	double price;
	void putData()
	{
	    Scanner s=new Scanner(System.in);
	    System.out.print("\nEnter the Product Name: ");
	    product=s.nextLine();
	    System.out.print("\nEnter the Price: ");
	    price=s.nextDouble();
	}
	void print()
	{
		System.out.print("\nProduct Name: \n"+product);
		System.out.print("\nPrice Of the Product: \n"+price);
	}
}
class Retailer extends Dealer
{
	void cal()
	{
		price=price+(1.5/100);
	}
	void result()
	{
		System.out.print("\nSelling Price of the Product: \n"+price);
	}
}
class Medi 
{
	public static void main(String[]args)
	{
		Retailer r1=new Retailer();
		r1.getData();
		r1.putData();
		r1.dis();
		r1.print();
		r1.cal();
		r1.result();
	}
}