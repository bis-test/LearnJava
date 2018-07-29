package corejava.concepts.basics;

public class SumOfArray {

	public static void main(String[] args) {
		
		int sum=0;
		
		int[] number = {12,23,45,67,78};
		
		for(int i=0; i<number.length; i++)
		{
			
			
			sum=sum+number[i];
			
			
		}
			
	System.out.println("Sum of array=" +sum);		

	}

}
