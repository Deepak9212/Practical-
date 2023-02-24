package MethodOverriding.java;


class Base{
	public int add(int a,int b) {
		System.out.println("In the base class");
		return a+b;
	}
	public void print() {
		System.out.println("In the base class");
	}
		
	}
class Derived extends Base{
	public int add(int a,int b) {
		System.out.println("In the child class");
		return a+b;
	}
	public void print() {
		System.out.println("In the child class");
	}
	
}
//main class
public class StaticCoverriden {
	public static void main(String[] args) {
		Base obj=new Derived();
		System.out.println(obj.add(4,5));
		obj.print();
	}

}
