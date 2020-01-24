import java.util.Random;
class Handle
{
	public static void main(String args[])
	{
		double a=0,b=0,c=0;
		Random r=new Random();
		for(double i=0;i<3900;i++)
		{
			try
			{
				a=r.nextDouble();
				c=r.nextDouble();
				b=r.nextDouble();
				a=2320000/(b/c);
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("\nTheere is an error\n"+e);
				a=0;
			}
			//
			System.out.println("\nThe answer is:\n"+a);
		}
	}
}
			