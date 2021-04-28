package TestCase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificMthods;
import Pages.LoginPage;

public class EditLead_003 extends ProjectSpecificMthods   {
	
	
	@BeforeTest
	public void setFile() {
		
		testName="EditLead";
		testDescription="EditLead with existing createLead";
	    testAuthor="Anand";
	    testCategory="Functional";
		excelFilename="EditLead";
	}

	@Test(dataProvider = "fetchData")
	public void runEditLead(String cname,String phno) throws InterruptedException, IOException {
		
		
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickonPhonetab()
		.enterPhoneNumber(phno)
		.clickFindLeads()
		.clickonFirstLeadnGrid()
		.clickEditButton()
		.enterUcompanyname(cname)
		.clickSubmitButtoninEL()
		.verifyViewLead();
		
		
		
		
	}
	
}
