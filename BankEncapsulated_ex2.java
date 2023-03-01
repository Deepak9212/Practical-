package mypackage;

public class BankEncapsulated_ex2 {
	public static void main(String[] args) {
		Bank b=new Bank();
		b.setAccountno(34423154609345L);
		b.setName("sonu");
		b.setEmail("dk0192987@gmail.com");
		b.setAmount(50000f);
		System.out.println(b.getAccountno());
		System.out.println(b.getName());
		System.out.println(b.getEmail());
		System.out.println(b.getAmount());

		
	}

}
