import java.io.*;
import java.util.*;
class third
{
public static void main (String args[])
{
Scanner  obj=new Scanner(System.in);
System.out.println("Enter the value of a");
int a =obj.nextInt();
if (a%2==0)
	System.out.println(a+"is even");
else
	System.out.println(a+"is odd");
}
}
