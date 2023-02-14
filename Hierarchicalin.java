package Inheritance;

//Hierarchical Inheritance

class Vehicle1{ //parent class A
	void running() {
		System.out.println("running mode on");
	}
}
class Car1 extends Vehicle1{ //child class 1
	void run() {
		System.out.println("car run mode on");
	}
}
class Bike1 extends Vehicle1{ //child class 1
	void Speed() {
		System.out.println("Speed is very high");
	}
}


public class Hierarchicalin { 
	public static void main(String[] args) {
		Bike1 b=new Bike1();
		b.running();
		b.Speed();
		Car1 c=new Car1();
		c.running();
		c.run();
	}

}
