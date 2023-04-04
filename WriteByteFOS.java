package IO;

import java.io.FileOutputStream;

//write string to byte array ----write byte with file output
public class WriteByteFOS {
public static void main(String[] args) {
	try {
		//Destination
		FileOutputStream f=new FileOutputStream("D://wel.txt");
		String s="Welcome to Anudip ";
		byte b[]=s.getBytes(); //converting a string into byte array
		f.write(b);
		f.close();
		System.out.println("Ok");
	}
	catch (Exception e) {
		System.out.println(e);
	}
}
}
