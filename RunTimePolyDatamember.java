package Polymorphism;
//runtime polymorphism ant achieved by data member
public class RunTimePolyDatamember {
	public static void main(String[] args) {
		papa_mamma object;
		object=new children();
		System.out.println(object.priority);
	}}
	class papa_mamma{//base class
		String priority="High";
	}
	class children extends papa_mamma{//child class
		String priority="Super_High";
	}


