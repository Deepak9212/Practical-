package Abstract;

abstract class parentabs{
	parentabs(){//cons
		System.out.println("No-args constructor");
	}
	abstract void show();//abstract method
	void run() {//non abstract
		System.out.println("Non abstract method");
	}
	
}
class childabs extends parentabs{
	void show() {
		System.out.println("parent abstract method");
	}
}
public class Abstractclasseg {
	public static void main(String[] args) {
		parentabs object=new childabs();
		object.show();
		object.run();
	}

}
