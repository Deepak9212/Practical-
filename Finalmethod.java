package MethodOverriding.java;
//Final keyword 
//final method  cannot override the final method

class Finalmethod1{
	final void display() {
		System.out.println("This is a final method.");
	}
}
class Child1 extends Finalmethod1{
	//try to override final method
	/*public final void display() {
		System.out.println("The final method is Overridden");
		
	}*/
}
public class Finalmethod {
	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.display();
	}

}
