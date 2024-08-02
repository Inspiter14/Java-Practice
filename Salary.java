import java.util.*;
class Employee
{
	int hr,over,day;
	double salary;
	String name;
	void getData()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter Your Name: \n");
		name=s.nextLine();
	}
	void temp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nPlease Enter Your Working Hours in a Month: \n");
		hr=s.nextInt();
		System.out.println("\nPlease Enter Your OverTime Working Hours in a Month: \n");
		over=s.nextInt();
	}
	void per()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nPlease Enter Your Working Days in a Month: \n");
		day=s.nextInt();
	}
	void dis()
	{
		System.out.println("\n ***************THANK YOU***************");
		System.out.println("\nEntered Name: \n"+name);
	}
}
class Temporary extends Employee
{
	void calTemp()
	{
		hr=hr+over;
		salary=200*hr;
		System.out.println("\nTotal Working Hours: \n"+hr);
		System.out.println("\n Calculated Salary: \n"+salary);
	}
}
class Permenant extends Employee
{
	void calPer()
	{
		salary=2000*day;
		System.out.println("\nTotal Working Days in a Month: \n"+day);
		System.out.println("\nCalculated Salary= \n"+salary);
	}
}
class Salary
{
	public static void main(String[]ar)
	{ 
		String y;
		Scanner s=new Scanner(System.in);
		Temporary t1=new Temporary();
		Permenant p1=new Permenant();
		System.out.println("\nAre You an Permenant Employee? [Please Enter yes or no]:");
		y=s.nextLine();
		if(y.equals("no"))//when we are going to compare string use keyword ".equal"
		{
		    t1.getData();
		    t1.temp();
		    t1.dis();
		    t1.calTemp();
		}
		else if(y.equals("yes"))
		{
		    p1.getData();
		    p1.per();
			p1.dis();
		    p1.calPer();
		}
		else
		{
		    System.out.println("\nEnter Correct Information");	
		}
	}
}