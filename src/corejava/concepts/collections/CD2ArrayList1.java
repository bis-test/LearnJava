package corejava.concepts.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CD2ArrayList1{

	public static void main(String args[]){  
		
		//Creating arraylist  
		
		//ArrayList is class & list is the object
		ArrayList<String> list=new ArrayList<String>();
		
		//Adding object in arraylist  
		list.add("Ravi");
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  