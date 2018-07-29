package corejava.concepts.keywords;

class Counter{  
	int count1=0;//will get memory when instance is created  
	static int count2=0;

	Counter(){  
		count1++;  
		System.out.println("value of count1="+count1);  

		count2++;
		System.out.println("value of count2="+count2);  
	}  


}


public class StaticVariableCounter {

	public static void main(String[] args) {

		Counter c1=new Counter();  
		Counter c2=new Counter();  
		Counter c3=new Counter();  

	}

}
