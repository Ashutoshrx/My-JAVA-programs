class Car
{
	int speed;
	car();
	{
		speed=50;
	}
	protected void finalize()
	{
		System.out.println("Finalize is in car class");
	}
}


class bike
{
	int speed;
	bike();
	{
		speed=50;
	}
	protected void finalize()
	{
		System.out.println("Finalize is in bike class");
	}
}


class Example
{
	public static void main(String args[])
	{
		car c=new car();
		bike b=new bike();
		c=null;
		Systm.gc();
		for(b.speed=1;b.speed<=10;b.speed++)
		{
			System.out.println("Speed of bike"+b.speed);
		}
		b=null;
		System.gc();
		for(c.speed=1;c.speed<=10;c.speed++)
		{
			System.out.println("Speed of car"+c.speed);
		}
	}
}


