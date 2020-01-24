	import java.util.*;

class Complex
{
 double x,y;
 Complex(double x,double y)
 {
  this.x=x;
  this.y=y;
 }

public Complex add(Complex z1, Complex z2 )
  {
   //Complex temp;
   this.x=z1.x+z2.x;
   this.y=z1.y+z2.y;
   return (this);
  }


public Complex sub(Complex z1,Complex z2)
{
  this.x=z1.x-z2.x;
   this.y=z1.y-z2.y;
   return (this);
}

public Complex mul(Complex z1,Complex z2)
{
  this.x=z1.x*z2.x;
   this.y=z1.y*z2.y;
   return (this);
}
}


class New1
{
 public static void main(String args[])
 {
  Complex z1=new Complex(5,4);
  Complex z2=new Complex(4,3);
  Complex temp1=z1.add(z1,z2);
   System.out.println("X:"+temp1.x+"+i Y:"+temp1.y);

 
   Complex temp2=z1.sub(z1,z2);
  System.out.println("X:"+temp2.x+"+i Y:"+temp2.y);

 
    Complex temp3=z1.mul(z1,z2);
  System.out.println("X:"+temp3.x+"+i Y:"+temp3.y);
 }
}
 




/*
NAME:Ashutosh Satapathy
ROLL NO.:UCSE17002
SEMESTER NO.:3

*/