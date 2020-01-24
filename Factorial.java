import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
        int num,factorial;
        Scanner scanner = new Scanner(System.in);			
        System.out.println("Enter the number:");
	    int n = scanner.nextInt();
	    factorial = fact(n);
	    System.out.println("Factorial of entered number is: "+factorial);     
    }
        static int fact(int n)
		{
			int output;
			if(n<1)
			{
				return 1;
			}
			else
			{
				output = fact(n-1)* n;
				return output;
			}
		}
}







/*
NAME:Ashutosh Satapathy
ROLL NO.:UCSE17002
SEMESTER NO.:3
Ques.No.:Assignment 1.a
*/