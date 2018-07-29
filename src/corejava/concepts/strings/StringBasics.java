//@Author-Biswajit Sundara
//@Date-06/16/2018
//@Topic- Strings
//@Subtopic- How to create strings using different approaches
//@Status- Complete


package corejava.concepts.strings;

public class StringBasics {

	public static void main(String[] args) {
		
		/* s1 is string literal. JVM will store 'welcome' in string constant pool
		and create a reference to welcome using s1  */
		String s1="Welcome";
		System.out.println(s1);
		
		
		/*Creating string using new keyword. Here JVM will create a new string object
		 in heap memory and the literal India will be placed in string constant pool
		 The variable s2 will refer to the object in heap memory*/
		String s2= new String("India");
		System.out.println(s2);
		
		
		/* String as character Array*/
		char ch[]= {'B','I','S','W','A','J','I','T'};
		System.out.println(ch);
		
		/*We can convert the character array using new String */
		String s3= new String(ch);
		System.out.println(s3);
				

	}

}
