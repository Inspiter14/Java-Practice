 //Find out Tallest between two persons for multiple & different object communication.

//Here, in below program we use logic of Object as Parameter.
import java.util.*;
class Person
{
   int Person_id;
   private String name;//data security we change access specifier
   private int height;
    static int id=1001;
	Person()
	{
		Person_id=id;
		   id++;
	
	}
      void get()
	{
	Scanner in=new Scanner(System.in);
	  
	  
	  System.out.println("Enter a Name");
	   name=in.nextLine();
	  System.out.println("Enter a Height");
	   height=in.nextInt();
	 }
       void put()
	{
	  System.out.println("\nPerson Id  : "+ Person_id);
	  System.out.println("\nName  : "+ name);
	  System.out.println("\nHeight : "+ height+" in cm");
	}
       Person compare(Person obj) // Here we returns object 
	{
	
 	if(height>obj.height)
	     return this;   //this refers implicit object for which function is called.
	else
	     return obj;//here we returns values of explicit object.
	}

    public static void main(String ar[])
	{
	  Person p[]=new Person[5]; //10 Persons
	 
	  for(int i=0;i<5;i++){
	     p[i]=new Person();
	     p[i].get();
	}
	 
	 for(int i=0;i<5;i++)
	    p[i].put();

	}
}
