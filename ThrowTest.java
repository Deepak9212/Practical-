package Exception;
//another unchecked example of throw keyword
public class ThrowTest {
public static void checknum(int num) {
	if(num<0) {
		throw new ArithmeticException("Number is negative");
	}else
	{
		System.out.println("Number is positive");
	}
}
public static void main(String[] args) {
	checknum(-1);
	System.out.println("Excuted");
}
}
