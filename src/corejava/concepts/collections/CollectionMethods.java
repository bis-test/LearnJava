package corejava.concepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {

	public static void main(String[] args) {

		List<String> names= new ArrayList<String>();
		names.add("Shahrukh");
		names.add("Salman");
		names.add("Amir");
		names.add("Deepika");


		//1.size method
		//Returns the count of elements in the list
		//Number of items in the cart
		int size= names.size();
		System.out.println("The size of the array= " +size);


		//2.get method
		//Returns the value at the specified index
		//Index starts from zero
		String str=names.get(2);
		System.out.println("The item at index 2=" +str);

		//3.add method
		//Adds values to the list
		//If you want to add an item to the cart
		names.add("Priyanka");
		System.out.println(names);


		//4.sort method
		//sorts the list
		Collections.sort(names);
		System.out.println(names);

		//5.remove method
		//Deletes value from the list
		//If you want to delete an item from the cart
		names.remove("Amir");//Removes by value
		names.remove(3); //Removes by index
		System.out.println(names);

		
       //6.Clear method
	   //removes all elements from the list
	   names.clear();
	   System.out.println(names);
	   
	   //7.isEmpty method
	   //Checks if the list is empty
	   boolean bo = names.isEmpty();
       System.out.println("The list is empty= "+bo);
       
	}

}
