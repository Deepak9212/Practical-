package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
// we connected one stream (FileOutputStream) with another(Bufferedoutputstream)
public class BufferedOS {
	public static void main(String[] args) {
		try {
			//Destination
			FileOutputStream f=new FileOutputStream("D://wel.txt");
			BufferedOutputStream b=new  BufferedOutputStream(f);
			String s="Welcome to coding world! ";
			byte b1[]=s.getBytes(); //converting a string into byte array
			f.write(b1);
			b.flush();//flushed the data of one stream and send it into another stream
			f.close();
			f.close();
			System.out.println("Ok");
		}
		catch (Exception e) {
			System.out.println(e);
		}
}}
