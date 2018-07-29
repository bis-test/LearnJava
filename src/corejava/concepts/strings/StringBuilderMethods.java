package corejava.concepts.strings;

public class StringBuilderMethods {

	public static void main(String[] args) {

		StringBuilder sb= new StringBuilder("Hello");

		//1.append method
		//The append() method concatenates the given argument with this string.
		sb.append("Java");
		System.out.println("String builder after append= "+sb);

		//2.insert method
		//The insert() method inserts the given string with this string at the given position.
		sb.insert(5, " I am ");
		System.out.println("String after insert at 5th position= "+sb);

		//3.replace method
		//The replace() method replaces the given string from the specified beginIndex and endIndex.
		sb.replace(5, 11, " Myself ");
		System.out.println("String after replace from 5-11 position= "+sb);

		//4.delete method
		//The delete() method deletes the string from the specified beginIndex to endIndex.
		sb.delete(5,12);
		System.out.println("String after delete from 5-12 position= "+sb);

		//5.reverse method
		//The reverse() method of StringBuilder class reverses the current string.
		sb.reverse();
		System.out.println("String after reversing="+sb);


		//6.capacity method
		//The capacity() method of StringBuilder class returns the current capacity of the builder.
		//The default capacity of the builder is 16. 
		//If the number of character increases from its current capacity
		//it increases the capacity by (oldcapacity*2)+2. 
		//For example if your current capacity is 16, it will be (16*2)+2=34.
		StringBuilder sb1=new StringBuilder();

		int capacity=sb1.capacity();
		//This will print default capacity=16
		System.out.println("Capacity post declaration=" +capacity);

		sb1.append("Hey");
		capacity=sb1.capacity();
		//This will print 16 as the number of characters is still under 16
		System.out.println("Capacity after adding Hey=" +capacity);


		sb1.append(" Java is my favourite language");
		capacity=sb1.capacity();
		//Now oldcapacity*2+2
		//16*2+2=34
		System.out.println("Capacity after adding a long text=" +capacity);



		//7.ensureCapacity()
		//It increases the capacity and ensures the min size as specified
		//in this case, string buffer default value=16 (hello text size=5 within 16)+ increase 28
		//It will print the capacity= 44
		StringBuilder sb2= new StringBuilder("Hello");
		System.out.println("String builder capacity before ensure capacity="+sb2.capacity());
		sb2.ensureCapacity(28);
		System.out.println("String builder capacity after ensure capacity="+sb2.capacity());


		//9.setCharAt method
		//The method sets the character at the specified index to ch.
		StringBuilder sb5=new StringBuilder("Success");
		sb5.setCharAt(3, 'C');
		System.out.println(sb5);
	}

}
