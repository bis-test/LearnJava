package corejava.concepts.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExCharClass {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  

		String txt="a";
		String pat = "[axk]";
		Pattern p= Pattern.compile(pat);
		Matcher m= p.matcher(txt);
		System.out.println(m.matches());
		
	}

}
