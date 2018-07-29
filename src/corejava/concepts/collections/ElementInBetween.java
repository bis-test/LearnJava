package corejava.concepts.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ElementInBetween {

	public static void main(String[] args) {
		//List is an interface
		//values is the referencing variable
		//we can't create object of interface, so ArrayList is the implementation class
		//<Integer> is generic
		//if we don't specify generic, it will accept any data type
		List<Integer> values= new ArrayList<Integer>();
		values.add(23);
		values.add(34);
		values.add(57);

		//insert element 27 after 23
		values.add(1, 27);
		values.forEach(System.out::println);



	}

}
