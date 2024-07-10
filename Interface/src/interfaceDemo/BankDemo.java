package interfaceDemo;

public class BankDemo {
	
	public static void main(String[] args) {
		SavingAccount s1=new SavingAccount("Pallavi", "Pune", 1234567,15500);
		
		s1.deposit(20000);
		System.out.println(s1);
		
		s1.withdraw(10000);
		System.out.println(s1);
		
		s1.withdraw(30000);
		System.out.println(s1);
	}
	

}
