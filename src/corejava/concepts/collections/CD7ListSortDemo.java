package corejava.concepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CD7ListSortDemo {

	public static void main(String[] args) {
		List<Integer> values= new ArrayList<Integer>();
		values.add(23);
		values.add(14);
		values.add(57);
		values.add(27);

		//sort the values
		Collections.sort(values);

		values.forEach(System.out::println);

	}

}
