package Array;

public class ArrayEg2 {
	public static void main(String[] args) {
		int a[]=new int[5];//declaring and instantiation
		//initialization
		a[0]=4;
		a[1]=5;
		a[2]=7;
		a[3]=5;
		a[4]=6;
		//traversing an array
		for(int i:a) 
			System.out.println(i);
		//for(int i=0;i<a.length;i++)//length is one of the property of an array
		//System.out.println(a[i]);
	}

}
