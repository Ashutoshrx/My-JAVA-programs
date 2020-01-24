class Point
{
	double x,y;
	Point(int a,int b)
	{
		x=a;
		y=b;
	}
	
	Point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	void printPoint()
	{
		System.out.println("X="+this.x+"Y="+this.y);
	}
}


class Practice1
{
	public static void main(String  args[])
	{
		Point p1=new Point(10,20);
		p1.printPoint();
		Point p2=new Point(5.5,4.2);
		p2.printPoint();
	}
}

/*
NAME:ASHUTOSH SATAPATHY
ROLL:UCSE17002
ASSIGNMENT NO.:3
SEMESTER NO.:3
*/