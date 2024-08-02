class Number implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=1000;i++)
		{
			if(i%7==0)
			{
				System.out.println("Number :"+i);
			}
		}
	}
}
class Arg implements Runnable
{
	int i;
	String j[];
	Arg(String args[])
	{
		j=args;
	}
	public void run()
	{
		for(i=0;i<j.length;i++)
		{
			System.out.println("Argument : "+j[i]);
		}
	}
}
class NumArg
{
	public static void main(String[]ar)
	{
		Number n=new Number();
		Arg a=new Arg(ar);
		Thread t1=new Thread(n);
		Thread t2=new Thread(a);
		t1.start();
		t2.start();
	}	
}