package corejava.concepts.strings;

public class Exrcise1 {

	public static void main(String[] args) {
		String s1="hello";
        String s2="hello";
        
        if(s1==s2)
        {
        	System.out.println("String matches 1");
        	System.out.println(s1==s2);
        }
        
        if(s1.equals(s2))
        {
        	System.out.println("String matches 2");
        	System.out.println(s1.equals(s2));
        }

	}

}
