package Pages;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.ProjectSpecificMthods;

public class HomePage extends ProjectSpecificMthods {
	
	
	 public HomePage(ChromeDriver driver) {
			
			this.driver=driver;
	    }

	public MyHomePage clickCRMSFA() throws IOException {
		try {
			driver.findElementByLinkText("CRM/SFA").click();
			reportStep("Clicked CRMSFA link successfully", "Pass");
		} catch (Exception e) {
			reportStep("Clicked CRMSFA link un successfully", "Fail");
		}
		
		return new MyHomePage(driver);
	}

}
