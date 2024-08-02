//get input as string and print it as ttring
import java.util.*;
class SwapLet
{
	public static void main(String[]ar)
	{
		Scanner s=new Scanner(System.in);
		String str="";
		
		System.out.println("Enter Word: ");
		str=s.nextLine();
		
		String c=str.replace(str.charAt(0),str.charAt(1));
		
		System.out.println("Modified String: "+c);
	}
}