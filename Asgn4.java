import java.util.*;
class Asgn4 {
public static void main(String args[])
{
if (args.length !=5)
{
throw new IllegalArgumentException("Enter 5 parameters!");
}
int count=0,count1=0;
int arg;
for(int i=0;i<5;i++)
{
try 
{
arg=Integer.parseInt(args[i]);
count++;
} 
catch(NumberFormatException e) 
{
count1++;
}
}
System.out.println("Valid outcomes = "+count);
System.out.println("Invalid outcomes = "+count1);
}
}


