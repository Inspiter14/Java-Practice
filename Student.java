import Pack.*;
import java.util.Scanner;
class Stud
{
	String name;
	int roll_no;
	float total,per;
	SyMarks s1=new SyMarks();
	TyMarks t1=new TyMarks();
	void get1()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name:");
		name=s.nextLine();
		System.out.println("Enter Roll Number:");
		roll_no=s.nextInt();
		s1.get2();
		t1.get3();
	}
	void put1()
	{
		System.out.println("\n\n*****Entered Details*****");
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+roll_no);
		s1.put2();
		t1.put3();
	}
	void cal()
	{
		System.out.println("SY Marks Total:");
		s1.total1();
		System.out.println("TY Marks Total: ");
		t1.total2();
		total=(s1.total+t1.total);
		System.out.println("Total of SY and TY Marks: "+total);
		per=total/5;
		System.out.println("Percentage: "+per);
		if(per>=70)
		{
			System.out.println("A Grade");
		}
		else if(per<70 && per>=60)
		{
			System.out.println("B Grade");
		}
		else if(per<60 && per>=50)
		{
			System.out.println("C Grade");
		}
		else if(per<50 && per>=40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}
class Student
{
	public static void main(String[]ar)
	{
		float total,per;
		Stud s=new Stud();
		s.get1();
		s.put1();
		s.cal();
	}
}