/*Write a program to manipulate a string.

Input = "xaxXbxcx"
output = aXbcxxxx 

Take all the lowercase 'x's and append at the last

*/

package corejava.concepts.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExercise5 {

	public static void main(String[] args) {
		
		
		System.out.println("Approach 1 - Using ReplaceAll method");
		
		String str="xaxXbxcx";
        String txt1= str.replaceAll("[xx]","");
		String txt2= str.replaceAll("[^xx]", "");
		String txt3= txt1.concat(txt2);
		System.out.println("The result=" +txt3);

		
		System.out.println("Approach 2- Using find & group methods");
		String txt="xaxXbxcx";
		String patt="[^x]";
		String s="";
		
		Pattern p=Pattern.compile(patt);
		Matcher m=p.matcher(txt);
		
		while(m.find())
		{
			s=s+m.group();		
		}
		
		
		String txt4="xaxXbxcx";
		String patt1="[x]";
		String s1="";
		
		Pattern p1=Pattern.compile(patt1);
		Matcher m1=p1.matcher(txt4);
		
		while(m1.find())
		{
			s1=s1+m1.group();		
		}
		
		String s2=s.concat(s1);
		System.out.println("The result=" +s2);
		
	}

}
