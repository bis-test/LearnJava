//@author- Biswajit Sundara
//@Date- 06/18/2018
//@Program - Rverse the string using different approaches
//@Satus-Complete

/*
Input: String= Success

Output: sseccuS

Please note, don't try to print the output as
System.out.println("Reversed string=" +revstr)
Because revstr is not a string, it's an array of chars 

 */

package corejava.concepts.strings;

public class StringReverse {

	public static void main(String[] args) {

		//1. Approach 1
		String txt="Success";
		String revtxt = null;
		String str;

		int i=0;

		int len=txt.length();

		System.out.println("The string is="+txt);
		System.out.println("Reverse the string using approach 1");
		for(i=len-1;i>=0;i--)
		{

			revtxt= revtxt+txt.charAt(i);
		}

		//we are removing null from the revtxt
		str = revtxt.substring(4, len+4);

		System.out.println(str);

		//End of approach 1


		//Approach 2
		System.out.println("Reverse the string using approach 2");
		String txt1= "Success";
		char[] txt1Arr = txt1.toCharArray();
		int k=0;
		int l=0;
		int len1=txt1Arr.length;
		char[] revtxtArr = new char[len1];
		for(k=len1-1;k>=0;k--)
		{
			revtxtArr[l]=txt1Arr[k];
			l++;
		}

		System.out.println(revtxtArr);


		//Approach 3
		System.out.println("Reverse the string using approach 3");
		String txt3= "Success";
		char[] revtxt3 = txt1.toCharArray();
		//char[] revtxt3= new char[txt3.length()-1];
		int len3=txt3.length();
		int m=0;
		int n=0;

		for(m=len3-1;m>=0;m--)
		{
			revtxt3[n]=txt3.charAt(m);
			n++;
		}

		System.out.println(revtxt3);
		
		
		
		
		

	}

}
