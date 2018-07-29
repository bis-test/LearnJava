

/*
 * Every class in java is child of Object class either directly or indirectly. 
 * Object class contains toString() method. We can use toString() method to get string 
 * representation of an object. Whenever we try to print the Object reference then internally 
 * toString() method is invoked. If we did not define toString() method in your class 
 * then Object class toString() method is invoked otherwise our implemented/Overridden toString() 
 * method will be called.
 */




package corejava.concepts.strings;

public class Student{  
	int rollno;  
	String name;  
	String city;  

	Student(int rollno, String name, String city){  
		this.rollno=rollno;  
		this.name=name;  
		this.city=city;  
	}  


	//uncomment below lines to override the toString method
	//This will print the correct output
	
	/*public String toString(){//overriding the toString() method  
		//return rollno+" "+name+" "+city;  
	} */  


	public static void main(String args[]){  
		Student s1=new Student(101,"Raj","lucknow");  
		Student s2=new Student(102,"Vijay","ghaziabad");  

		System.out.println(s1);//compiler writes here s1.toString()  
		System.out.println(s2);//compiler writes here s2.toString()  
	}  



}
