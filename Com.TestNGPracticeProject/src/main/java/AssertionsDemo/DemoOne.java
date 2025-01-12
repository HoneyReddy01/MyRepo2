package AssertionsDemo;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoOne {
	
	@Test 
	public void One() {
		
		//Assert.assertEquals(9,3);
		int a=10, b=30;
		
		Assert.assertTrue(a<b);
	}

}
