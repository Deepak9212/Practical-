package Exception;

public class DifferentTypeException {
	public void show() {
		//before try -catch block 
		String a = "hey am error";
		System.out.println(a);
		try {
			// arithmetic exception
			int i = 50/0;
			System.out.println(i);
			//null pointer exception
			String s = "Deepak Kumar";
			int n = Integer.parseInt(s);
			System.out.println(n);
		//array index out bound exception
			int arr[] = new int[5];
			arr[7]= 10;
			//number format exception
		//null pointer exception
			String s1= null;
			System.out.println(s1);
		}
			
		catch(Exception e) {
			System.out.println(e);
			
		}
		//after try-catch block
		String b = "The end";
		System.out.println(b);
			
	}
	public static void main(String[] args) {
		DifferentTypeException  ed = new DifferentTypeException ();
		ed.show();
		
	}
}
