package HashMapConcept_B;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCRMTest 
{
	WebDriver driver;
	public String credentials;
	public String credentialsInfo[];
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
		driver.get("https://classic.crmpro.com/index.html");
	}
	
	@Test(priority=1)
	public void loginWithCustomerCredentials() throws InterruptedException
	{	
		//Accessing User Credentials from Data Class.
		//Split function returns String[].
		credentials = Data.getUserLoginInfo().get("customer");
		credentialsInfo = credentials.split("_");
		
		driver.findElement(By.name("username")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@class='btn btn-small' and @type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginButton);
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("mainpanel");
		Select select = new Select(driver.findElement(By.name("slctMonth")))	;
		select.selectByVisibleText(Data.monthMap().get(10));
	}
	
	@Test(priority=2)
	public void loginWithAdminCredentials() throws InterruptedException
	{	
		//Accessing User Credentials from Data Class.
		//Split function returns String[].
		credentials = Data.getUserLoginInfo().get("admin");
		credentialsInfo = credentials.split("_");
		
		driver.findElement(By.name("username")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@class='btn btn-small' and @type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginButton);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
