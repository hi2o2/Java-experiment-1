//Program to find factorial of a given number
import java.io.*;
import java.util.*;
class eighth
{
public static void main (String args[])
{
Scanner  obj=new Scanner(System.in);
System.out.println("Enter the value of a");
int a =obj.nextInt();
int i,fact=1;
for(i=1;i<=a;i++)
	fact*=i;
System.out.println("Factorial ="+fact);
}
}
