package mypackage;

public class Encapsulated_ex {
	public static void main(String[] args) {
		personone p=new personone(); //create of the object of encapsulated person class
		p.setName("Deepak");//setting value in the name
		p.setAge(22);//setting value in the age
		//getting value of the name and the age
		System.out.println("Name is :"+p.getName());
		System.out.println("Age is :"+p.getAge());
		}

}
