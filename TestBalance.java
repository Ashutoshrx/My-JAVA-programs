package Mypack;

class Balance
{
	String name;
	double bal;
	Balance(String a,double b)
	{
		name=a;
		bal=b;
	}
	void show()
	{
		System.out.println("Name:" +name+ " , Balance:"  +bal );
	}
}

class TestBalance
{
	public static void main(String args[])
	{
		Balance ob=new Balance("Ashu",12.5);
		ob.show();
	}
}