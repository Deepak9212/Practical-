package MultipleInheritanceAbstract;

interface New_Employee{//parent interface1
	void salary();//abstract method salary for parent class
	
}
interface New_Developer { //parent interface 2
	 void salary() ;//abstract method bonus for parent class
		
	}
class new_Trainer implements New_Employee,New_Developer{
	public void salary() {
		System.out.println("salary Incremented");
	}
}
public class MultipleIn_Interface_Eg2{
	public static void main(String[] args) {
		new_Trainer object=new new_Trainer();
		object.salary();

	}

}

