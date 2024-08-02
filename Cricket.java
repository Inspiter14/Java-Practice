import java.util.*;
class Players
{
	String name, country;
	int score, i;
	float average, sum;
	int[] a=new int[5];
	void getData()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter the Name of the Player:");
		name=s.nextLine();
		System.out.print("\nEnter the Country of the Player:");
		country=s.nextLine();
		System.out.print("\nEnter the score of last 5 matches:");
		
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
	}
	void average()
	{
		
		average=sum/5;
	}
	void dis()
	{
		System.out.print("*****ENTERED INFORMATION*****");
		System.out.print("\nName:"+name);
		System.out.print("\nCountry:"+country);
		System.out.print("\nAverage:"+average);
	}
}
class Cricket
{
	public static void main(String[]args)
	{
		Players[] p=new Players[5];
		for(int j=0;j<5;j++)
		{
			p[j]=new Players();
		}
		for(int j=0;j<5;j++)
		{   
			p[j].getData();
			p[j].average();
			p[j].dis();
		}	
		
	}
}