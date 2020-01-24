import java.util.concurrent.*;
class Q
{
int n;
Semaphore sp=new Semaphore(1);
Semaphore sp1=new Semaphore(1);
Semaphore sc=new Semaphore(0);
Semaphore sc1=new Semaphore(0);
void get(int n)
{
try
{
sc.acquire();
}
catch(InterruptedException e)
{
System.out.println("interrupted");
}
System.out.println("Consumer Consumed - "+n);
sp.release();
}
void get1(int n)
{
try
{
sc1.acquire();
}
catch(InterruptedException e)
{
System.out.println("interrupted");
}
System.out.println("Consumer Consumed - "+n);
sp1.release();
}
void put(int n)
{
try
{
sp.acquire();
}
catch(InterruptedException e)
{
System.out.println("Interrupted");
}
this.n=n;
System.out.println("Producer Produced - "+this.n);
sc.release();
}
void put1(int n)
{
try
{
sp1.acquire();
}
catch(InterruptedException e)
{
System.out.println("Interrupted");
}
this.n=n;
System.out.println("Producer Produced - "+this.n);
sc1.release();
}
}
class P implements Runnable
{
Q q;
Thread t;
P(Q q)
{
this.q=q;
t=new Thread(this,"hello");
}
public void run()
{
for(int i=0;i<10;i=i+2)
{
q.put(i);
q.put1(i+1);
}
}
}

class C implements Runnable
{
Q q;
Thread t;
C(Q q)
{
this.q=q;
t=new Thread(this,"helloo");
}
public void run()
{
for(int i=0;i<10;i=i+2)
{
q.get(i);
q.get1(i+1);
}
}
}

class Assignment3
{
public static void main(String args[])
{
Q q=new Q();
P ob1=new P(q);
C ob3=new C(q);
ob1.t.start();
ob3.t.start();
}
}


/*

OUTPUT
======

Producer Produced - 0
Producer Produced - 1
Consumer Consumed - 0
Consumer Consumed - 1
Producer Produced - 2
Producer Produced - 3
Consumer Consumed - 2
Consumer Consumed - 3
Producer Produced - 4
Producer Produced - 5
Consumer Consumed - 4
Consumer Consumed - 5
Producer Produced - 6
Producer Produced - 7
Consumer Consumed - 6
Consumer Consumed - 7
Producer Produced - 8
Producer Produced - 9
Consumer Consumed - 8
Consumer Consumed - 9

*/

