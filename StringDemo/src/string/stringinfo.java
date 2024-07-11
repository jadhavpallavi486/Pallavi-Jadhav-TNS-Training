//string is the collection of characters.
//it is enclosed in single quotes or double quotes.
//String s1="Capgemini" -----> Primitive type
//String s2=new String ("Pallavi") ----->by creating object
//when data is same for two different references (variables) then the memory allocated for it is also same not different for each reference.
//String Buffer
/* string buffer class is created of flexible length which can be modified.
   it is mutable so it can be changeable declared as final*/
//string buffer is mutable class while string is immutable class.
//StringBuffer class is faster and consumes less memory while string class is slow and consumes more memory.
package string;

public class stringinfo {
	public static void main(String[] args) {
		//initialize string
		
		char c[]= {'I','N','D','I','A'};
		String s1=new String(c);
		System.out.println(s1);
		
		String s2=new String (s1);
		System.out.println(s2);
		
		//concatenation to prevent long lines
		String longstr="This is to show"+
					   "how long sentences"+
					   "can be printed.";
		System.out.println(longstr);
	}

}
