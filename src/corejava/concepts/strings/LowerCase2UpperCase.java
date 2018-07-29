package corejava.concepts.strings;

public class LowerCase2UpperCase {

	public static void main(String[] args) {
		
		
		String str="hello";
		String str1="";
		//I want to convert the small l to capital
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(i==3)
			{
				//if we subtract the 32 from ascii value, it will give ascii value of capital letter
				//visit https://www.asciitable.com/
				str1= str1+((char)(str.charAt(i)-32));
			}
			else 
			{
				str1=str1+str.charAt(i);
			}
		}

		System.out.println(str1);

	}

}
