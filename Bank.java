package mypackage;

public class Bank {
	long Accountno;
	String name;
	String Email;
	double Amount;


public Bank(int Accountno ,String name,String Email,double Amount) {
	this.Accountno=Accountno;
	this.name=name;
	this.Email=Email;
	this.Amount=Amount;
	
}
public Bank() {
	// TODO Auto-generated constructor stub
}
public long getAccountno() {
	return Accountno;
}
public void setAccountno(long l) {
	Accountno = l;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public double getAmount() {
	return Amount;
}
public void setAmount(double amount) {
	Amount = amount;
}
}
