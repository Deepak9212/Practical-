package Inheritance;
// Area of Circle pi*R*R

class AggregatingEg{//class1
	int Square(int r) { //method name square
		return r*r;
		
	}
}
public class AggregatingExCircle {
	AggregatingEg ag;
	double pi=3.14;
	double area (int radius) { //obj (entity ref)
		AggregatingEg ref_var=new AggregatingEg();
	int psquare=ref_var .Square(radius);
	return pi*psquare;
	}
	
public static void main(String[] args) {
	AggregatingExCircle c=new AggregatingExCircle();
double result=c.area(5); //3.14*5*5
System.out.println("Area:"+result);

}
}
