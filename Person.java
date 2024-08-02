import java.util.*;
class Person
{
	int height1;
	int put(int Person_id,String name,int height)
	{
	   System.out.println("1st Person's Information");
	   System.out.println("Person Id  : "+ Person_id);
	   System.out.println("Name  : "+ name);
	   System.out.println("Height : "+ height+" in cm");
	   return height;
	}
	int put(String name,int Person_id)
	{
	    Scanner s=new Scanner(System.in);
  	    System.out.println("\n2nd Person's Information");
		System.out.println("Name  : "+ name);
		System.out.println("Person Id  : "+ Person_id);
		System.out.println("Enter the Height: ");
	    height1=s.nextInt();
		System.out.println("Height: "+height1+" in cm");
		return height1;
	}
      
    public static void main(String ar[])
	{
	    Person p=new Person(); 
	    if(p.put(1001,"Akash",150)>p.put("Siddhant",1002))
			System.out.println("\n1st Person is Taller");
	    else
			System.out.println("\n2nd Person is Taller");
	}
}
