
class A
{
    int i = 50;
 
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method");
    }
}
 
   class Test
{
   public static void main(String[] args)
   {
      //Creating two instances of class A
 
      A a1 = new A();
 
      A a2 = new A();
 
      //Assigning a2 to a1
 
      a1 = a2;
 
      //Now both a1 and a2 will be pointing to same object 
 
      //An object earlier referred by a1 will become abandoned
 
      System.out.println("done");
   }
}