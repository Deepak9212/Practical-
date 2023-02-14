package Inheritance; 
public class MultiLevelInheritance { //main class
	public static void main(String[] args) {
		SIChild2 child=new SIChild2(); //create a object of a child class
		child.display();
		child.show();
		child.print();
	}
	}

class SIParent1{ //parent class
	void show() {//parent class user defined method
		System.out.println("show the details");
	}
	}
//child class of a SIparent &parent class of SIchild2
	class SIChild1 extends SIParent1{//child class
		void display() {//child class user defined method
		
			System.out.println("Display the result");
		}
	}
	class SIChild2 extends SIChild1{//child class
		void print() {//child class user defined method
		
			System.out.println("Print the output");
		}

	
		
	}
	
