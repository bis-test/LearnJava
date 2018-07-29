package javadesignp.factorymethod;

public class DomesticPlan implements Plan{

	@Override
	public double getRate() {
		return 3.50;
	}

	@Override
	public void calcbill(int units, double rate) {
		double calcamt=units*rate;
		System.out.println("Total units=" +units);
		System.out.println("Rate per unit=" +rate);
		System.out.println("The bill amount=" +calcamt);

	}

}
