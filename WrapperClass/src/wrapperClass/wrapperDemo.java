//Wrapper Class
//wrapper classes provide a way to use primitive data types (int, boolean, etc)as objects
//For Example---->
//if we create an object of integer wrapper class, it contains a single variable (or field) that will store it.

package wrapperClass;

public class wrapperDemo {

	public static void main(String[] args) {
		//unboxing
		Integer i = new Integer (10);
		System.out.println(i);
		int b = i.intValue();
		System.out.println(b);
		
		//without using intvalue()
		int c = i;
		System.out.println(c);
		
		//Autoboxing
		int a=100;
		Integer il=a;
		System.out.println(il);
		

	}

}
