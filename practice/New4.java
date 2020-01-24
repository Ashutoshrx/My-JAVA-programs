import java.util.*;
class Complex
{
	double x,y;
	Complex(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public Complex add(Complex z1,Complex z2)
	{
		this.x=z1.x+z2.x;
		this.y=z1.y+z2.y;
		return (this);
	}
	
}

class New4
{
	public static void main(String args[])
	{
		Complex z1=new Complex(5,4);
		Complex z2=new Complex(4,3);
		Complex temp=z1.add(z1,z2);
		System.out.println("\nThe addition is:\n"+temp.x+ "+ I "+temp.y);
	}
}