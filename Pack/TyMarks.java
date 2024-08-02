package Pack;
import java.util.Scanner;
public class TyMarks
{
	public float theory,practicals,total;
		
		public void get3()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Theory Total Marks [From 100]:");
			theory=s.nextFloat();
			System.out.println("Enter Practicals Total Marks [From 100]:");
			practicals=s.nextFloat();
		}
		public void put3()
		{
			System.out.println("Theory Total: "+theory);
			System.out.println("Practicals Total: "+practicals);
		}
		public void total2()
		{
			total=theory+practicals;
			System.out.println("Total: "+total);
		}
}