package corejava.concepts.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CD1CollectionDemo {

	public static void main(String[] args) {

		//collection is an interface
		//values is the referencing variable
		//we can't create object of interface, so ArrayList is the implementation class
		//<Integer> is generic
		//if we don't specify generic, it will accept any data type
		Collection<Integer> values= new ArrayList<Integer>();
		values.add(23);
		values.add(34);
		values.add(57);
		//values.add("Bis");
		values.forEach(System.out::println);

//		for (int i:values)
//		{
//			System.out.println(i);
//		}

	}

}
