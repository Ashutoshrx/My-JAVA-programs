class Generic<t>
{
	t ob;
	Generic( t x)
	{
		ob=x;
	}
	void show_value()
	{
		System.out.println("\nThe value is:\n"+ob);
	}
}

class Demo2
{
	public static void main(String args[])
	{
		Generic<Double> iob=new Generic<Double>(2.5);
		iob.show_value();
		Generic<String> iob1=new Generic<String>("Ashutosh");
		iob1.show_value();
	}
}