package Base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.ReadExcelEDP;

public class ProjectSpecificMthods {
	
	
	public ChromeDriver driver;
	public String excelFilename;
	public static ExtentHtmlReporter reportfile;
	public static ExtentReports extent;
	public static ExtentTest test,Node;
	public String testName,testDescription,testAuthor,testCategory;
	
	
	@BeforeSuite 
	public void startReport1() {
		reportfile=new ExtentHtmlReporter("./Reports/report.html");
        reportfile.setAppendExisting(true);
		extent=new ExtentReports();
	    extent.attachReporter(reportfile);
	}
	
	
	public long takeSnap() throws IOException {
		
	    long randnum=(long)(Math.random()*99999999);
		File source= driver.getScreenshotAs(OutputType.FILE);
		File target=new File("./Snaps/img"+randnum+".png");
		FileUtils.copyFile(source, target);
		return randnum;
	}
	
	@BeforeClass
	public void testDetails() {
		
		test=extent.createTest( testName,testDescription);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);
		
	}
	
	
	public void reportStep(String msg,String status) throws IOException {
		
		if(status.equalsIgnoreCase("pass")) {
			Node.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".//./Snaps/img"+takeSnap()+".png").build());
		}
		else {
			Node.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".//./Snaps/img"+takeSnap()+".png").build());
		}
		
		
	}
	
	@BeforeMethod
	public void statApp() { 
		
		Node = test.createNode(testName);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	
	@AfterMethod
	public void stopApp() {
		
		driver.close();
	}
	
	
	
	

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {

		return ReadExcelEDP.readexcelData(excelFilename);

	}
	
	
	
	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
	
	
}
