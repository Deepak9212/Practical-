package IO;

import java.io.FileOutputStream;

//write byte to string using FOS ----write string with file output stream
public class WritebyteFOS2 {
	public static void main(String[] args) {
		try {
			//write byte to string
			FileOutputStream f=new FileOutputStream("D://hello.txt");
			
			f.write(69);
			f.close();
			System.out.println("Ok");
		}
		catch (Exception e) {
			System.out.println(e);
		}}
}
