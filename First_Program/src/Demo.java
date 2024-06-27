import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		n1=sc.nextInt();
		System.out.println("Enter second number:");
		n2=sc.nextInt();
		sum=sum(n1,n2);
		System.out.println("Addition of n1 and n2:"+sum);
		

	}
	public static int sum(int a, int b) {
		int sum=a+b;
		return sum;
	}
	

}
