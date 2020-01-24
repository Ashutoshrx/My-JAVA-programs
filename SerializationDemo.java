import java.io.*;
public class SerializationDemo
{
	public static void main(String args[])
	{
		try(ObjectOutputStream obOStrm=new ObjectOutputStream(new FileOutputStream("serial")))
		{
			Myclass ob1=new Myclass("HELLO",5,10.33);
			System.out.println("OBject1:"+ob1);
			obOStrm.writeObject(ob1);
		}
		
		catch(IOException e)
		{
			System.out.println("Exception during seriliziation:"+e);
		}
		
		try(ObjectInputStream objIStrm=new ObjectInputStream(new FileInputStream("serial")))
		{
			Myclass ob2=new Myclass("Ashutosh",6,8.8);
			System.out.println("Object2:"+ob2);
		}
		
		catch(IOException e)
		{
			System.out.println("Exception during deserialisation:"+e);
		}
	}
}

class  Myclass implements Serializable
{
	String s;
	int i;
	double d;
	public Myclass(String s,int i,double d)
	{
		this.s=s;
		this.i=i;
		this.d=d;
	}
	public String toString()
	{
		return "\n s:"+s+"\n i:"+i+"\n d:"+d;
	}
}
		
		
		