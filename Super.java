package Inheritance;
class shape{
	String name="Circle";
	
	
}
class size extends shape{
	String name="No Size";
	void print() {
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class Super {
	public static void main(String args[]) {
		size obj=new size();
		obj.print();
	}

}
