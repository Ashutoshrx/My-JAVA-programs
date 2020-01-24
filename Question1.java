class Human
{
	String name;
	int dob;
	String father_name;
	Human(String a,int b,String c)
	{
		name=a;
		dob=b;
		father_name=c;	
	}
	void calculate_age()
	{	
		int age=2018-dob;
		System.out.println("The age is:"+age);
	}
	void vitalMark()
	{
		System.out.println("NAME:"+name+"  ,  DOB:"+dob);
	}
}

class Student extends Human
{
	private String roll;
	private String branch;
	private int rank;
	private int DOG;
    Student(String a,int b,String c,String d,String e,int f,int g)
	{
		super(a,b,c);
		roll=d;
		branch=e;
		rank=f;
		DOG=g;
	}

	void ageofscholar()
	{
		int s=DOG-2018;
		System.out.println("The age of scholar is:"+s);
	}
	void vitalMark()
	{
		System.out.println("Name:"+super.name+"  ,  DOG:"+DOG);
	}
}

class  Staff extends Human
{
	int doj;
	String designation;
	double salary;
	Staff(String a,int b,String c,int d,String e,double f)
	{
		super(a,b,c);
		doj=d;
		designation=e;
		salary=f;
	}
	void ageofsuperannuation()
	{
		int y=dob+60;
		if(y<2018)
		{
			int flag=2018-y;
			System.out.println("The age of the superannuation is:"+flag);
		}
		else
		{
			System.out.println("He hasn't yet retired");
		}
	}
	void vitalMark()
	{
		System.out.println("Name:"+super.name+"  ,  DOJ:"+doj);
	}
}

class Faculty extends Staff
{
	String qual;
	String Research;
	int DOP;
	Faculty(String a,int b,String c,int d,String e,double f,String l,String m,int n)
	{
		super(a,b,c,d,e,f);
		qual=l;
		Research=m;
		DOP=n;
	}
	
	void PromotionDue()
	{
		int x=DOP+3;
		System.out.println("The Promotion due is:"+x);
	}
	void vitalMark()
	{
		System.out.println("NAME:"+super.name+"  ,  DOP:"+DOP);		
	}
}

class Question1
{
	public static void main(String args[])
	{
		//Faculty ob5[]=new Faculty[4];
		Faculty ob1=new Faculty("Ashutosh",1970,"Mister",2001,"Supervisor",100000,"MTech","Statician",2010);
		Staff ob2=new Staff("Ronnie",1945,"Mistress",2002,"Supervisor",100000);
		Student ob3=new Student("Satapathy",1999,"Hello","Ucse17002","Comp_Sci",9,2021);
		Human ob4=new Human("Ashutosh Satapathy",1999,"Doctor madam");
		ob1.PromotionDue();
		ob2.ageofsuperannuation();
		ob3.ageofscholar();
		ob4.calculate_age();
		System.out.println("THE ARRAY IS AS FOLLOWS:");
			ob1.vitalMark();
			ob3.vitalMark();
			ob2.vitalMark();
		    ob4.vitalMark();
        		
	}
}
/*
NAME:ASHUTOSH SATAPATHY
ROLL:UCSE17002
ASSIGNMENT NO.:3
SEMESTER NO.:3
*/


		