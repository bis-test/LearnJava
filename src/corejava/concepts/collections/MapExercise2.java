package corejava.concepts.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExercise2 {

	public static void main(String[] args) {

		String str="AMAZONM";
		char[] arr= str.toCharArray();

		Map<Character, Integer> data= new HashMap<Character, Integer>();


		for (char ch : arr) {

			if(data.containsKey(ch))
			{
				System.out.println("The "+ch+" is duplicate");
			}
			else
				data.put(ch, 1);

		}


		System.out.println(data);


	}

}
