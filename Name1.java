//take input as Lal krishn Advani and print it as L. K. Advani
import java.util.*;
class Name1
{
	public static void main(String[]ar)
	{
		Scanner s=new Scanner(System.in);
		String n="";
		char f,m;
		String l;
		
		System.out.println("Enter your FullName[First Middle Last]: ");
		n=s.nextLine();
		
		int pos1=n.indexOf(" ");                       //finds first space
		int pos2=n.indexOf(" ",pos1+1);                //finds second space
		
		f=n.charAt(0);                                 //stores first letter at index 0
		m=n.charAt(pos1+1);                            //stores letter after second space
		l=n.substring(pos2);                           //stores string after second space
		
		System.out.println("Entered Name: "+n);       
		System.out.println(""+f+". "+m+". "+l);        //print char in f, char in m, string in l
	}
}