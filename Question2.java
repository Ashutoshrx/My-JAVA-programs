import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

abstract class Drink
{
	double unit_price;
	String drink_id;
	Drink(String a,double b )
	{
		unit_price=b;
		drink_id=a;
	}
	abstract void compute_total_price();
	abstract void show();
}

class DrinkCylinder extends Drink
{
	int radius;
	int height;
	DrinkCylinder(String a,double b,int c,int d)
	{
		super(a,b);
		radius=c;
		height=d;
	}
	void compute_total_price()
	{
		int y=(22/7)*radius*height*radius;
		double x=super.unit_price*y;
		System.out.println("The total price of the cylinder is:"+x);
	}
	void show()
	{
		System.out.println("The details are:"+super.drink_id+",RS."+super.unit_price+"/-,"+radius+","+height);
		System.out.println("The ");
	}
}

class DrinkBox extends DrinkCylinder
{
	int width;
	int depth;
	DrinkBox(String a,double b,int c,int d,int e,int f)
	{
		super(a,b,c,d);
		width=e;
		depth=f;
	}
	void compute_total_price()
	{
		int y=super.height*width*depth;
		double x=super.unit_price*y;
		System.out.println("The total price if the box is:"+x);
	}
	void show()
	{
		System.out.println("The details are:"+super.drink_id+",RS."+super.unit_price+"/-,"+super.radius+","+super.height+","+width+","+depth);
	}
}
	
class Question2
{
	public static void main(String args[])
	{
		char  input1;
		String inputInfo=new String();
		String line=new String();
		boolean found=false;
		ArrayList drinkList=new ArrayList();
		
		try
		{
			printMenu();
			
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader stdin= new BufferedReader(isr);
			
			do
			{
				System.out.println("What action would you like to perform?(Enter in CAPS)");
				line=stdin.readLine().trim();
				input1=line.charAt(0);
				input1=Character.toUpperCase(input1);
				DrinkBox ob1=new DrinkBox(inputInfo,10.3,6,6,6,6);
				if(line.length()==1)
				{
					switch (input1)
					{
						case 'A':
							System.out.println("Please enter a drink information to add:\n");
							inputInfo=stdin.readLine().trim();
							
							drinkList.add(inputInfo);
							break;
								
						case 'C':
							
							//DrinkBox ob1/*=new DrinkBox(inputInfo,10.3,6,6,6,6);
							DrinkCylinder ob2=new DrinkCylinder(inputInfo,10.5,8,5);
							drinkList.add(inputInfo);
							System.out.println("The total prices are:");
							ob1.compute_total_price();
							ob2.compute_total_price();
							break;
							
						case 'D':
							System.out.println("\n Enter the drinkid to search \n ");
							inputInfo=stdin.readLine().trim();
						
							
								if(drinkList.contains(inputInfo))
								{
									found =true;
								}
								
								else
								{
									System.out.println("\n FATAL ERROR\n");
								}
								if(found==true)
								{
									System.out.println("\nItem is in the list\n");
								}
								
							break;
							
						case 'L':
							System.out.println("The array is:"+drinkList);
							break;
							
						case 'Q':
							break;
							
						case '?':
							printMenu();
							break;
							
						default:
						
							System.out.println("Unknown Action \n");
							break;
						
							
					}
				}
				
				else
				{
					System.out.println("Unknown Action \n");
				}
				
			}
			while(input1 !='Q');
		}
		catch(IOException exception)
		{
			System.out.println("IO Exception.");
		}
	}


	public static void printMenu()
	{
		System.out.print("Choice\t\tAction\n"+
						"-------\t\t------\n"+
						"C\t\tComputer total prices\n"+
						"D\t\tSearch for Drink\n"+
						"Q\t\tQuit\n"+
						"?\t\tDisplay Help\n\n");
	}
}
/*
NAME:ASHUTOSH SATAPATHY
ROLL:UCSE17002
ASSIGNMENT NO.:3
SEMESTER NO.:3
*/						
		
						
						
							
							
									
							
							
							


	