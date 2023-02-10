package StaticVariable.java;
//without and with this keyword
 class ThisKeyword1 {
//instance variable 
	 int id;
	 String name;
	 double salary;
	 //parameterized constructor
	 ThisKeyword1(int id,String name, double salary){
		 this.id=id;
		 this.name=name;
		 
	 }
	 //method
	 void display() {
		 System.out.println(id+" "+name+" "+salary);
		 
	 }
	 public class ThisKeyword{//main class
		 public static void main(String[] args) {
			//objects
			 ThisKeyword1 d1=new ThisKeyword1(001,"Ajit",3000);
			 ThisKeyword1 d2=new ThisKeyword1(002,"Ranjeet",7000);
			 d1.display();
			 d2.display();
		}
	 }
}
