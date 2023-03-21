package Exception;

public class Multicatch {
static void myFunc() {
	try {
		int i=50/2;//Arithmetic // 50/2
		System.out.println(i);//arithmetic
		int arr[]=new int[3];//Array index out of the bound
		arr[7]=24;
	}
	catch(ArithmeticException e) {
		System.out.println(" only 1st Arithmetic exception will excute");
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(" now Array index out of the bound will occure");
		
}
	finally {
		System.out.println("I am finally block");
	}
}
public static void main(String[] args) {
	myFunc();
}}
