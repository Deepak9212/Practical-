package String;
import java.util.Scanner;
public class StringTest {
String str="Hello";
public void show() { //method
	Scanner s=new Scanner(System.in);//user input
	System.out.println("Enter string");//line no 1
	String A=s.next();//1st string
	String B=s.next();//2nd string
	System.out.println(A.length()+B.length());
	System.out.println(A.compareTo (B)>0 ? "Yes" : "No");//compare to ()-lexicographical string
	System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+" "
			+B.substring(0,3).toLowerCase()+B.substring(1));
	//Substring (),upper case,lower case java
	System.out.println("Substring is:"+str.substring(0,3));
	System.out.println("Substring is:"+str.substring(2));
}
	public static void main(String ... args) {
		StringTest t=new StringTest();
		t.show();
	
}
}
