//Program to find factor of a given number
import java.io.*;
import java.util.*;
class sixith
{
public static void main (String args[])
{
Scanner  obj=new Scanner(System.in);
System.out.println("Enter the value of a");
int a =obj.nextInt();
int i,sum=0;

System.out.println("Factors are:");
for (i=1;i<=a;i++)
	if (a%i==0)
		System.out.println(i);
}
}
