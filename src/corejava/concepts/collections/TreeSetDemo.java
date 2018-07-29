package corejava.concepts.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> values = new TreeSet<>();
		
		values.add(45);
		values.add(67);
		values.add(13);
		values.add(5);
		values.add(67);
		
		for(int i: values)
		{
			System.out.println(i);
		}

	}

}
