package corejava.concepts.controlflow;
import java.util.*;


public class LearningSwitchcaseString {

	public static void main(String[] args)
	{
		
	
	String light="none";
	
	Scanner sc=new Scanner(System.in);
	System.out.println("What is the light color");
	light=sc.next();
	
	
	
	switch(light)
	{
	case "green": System.out.println("Go..");break;
	case "yellow": System.out.println("Get Ready");break;
	case "Red": System.out.println("stop");break;
	default: System.out.println("Wait");
	}
}

}