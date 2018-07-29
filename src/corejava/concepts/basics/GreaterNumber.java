//@author-Biswajit Sundara
//@date-05/03/2018
//@subject-Greater Number


package corejava.concepts.basics;
import java.util.*;

public class GreaterNumber {

	public static void main(String[] args)
	{
		
	
	int number1;
	int number2;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Number 1=");
	number1= sc.nextInt();
	
	System.out.println("Enter Number 2=");
	number2= sc.nextInt();
	
	if (number1>number2)
	{
		System.out.println("Number 1 is greater than number 2");
		
	}
	
	else if (number2>number1)
	{
		System.out.println("Number 2 is greater than number 1");
	}
	
	sc.close();
	
	
	}
}
