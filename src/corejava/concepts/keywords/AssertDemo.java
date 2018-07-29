
/* assert is a Java keyword used to define an assert statement. 
 * An assert statement is used to declare an expected boolean condition in a program. 
 * If the program is running with assertions enabled, then the condition is checked at runtime. 
 * If the condition is false, the Java runtime system throws an AssertionError.
 * 
 * assert expression1;
 * OR 
 * assert expression1 : expression2;
 * 
 * By default, assertion is disabled at runtime. To enable assertion, 
 * specify the switch –enableassertions or -ea at command line of java program. 
 * 
 * For example, to enable assertion for the program:
 * java –enableassertions AssertDemo
 * OR
 * java –ea AssertDemo
 * 
 * When running the program above with this command:java -ea AssertionExample 15
 * A java.lang.AssertionError error will be thrown:
 * 
 * But the program will continue and print out “Pass” if we pass a number less than 10, 
 * in this command: java -ea AssertionExample 8
 * 
 */


package corejava.concepts.keywords;

public class AssertDemo {

	public static void main(String[] args) {

		// get a number in the first argument
		int number = Integer.parseInt(args[0]);

		// stops if number > 10
		assert number <= 10;

		System.out.println("Pass");

	}

}
