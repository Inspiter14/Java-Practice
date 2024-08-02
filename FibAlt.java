class Fibo implements Runnable
{
	public void run()
	{
		int i=2,next,t1=0,t2=1;
		System.out.println(t1+"\n"+t2);
		for(i=2;i<=10;i++)
		{
			next=t1+t2;
			System.out.println(next);
			t1=t2;
			t2=next;			
		}
	}
}
class Alternate implements Runnable
{
	public void run()
	{
		char i;
		for(i='a';i<='z';i++)
		{
			System.out.println(i);
	        i++;	
		}
	}
}
class FibAlt
{
	public static void main(String[]ar)
	{
		Fibo f=new Fibo();
		Alternate a=new Alternate();
		Thread t1=new Thread(f);
		Thread t2=new Thread(a);
		t1.start();
		t2.start();
	}
}