class Rand 
{
	int vaid,invalid;
	public static void main(String args[])
	{
		try
		{
			for(int i=0;i<9;i++)
			{
				for(int j=0;j<9;j++)
				{
					if(args[j]=='i')
					{
						invalid++;
					}
					else
					{
						valid ++;
					}
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\nError\n");
		}
	}
}