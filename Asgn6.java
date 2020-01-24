class A<T> 
{
	
	T ob[];
	
	A(T x[])
	{
		ob=x;
	}
	T get_ob()
	{
		return ob;
	}
	public void findmin()
	{
	
			T min=ob[0];
			for(int i=1;i<ob.length;i++)
			{
				System.out.println(ob[i]);
		}

	}
}


class Asgn6
{
	public static void main(String args[])
	{
		int ob1[]={1,2,3,4,5,6};
		A<Integer> ob3=new A<Integer>(ob1);
		System.out.println("The minimum is:"+ob3.get_ob());
	/*	
		String ob2[]={"Ashutosh","Satpathy","Ronnie"};
		A<String> ob4=new A<String>(ob2);
		
		//System.out.println("The minimum is:"+ob1.findmin());
		System.out.println("The minimum is:"+ob4.get_ob());*/
	}
		
}