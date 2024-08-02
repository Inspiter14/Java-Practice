//Find out Tallest between two persons for multiple & different object communication.

//Here, in below program we use logic of Object as Parameter.


import java.util.*;
class Person
{
   private String name;//data security we change access specifier
   private int height;
    
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

  
}
class Tallest10
{
   public static void main(String ar[])
	{
	  Person[] p=new Person[10]; //10 Persons
	 Person temp;
	  for(int i=0;i<10;i++)
	     p[i].get();

	  temp=p[0];

	 for(int i=0;i<10;i++)
	  temp=temp.compare(p[i]); //Nested calling
	
	  System.out.println("Tallest from all 10 persons");  
	  temp.put();

	}
}
