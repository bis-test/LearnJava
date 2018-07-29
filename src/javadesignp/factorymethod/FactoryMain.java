package javadesignp.factorymethod;

import java.util.Scanner;

public class FactoryMain {

	public static void main(String[] args) {

		OperatingSystemFactory osf= new OperatingSystemFactory();
		
		System.out.println("Enter the plan name (Domestic/Commercial/Instituitional");
		Scanner sc = new Scanner(System.in);
		String planType= sc.next();
		Plan obj= osf.getPlanType(planType);
		
		double rate= obj.getRate();
		
		System.out.println("Enter the number of units");
		int unit= sc.nextInt();
		obj.calcbill(unit, rate);
		

	}

}
