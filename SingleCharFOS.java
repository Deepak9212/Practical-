package IO;

import java.io.FileInputStream;

//we can read single character - using FileinputStream
public class SingleCharFOS {
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("D://new.txt");//source path
			//read single character
			int i=f.read();{
				System.out.println((char)i); //convert it into integer
			}
			
			f.close();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}}
}
