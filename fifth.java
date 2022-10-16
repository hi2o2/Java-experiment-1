// Program to find sum of first n natural numbers
import java.io.*;
import java.util.*;
class fifth
{
public static void main (String args[])
{
Scanner  obj=new Scanner(System.in);
System.out.println("Enter the value of a");
int a =obj.nextInt();
int i,sum=0;
for (i=1;i<=a;i++)
	sum+=i;
System.out.println("Sum ="+sum);
}
}
