package Exception;
// constructor can throw an exception
public class Throws_with_cons {
	String name;
	int age;
	public Throws_with_cons(String name,int age) throws Exception{
		if(age<18) {
			throw new Exception("Age should be more than 18");
		}
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) throws Exception {
		Throws_with_cons obj=new Throws_with_cons("Deepak",20);
		System.out.println(obj.name+" "+obj.age);
	}

}
