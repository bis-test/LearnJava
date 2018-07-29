package corejava.concepts.keywords;


class Student
{  
	int rollno;  
	String name;  
	static String college ="ITS";  

	Student(int r,String n)
	{  
		rollno = r;  
		name = n;  
	}  
	
	void display ()
	{
		System.out.println(rollno+" "+name+" "+college);
	}  

}

public class StaticVariable
{
	public static void main(String args[])
	{  
		Student s1 = new Student(111,"Salman");  
		Student s2 = new Student(222,"Aamir");  

		s1.display();  
		s2.display();  
	}  
 
}



