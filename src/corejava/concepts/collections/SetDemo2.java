package corejava.concepts.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		
		HashSet<String> values = new HashSet<>();
		
		System.out.println(values.add("Biswajit"));
		System.out.println(values.add("Priyanka"));
		System.out.println(values.add("Parineeti"));
		System.out.println(values.add("Biswajit"));
		
		for(String i: values)
		{
			System.out.println(i);
		}

	}

}
