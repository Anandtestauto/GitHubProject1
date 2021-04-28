package Pages;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.ProjectSpecificMthods;


public class ViewLeadPage extends ProjectSpecificMthods {
 
    
	public ViewLeadPage(ChromeDriver driver) {
		
		this.driver=driver;
    	
    }
	
	public void verifyViewLead() {
		
		System.out.println("createLead verified successfully");
	}
	
	public EdtitLeadPage clickEditButton() throws IOException {
		try {
			driver.findElementByLinkText("Edit").click();
			reportStep("Clicked Edit button successfully", "Pass");
		} catch (Exception e) {
			reportStep("Clicked Edit button un successfully", "Pass");
		}
		return new EdtitLeadPage(driver);
	}
	
}
