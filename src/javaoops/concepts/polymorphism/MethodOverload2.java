package javaoops.concepts.polymorphism;


class DisplayOverloading2
{
	public void disp(char c)
	{
		System.out.println(c);
	}
	public void disp(int c)
	{
		System.out.println(c );
	}
}



public class MethodOverload2 {

	public static void main(String[] args) {

		DisplayOverloading2 obj = new DisplayOverloading2();
		obj.disp('B');
		obj.disp(123);


	}

}
