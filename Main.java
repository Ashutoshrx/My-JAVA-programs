import java.util.concurrent.Semaphore;
class Queue
{
	int n;
	 Semaphore p=new Semaphore(0);
	 Semaphore p1=new Semaphore(1);
	 Semaphore c=new Semaphore(0);

	void get(int n)
	{
		try
		{
			c.acquire();
		}
		catch(InterruptedException e)
		{
			System.out.println("Error"+e);
		}
		System.out.println("GEt:"+n);
		p.release();
		p1.release();
	}
	
	

	
	void put(int n)
	{
		try
		{
			p.acquire();
			p1.acquire();
		}
		catch(InterruptedException e)
		{
			System.out.println("Error"+e);
		}
		this.n=n;
		System.out.println("PUT:"+n);
		c.release();
	}
}



class Producer implements Runnable 
{ 
    Queue q; 
    Producer(Queue q) { 
        this.q = q; 
        new Thread(this, "Producer").start(); 
    } 
      
    public void run() { 
        for(int i=0; i < 5; i++)  
		{ 
            q.put(i);
			//Thread.sleep(1000)throws Exception;
			
		}			
    } 
}

class Consumer implements Runnable
{
	Queue q;
	Consumer(Queue q)
	{
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	
	public void run()
	{
		
			for(int i=1;i<5;i++)
			{
				q.get(i);
			//	Thread.sleep(1000);
			}
		
	}
}

class Main
{
	public static void main(String args[])
	{
		Queue q=new Queue();
		new Producer(q);
		new Consumer(q);

	}
}
