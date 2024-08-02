#include <iostream>
using namespace std;
class addd
{
int a,b;
public:
add();
add(int,int);
add(const add &);
void get();
void dis();

};
   void add::get()
   {
	   cout<<"\n Enter a:";
	   cin>>a;
	   cout<<"\n Enter b:";
	   cin>>b;
	   
   }
   add::add(int x,int y)
   {
	   a=x;
	   b=y;
   }
   add::add(const add &obj)
   {
	   a=obj.a;
	   b=obj.b;
   }
   void dis()
   {
	   c=a+b;
	   cout<<"\nAddition:"<<c<<"\nFor a:"<<a<<"\nFor b:"<<b<<endl;
   }
   int main()
   {
	   add object1(10,20);
	   add object2;
	   add object3=object1;
	   
	   object1.get();
	   object2.get();
	   
	   object1.dis();
	   object2.dis();
	   object3.dis();
	   
	   return 0;
   }