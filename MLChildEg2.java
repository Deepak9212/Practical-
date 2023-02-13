package Inheritance;

 class MLParenteg3 { //parent class
	int salary=5000;//parent class member
	

}
class MLChildEg1 extends MLParenteg3{
	int bonus=2000; //child class member
	int annualsal=salary+bonus;
	
	}
class MLChildEg2 extends MLChildEg1{
	int da=300;
	int totalsal=annualsal+da;
	public String totalannualfee;
	
public static void main(String[] args) {
	MLChildEg2 object=new MLChildEg2();
	System.out.println("Salary is:"+ object.salary);
	System.out.println("Annual Salary is:"+ object.annualsal);
	System.out.println("total salary is:"+ object.totalsal);
}
}
