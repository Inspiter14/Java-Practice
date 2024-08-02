import java.util.*;

class Result
{
	public static void fizzBuzz(int n)
	{
		int i;
		for(i=0;i<=n;i++)
		{
			if(i==0)
				continue;
		    else if(i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			else if(i%3==0 && i%5!=0)
				System.out.println("Buzz");
			else if(i%3!=0 && i%5==0)
				System.out.println("Fizz");
			else
				System.out.println(i);
		}
	}
}
public class FizzBuzz
{
	//int num;
	public static void main(String[]ar)
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a digit:");
		num=s.nextInt();
		Result r=new Result();
		r.fizzBuzz(num);
	}
}