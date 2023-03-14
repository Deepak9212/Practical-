package String;

import java.util.StringTokenizer;

public class Stringtokenizer {//class
	public static void my() {
		StringTokenizer t=new StringTokenizer("i am happy to completed this program");
		while(t.hasMoreTokens()) {
			System.out.println(t.nextToken(" "));
		}
		StringTokenizer st=new StringTokenizer(" I am Deepak & i am from Madhubani bihar");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken(" & "));
	}}
	public static void main(String[] args) {
		my();
	}

}
