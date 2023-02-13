package Inheritance;

class SIParenteg2{ //parent class
	int salary=40000; //parent class member
}
public class SIChildeg2 extends SIParenteg2 {
	int bonus=1400;
	int annualsal=salary+bonus;
	public static void main(String[] args) {
		SIChildeg2 object=new SIChildeg2();
		System.out.println("Salary is:"+object.salary);
		System.out.println("Annnual salary is:"+object.annualsal);
	}

}
