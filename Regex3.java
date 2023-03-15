package String;

import java.util.regex.Pattern;

//Quantifiers
//x? -x occurs once or not at all
//x+ -x occurs once or more than once
//x* -x occurs zero or more time
//x{n}- x occurs n time x(7) only 7 char
//x{n,} -x occurs one or more time x{7,} only 7 char or more
public class Regex3 {
	public static void main(String[] args) {
		boolean b7=Pattern.matches("[A-Za-z0-9]{8,}","Anudip123sss");
		System.out.println(b7);
		boolean b8=Pattern.matches("[A-Za-z0-9+.+@]{19,}","Pallabi.Anudip@2023");
		System.out.println(b8);
		boolean b6=Pattern.matches("[0-9]{10}","7370957311");
		System.out.println(b6);
		//other method print mobile number
		boolean b5=Pattern.matches("[6789]{1}[0-9]{9}","7370957312");
		System.out.println(b5);
		//print email
		boolean b4=Pattern.matches("[A-Za-z0-9+@+.]{18,}","dk0192987@gmail.com");
		System.out.println(b4);
		
	}

}
