import java.util.concurrent.*;

class Queue
{
	int n;
	Semaphore p=new Semaphore(1);

	Semaphore c=new Semaphore(0);

	
	void get(int n)
	{
		try
		{

				c.acquire();
			
		}
		catch(InterruptedException r)
		{
			System.out.println("\nError\n");
		}
		
		
		System.out.println("\nConsumer consumed:"+n);
			p.release();
		
			
		
	
	}
	void put(int n)
	{
		try
		{
			p.acquire();	
		}
		catch(InterruptedException e)
		{
			System.out.println("\nError\n");
		}

		//this.n=n;
		System.out.println("\nProducer produced:"+n);
		c.release();
		
		
	
	}

}
     

class Producer implements Runnable
{
	Queue q;
	Producer(Queue q)
	{
		this.q=q;
		new Thread(this,"prodeucer").start();
	}
	
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				q.put(i);
				Thread.sleep(1000);
				
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("\nError\n");
		}
	}
}

class Consumer implements Runnable
{
	Queue q;
	Consumer(Queue q)
	{
		this.q=q;
		new Thread(this,"consumer").start();
	}
	
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				q.get(i);
				Thread.sleep(1000);
				
			}
		}
		
		catch(InterruptedException e)
		{
			System.out.println("\nError\n");
		}
	}
}

class Asgn3
{
	public static void main(String args[])
	{
		Queue q=new Queue();
		Producer ob1=new Producer(q);
		Consumer ob2=new Consumer(q);
	}
}