package corejava.concepts.collections;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

public class SortDates {

	public static void main(String[] args) {

		ArrayList<String> datestr = new ArrayList<String>();
		datestr.add("10/10/1988");
		datestr.add("11/15/1979");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy '@'hh:mm a");
	    Collections.sort(datestr, (s1, s2) -> LocalDateTime.parse(s1, formatter).
	            compareTo(LocalDateTime.parse(s2, formatter)));
	}

}
