abstract class Shape
{
	double dim1,dim2;
	Shape(double a, double b)
	{
		dim1=a;
		dim2=b;
	}
    abstract double find_area();
}



class Rectangle extends Shape
{
	Rectangle(double a,double b)
	{
		super(a,b);
	}
	double find_area()
	{
		return dim1*dim2;
	}
}

class Area
{
	public static void main(String args[])
	{
		//Shape s=new Shape(1,2);
		Rectangle r=new Rectangle(3,4);
		/*Shape sref;
		sref r;*/
		System.out.println("The area is:"+r.find_area());
	}
}