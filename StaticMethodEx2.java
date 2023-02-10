package StaticVariable.java;

public class StaticMethodEx2 {
static int add(int a,int b) {
	return a+b;
}
public static void main(String[] args) {
	int c=StaticMethodEx2.add(6,10);
	System.out.println(c);
}
}
