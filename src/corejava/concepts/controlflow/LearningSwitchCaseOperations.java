package corejava.concepts.controlflow;
import java.util.*;

public class LearningSwitchCaseOperations {

	public static void main(String[] args) {
			
	
	int a=5;
	int b=6;
	String operations="None";
	
	System.out.println("Enter input" );
	Scanner sc=new Scanner(System.in);
    operations= sc.next();
    
   
    
    switch (operations)
    {
    case "add": System.out.println("a+b=" +(a+b) );break;
    case "sub": System.out.println("a-b=" +(a-b) );break;
    case "mul": System.out.println("a-b=" +(a*b) );break;
    case "div": System.out.println("a-b=" +(a/b) );break;
    case "default": System.out.println("invalid output" );
    }
    
	
	
    
}

}