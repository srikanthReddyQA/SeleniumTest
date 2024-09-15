package Selenium.SeleniumProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LauchBrowser {
	static WebDriver driver;


	//public LauchBrowser() {
		//this.driver = driver;
		//PageFactory.initElements(driver, LauchBrowser.class);
		//}
	
	
	//@FindBy(xpath = "//div[contains(@class,'w3-row w3-center')]/div[3]/div")
	//static WebElement getADemo;

	//@FindBy(xpath="//div[contains(@class,'w3-row w3-center')]/div[3]/div")
//	static WebElement getADemo;
	
	@Test
   // @Parameters("Browser")
	public static void browser() throws InterruptedException, WebDriverException, IOException {
		
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		
	
		
	WebDriverManager.chromedriver().browserVersion("124.0.0000.00 ").setup();
	
		driver = new ChromeDriver();
		
	
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		
		driver.manage().window().maximize();
		WebElement e = null;
		Thread.sleep(2000);
		Reporter.log("Browser Opened");
		 
		extent.createTest("MyFirstTest Browser")
		 .log(Status.PASS, "Browser Opened chrome");
		extent.flush();
	
		
		WebElement getADemo = driver.findElement(By.xpath("//div[contains(@class,'w3-row w3-center')]/div[3]/div"));
		Thread.sleep(2000);
	Actions s =new Actions(driver);

	
	s.moveToElement(getADemo).perform();
	
	WebElement element =driver.findElement(By.xpath("//span[contains(@class,'tooltiptext tooltip-bottom')]"));
	  System.out.println("--------");
    System.out.println(element.getAttribute("title" ));
    System.out.println("-----");
	//e.clear();
	System.out.println(element.getText());
	
	
	driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[2]")).click();
	
	
	
		TakesScreenshot screen =(TakesScreenshot)driver;
		File sc  =screen.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("");
		FileUtils.copyFile(sc, DestFile);
		
		
	
	
	//WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(60));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".classlocator")));
	
	Assert.assertEquals("test", "test");
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals("ho", "ho");
	softAssert.assertAll();
	}
	
	
	
}

