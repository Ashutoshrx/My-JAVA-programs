class Practice3
{
	public static void main(String args[])
	{
		try
		{
			int i=args.length;
			String a=args[i-1];
			if(a.equals("Java"))
			{
				System.out.println("\nFirst word is JAVA\n");
				System.out.println("\nNumber of arguments is:\n"+i);
			}
			int x=18/i;
			int y[]={555,999};
			y[i]=x;
		}
		catch(ArithmeticException e)
		{
			System.out.println("\nDivision by zero\n"+e);
		}
		
		catch(NullPointerException e)
		{
			System.out.println("\nA null piter Exception:\n"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\nArray out of bounds:\n"+e);
		}
	}
}