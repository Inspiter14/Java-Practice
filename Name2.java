//take an i/o as Kartiki Uday Khare and print is as Khare Kartiki Uday
import java.util.*;
class Name2
{
	public static void main(String[]ar)
	{
		Scanner s=new Scanner(System.in);
		String name="";
		String f,m,l;
		
		System.out.println("Enter FullName[First Middle Last]: ");
		name=s.nextLine();
		
		int pos1=name.indexOf(" ");                                   //finds first space
		int pos2=name.indexOf(" ",pos1+1);                            //finds second space
		
		f=name.substring(0,pos1);                                     //store first name which is from 0th index to first space
		m=name.substring(pos1,pos2);                                  //store  middle name which is from first space to second space
		l=name.substring(pos2);                                       //strore last name which is after second space
		
		System.out.println("Entered Name: "+name);
		System.out.println("Modified Name: "+l+" "+f+""+m);           //prints Lastname then Firstname and Middlename
	}
}