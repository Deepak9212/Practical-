package MethodOverriding.java;
//Final keyword 
//final variable cannot be change the value of final variable
public class FinalVariable {
	final int value=60; //final variable
	void display() {
		System.out.println(value);
		//we cannot change the value of final variable
		//value=70;
	}
	public static void main(String[] args) {
		FinalVariable fv=new FinalVariable();
		fv.display();
	}

}
