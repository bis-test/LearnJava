package corejava.concepts.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> values = new HashSet<>();
		
		values.add(54);
		values.add(65);
		values.add(86);
		values.add(65);
		
		for(int i: values)
		{
			System.out.println(i);
		}

	}

}
