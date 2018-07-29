//@author-Biswajit Sundara
//@date- 05/03/2018
//@subject-Find if a number is odd or even

package corejava.concepts.basics;

import java.util.*;

public class OddEven {

	public static void main(String[] args) {
		
		int number;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		
		if(number%2==0)
		{
			System.out.println("This is an even number");
		}
		
		else 
			System.out.println("This is an Odd number");
	
		sc.close();	
		
	}

	
}
