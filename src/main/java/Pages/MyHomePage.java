package Pages;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMthods;

public class MyHomePage extends ProjectSpecificMthods {
	
	
	public MyHomePage(ChromeDriver driver) {
		
		this.driver=driver;
    }
	
	
	   public MyLeadsPage clickLeads() throws IOException {
			try {
				driver.findElementByLinkText("Leads").click();
				reportStep("Leads linked successfully","Pass");
			} catch (Exception e) {
				reportStep("Leads linked unsuccessfully","Fail");
			}
			
			return new MyLeadsPage(driver);
	   }

}
