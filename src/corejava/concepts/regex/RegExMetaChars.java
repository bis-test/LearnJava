package corejava.concepts.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMetaChars {

	public static void main(String[] args) {
		System.out.println("metacharacters d...."); /* \\d means digit */  

		System.out.println(Pattern.matches("\\d", "abc")); //false (non-digit)  
		System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
		System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
		System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  

		System.out.println("metacharacters D...."); /*\\D means non-digit  */

		System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
		System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
		System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  

		System.out.println("metacharacters D with quantifier....");  
		System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  



		System.out.println("--------------Meta Chars Demo 2nd -------------");
		
		String txt="5";
        //The pattern lowercase d means numbers, digits
		//Since 5 is a digit, it will match
		String pat="\\d";
		Pattern p= Pattern.compile(pat);
		Matcher m= p.matcher(txt);
		System.out.println(m.matches());

		
		String txt1="55";
		//used quantifer 2 as there are two digits
		String pat1="\\d{2}";
		Pattern p1= Pattern.compile(pat1);
		Matcher m1= p1.matcher(txt1);
		System.out.println(m1.matches());

		
		String txt2="@xyz";
		//dot is for any character, so it checks any 4 chars
		String pat2=".{4}";
		Pattern p2= Pattern.compile(pat2);
		Matcher m2= p2.matcher(txt2);
		System.out.println(m2.matches());












	}

}
