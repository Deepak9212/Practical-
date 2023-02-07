package Constructor;

public class Parameterizedcons {
int age;
String name;
//parameterized cons where we have to pass the parameter / arguments
Parameterizedcons(int a,String n){
	age=a;
	name=n;
}
void show() {
	System.out.println(age+" "+name);}
public static void main(String[] args) {
	Parameterizedcons d=new Parameterizedcons(60,"sonu");
	Parameterizedcons d2=new Parameterizedcons(20,"Deepak");
	Parameterizedcons d3=new Parameterizedcons(23,"Monu");
	d.show();
	d2.show();
	d3.show();
	
}
}
