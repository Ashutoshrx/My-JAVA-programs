import java.io.*;
import java.util.*;
class InputStreamTest
{
	public static void main(String args[])throws IOException
	{
		int size;
		 FileInputStream fin;
		fin=new FileInputStream("test.txt");
		size=fin.available();
		System.out.println("Total size:"+size);
		System.out.println("First 1/4 is displayed:Using read()");
		for(int i=0;i<size/4;i++)
		{
			System.out.println((char)fin.read());
		}
		System.out.println((char)fin.read());
		System.out.println("NExt 1/4 is displayed:Using read(b[])");
		try
		{
			byte b[]=new byte[size/4];
			if(fin.read(b)!=b.length)
			{
				System.err.println("\nFILE LOADING ERROR\n");
			}
			else
			{
				String temp=new String(b,0,0,b.length);
				System.out.println(temp);
				System.out.println("Still available:"+fin.available());
				System.out.println("Skipping 1/4:Using skip()");
				fin.skip(size/4);
				System.out.println("FIle reaming for read:"+fin.available());
			}
		}
			catch(IOException e)
			{
				System.out.println("Caught"+e);
			}
			finally
			{
				fin.close();
			}
	}
}