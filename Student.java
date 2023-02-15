package Inheritance;

public class Student { //class
	int id;
	String name;
	Address address; //Aggretion (entity ref of address class)
	public Student(int id,Address address,String name) {
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
		
	}
	public static void main(String[] args) {
		Address address1=new Address("Madhubani","Bihar","India");
		Address address2=new Address("Darbhanga"+ "","Bihar","India");
		Student s=new Student(4,address1,"Deepak");
		Student s1=new Student(4,address2,"Jaipur");
		s.display();
		s1.display();
	}

}
