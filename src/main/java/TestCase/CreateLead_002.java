package TestCase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificMthods;
import Pages.LoginPage;

public class CreateLead_002 extends ProjectSpecificMthods {
	
	
	@BeforeTest
	public void setFile() {
		
		
		testName="CreateLead";
		testDescription="CreateLead with mandatory fields";
	    testAuthor="Anand";
	    testCategory="Smoke";
		excelFilename="CreateLead";
	}

	@Test(dataProvider = "fetchData")
	public void  runCreateLead(String fname,String lname,String cname ) throws IOException {
		
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterCompanyName(cname)
		.clickSubmit()
		.verifyViewLead();
		
		
	}

	
} 
