/* Java main method is the entry point of any java program. Its syntax is always public static void main(String[] args). 
 * You can only change the name of String array argument, for example you can change args to myStringArgs.
 * Also String array argument can be written as String... args or String args[].
 * 
 * public
 * This is the access modifier of the main method. It has to be public so that java runtime can execute this method. 
 * Remember that if you make any method non-public then it’s not allowed to be executed by any program, 
 * there are some access restrictions applied. So it means that the main method has to be public. 
 * If we remove the public, it will throw run time error like main method is not found in class.
 * 
 * static
 * When java runtime starts, there is no object of the class present. 
 * That’s why the main method has to be static so that JVM can load the class into memory and call the main method. 
 * If the main method won’t be static, JVM would not be able to call it because there is no object of the class is present. 
 * If we remove static from the main method then it will throw run time error - Main method is not static.
 * 
 * void
 * Java programming mandates that every method provide the return type. 
 * Java main method doesn’t return anything, that’s why it’s return type is void. This has been done to keep things simple 
 * because once the main method is finished executing, java program terminates. So there is no point in returning anything, 
 * there is nothing that can be done for the returned object by JVM. If we try to return something from the main method, 
 * If we return, it will give compilation error - incompatible types.
 * 
 * main
 * This is the name of java main method. It’s fixed and when we start a java program
 * we can't change the name of main method. Always we need to have the name as 'main' 
 * 
 * String[] args
 * Java main method accepts a single argument of type String array. 
 * This is also called as java command line arguments. 
 * 
 * An very interesting question is. Can we have two main methods? The answer is 'yes'
 * but the arguments need to be different.
 * If you look at the below code. The argument of both main methods are different.
 * 
 */


package corejava.concepts.basics;

public class MainDemo {

	public static void main(String[] args) {

		System.out.println("Hello World");	
		main(5);
	}

	public static void main(int i) {

		System.out.println("Hello World");

	}
	
}
