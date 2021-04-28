package Pages;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMthods;

public class LoginPage extends ProjectSpecificMthods  {
	
	
	 public LoginPage(ChromeDriver driver) {
			
			this.driver=driver;
	    }
	
	public LoginPage enterUsername() throws IOException {
		try {
			driver.findElementById("username").sendKeys("demosalesmanager");
			reportStep("Username entered successfully","Pass");
		} catch (Exception e) {
			reportStep("Username entered unsuccessfully","Fail");
		}
		
		return this;
	}
	
	
	public LoginPage enterPassword() throws IOException {
		try {
			driver.findElementById("password").sendKeys("crmsfa");
			reportStep("Password entered successfully","Pass");
		} catch (Exception e) {
			reportStep("Password entered unsuccessfully","Fail");
		}
		return this;
	}
	
	
	public HomePage clickLoginButton() throws IOException {
		try {
			driver.findElementByClassName("decorativeSubmit").click();
			reportStep("Login button clicked successfully","Pass");
		} catch (Exception e) {
			reportStep("Login button clicked unsuccessfully","Fail");
		}
		return new HomePage(driver);
	}

}
