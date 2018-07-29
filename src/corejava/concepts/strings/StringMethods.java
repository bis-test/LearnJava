//@Author-Biswajit Sundara
//@Date-06/16/2018
//@Topic- Strings
//@Subtopic- Demonstration of different string methods
//@Status- In Progress


package corejava.concepts.strings;

public class StringMethods {

	public static void main(String[] args) {


		//1.toCharArray
		//Demonstrate method toCharArray. This method converts a string to character array

		String txt="Hello";
		char[] chars= txt.toCharArray();
		for(int i=0;i<txt.length();i++)
		{
			System.out.println(chars[i]);
		}


		//2.length()
		/* Demonstrate method length(). This method returns the count of characters
		 Return type is int.
		 If the string is empty then it will return zero.*/
		String txt1="World";
		int len = txt1.length();
		System.out.println("The length of string txt1= "+len);

		String txt2="";
		int len1 = txt2.length();
		System.out.println("The length of string txt2= "+len1);


		//3.charAt()
		/* The Java String charAt() method returns the character at the specified index. 
		 The index value should lie between 0 and length()-1.*/
		String txt3="Hello World";
		char ch1= txt3.charAt(1); //character at 2nd sequence
		System.out.println(ch1);		

		//The below code will throw StringIndexOutOfBoundsException
		//The index starts from zero and at the string length index there's nothing
		//remember, the charAt function works until length-1.
		//The below two lines are commented. Uncomment to see what happens
		//char ch2=txt3.charAt(txt3.length());
		//System.out.println(ch2);


		//4.indexOf
		/*This method returns the index within the string of the first occurrence of 
		the specified character or -1, if the character does not occur 
		There are 4 variants of this method, this is called method overloading
		 */

		String txt4="Hello World";

		//This will print the index
		int index1 = txt4.indexOf('W');
		System.out.println("The index of W= " +index1);

		//This will print -1 as Y doesn't exist
		int index2=txt4.indexOf('Y');
		System.out.println("The index of Y= "+index2); 

		//There are multiple l's so it will consider the first occurence of l
		//It will always start from left by default
		int index3=txt4.indexOf('l');
		System.out.println("The index of l="+index3);

		//4.1 indexOf(char ch,int start)
		//This method returns the index within the string of the first occurence of the
		//character, but the search will start from the specified index or-1 if the character
		//doesn't occur

		int index4=txt4.indexOf('l', 5);
		System.out.println("The index of l after 5 characters= " +index4);

		//4.2 indexOf(String str)
		//his method returns the index within this string of the first occurrence of the specified substring. 
		//If it does not occur as a substring, -1 is returned.
		String substr="Wor";
		int index5= txt4.indexOf(substr);
		//It will return the index of W as that's the first character
		System.out.println("The index of substring "+substr+" is= "+index5);


		//4.3 indexOf(String str, int start)
		//This method returns the index within this string of the first occurrence of the specified substring, 
		//starting at the specified index. If it does not occur, -1 is returned.
		String txt5="Hello Bis Hello Prinks";
		String substr1="llo";
		int start=0;
		int index6=txt5.indexOf(substr1, start);
		System.out.println("The index of substring "+substr1+" from "+start+" position= "+index6);
		start=4;
		index6=txt5.indexOf(substr1, start);
		System.out.println("The index of substring "+substr1+" from "+start+" position= "+index6);


		//5.lastIndexOf
		//Returns the last index of the given character value or substring
		//If it is not found, it returns -1
		//The index counter starts from zero
		//It also has similar functions like indexOf
		String txt10="this is last index example";
		int lindex=txt10.lastIndexOf('e');
		System.out.println("The last index of e="+lindex);


		//5.trim()
		//Trims the white space before or after the string
		//If space is in the middle then it will not be removed.
		String txt6=" Hello";
		String txt7="Biswajit ";
		String txt8="Hello Biswajit";

		System.out.println("String txt6(before trim)=" +txt6);
		System.out.println("String txt7(before trim)=" +txt7);
		System.out.println("String txt8(before trim)=" +txt8);

		txt6= txt6.trim();
		txt7=txt7.trim();
		txt8=txt8.trim();

		System.out.println("String txt6=" +txt6);
		System.out.println("String txt6=" +txt7);
		System.out.println("String txt6=" +txt8);

		//6.toUpperCase
		//This method converts string from lower case to uppercase.
		String str="india";
		String str1="IndIa";
		System.out.println("The string is="+str);
		System.out.println("The string is="+str1);
		str=str.toUpperCase();
		str1=str1.toUpperCase();
		System.out.println("The string converted to uppercase="+str);
		System.out.println("The string converted to uppercase="+str1);	

		//7.toLowerCase
		//This method converts string from upper case to lowercase.
		String str2="INDIA";
		String str3="iNdiA";
		System.out.println("The string is="+str2);
		System.out.println("The string is="+str3);
		str2=str2.toLowerCase();
		str3=str3.toLowerCase();
		System.out.println("The string converted to Lowercase="+str2);
		System.out.println("The string converted to Lowercase="+str3);	


		//8.concat
		//The java string concat() method combines specified string at the end of this string. 
		//It returns combined string. It is like appending another string.
		String str4="Hey";
		String str5="Hello";
		String concat1= str4.concat(str5);
		System.out.println(concat1);


		//9.substring
		//This method returns part of the string
		String str6="javaisgood";

		//starting index till the last
		String substr2=str6.substring(3);
		System.out.println("The substring="+substr2);

		//starting index and end index
		String substr3=str6.substring(3, 6);
		System.out.println("The substring="+substr3);


		//10.split
		//Splits this string against given regular expression and returns a char array.
		String str7="java string split method by bistest";
		String[] words=str7.split("\\s");//splits the string based on whitespace  
		//String[] words=str7.split(" "); -- This will also work
		for(String w:words)
		{  
			System.out.println(w);
		}

		String str8="java@string@split@method@by@bistest";
		String[] words1=str8.split("@");
		for(String w:words1)
		{  
			System.out.println(w);
		}


		//11.replace
		//This method returns a string replacing all the old char or CharSequence to new char 
		//or CharSequence
		String str9="javatpoint is a very good website";
		//replacing characters
		String repstr= str9.replace('a', 'e');
		System.out.println(repstr);

		//replacing strings
		String repstr1= str9.replace("good", "bad");
		System.out.println(repstr1);

		//replace all - we can use regex
		//This will remove the white spaces
		String repall= str9.replaceAll("\\s", "");
		System.out.println(repall);


		//12.equals
		//compares the two given strings based on the content of the string. 
		//If any character is not matched, it returns false. If all characters are matched, 
		//it returns true.
		String str10="javatpoint";
		String str11="javatpoint";
		String str12="JAVATPOINT";

		boolean st= str10.equals(str11);
		System.out.println(st);
		st=str10.equals(str12);
		System.out.println(st);
		st=str10.equalsIgnoreCase(str12);
		System.out.println(st);

        
		//13.toString
		String str13="hello";
		char[] chars1= str13.toCharArray();
		String a=chars1.toString();
		System.out.println("a"+a);
 

	}

}
