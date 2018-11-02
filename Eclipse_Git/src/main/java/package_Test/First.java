package package_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class First {

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
		
		Assert.assertEquals(s1, s2);
		System.out.println("A");
	}
	
	@Test
	public void B() {
		String s1 = "s";
		String s2 = "m";
		
		Assert.assertEquals(s1, s2);
		System.out.println("B");
	}
	
	@Test
	public void C() {
		String s1 = "d";
		String s2 = "d";
		
		Assert.assertEquals(s1, s2);
		System.out.println("C");
	}

}
