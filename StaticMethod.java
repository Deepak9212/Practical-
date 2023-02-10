package StaticVariable.java;

 class StaticMethod1 {
	 //Instance variable
	int rollno;
	String name;
	float fee;
	
	static String college="NGF";//static variable
	//Static method to change the value of Static variable
	static void change(){//static method
	  college="MDU";}
	// parameterized constructor
	StaticMethod1(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		
	}
	//user defined method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
	public class StaticMethod{ //class2
		public static void main(String[]args) {
			//no need to create object for static method
			//calling static method to class name
			StaticMethod1.change();
			//creating object;
			StaticMethod1 s1=new StaticMethod1(110,"Dk",43000);
			StaticMethod1 s2=new StaticMethod1(122,"Sk",56000);
			s1.display();
			s2.display();
		}
		
	}
	

}


