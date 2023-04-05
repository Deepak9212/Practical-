package IO;

import java.io.ByteArrayInputStream;

public class ByteArrayIS {
public static void main(String[] args) {
	byte [] arr= {68,67,45,35};
	ByteArrayInputStream bin=new ByteArrayInputStream(arr);
	int i=0;
	while((i=bin.read())!=-1){
		char ch=(char)i;//converting into character
		System.out.println("ASCII Character"+i+" "+"value is"+ch);
	}
}
}
