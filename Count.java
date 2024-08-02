//Program to count the letters,words and sentences in a string. Sentences are seperated with "." and words are seperated with space
import java.util.*;
class Count
{
	public static void main(String[]ar)
	{
		Scanner s=new Scanner(System.in);
		String str="";
		int cnt1=0;
		int i;
		int cnt2=0;
		int cnt3=0;
		
		System.out.println("Enter Strings[Please give space after a sentence]: ");
		str=s.nextLine();
		for(i=0;i<str.length();i++)//for counting letters
		{
			if((str.charAt(i) !=' ') && (str.charAt(i)!='.'))//when it checks that there is space or dot, it will not increment cnt
			{
				cnt1++;
			}
			else if((str.charAt(i)==' '))//to count no. of words in a string by checking spaces
			{
				cnt2++;
			}
			else if((str.charAt(i)=='.'))//to count strings by checking dot
			{
				cnt3++;
			}
			else
			{
				System.out.println("Wrong");
			}				
		}
		cnt2++;//to add last word caz we start cnt2=0
		System.out.println("String: "+str);
		System.out.println("Total Letters: "+cnt1);
		System.out.println("Total Words: "+cnt2);
		System.out.println("Total Strings: "+cnt3);
		/*System.out.println("String: "+str);
		System.out.println("Total Letters: "+cnt1);
		
		for(i=0;i<str.length();i++)
		{
			if((str.charAt(i)==' '))
			cnt2++;				
		}
		cnt2++;
		System.out.println("Total Words: "+cnt2);
		
		for(i=0;i<str.length();i++)
		{
			if((str.charAt(i)=='.'))
			cnt3++;				
		}
		System.out.println("Total Strings: "+cnt3);*/
    }	
}