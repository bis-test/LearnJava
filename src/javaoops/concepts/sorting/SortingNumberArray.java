/* @author-Biswajit Sundara
 * @date-05/04/2018
 * @subject- Sort an array of integers using bubble sort
 * @verified- yes
 * 
 * compareTo() is a method in string class that returns integer value
 * The method compareTo() is used for comparing two strings lexicographically. 
 * Each character of both the strings is converted into a Unicode value for comparison. 
 * If both the strings are equal then this method returns 0 else it returns positive or negative value.	
 * 
 * 
 */


package javaoops.concepts.sorting;


public class SortingNumberArray
{

	public static void main(String[] args) 
	{
		int arr[] = {3,60,35,2,45,320,5};
		int n=arr.length;
		int temp=0;
		
		System.out.println("Array before bubble sort");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] +" ");
		}

		
		for (int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j-1] > arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("\nArray after bubble sort");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] +" ");
		}

	}


}
