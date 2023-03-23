package Exception;

import java.io.IOException;

// checked Exception
class Test{
	void display() throws IOException{
		//System.out.println("Throws Exception Perfectly");
		 throw new IOException(" Throws Exception error");
	}
}
public class Throws_Eg2 {
public static void main(String[] args) throws IOException {
	Test obj=new Test();
	obj.display();
}
}
