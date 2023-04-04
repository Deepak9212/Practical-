package IO;

import java.io.FileInputStream;
//we can read all the character - using FileinputStream
public class AllCharFIS {
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("D://new.txt");//source path
			//read all character
			int i=0;
			while((i=f.read())!=-1) {
				System.out.println((char)i); //convert it into integer
			}
			
			f.close();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}}
}
