package package_Test;

import org.testng.annotations.Test;

public class First {

	public static void main(String[] args) {

		First obj = new First();
		obj.A();

	}
	
	@Test
	public void A() {
		System.out.println("First Program");
	}

}
