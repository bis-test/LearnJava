/*
 * Scanner is a class in java.util package used for obtaining the input of the primitive types like int, double etc. and strings. 
 * It is the easiest way to read input in a Java program, 
 * though not very efficient if you want an input method for scenarios where time is a constraint like in competitive programming
 * 
 * To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream. 
 * We may pass an object of class File if we want to read input from a fil.
 * 
 * To read numerical values of a certain data type XYZ, the function to use is nextXYZ(). 
 * For example, to read a value of type short, we can use nextShort()
 * To read strings, we use nextLine().
 * To read a single character, we use next().charAt(0). 
 * next() function returns the next token/word in the input as a string 
 * and charAt(0) funtion returns the first character in that string.
 * 
 * Scanner is a class
 * sc is the object
 * Scanner class implements iterator, closable interface.
 * public Scanner(InputStream source) 
 *  {
 *      this(new InputStreamReader(source), WHITESPACE_PATTERN);
 *  }
 *  
 *  System.in is an InputStream which is typically connected to keyboard input of console programs.	
 * 
 */


package corejava.concepts.basics;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("The number is=" +a);
		
		sc.close();

	}

}
