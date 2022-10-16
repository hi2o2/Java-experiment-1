//Program to check given number is Armstrong or not
import java.io.*;
import java.util.*;
class nineth
{
public static void main (String args[])
{
int i,n,sum=0;
Scanner  obj=new Scanner(System.in);
System.out.println("Enter the value of a");
int number =obj.nextInt();
n=number;
while(n>0)
{
i=n%10;
sum+=(i*i*i);
n=n/10;
}
if (sum==number)
System.out.println("The number is amstrong");
else
System.out.println("The number is not amstrong");
}
}
