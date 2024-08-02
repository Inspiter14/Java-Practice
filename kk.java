import java.util.*;
class Prime
{
	public static void main(String[]ar)
	{
		int i=1;
		int j=0;
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter a positive integer:\n");
		num=s.nextInt();
		if(i<=num)
		{
			if(num%i==0)
			{
				j++;
			}
			i++;
			break;
		}
		if(j==2)
		{
			System.out.println("\n"+num+" is a Prime Number");
		}
		else
		{
			System.out.println("\n"+num+" is not a Prime Number");
		}
	}
}