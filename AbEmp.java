import java.util.*;

abstract class Employee
{
	String name;
	int hr,over,day;
	double salary;
	
	void get()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter Your Name: ");
		name=s.nextLine();
	}
	abstract void getData();
	abstract void cal();
	void put()
	{
		System.out.println("\n ***************THANK YOU***************");
		System.out.println("\nEntered Name: \n"+name);	
	}
}
class Temporary extends Employee
{
	void getData()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nPlease Enter Your Working Hours in a Month: \n");
		hr=s.nextInt();
		System.out.println("\nPlease Enter Your OverTime Working Hours in a Month: \n");
		over=s.nextInt();
	}
	void cal()
	{
		hr=hr+over;
		salary=200*hr;
		System.out.println("\nTotal Working Hours: \n"+hr);
		System.out.println("\n Calculated Salary: \n"+salary);		
	}
}
class Permenant extends Employee
{
	void getData()
	{
		Scanner s=new Scanner(System.in);
       	System.out.println("\nPlease Enter Your Working Days in a Month: \n");
		day=s.nextInt();		
	}
	void cal()
	{
		salary=2000*day;
		System.out.println("\nTotal Working Days in a Month: \n"+day);
		System.out.println("\nCalculated Salary= \n"+salary);
	}
}
class AbEmp
{
	public static void main(String[]ar)
	{
		Employee e;
		String y;
		int ch;
		
		Scanner s=new Scanner(System.in);
		System.out.println("\nAre You an Permenant Employee? [Please Enter yes or no]:");
		y=s.nextLine();
		
		if(y.equals("no"))                                                      //when we are going to compare string use keyword ".equal"
		{
		    e=new Temporary();
		}
		else 
		{
		    e=new Permenant();  
		}
		/*else
		{
			System.out.println("Please Enter a Corerect Choice");
		}*/
		
		do
		{
			System.out.println("**********MENU**********\n1.INPUT\n2.DISPLAY");
		    System.out.println("Please Enter your Choice:");
      		ch=s.nextInt(); 
		    if(ch==1)
			{
				e.get();
				e.getData();
			}
			else if(ch==2)
			{
		        e.put();
				e.cal();
			}
			else
			{
				System.out.println("Enter Correct Choice");
			}
		}while(ch==1 || ch==2);
	}
}