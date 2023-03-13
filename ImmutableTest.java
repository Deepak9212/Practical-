package String;

public class ImmutableTest {
	public static void main(String[] args) {
		String str="Deepak";
		str.concat("Kumar");//insert the string at the end
		str=str.concat("Kumar");//it will print Deepakkumar
		System.out.println(str);//it will print Deepak only because string is immutable
	}

}
