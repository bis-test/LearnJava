/* @author-Biswajit Sundara
 * @date-05/04/2018
 * @subject- Sort an array of Strings using bubble sort
 * @verified- yes
 * 
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly 
 * steps through the list to be sorted, compares each pair of adjacent items and swaps them if they are 
 * in the wrong order.
 * 
 */


package javaoops.concepts.sorting;


public class SortingStringArray
{

	public static void main(String[] args) 
	{


		//Declare the string array & other variables
		String arr[] = {"Zhiva","Derrick","Bis","Thanya","Eloy"};
		int n=arr.length;
		String temp=null;

		//Print the unsorted array 
		System.out.println("Array before bubble sort");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] +" ");
		}

		//Sort the array		
		for (int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if((arr[j-1].compareTo(arr[j])) >0)
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}

		//Print the sorted array 
		System.out.println("\nArray after bubble sort");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] +" ");
		}

	}


}
