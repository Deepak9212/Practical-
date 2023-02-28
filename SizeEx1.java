package Interface;

abstract public class SizeEx1 {
	 abstract void calculate_Area();
	}
	 class Circle extends SizeEx1{
		  void  calculate_Area(){
			 System.out.println(" circle area formula: 2*pi*r*hy");
			 
		 }
	 }
	 class Rectangle  extends SizeEx1{
		    void  calculate_Area(){
			 System.out.println(" rectangle area formula:l*w");
	 }public static void main(String[] args) {
		 SizeEx1 object = new Circle();
		object.calculate_Area();
		SizeEx1 obj = new Rectangle  ();
		obj.calculate_Area();
	}
		    }
