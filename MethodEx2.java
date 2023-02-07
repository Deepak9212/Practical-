package methodsinjava;

import java.util.Scanner;

public class MethodEx2 {
	
	public static void main(String[] args) {
		
		//create Scanner class
				int num,i;
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			 num=sc.nextInt();
		
			//call the method
			 findPrimeNumber(num);
		
		}
	

	
	//create a method
	public static  void findPrimeNumber(int num) {
		int count = 0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			
		}
		}
		
	

if(count==2) {
	System.out.print("prime number");
}
else {
	System.out.print("not prime number");


}
		}
}
		
	


	
