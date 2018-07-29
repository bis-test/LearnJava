/* Write a program to validate if the PAN number format is valid */


package corejava.concepts.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExercise6 {

	public static void main(String[] args) {
		String PAN="ABCDE1234A";

		/*First 5 characters are alphabets so A-Z{5}
		  Then 4 digits so 0-9{4}
		  Then one alphabet so [A-Z]
		 */		  
		String patt="[A-Z]{5}[0-9]{4}[A-Z]";

		Pattern p=Pattern.compile(patt);
		Matcher m=p.matcher(PAN);

		System.out.println(m.matches());

	}

}
