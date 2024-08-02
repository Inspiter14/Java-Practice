//takes first and last name from user and concat it and print it
import  java.util.*;
class ConName
{
	public static void main(String[]ar)
	{
		Scanner s=new Scanner(System.in);
		String first,last,f,l;
		String m=" ";                                                           //for adding space in name
		System.out.println("Please Enter your first name: ");
		first=s.nextLine();
		System.out.println("Please Enter your last name: ");
		last=s.nextLine();
		f=first.concat(m);                                                     //concates first name with space and stored in f
		l=f.concat(last);                                                      //concates f with last name
		System.out.println("Full Name: "+l);                                   //prints Firstname, space, middle name by concating 
	}
}