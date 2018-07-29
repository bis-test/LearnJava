package corejava.concepts.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExQuantifiers {

	public static void main(String[] args) {
		System.out.println("? quantifier ....");  
		System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
		System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  

		System.out.println("+ quantifier ....");  
		System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
		System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
		System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  

		System.out.println("* quantifier ....");  
		System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  

		
		System.out.println("--------------Quantifier Demo 2nd -------------");
		String txt="ax";
		//quantifier 2 means, it will check if two matching characters are available.
		//it will return false if we say txt="a" because we have mentioned 2 chars in pattern
		//it will return false if we say txt=axk because the pattern has 2 matching chars not 3
		String pat="[axk]{3}";
		Pattern p= Pattern.compile(pat);
		Matcher m= p.matcher(txt);
		System.out.println(m.matches());
	}

}
