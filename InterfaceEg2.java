package Interface;

interface Shape{
	void shape_name();
	
}
 class cone implements Shape{
	public void shape_name() {
		System.out.println("Draw a circle");
		
	}}
 class square implements Shape{
	public void shape_name() {
		System.out.println("Draw a square");
	}
}
public class InterfaceEg2 {
	public static void main(String[] args) {
		Shape object=new square();
		object.shape_name();
	}

}
