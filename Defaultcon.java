package Constructor;

import java.util.Scanner;

//Display default value
public class Defaultcon {
	int age;
	String name;
	void show() {//method to display age and name
		System.out.println(age+" "+name);}
	public static void main(String[] args) {
		//first object for name and age
		Defaultcon d=new Defaultcon();
		//2nd object for name and age
		Defaultcon d1=new Defaultcon();
		d.show();
		d1.show();
	
	}
		
		
	}


