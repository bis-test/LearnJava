package corejava.concepts.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExercise1 {

	public static void main(String[] args) {
		
	String str="AMAZON INDIA";
	char[] arr= str.toCharArray();
	int counter=1;
	
	Map<Character, Integer> data= new HashMap<Character, Integer>();
	

	for (char ch : arr) {
		
		if(data.containsKey(ch))
		{
			counter=data.get(ch);
			counter++;
			data.put(ch, counter);
		}
		else
			{
			data.put(ch, 1);
			}
		
	}
       System.out.println(data);
	
	}

}
