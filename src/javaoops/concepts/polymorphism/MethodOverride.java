package javaoops.concepts.polymorphism;


public class MethodOverride {

	public static void main(String[] args) {
		Boy obj = new Boy();
		//This will call the child class version of eat()
		obj.eat();

	}

}


class Human{
	//Overridden method
	public void eat()
	{
		System.out.println("Human is eating");
	}
}
class Boy extends Human{
	//Overriding method
	public void eat(){
		System.out.println("Boy is eating");
	}
}


	
