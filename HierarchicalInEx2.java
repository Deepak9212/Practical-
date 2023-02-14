package Inheritance;

class Employee{
int salary=20000000;
int bonus=49000;
void action() {
	int updated_salary=salary+bonus;
	System.out.println(updated_salary);
	
}
}
class Engineer extends Employee{
	int benifits=100;
	
}
class Doctor extends Employee{
	int da=200;
}

public class HierarchicalInEx2 {
	public static void main(String[] args) {
		Engineer e=new Engineer();
		System.out.println(e.salary+" "+e.benifits+"  " +"incremented salary for Enginer");
		e.action();
				Doctor d=new Doctor();
				System.out.println(d.salary+" "+d.da+"  "+"incremented salary for doctor");
		d.action();
				}
}


