// Program to print finonacci series upto n
import java.io.*;
import java.util.*;
class seventh
{
public static void main (String args[])
{
int i=0,a=0,b=1,c=1;
Scanner  obj=new Scanner(System.in);
System.out.println("Enter the value of n");
int n =obj.nextInt();
System.out.println(a);
System.out.println(b);
System.out.println(c);
while(i<n)
{
a=b;
b=c;
c=a+b;
System.out.println(c);
i+=1;
}
}
}
