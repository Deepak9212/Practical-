package MethodOverloading;

//Method Overloading -same name method with different arguments
//1.changing no.of arguments
//2.changing data types of arguments

public class Overloading_changing__argdatatypes{
	static int sum(int a ,int b) {//integer type arguments
		return a+b;
		
	}//double type arguments
	static double sum(double a ,double b) { //three arguments
		return a+b;
		
	}
	public static void main (String args[]) {
		System.out.println(Overloading_changing__argdatatypes.sum(5, 8));
		System.out.println(Overloading_changing__argdatatypes.sum(2,3));
		
	}

}
