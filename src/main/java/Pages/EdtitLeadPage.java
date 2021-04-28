package Pages;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMthods;



public class EdtitLeadPage extends ProjectSpecificMthods {
	
	
	 public EdtitLeadPage(ChromeDriver driver) {
			
			this.driver=driver;
	    }
	
	
	 public EdtitLeadPage enterUcompanyname(String companyName) throws IOException{
		  try {
			driver.findElementById("updateLeadForm_companyName").sendKeys(companyName);
			reportStep("Enter"+companyName+"successfully","Pass");
		} catch (Exception e) {
			reportStep("Enter lastName unsuccessfully","Fail");
			
		}
		  return this;
		}
		
		public ViewLeadPage clickSubmitButtoninEL() throws IOException {
			try {
				driver.findElementByName("submitButton").click();
				reportStep("Submit button clicked successfully","Pass");
			} catch (Exception e) {
				reportStep("Submit button clicked unsuccessfully","Fail");
				
			}
			return new ViewLeadPage(driver);
		}
	 

}
