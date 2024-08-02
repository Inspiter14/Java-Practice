public class First_C 
{  
    int z=10,x=3,y=5,ans,a;
	
      public void myMethod()   
    {  
    System.out.println("Method"); 
    ans = ++z;
	System.out.println("z= "+ans);	
	a=z+y-y+z+x++;
	System.out.println("Ans= "+a);	
	String str1=new String("Hello");
	String str2=new String(str1);
	System.out.println(str1==str2); 
	}  
      
    {  
    System.out.println("Instance Block");  
    }  
          
    public void First_C()  
    {  
    System.out.println("Constructor ");  
    }  
    static
	{  
    System.out.println("static block");  
    }  
	
    public static void main(String[] args) {  
    First_C c = new First_C();  
    c.First_C();  
    c.myMethod();  
  }  
}   