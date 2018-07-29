package corejava.concepts.strings;

import java.util.StringTokenizer;

public class MultipleSpacesToSingleSpace {

	public static void main(String[] args) {
		String str = "a  bcd$            cd.";
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuffer sb = new StringBuffer();
        while(st.hasMoreElements()){
            sb.append(st.nextElement()).append(" ");
        }
        System.out.println(sb.toString().trim());

	}

}
