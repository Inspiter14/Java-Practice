import java.util.*;
class Bill
{
	int quantity,price,total,over;
	String name,product;
	long mob_no=10;
	
	void getData()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nPlease Enter Your Name:");
		name=s.nextLine();
		do
		{
		    System.out.println("\nPlease Enter Your Mobile Number:");
	        mob_no=s.nextLong();
			if(mob_no!=10)
			{
				System.out.println("\nPlease Enter 10digits Number:");
			}
		}while(mob_no!=10);
	}
	void shop()
	{   
		Scanner s=new Scanner(System.in);
		System.out.println("\nPlease Enter the Product Name:");
		product=s.nextLine();
		System.out.println("\nEnter The Quantity:");
		quantity=s.nextInt();
		System.out.println("\nPlease Enter The Price:");
		price=s.nextInt();
		total=quantity*price;
		over += total;
	}
	
	void dis()
	{
		System.out.println("\n***************THANK YOU***************");
		System.out.println("\nName:  "+name);
		System.out.println("\nMobile Number:  "+mob_no);
		System.out.println("\nProduct   Quantity   Price   Total Price\n"+product+"       "+quantity+"      "+price+"      "+total+"\n");
		System.out.println("\nTotal Bill: "+over);
	}
}
class ShopBill
{
	public static void main(String[]ar)
	{
		Bill b=new Bill();
		Scanner s=new Scanner(System.in);
		String y,p;
		do
		{
			b.getData();
			do
			{
				b.shop();
				System.out.println("\nDo You Want to add new Item?[Enter yes or no]: ");
				y=s.nextLine();
			}while(y.equals("YES") || y.equals("yes") || y.equals("Yes"));
			b.dis();
			System.out.println("\nDo you want to add a new customer:[yes or no]:");
			p=s.nextLine();
	    }while(p.equals("YES") || p.equals("yes") || p.equals("Yes"));
	}
}