import java.util.Scanner;
public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner object to accept user inputs
		Scanner ob=new Scanner(System.in);
		
		String name;
		System.out.println("Enter Person Name:");
		name=ob.next();
		System.out.println("Enter Age:");
		int age = ob.nextInt();
		System.out.println("Enter Gender:");
		String gender=ob.next();
		
		System.out.println("Enter Income:");
		int income=ob.nextInt();
		
		//person object and initialise values using setter
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		System.out.println(person);
		
		TaxCalculation calc=new TaxCalculation();
		calc.calculateTax(person);
		System.out.println("After Calculation Tax:");
		System.out.println(person);
	}

}
