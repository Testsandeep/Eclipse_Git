package package_Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class First {
	
	SoftAssert sa = new SoftAssert();

	public static void main(String[] args) {

		First obj = new First();
		obj.A();
		obj.B();
		obj.C();

	}

	@Test
	public void A() {
		String s1 = "s";
		String s2 = "s";
		
		sa.assertEquals(s1, s2);
		System.out.println("A");
	}
	
	@Test
	public void B() {
		String s1 = "s";
		String s2 = "m";
		
		sa.assertEquals(s1, s2);
		System.out.println("B");
	}
	
	@Test
	public void C() {
		String s1 = "d";
		String s2 = "d";
		
		sa.assertEquals(s1, s2);
		System.out.println("C");
	}

}
