package DataDrivenTestingDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDDemo {
           
	@Test(dataProvider="dsm")
	public void Testlogin(String username ,String password){
		System.out.println("User has login using username : "+username+" and password: "+password);
		
		
		
		
	}
	@DataProvider(name="dsm")
	public Object[][] DataSupplierMthod() {
		
		Object[][] data= {{"Arun","123"},{"tharun","345"},{"varun","567"}};
		return data;
		
	}
	
	
	
}
