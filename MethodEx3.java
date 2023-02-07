package methodsinjava;

public class MethodEx3 {
	public static void main(String[] args) {
		int num1=4;
		int num2=6;
		//method calling
		int c=addition(num1,num2);
		System.out.println("sum"+" "+c);
	}
	//declare the method(user defined method)
	public static int addition(int num1,int num2) {
		int sum;
		sum=num1+num2;
		return sum;
	}
	
	

}
