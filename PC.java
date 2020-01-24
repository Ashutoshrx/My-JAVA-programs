class A
{
	 void call(String msg)
	{
		System.out.println("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("ERROR"+e);
		}
		System.out.println("]");
	}
}

class B implements Runnable
{
	A target;
	Thread t;
	String msg;
	B(A a,String b)
	{
		target=a;
		msg=b;
		t=new Thread(this);
	}
	public void run()
	{
		synchronized(target)
		{
			target.call(msg);
		}
	}
}

class PC
{
	public static void main(String args[])
	{
		A target=new A();
		B ob1=new B(target,"ASHUTOSH");
		B ob2=new B(target,"ASHU");
		ob1.t.start();
		ob2.t.start();
		try{
			ob1.t.join();
			ob2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("ERR");
		}
	}
}