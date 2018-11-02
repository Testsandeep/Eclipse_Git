package package_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class First {

	public static void main(String[] args) {

		First obj = new First();
		obj.A();

	}

	@Test
	public void A() {
		String s1 = "s";
		String s2 = "b";
		
		Assert.assertEquals(s1, s2);
	}

}
