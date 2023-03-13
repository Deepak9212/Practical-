package String;

import java.util.Scanner;

//check equality by using equal () method
public class StringEquality {
public static void main(String[] args) {
	String str1,str2;
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter first string");
	str1=ab.nextLine();
	
	System.out.println("Enter second string");
	str2=ab.nextLine();
	//comparing two input string (java string compare)
	//if(str1.equals(str2))//equals()-compare original content of string
	//if(str1==str2)//== compare reference not value
	if(str1.compareTo(str2)>0)//compare lexicographically
		System.out.print("Equal strings");
	else
		System.out.print("unEqual strings");
}
}
