//10.Program to check whether given number is palindrome or not
import java.io.*;
import java.util.*;
class tenth
{
public static void main (String args[])
{
int i,j,n,sum=0;
Scanner  obj=new Scanner(System.in);
System.out.println("Enter the value of a");
int number =obj.nextInt();
n=number;
while(n!=0)
{
i=n%10;
sum= sum*10+i;
n=n/10;
}
if (sum==number)
System.out.println("The number is Palindrome");
else
System.out.println("The number is not Palindrome");
}
}
