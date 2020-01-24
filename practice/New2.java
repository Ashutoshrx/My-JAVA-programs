 import java.util.*;
 class Fact
{
	static int facto(int n)
	{
		if(n<1)
		{
			return 1;
		}
		else
		{
			int result=facto(n-1)*n;
			return result;
		}
		
	}
}

class EvenOdd
{
	//boolean=false;
	static boolean findEvenOdd(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Prime
{
	static void display(int n)
	{
		boolean findPrime=true;
		for(int i=2;i<n;i++)
		{
			
			if(n%i==0)
			{
				findPrime= false;
				break;
			}
		}
		if(findPrime)
		{
			System.out.println(n+"Prime");
		}
		else{
			System.out.println(n+"Not Prime");
		}
	}
}

class New2
{
	public static void main(String args[])
	{
		
		System.out.println("Factorial:"+Fact.facto(5));
		System.out.println("Even odd:"+EvenOdd.findEvenOdd(5));
		Prime.display(7);
	}
}