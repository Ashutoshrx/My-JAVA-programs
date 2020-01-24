
import java.util.Scanner;
class Practice2
{
	static void Division(int x,int y )
	{
		try
		{
			int a=x/y;
			System.out.println("\na="+a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("\nDivision by zero\n"+e);
		}
	}
	public static void main(String args[])
	{
		int a,b;
		System.out.println("\n Enter any two integers:");
		Scanner ob1=new Scanner(System.in);
		a=ob1.nextInt();
		b=ob1.nextInt();
		Division(a,b);
		
	}
}
