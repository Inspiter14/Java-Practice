
import java.util.*;
class Array
{
	int n,i;
	int[] a=new int[20];
	void getData()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter the no. of elements in Array:");
		n=s.nextInt();
		System.out.print("\nEnter the Elements in an Array:");
		 for(int i=0;i<n;i++)
		 {
			 a[i]=s.nextInt();
		 }
	}
	void show()
	{
		System.out.print("\n[");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.print("]\n");
	}
	Array even()
	{
		Array temp=new Array();
		int cnt=0;
		for(int i=0;i<n;i++)
        {
            if(a[i] % 2 == 0)
            {
                temp.a[cnt]=a[i];
				cnt++;
            }
        }
		temp.n=cnt;
        return temp;		
	}
	Array odd()
	{
		Array temp=new Array();
		int cnt=0;
		for(int i=0;i<n;i++)
        {
            if(a[i] % 2 != 0)
            {
                temp.a[cnt]=a[i];
				cnt++;
            }
        }
		temp.n=cnt;
		return temp;
	}
}
class EvenOdd
{
	public static void main(String[]ar)
	{
		Array a1=new Array();
		a1.getData();
		
        Array a2=a1.even();
		System.out.print("\nEven Elements:");
        a2.show();

        Array a3=a1.odd();
		System.out.print("\nOdd Elements:");
        a3.show();		
	}
}