package String;
//append() insert() replace() delete() reverse() -mutable class(string builder& buffer)
public class mutableexamplestring {
public static void my() {
	//string Buffer
	StringBuffer s=new StringBuffer("Hello");//object of string buffer class
	s.append("World");
	System.out.println("String is :"+s);//hello world
	s.insert(2, "Rani");//(int off set ,string s)
	System.out.println("Insert is :"+s);//heyriyallo world
	s.replace(1, 3,"java");//beginwith endswith string s
	System.out.println("Replace is :"+s);
	System.out.println("Capacity is :"+s.capacity());
	
	//String Builder
	StringBuilder s1=new StringBuilder("world");
	s1.replace(1, 3, "java");
	System.out.println("replace is :"+s1);
	s1.delete(1,3);
	System.out.println("delete is :"+s1);
	s1.reverse();
	System.out.println("reverse is :"+s1);
}
public static void main(String[] args) {
	my();
}
}
