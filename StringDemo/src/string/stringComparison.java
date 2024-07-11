package string;

public class stringComparison {

	public static void main(String[] args) {

	//creating string using literals//pool memory
	//same memory is allocated for different references with the same data.
		
	String s1 = "TNSIF";
	String s2 = "TNSIF";
	
	//creating new string operator//heap memory
	//if reference is different then it is stored in different memory location 
	String s3 = new String ("TNSIF");
	String s4 = new String ("TNSIF");
	
	//== --> Equals || compares LHS and RHS and object references also
	//.equals ---->  compares the data which will be stored
	System.out.println("Case 1:"+(s1==s2));
	System.out.println("Case 2:"+(s1==s3));
	System.out.println("Case 3:"+(s2.equals(s1)));
	System.out.println("Case 4:"+(s2.equals(s4)));
	System.out.println("Case 5:"+(s3==s4));
	System.out.println("Case 6:"+(s3.equals(s4)));
	
	
	//hashCode() ---> returns the memory units allocated to the string 
	//means identical strings has same hashcode
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
	
	//compareTo s1 == TNSIF compare INSIF
	System.out.println(s1.compareTo("TNSIF")); //
	System.out.println(s1.compareTo("AA"));
	System.out.println(s1.compareToIgnoreCase("tnsif"));
	System.out.println(s1.compareTo(s4));

	}

}
