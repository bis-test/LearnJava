package corejava.concepts.controlflow;
import java.util.*;

public class LearningSwitchCase {

	public static void main(String[] args)
	{

		int day = 0;

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the day number");
		day= sc.nextInt();
		
		switch(day)
		{

		case 1: System.out.println("Today is Monday");break;
		case 2: System.out.println("Today is Tuesday");break;
		case 3: System.out.println("Today is Wednesday");break;
		case 4: System.out.println("Today is Thursday");break;
		case 5: System.out.println("Today is Friday");break;
		case 6: System.out.println("Today is Saturday");break;
		}
	}
}
