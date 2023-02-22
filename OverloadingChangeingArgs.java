package MethodOverloading;
//Method Overloading -same name method with different arguments
//1.changing no.of arguments
//2.changing data types of arguments

public class OverloadingChangeingArgs {
	static int sum(int a ,int b) {//two  parameters/arguments
		return a+b;
		
	}
	static int sum(int x,int y,int z,int c) { //three arguments
		return x+y+z;
		
	}
	public static void main (String args[]) {
		System.out.println(OverloadingChangeingArgs.sum(5, 6));
		System.out.println(OverloadingChangeingArgs.sum(2,3,4,1));
		
	}

}
