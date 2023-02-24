package Polymorphism;
//runtime polymorphism --Dynamic method Dispatch
//overload a static method called by the reference variable of papa class
//overridden  method called by the referencce variable of papa class
//overridden method is resolved at runtime rather than compile time
public class RunTimepoly {
	public static void main(String[] args) {
		Java_student js;
		js=new Sana();
		System.out.println("quality of sana is:"+js.quality());
		js =new Hemant();
		System.out.println("quality of Hemant is:"+js.quality());
	}

}
class Java_student{//parent class
	String quality() {
		return null;
	}
}
class Ritu extends  Java_student{//child class
	String quality() {
		return "artist";
	}
}
class Hemant extends  Java_student{//child class
	String quality() {
		return "Active";
	}
}
class Sana extends  Java_student{//child class
	String quality() {
		return "Good in nature";
	}
}
class Prince extends  Java_student{//child class
	String quality() {
		return "unable to run code";
	}
}

