package javaoops.concepts.polymorphism;

class DisplayOverloading3
{
	public void disp(char c, int num)
	{
		System.out.println("first definition of disp: "+c+","+num);
	}
	public void disp(int num, char c)
	{
		System.out.println("second definition of disp: "+num+","+c );
	}
}




public class MethodOverload3 {

	public static void main(String[] args) {

		DisplayOverloading3 obj = new DisplayOverloading3();
		obj.disp('x', 51 );
		obj.disp(52, 'y');

	}

}
