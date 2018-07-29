/* The program tries to find repeated characters from a string. 
 * Enhance the program to find most repeating chars in a string
 * 
 */


package corejava.concepts.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExercise7 {

	public static void main(String[] args) {
		String stringToMatch = "abbccdef";
		Pattern p = Pattern.compile("(\\w)\\1+");
		Matcher m = p.matcher(stringToMatch);
		if (m.find())
		{
		    System.out.println("Duplicate character " + m.group(1));
		}

	}

}
