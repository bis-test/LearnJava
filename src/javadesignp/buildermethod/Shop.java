package javadesignp.buildermethod;

public class Shop {

	public static void main(String[] args) {
		
		Phone p = new PhoneBuilder().setOS("Andriod").setRAM(2).getPhone();
        System.out.println(p);
	}

}
