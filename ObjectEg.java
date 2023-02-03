

//3 ways to initialize object in java -By reference variable,by method ,By constructor
package Class.java;
class Object { //class 2
	//instance variable
	int id;
	String name;
}
class ObjectEg{ //main class
	public static void main(String[] args) {
		Object obj=new Object(); //create object-- object is our reference variable
		obj.id=100;
		obj.name="Deepak";
		System.out.println(obj.id+" "+obj.name);//printing member with a white space
		
	}
	
	

}
