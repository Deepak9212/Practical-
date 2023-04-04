package Threads;
//without wait(),notify(),notifyAll()
class Sync1{
	int i;
	boolean flag=false;
	synchronized void display(int i) {
		if (flag)
			try {
				wait();
			}
		catch (InterruptedException ie) {
			System.out.println(ie);
		}
		this.i=i;
		flag=true;
		System.out.println("Data displayed:"+i);
		notify();
	}
	synchronized int received() {
		if(!flag)
			try {
				wait();
			} 
		catch(InterruptedException ie) {
			System.out.println(ie);	
		}
	
	System.out.println("Data received:"+i);
	flag=false;
	notify();
	return i;
}
	}
class First_Thread1 extends Thread{
	Sync1 obj;
	
	First_Thread1(Sync1 obj){
		this.obj=obj;
	}
	public void run() {
		for (int j=1; j<=10;j++) {
			obj.display(j);
		}
	}
}
class Second_Thread1 extends Thread{
	Sync1 obj;
	Second_Thread1(Sync1 obj){
		this.obj=obj;
		
	}
	public void run() {
		for (int j=1; j<=10;j++) {
			obj.received();
		}
			
}}
	
public class Inter_Thread_Com2 {
	public static void main(String[] args) {
		Sync1 obj=new Sync1();
		First_Thread1 t=new First_Thread1(obj);
		Second_Thread1 t1=new Second_Thread1(obj);
		t.start();
		t1.start();
	}
	}

