/* Program to find numbers in a given string and add them */



package corejava.concepts.regex;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExercise8 {

	public static void main(String[] args) {

		String txt="The number of employees in Infosys India is 124012 and number of employee in US is 4040";

		LinkedList<String> numbers = new LinkedList<String>();

		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(txt); 
		while (m.find()) {
			numbers.add(m.group());

		}

		int sum=0;
		for (int i=0;i<=numbers.size()-1;i++)
		{
			String item= numbers.get(i);
			int num= Integer.parseInt(item);
			sum= sum+ num;
		}

		System.out.println("The total number of employees = "+sum);

	}

}
