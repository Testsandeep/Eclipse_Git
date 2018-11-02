package package_Test;

import org.testng.Assert;

public class First {

	public static void main(String[] args) {

		First obj = new First();
		obj.A();

	}

	public void A() {
		String s1 = "s";
		String s2 = "a";
		
		Assert.assertEquals(s1, s2);
	}

}
