//@author- Biswajit Sundara
//@Date- 06/18/2018
//@Program - Using string buffer delete the common characters in strings
//@Satus-Complete

/*
Input: String1= 'Successb'
       String2= 'failurec'

Output: Sssb

Delete characters from string1 if that character is available in string 2 
 
*/



package corejava.concepts.strings;

public class StringDeleteChars {

	public static void main(String[] args) {

		
		//Declare string buffer variables
		StringBuffer txt1= new StringBuffer("Successb");
		StringBuffer txt2= new StringBuffer("failurec");



		//Use two loops, if the character matches between the strings
		//Delete that character from string1
		for(int i=0;i<txt1.length();i++)
		{
			for(int j=0;j<txt2.length();j++)
			{
				if(txt1.charAt(i)==txt2.charAt(j))
				{
					txt1.deleteCharAt(i);
					//reinitialize index of string1
					i=0; 
				}
			}
		}

		//Print the string1
		System.out.println("String1 after deletion of common characters= " +txt1);	

	}

}
