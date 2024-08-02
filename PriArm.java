class Prime implements Runnable
{
	public void run()
	{
        int i =0;
        int num =0;
        String  prime= "";
        for (i = 1; i <= 1000; i++)         
        { 		  	  
            int counter=0; 	  
            for(num =i; num>=1; num--)
	        {
                if(i%num==0)
	            {
 		            counter = counter + 1;
	            }
	        }
	        if (counter ==2)
	        {
	            System.out.println("Prime :"+i);
		    }	
        }	
   	}
}
class Armstrong implements Runnable
{
	public void run()
	{
		int i,n,b,sum = 0;
        for(i = 1; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.println("Armstrong :"+i);
            }
            sum = 0;
        }
	}
}
class PriArm
{
	public static void main(String[]ar)
	{
		Prime p=new Prime();
		Armstrong a=new Armstrong();
		Thread t1=new Thread(p);
		Thread t2=new Thread(a);
		t1.start();
		t2.start();
	}
}