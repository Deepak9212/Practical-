class Student1{      //defining a student class
int slno;            //defining field/data mmember/instance variable
String name;
} 
class Student2{
int slno;
String name;
}
class Student{

public static void main(String[]args){  //method of student class
Student1 s=new Student1();   //creating an object
Student2 t=new Student2();
s.slno=01;
s.name="Deepak";
System.out.println(s.slno);
System.out.println(s.name);

s.slno=02;
s.name="Sonu";
System.out.println(s.slno);
System.out.println(s.name);

}
}