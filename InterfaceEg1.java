package Interface;

interface ParentInterface{
	void show();//by default interface method
	default void print() { //java 8 onwards
		System.out.println("Default method");
	}
	static void display() {//java 8 onwards
		System.out.println("static method");
	}
}
public class InterfaceEg1  implements ParentInterface {//class implement interface
	public void show() {
		System.out.println("parent interface method");
	}
public static void main(String[] args) {
	InterfaceEg1 object=new InterfaceEg1();
	object.show();
}
}
