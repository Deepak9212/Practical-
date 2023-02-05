package methodsinjava;

import java.util.Scanner;

public class MethodEx1 {
public static void main(String[] args) {
	//create Scanner class
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	//real number from user
	int num=sc.nextInt();
	//call the method
	findevenodd(num);
}
//create a method

public static void findevenodd(int num) {
	if(num%2==0) {
	System.out.println(num +" "+"Even");	
}
	else {


	System.out.println(num +" "+"odd");
}
}
}
