package corejava.concepts.strings;


public class StringExercise1 {

	public static void main(String[] args) {
		String str="xaxXbxcx";
		char[] arr= str.toCharArray();
        String str1="";
        String str2="";

		for (char c : arr) {
			
			if(c=='x')
			{
			  str1=str1+c;
			}
			else
			{
				str2=str2+c;
			}
		}
	
	 str2=str2.concat(str1);	
      System.out.println(str1);
      System.out.println(str2);
	}

}
