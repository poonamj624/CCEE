// class lock with ReentrantLock  
import java.util.concurrent.locks.*;
public class Demo2 implements Runnable
{
	static ReentrantLock mylock=new ReentrantLock();
	static void disp()
	{
		mylock.lock();
		for(int i=0;i<5;i++)
		{	
			System.out.println("Hello"+i);
		}
		mylock.unlock();
	}
	public void run()
	{
		disp();
	}
	public static void main(String args[])
	{
		Demo2 ob1=new Demo2();
		Demo2 ob2=new Demo2();
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		t1.start();
		t2.start();
	}
}