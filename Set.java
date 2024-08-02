import java.util.*;
class Set
{
	public static void main(String[]args)
	{
	 int[] a= new int[10];
	 int[] b= new int[10];
	 int[] uni= new int[20];
	 int[] inter= new int[20];
	 int i,j;
	
	 Scanner s= new Scanner(System.in);
	 System.out.print("\n Enter Elements in Set A:\n");
	   for(i=0;i<5;i++)//take input for set A
	   {
	      a[i]=s.nextInt();	
		  for(j=0;j<i;j++)
		  {
		    	 if(a[i]==a[j])//check whether user repeat any no.
			  {
			        	System.out.print("\n Re-enter a number\n");//if user enters a no for multiple times he needs to re-enter
			     	    i--;//needs to decrement i to store further no on correct position
						break;
			  }
		  }
	   }
	  
	  System.out.print("\n Enter Elements in Set B:\n");
	   for(i=0;i<5;i++)
	   {
	      b[i]=s.nextInt();	
		  for(j=0;j<i;j++)
		  {
		    	 if(b[i]==b[j])
			  {
			        	System.out.print("\n Re-enter a number\n");
			     	    i--;
						break;
			  }
		  }
	   }
	  
	  int cnt=0;
	  for(i=0;i<5;i++)//copying the nos for set A in Union set
	  {
		  uni[cnt]=a[i];
		  cnt++;
	  }
	  
	  for(i=0;i<5;i++)//for set B 
	  {
		  int f=0;
		  for(j=0;j<5;j++)//for set A
		  {
			  if(b[i]==a[j])//checking all the elements from set A and B
			  {
				  f=1;
				  break;//if any no get  match from the set then it is not copied in union
			  }
		  }
		  if(f==0)//when the condition don't get satisfied it will copy that no
		    uni[cnt++]=b[i];
	    }  
		  System.out.print("\nSet A:\n");
		  System.out.print("\n[");
		  for(i=0;i<5;i++)
          {
			  System.out.print(a[i]+",");
		  }			  
		  System.out.print("]\n");
		  
		 System.out.print("\nSet B:\n");
		  System.out.print("\n[");
		  for(i=0;i<5;i++)
          {
			  System.out.print(b[i]+",");
		  }			  
		  System.out.print("]\n");
		  
		  System.out.print("\n Union of Set A and B:\n");
		  System.out.print("\n[");
		  for(i=0;i<cnt;i++)
		  {
			  System.out.print(uni[i]+",");
		  }
		  System.out.print("]\n");
		  
		  int icnt=0;
		  for(i=0;i<5;i++)//for set B 
	      {
		  int f=0;
		  for(j=0;j<5;j++)//for set A
		  {
			  if(b[i]==a[j])//checking all the elements from set A and B
			  {
				  f=1;
				  break;//if any no get  match from the set then it is not copied in union
			  }
		  }
		  if(f==1)//when the condition don't get satisfied it will copy that no
		    inter[icnt++]=b[i];
	      } 

          System.out.print("\n Intersection of Set A and B:\n");
          System.out.print("\n[");
          for(i=0;i<icnt;i++)
          {
			  System.out.print(inter[i]+",");
		  }			  
	      System.out.print("]\n");
	}
}