/*Write a program to find all numbers in a string*/

package corejava.concepts.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExExercise3 {

	public static void main(String[] args) {
		
		String txt="hcl 12344 has 12345 employee";
		String patt="\\d{5}";
		
		Pattern p=Pattern.compile(patt);
		Matcher m=p.matcher(txt);
		
		while(m.find())
		{
			System.out.println(m.group());
		}

	}

}
