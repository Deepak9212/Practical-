package String;
//char[] work same as java string
public class StringExample1 {
	public void show() { //method1
		char [] arr= {'j','a','v','a'};//char type array
		System.out.println(arr);
		String s=new String(arr);
		System.out.println("value is:"+s);//"java"
	}
	public void myFunction() {
		String s1="Deepak";
		String s2=new String(s1);//by using new keyword creating  string obj
		System.out.println(s2);//Deepak
	}
	public static void main(String[] args) {
		StringExample1 str=new StringExample1();
		str.show();
		str.myFunction();
	}

}
