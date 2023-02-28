package MultipleInheritanceAbstract;

//inheritance with interface
interface Parent{
	void show();
}
interface child extends Parent{//child interface (interface inherit interface with extends)
	void display();
	
}
class child1 implements child{ //another child class(interface inherit by class with implement)
	public void show() {
		System.out.println(" parent interface method");
	}
	public void display() {
		System.out.println("child interface method ");
	}
}
public class INheritance_Interface {
	public static void main(String[] args) {
		child1 object=new child1();
		object.display();
		object.show();
	}

}
