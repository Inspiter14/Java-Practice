
import java.util.*;
class Fur
{
	int f_code,quantity;
	float price;
	String type;
	
	void getData()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\n Enter the Code: ");
		f_code=s.nextInt();
		System.out.print("\n Enter the Type[Chair/Table]: ");
		type=s.nextLine();
		System.out.print("\n Enter the Price: ");
		price=s.nextFloat();
		System.out.print("\n Enter the Quantity: ");
		quantity=s.nextInt();
	}
	void cal()
	{
		price=quantity*price;
	}
	
	void dis()
	{
		System.out.print("\n Code: \n"+f_code);
		System.out.print("\n Type: \n"+type);
		System.out.print("\n Price: \n"+price);
		System.out.print("\n Quantity: \n"+quantity);
	}
	Fur	compare(Fur obj)
	{
		if(this.price<obj.price)
		{
			return this;
		}
		else
		{
			return obj;
		}
	}
}
class Furniture
{
	public static void main(String[]ar)
	{
		Fur[] f=new Fur[2];
		Fur f1;
		f1=f[0];
		for(int i=0;i<2;i++)
		{
			f[i].getData();
			f[i].cal();
			f1=f1.compare(f[i]);
		}
		System.out.print("\n Greatest Price: \n");
		f1.dis();

	}
	
}