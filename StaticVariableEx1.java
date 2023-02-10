package StaticVariable.java;

class StaticVariableEx {//class
	int rollno;
	String name;
	float fee;
	static String college="DCTM";
	//static void change(){
	//college="YMCA";}
	//constructor
	StaticVariableEx(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		
	}
	//method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
	public class StaticVariableEx1{ //class2
		public static void main(String[]args) {
			//Ex1.change();
			//object;
			StaticVariableEx s1=new StaticVariableEx(101,"Deepak",4000);
			StaticVariableEx s2=new StaticVariableEx(102,"Sonu",5000);
			s1.display();
			s2.display();
		}
		
	}
	

}
