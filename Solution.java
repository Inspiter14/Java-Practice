import java.io.*;
import java.util.*;

class Result
{
	/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int num[]=new int[5];
	int i,j;
	double sum=0;
	String s;
	System.out.print("Enter 5 integers: ");

	for(i=0;i<4;i++)
	{
		m=br.readLine();
		num[i]=Integer.parseInt(s);
	}
	List<Integer> list=Arrays.asList(num);
	arraySum(list);*/
	
	public static int arraySum(List<Integer> number)
	{
		ArrayList<Integer> arr=new ArrayList<Integer>(number);
		for(j=0;j<arr.size();j++)
			sum+=arr.get(j);
		return sum;
	}	
}
public class Solution
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int num[]=new int[5];
	int i,j;
	double sum=0;
	String s;
	System.out.print("Enter 5 integers: ");

	for(i=0;i<4;i++)
	{
		m=br.readLine();
		num[i]=Integer.parseInt(s);
	}
	List<Integer> list=Arrays.asList(num);
	
	public static void main(String[]ar)throws Exception
	{
		Result r=new Result();
		int ans=r.arraySum(list);
		System.out.print(ans);
	}
}