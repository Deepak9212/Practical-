package Threads;
//without wait(),notify(),notifyAll()
class Sync{
	int i;
	synchronized void display(int i) {
		this.i=i;
		System.out.println("Data displayed:"+i);
	}
	synchronized int received() {
		System.out.println("Data received:"+i);
		return i;
	}
}
class First_Thread extends Thread{
	Sync obj;
	
	First_Thread(Sync obj){
		this.obj=obj;
	}
	public void run() {
		for (int j=1; j<=10;j++) {
			obj.display(j);
		}
	}
}
class Second_Thread extends Thread{
	Sync obj;
	Second_Thread(Sync obj){
		this.obj=obj;
		
	}
	public void run() {
		for (int j=1; j<=10;j++) {
			obj.received();
		}
			
}}
public class Inter_Thread_com {
public static void main(String[] args) {
	Sync obj=new Sync();
	First_Thread t=new First_Thread(obj);
	Second_Thread t1=new Second_Thread(obj);
	t.start();
	t1.start();
}
}
