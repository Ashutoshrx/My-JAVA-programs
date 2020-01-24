class Exc1
{
	public static void main(String args[])
	{
		try
		{
			int d=0;
			int a=18/d;
			System.out.println("The try block is printed:\n"+a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("\nException: \n"+e);
		}

	}
}