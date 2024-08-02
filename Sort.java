//program to sort the string array
import java.util.*;
class Sort
{
	public static void main(String[]ar)
	{
		String[] arr={"Abhishek","Raj","Abhay","Ketaki","Puja","Tanvi","Diksha","Riddhi","Vidya","Kavya"};
		int len=arr.length;
		int i,j;
		String temp;
		
		for(i=0;i<len-1;i++)
		{
			for(j=(i+1);j<len;j++)
			{
				if(arr[i].compareTo(arr[j])>0)               //compare strings by aski value if it is greater than 0 then it will swaps, if it is less than 0 it remains same
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.print("\nSorted String:\n");
		System.out.print("\n[");
        for(i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ,");
		}			
		System.out.print("]\n");
	}
}