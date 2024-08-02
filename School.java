import java.util.Scanner;
class Student
{
	String name;
	int roll_no;
	void getData()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\n Enter the Name of Student: ");
		name=s.nextLine();
		System.out.print("\n Enter the Roll No of Student: ");
		roll_no=s.nextInt();
	}
	void dis1()
	{
		System.out.print("\nName: \n"+name);
		System.out.print("\n\nRoll Number: \n");
	}
}
class Exam extends Student
{
	float sub1,sub2,sub3;
	float total,per;
	
	void putData()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\n Enter the Marks of 1st Subject[from 100]: ");
		sub1=s.nextFloat();
		System.out.print("\n Enter the Marks 2nd Subject[from 100]: ");
		sub2=s.nextFloat();
		System.out.print("\n Enter the Marks 3rd Subject[from 100]: ");
		sub3=s.nextFloat();
	}
	void cal()
	{
		total=sub1+sub2+sub3;
		per=total/3;
	}
	void dis()
	{
		System.out.print("\n\nMarks of 1st sub: \n"+sub1);
		System.out.print("\n\nMarks of 2nd sub: \n"+sub2);
		System.out.print("\n\nMarks of 3rd sub: \n"+sub3);
		System.out.print("\n\nTotal: \n"+total);
		System.out.print("\n\nPercentage: \n"+per);
	}
}
class School
{
	public static void main(String []args)
	{
		Exam e1=new Exam();
		e1.getData();
		e1.putData();
		e1.cal();
		e1.dis1();
		e1.dis();
	}
	
}
