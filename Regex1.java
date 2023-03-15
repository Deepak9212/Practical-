package String;

import java.util.regex.Pattern;

//Character class-.....
//[abc]=a,b,c only these 3 char (single)
//[^abc]=any char except abc,(single char)
//[a-z A-Z]=either upper/lower case and both(single char)
public class Regex1 {
	public static void main(String[] args) {
		boolean b1=Pattern.matches("[a-zA-Z]","G");
		boolean b2=Pattern.matches("[pqr]","s");
		boolean b3=Pattern.matches("[^abc]","r");
		System.out.println(b1+" "+b2+" "+b3);
	}

}

