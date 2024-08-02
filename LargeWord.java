//program to find out largest word in a string and prints its length
import java.util.*;
class LargeWord
{
	public static void main(String[]ar)
	{
		String str="Hello myself Kartiki Khare";
		char ch;
		int len=str.length();
		int l=0;
		int max=0;
		int i;
		String Long_Word="",word="";                                              //comparing words
		
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);                                                     //checks each char
			if(ch!=' ')                                                           //add in a word until it can't find space
			{
				word +=ch;                                                        //addition of characters
			}
			else
			{
				l=word.length();                                                   //assign length of desired word in l int
				if(l>max)                                                          //compare l with max , if l is greater max becomes l
				{
					max=l;
					Long_Word=word;                                                //assign the perticular word to the long word
				}
				word="";                                                           //again word becomes 0                                                         
			}
		}                                                                          //it repeates the given condition until it finds largest word which have largest length in string
		System.out.println("Longest Word: "+Long_Word+"\nLength :"+max);
	}
}