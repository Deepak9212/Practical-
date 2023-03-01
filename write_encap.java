package mypackage;

public class write_encap {
	private String name;
	
	public void setName() {
		this.name=name;
	}
	public static void main(String[] args) {
		write_encap obj=new write_encap();
		obj.setName();
		//we can not get the value ,there is no get method
		//System.out.println("Name:"+obj.getName());
		System.out.println(obj.name);
	}

}
