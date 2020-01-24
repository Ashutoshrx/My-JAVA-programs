
class A implements Runnable
{
	int a[];
	int temp;
	A(int a[])
	{
		this.a=a;
		Thread t1=new Thread(this);
		t1.start();
	}
	public void run()
	{

			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}

	}
	
	void display()
	{
		System.out.println("\nThe Ascending order is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
	}
}

class B implements Runnable
{
	int a[];
	int temp;
	B(int a[])
	{
		this.a=a;
		Thread t2=new Thread(this);
		t2.start();
	}
	
	public void run()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	void display()
	{
			System.out.println("\nThe Descending order is:\n");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
	}
}

class Asgn2
{
	public static void main(String args[])
	{
		int a[]={2,8,7,6,10};
		A ob1=new A(a);	
		ob1.display();
		B ob2=new B(a);
		ob2.display();
	}
}