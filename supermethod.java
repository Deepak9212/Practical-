package Inheritance;
class shape1{
	void print() {
		System.out.println("print circle");
	}
	
	
}
class size1 extends shape1{
	void print() {
		System.out.println("print triangle");}
	void display() {
		System.out.println("print nothing");}

void show() {
	super .print();
	display();
	print();
}
	}
class supermethod {
	public static void main(String args[]) {
		size1 obj=new size1();
		obj.show();
	}
}


