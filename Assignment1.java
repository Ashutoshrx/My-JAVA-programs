class Human
{
     String name;
     int dob;
	 String fathers_Name;
 
     Human(String Name, int DB, String Fname)
     {
              name = Name;
              dob = DB;
			  fathers_Name = Fname;
      }

      void Display()
      {
            System.out.println("Name : " + name);
            System.out.println("Date of birth : " + dob);
			System.out.println("Fathers Name : " + fathers_Name);
			
       }
	   int age(int d){
	   	 return (2018-dob);
	   }
} 

class Student extends Human
{
     String rollno;
     String branch;
     String rank;
	 String dateofgraduation;
 
     Student(String Name,int DB, String Fname, String rno, String b, String r, String dog)
     {
          super(Name,DB,Fname);
          rollno = rno;
          branch = b;
          rank = r;
		  dateofgraduation = dog;         
      }
     void Display()
     {
            super.Display();

            System.out.println("Rollno : " + rollno);
            System.out.println("Branch : " + branch);
            System.out.println("Rank : " + rank);
			System.out.println("Date of graduation " + dateofgraduation);
			System.out.println("Age of Scholar " + (2018-dob));
     }
}

class Staff extends Human
{
      String date_of_joining;
      int salary;
      String designation; 
 
     Staff(String Name, int DB, String Fname, String doj, int slry, String desgn )
     {
          super(Name,DB,Fname);
          date_of_joining = doj;
          salary = slry;
          designation = desgn;         
      }
     void Display()
     {
            super.Display();

            System.out.println("Date of Joining : " + date_of_joining);
            System.out.println("Salary : " + salary);
            System.out.println("Designation " + designation);
     }
}

class Faculty extends Human
{
      String date_of_joining;
      int salary;
      String designation; 
      String qualification;
      String researchGuided;
      int dateofpromotion; 
 
     Faculty(String Name, int DB, String Fname, String doj,int slry, String desgn,String qua, String rg, int dp )
     {
          super(Name,DB,Fname);
		   date_of_joining = doj;
		   salary = slry;
		   designation = desgn; 
		   
           qualification= qua;
           researchGuided = rg;
          dateofpromotion = dp;        
      }
     void Display()
     {
            super.Display();

            System.out.println("Qualification " + qualification);
            System.out.println("Research Guided: " + researchGuided);
            System.out.println("Date of promotion " + dateofpromotion);
     }
}


class Assignment1
{
       public static void main(String args[])
       {
               Human h = new Human("Soumya",1999,"R C Behera");
               Student s = new Student("Soumya",1999,"RC BEHERA","Ucse17010","CSE", "1st", "2021");
               Staff st = new Staff("P",1970,"Z","2012",6000,"ASSistance");
			   Faculty f = new Faculty("Gautam Sir", 1980,"MR","2017",250000,"Assistance Professor","Phd","X",2018);
               System.out.println("Human :");
               h.Display();
               System.out.println("");
               System.out.println("Student :");
               s.Display();
               System.out.println("");
               System.out.println("Staff :");
               st.Display();
			   System.out.println("Faculty :");
               f.Display();
        }
}