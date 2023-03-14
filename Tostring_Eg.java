package String;
//represent any object to string
public class Tostring_Eg {
	int rollno;
	String name,addr;
	Tostring_Eg(int rollno,String name,String addr){
		this.rollno=rollno;
		this.name=name;
		this.addr=addr;
		
	}
public String toString() {//return object to string
	//return super.toString();//object to string
	return rollno+" "+name+" "+addr;
	
}
public static void main(String[] args) {
	  Tostring_Eg s1 = new Tostring_Eg(1,"Raja","Mumbai");//return the hascode value of an object
	  Tostring_Eg s2 = new Tostring_Eg(1,"sonu","Delhi");
	
	System.out.println(s1);
	System.out.println(s2);
}
}
