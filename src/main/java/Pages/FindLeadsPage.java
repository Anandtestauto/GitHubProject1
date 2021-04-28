package Pages;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMthods;


public class FindLeadsPage extends ProjectSpecificMthods {
	
	public FindLeadsPage(ChromeDriver driver) {
    	this.driver=driver; 
	} 	
    	
	public FindLeadsPage clickonPhonetab() throws IOException {
		try {
			driver.findElementByXPath("//span[text()='Phone']").click();
			reportStep("phone no tab clicked successfully", "Pass");
		} catch (Exception e) {
			reportStep("phone no tab clicked unsuccessfully", "Fail");
		}
		return this;
		}
	
	public FindLeadsPage enterPhoneNumber(String phoneNumber) throws IOException {
		try {
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phoneNumber);
			reportStep("Entered"+phoneNumber+"successfully", "Pass");
		} catch (Exception e) {
			reportStep("Entered ph no unsuccessfully", "Fail");
		}
		return this;
	}

	public FindLeadsPage clickFindLeads() throws InterruptedException, IOException {
		try {
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
			reportStep("Clicked FIND LEADS successfully", "Pass");
		} catch (Exception e) {
			reportStep("Clicked FIND LEADS un-successfully", "Fail");
		}
		return this;
	}

	public ViewLeadPage clickonFirstLeadnGrid() throws IOException{
		try {
			driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
			reportStep("Clicked First LEAD successfully", "Pass");
		} catch (Exception e) {
			reportStep("Clicked First LEAD unsuccessfully", "Fail");
		}
		return new ViewLeadPage(driver);
	} 

}
 

