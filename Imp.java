import java.util.*;

class Complex
{
	int x,y;
	Complex(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	Complex add(Complex z1)
	{
		this.x=z1.x+z1.x;
		this.y=z1.y+z1.y;
		return (this);
	}
}

class Imp
{
	public static void main(String args[])
	{
		Complex z1=new Complex(5,4);
		Complex temp=z1.add(z1);
		System.out.println(temp.x+"+ I "+temp.y);
	}
}