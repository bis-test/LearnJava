//@author-Biswajit Sundara
//@date-05/03/2018
//@subject-Sum of digits


package corejava.concepts.basics;

import java.util.*;

public class SumOfDigits {

	public static void main(String[] args) {

		int number=0;
		int rem;
		int quo=0;
		int sum=0;

		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();

		while(number>0)
		{
			rem = number%10;
			quo=number/10;
			sum=sum+rem;
			number=quo;
		}

		System.out.println("The sum of digits=" +sum);

		sc.close();	
	}

	
	

}
