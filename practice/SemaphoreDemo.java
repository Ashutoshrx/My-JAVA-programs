import java.util.Concurrent.*;
class Queue
{
	int n;
	Semaphore p=new Semaphore(1);
	Semaphore c=new Semaphore(0);
	void get()
	{
		try
		{
			c.acquire();
		}
		catch(InterruptedException e)
		{
			System.out.println("Error"+e);
		}
		System.out.println("\nPUT:"+n);
		c.realease();
	}
	
	void put()
	{
		try
		{
			p.acquire();
		}
		catch(InterruptedException e)
		{
			System.out.println("Error"+e);
		}
		this.n=n;
		System.out.println("\nPUT:"+n);
		p.release();
	}
}