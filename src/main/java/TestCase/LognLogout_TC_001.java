package TestCase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificMthods;
import Pages.LoginPage;

public class LognLogout_TC_001 extends ProjectSpecificMthods {
	
	
	
	@BeforeTest
	public void setFile() {
		
		testName="LoginLogout";
		testDescription="Login with valid credentials";
	    testAuthor="Anand";
	    testCategory="Functional";
		
	}
	
	@Test
	public void loginLogout() throws IOException {
	
	
	LoginPage lp=new LoginPage (driver);
			
			lp.enterUsername()
			  .enterPassword()
			  .clickLoginButton();
	
 
	}
	
}