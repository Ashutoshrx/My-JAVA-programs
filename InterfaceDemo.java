interface  Callback
{
	void callme(int p);
}

class  A implements Callback
{
	public void callme(int p)
	{
		System.out.println("The number  you want to  print  is:"+p);
	}
}

class InterfaceDemo
{
	public  static  void main(String args[])
	{
		A ob=new A();
		Callback iob=ob;
	    iob.callme(5);
	}
}