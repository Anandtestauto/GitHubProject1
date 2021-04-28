package Pages;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMthods;

public class CreateLeadPage extends ProjectSpecificMthods  {
	
	
	    public CreateLeadPage(ChromeDriver driver) {
			
			this.driver=driver;
	    }
 
	    
	    public CreateLeadPage enterCompanyName(String companyName) throws IOException {
	    	try {
				driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
				reportStep("Enter"+companyName+"successfully","Pass");
			} catch (Exception e) {
				reportStep("Enter companyname unsuccessfully","Fail");
			}
	    	return this;
	    }
	    
	    public CreateLeadPage enterFirstName(String firstName) throws IOException {
	    	try {
				driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
				reportStep("Enter"+firstName+"successfully","Pass");
			} catch (Exception e) {
				reportStep("Enter firstName unsuccessfully","Fail");
			}
	    	return this;
	    }
	    
	    public CreateLeadPage enterLastName(String lastName) throws IOException { 
	    	try {
				driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
				reportStep("Enter"+lastName+"successfully","Pass");
			} catch (Exception e) {
				reportStep("Enter lastName unsuccessfully","Fail");
			}
	    	return this;
	    }
	    
	    
	    public ViewLeadPage clickSubmit() throws IOException {
	    	 try {
				driver.findElementByName("submitButton").click();
				reportStep("Submit button clicked successfully","Pass");
			} catch (Exception e) {
				reportStep("Submit button clicked unsuccessfully","Fail");
			}
	    	return new ViewLeadPage(driver);
	    }
	   
	    
}
