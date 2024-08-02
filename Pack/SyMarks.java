package Pack;
import java.util.Scanner;
public class SyMarks
{
	public float comp,math,electro,total;
		
		public void get2()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Computer Total Marks [From 100]:");
			comp=s.nextFloat();
			System.out.println("Enter Math Total Marks [From 100]:");
			math=s.nextFloat();
			System.out.println("Enter Electronic Total Marks [From 100]:");
			electro=s.nextFloat();
		}
		public void put2()
		{
			System.out.println("Computer Total: "+comp);
			System.out.println("Math Total: "+math);
			System.out.println("Electronic Total: "+electro);
		}
		public void total1()
		{
			total=comp+math+electro;
			System.out.println("Total: "+total);
		}
}