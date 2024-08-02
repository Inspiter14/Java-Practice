import java.util.*;
class Bank
{
 int account_no,balance;
 String account_name;
 int initial,initial1;
 Bank()
 {
 //Default Consructor
 }
 Bank(int account_no,int balance,String account_name)
 {
 this.account_no=account_no;
 this.balance=balance;
 this.account_name=account_name;
 }
 Bank(int account_no,int balance)
 {
 this.account_no=account_no;
 this.balance=balance;
 }
 void deposite()
 {
 Scanner s=new Scanner(System.in);
 System.out.print("\nEnter the amout to be Deposited:");
 initial=s.nextInt();
 balance=balance+initial;
 System.out.print("\nTHANK YOU!!!");
 }
 void withdraw()
 {
 Scanner s=new Scanner(System.in);
 System.out.print("\nEnter the amount to be Withdraw:");
 initial1=s.nextInt();
 balance=balance-initial1;
 System.out.print("\nTHANK YOU!!!");
 }
 void balance()
 {
 System.out.print("\nYour Current Balance="+balance);
 }
 void dis()
 {
 System.out.print("\n Amount Deposited="+initial);
 System.out.print("\n Amount Withdrawal="+initial1);
 System.out.print("\n Balance Amount="+balance);
 }
}
class BankAcc
{
 public static void main(String[]ar)
 {
 int p,ch;
 Bank b1=new Bank(1,5000,"Ridhhi");
 Bank b2=new Bank(2,5000,"Kartiki");
 Bank b3=new Bank(3,5000);
 Bank b=b1;
 Scanner s=new Scanner(System.in);
 do
 {
 System.out.print("\n**************\n 1.Person 1 \n 2.Person 2 \n 3.Person 3 \n**************\n Enter The Person's Number To Perform Operation:");
 p=s.nextInt();
  if(p==1)
  {
   b=b1;
  }
  else if(p==2)
  {
   b=b2;
  }
  else
  {
   b=b3;
  }
 System.out.print("\n**********MENU**********");
 System.out.print("\n1.Deposit\n2.Withdraw\n3.Balance\n4.Display");
 System.out.print("\n**************\nPlease Enter Your Choice'c Number:");
 ch=s.nextInt();
  switch(ch)
  {
  case 1:
   b.deposite();
   break;
  case 2:
   b.withdraw();
   break;
  case 3:
   b.balance();
   break;
  case 4:
   b.dis();
   break;
  default:
  System.out.print("\nPlease Enter Correct Choice:");
  }
 }while(ch==1||ch==2||ch==3||ch==4);
 }
}