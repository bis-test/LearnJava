package corejava.concepts.collections;
import java.util.*;

public class CD5ArrayList4 {

	public static void main(String args[]){  
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ajay");  
		ArrayList<String> al2=new ArrayList<String>();  
		al2.add("Ravi");  
		al2.add("Hanumat");  
		al.removeAll(al2);  
		System.out.println("iterating the elements after removing the elements of al2...");  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  

	}  

}
