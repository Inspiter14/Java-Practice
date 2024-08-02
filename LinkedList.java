import java.util.Scanner;
class node 
{
	int data;
	node next;
	void Linked()
	{
		next=null;
	}
}
class Linked extends node
{
	node temp,start;
    int ans,k=0;
	int a,b,c;
	a=b=c=0;
	Scanner s=new Scanner(System.in);
	void Linked()
	{
		start=null;
	}
	int create()
    {
        //System.out.println("Create a Linked List:\n");
        do
        {
            node newnode=new node();
            System.out.println("Enter a Value:\t");
            newnode.data=s.nextInt();
            if(start==null)
                start=newnode;
            else
            {
                temp=start;
                while(temp.next!=null)
                    temp=temp.next;
                temp.next=newnode;
            }
            System.out.println("Do you want to add a new node?\t[Enter 1 or 2]");
            ans=s.nextInt();
			k++;
        }while(ans==1);
    }
    
	void merge(Linked obj)
	{
		Linked temp=new Linked();
		
		
	}
    void display()
    {
        node temp;
        temp=start;

        //System.out.println("Formed Linked List:");
        while(temp!=null)
        {
            System.out.println(temp.data+"\n");
            temp=temp.next;
        }
    }

}
class LinkedList
{
	public static void main(String[]ar)
	{
		Linked l1=new Linked();
		Linked l2=new Linked();
		Linked l3=new Linked();
		
		int n,m;
		
		System.out.println("Create list 1:\n");
		l1.create();
		
		System.out.println("Create list 2:\n");
		l2.create();
		
		System.out.println("List 1:");
		l1.display();
		
		System.out.println("List 2:");
		l2.display();
		
		l3=l1.merge(l2);
	}
}