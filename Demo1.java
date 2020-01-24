class Generic<t>
{
	t ob;
	Generic(t o)
	{
		ob=o;
		}
		t get_ob()
		{
			return ob;
		}
		void showtype()
		{
			System.out.println("Below:");
			System.out.println("\nThe type of ob is:\n"+ob.getClass().getName());
		}
	}


class Demo1
{
	public static void main(String args[])
	{
		Generic<Integer> iob=new Generic<Integer>(5);
		int a=iob.get_ob();
		System.out.println("\nThe value of a is:\n"+a);
		
	}
}