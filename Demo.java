class A<T extends Number>
{
	
	T[] ob;
	A(T[] x)
	{
		ob=x;
	}
	Double FindMin()
	{
		Double min=0.0;
		for(int i=0;i<ob.length;i++)
		{
			min+=ob[i].doubleValue();
		}
		return min/ob.length;
	}
	
}

class Demo
{
	public static void main(String args[])
	{
		Double ob2[]={1.1,2.5,3.6,4.5};
		A <Double> ob1=new A<Double>(ob2);
		Double v=ob1.FindMin();
		System.out.println(v);
		
	}
}