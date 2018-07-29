package javaoops.concepts.basics;

abstract class Bank{  
	abstract float rateOfInterest();  
}  
class SBI extends Bank{  
	public float rateOfInterest(){return 9.15f;}  
}  
class PNB extends Bank{  
	public float rateOfInterest(){return 9.7f;}  
}  

public class OopsConcepts {

	public static void main(String[] args) {

		Bank b=new SBI();  
		System.out.println("ROI: "+b.rateOfInterest());  
	}  

}


