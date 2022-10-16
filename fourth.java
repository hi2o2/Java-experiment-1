//Program to check whether a given number is prime or not
import java.io.*;
import java.util.*;
class fourth
{
public static void main (String args[])
{
Scanner  obj=new Scanner(System.in);
System.out.println("Enter the value of a");
int a =obj.nextInt();
int i,primecheck=0;
for (i=2;i<a/2;i++)
	if (a%i==0)
		primecheck=1;
if (primecheck==0)
System.out.println("number is prime");
else
System.out.println("number is not prime");
}
}
