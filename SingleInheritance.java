package Inheritance;

public class SingleInheritance {//main class
	public static void main(String[] args) {
		SIChild child=new SIChild();//create a object
		child.display();
		child.show();
	}
}


class SIParent{ //parent class
	void show() {//parent class user defined method
		System.out.println("show the details");
		
	}}
	class SIChild extends SIParent{//child class
		void display() {//child class user defined method
		
			System.out.println("Display the result");
		}

	
	}
	


