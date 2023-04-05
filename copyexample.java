package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyexample {
public static void main(String[] args) {
	try {
		FileInputStream fin=new FileInputStream("D://wel.txt ");//read (Deepak)
		FileOutputStream fout=new FileOutputStream("D://new.txt");//write
		byte[] arr=new byte[1024];
		int i;
		while((i=fin.read(arr))>0){
		fout.write(arr);
		
		}
		fin.close();
		fout.close();
		System.out.println("done");
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
