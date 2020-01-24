import java.util.*;
class Assignment4 {
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

/*
OUTPUT
======

java Assignment4 3 4 5.0 b16 a
Valid outcomes = 2
Invalid outcomes = 3

*/
