class Fibo implements Runnable
{
	public void run()
	{
		int i,next,t1=0,t2=1;
		System.out.println("Fibonacci :"+t1+"\n"+t2);
		for(i=0;i<=50;i++)
		{
			next=t1+t2;
			System.out.println("Fibonacci :"+next);
			t1=t2;
			t2=next;
		}
	}
}
class Reverse implements Runnable
{
	public void run()
	{
		for(int i=1000;i>=1;i--)
		{
			System.out.println("Reverse :"+i);
		}
	}
}
class FibRev
{
	public static void main(String[]ar)
	{
		Fibo f=new Fibo();
		Reverse r=new Reverse();
		Thread t1=new Thread(f);
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
	}
}