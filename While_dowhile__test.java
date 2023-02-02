package ControlStatement.java;

import java.util.Scanner;

//find out the sum of positive numbers
public class While_dowhile__test {
	public static void main(String[] args) {
		
	

	int sum=0;
	int number=0;
	 //Scanner class
	Scanner sc=new Scanner(System.in); // take input from user
	
	System.out.println("Enter the number");
	 number=sc.nextInt();
	while(number>=0) { // add only positive numbers(condition)
		sum+=number; 
		System.out.println("Enter the number");
		number=sc.nextInt();
	}
	System.out.println("sum is:"+sum);
	sc.close();
	}
	
}
