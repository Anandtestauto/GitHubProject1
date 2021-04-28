package Pages;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMthods;

public class MyLeadsPage extends ProjectSpecificMthods {
	
	

	public MyLeadsPage(ChromeDriver driver) {
		
		this.driver=driver;
    }
	
	
	
	public CreateLeadPage clickCreateLead() throws IOException {
    	try {
			driver.findElementByLinkText("Create Lead").click();
			reportStep("Clicked  Create Lead successfully", "Pass");
		} catch (Exception e) {
			reportStep("Clicked  Create Lead un successfully", "Fail");
		}
    	return new CreateLeadPage(driver);
    }
	
	
	public FindLeadsPage clickFindLeads() throws IOException {
		try {
			driver.findElementByLinkText("Find Leads").click();
			reportStep("Clicked Find Lead successfully", "Pass");
		} catch (Exception e) {
			reportStep("Clicked Find Lead un successfully", "Pass");
		}
		return new FindLeadsPage(driver);
	}

}
