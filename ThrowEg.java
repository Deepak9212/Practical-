package Exception;

public class ThrowEg {
// Whether the student pass or not
	public static void mydisplay(int a) throws ArithmeticException{
	
	if(a>=0 & a<35) {
		//Throw Arithmetic Exception if not then fail
		throw new ArithmeticException("you are pass");
	}
	else {
		System.out.println("you are fail");
	}
}
//main method
public static void main(String[] args) {
	//calling the function
	mydisplay(13);
	System.out.println("rest of the code....");
}}