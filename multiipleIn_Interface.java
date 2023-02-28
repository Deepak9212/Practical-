package MultipleInheritanceAbstract;

//multiple inheritance -more than one parent class /interface
interface Employee{//parent interface1
	void salary();//abstract method salary for parent class
	
}
interface Developer { //parent interface 2
	 void Bonus() ;//abstract method bonus for parent class
		
	}
class Trainer implements Employee,Developer{
	public void Bonus() {
		System.out.println("bonus will be 10% on salary");
	}
	public void salary() {
		System.out.println("salary Incremented");
	}
}
public class multiipleIn_Interface {
	public static void main(String[] args) {
		Trainer object=new Trainer();
		object.Bonus();
		object.salary();
	}

}
