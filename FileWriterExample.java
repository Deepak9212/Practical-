package IO;

import java.io.FileReader;

public class FileWriterExample {
public static void main(String[] args) {
	try {
		/* FileWriter fw=new FileWriter("D://wel.txt");
		  fw.written("welcome to Anudip foundation skill Development");
		 */
		FileReader fr=new FileReader("D://wel.txt");
		int i=0;
		while((i=fr.read()) !=-1){

			System.out.println((char)i);
		}
		//fw.close();
		fr.close();
		System.out.println("done");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
