import java.util.*;

class EvenOdd
{
	static boolean evenodd(int n)
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
		boolean find_prime=true;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				find_prime=false;
				break;
			}
		}
		if(find_prime)
		{
			System.out.println("It is not Prime");
		}
		else
		{
			System.out.println("It is Prime");
		}
	}
}

class Factorial
{
	static int facto(int n)
	{
		if(n<1)
		{
			return 1;
		}
		else
		{
			int r= facto (n-1)*n;
			return r;
		}
	}
}
		

class New
{
	public static void main(String args[])
	{
		
		System.out.println("For even and Odd,It's:"+EvenOdd.evenodd(12345));
		System.out.println("For Prime Number:");
		Prime.display(11);
		System.out.println("For finding factorial:"+Factorial.facto(6));
		
	}
}