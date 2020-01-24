import java.util.Random;
interface x
{
	int no=0;
	int yes=1;
	int maybe=2;
	int never=3;
}

class Question implements x
{
	Random r=new Random();
	Double d=r.nextDouble();
	int ask()
	{
		if(d<0.30)
		{
			return no;
		}
		else if(d< 0.60)
		{
			return yes;
		}
		else if(d<0.75)
		{
			return maybe;
		}
		else
		{
			return never;
		}
	}
}

class Interface_var implements x
{
	public static void main(String args[])
	{
		Question q=new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}
	
	static void answer(int n)
	{
		switch(n)
		{
			case no:
			System.out.println("No");
			break;
			case yes:
			System.out.println("Yes");
			break;
			case maybe:
			System.out.println("Maybe");
			break;
			case never:
			System.out.println("Never");
			break;
		}
	}
}