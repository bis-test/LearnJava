//@author- Biswajit Sundara
//@Date- 06/18/2018
//@Program - Find the character occurence in a given string
//@Satus-Complete

/*
Input: String= Success

Output: The count of e 1

*/



package corejava.concepts.strings;

public class CharOccurence {

	public static void main(String[] args) {

		String txt="Success";

		int i=0;
		int j=0;

		for(i=0;i<txt.length();i++)
		{
			if(txt.charAt(i)=='e')
			{
				j++;
			}
		}

		System.out.println("The count of e is =" +j);
	}

}
