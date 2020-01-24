class Multiple
{
	public static void main(String args[])
	{
		try
		{
			int a=args.length;
			System.out.println("\na=:\n"+a);
			int b=42/a;
			int c[]={1};
			c[42]=99;
		}
		catch(ArithmeticException e)
		{
			System.out.println("\nError:\n"+e);
		}
		catch(IndexOutOfBoundsException f)
		{
			System.out.println("\nError:\n"+f);
		}
		System.out.println("After try/blocks");
	}
}