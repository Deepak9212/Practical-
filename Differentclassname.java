package Constructor;

public class Differentclassname {
	int age;
	String name;
	void show() {//method to display age and name
		System.out.println(age+" "+name);}
	public static void main(String[] args) {
		//first object for name and age
		 Differentclassname d=new  Differentclassname();
		//2nd object for name and age
		 Differentclassname d1=new  Differentclassname();
		d.show();
		d1.show();
		 Differentclassname d3=new  Differentclassname();
	d3.age=100;
	d3.name="Java";
	System.out.println(d3.age+d3.name);
}}
