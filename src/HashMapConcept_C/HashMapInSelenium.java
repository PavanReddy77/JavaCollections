package HashMapConcept_C;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapInSelenium 
{	
	//Scenario:
	//Role Based -- Permission Based Use Case.
	//Category Manager User --> Go to Application --> Add all the Products.
	//Customer User --> Go to Application --> Buy a Product --> Place an Order.
	//Admin User --> Go to Application --> Can See all the Orders Placed.
	//Seller User --> Go to Application --> See only those orders which are relevant.
	//Distributor User --> Go to Application --> Can see the respective order. 
	//Delivery Boy User --> Go to Application --> Can see the Order and Deliver the Product.
	//Customer Case User --> Go to Application --> Solve all Problems.
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
		driver.get("https://classic.crmpro.com/index.html");
		
		//To Print all values from getCredentials HashMap.
		System.out.println(getCredentials());
		
		//To Print particular Value using Key from getCredentials HashMap.
		System.out.println(getCredentials().get("customer"));
		
		System.out.println("#################################");
		
		String customer_Credentials = getCredentials().get("customer"); //pavanreddy:Saibaba77
		
		//First Way to Access Credentials
		//driver.findElement(By.name("username")).sendKeys(customer_Credentials.split(":")[0]);
		//driver.findElement(By.name("password")).sendKeys(customer_Credentials.split(":")[1]);\
		
		//Second Way to Access Credentials
		driver.findElement(By.name("username")).sendKeys(getUserName("customer"));
		driver.findElement(By.name("password")).sendKeys(getPassword("customer"));
	}
	
	public static HashMap<String, String> getCredentials()
	{
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("customer", "pavanreddy:Saibaba77");
		userMap.put("admin", "admin:test@123");
		userMap.put("distributor", "distributor:test@123");
		userMap.put("seller", "seller:test@123");
		userMap.put("deliveryboy", "deliveryboy:test@123");
		
		return userMap;
	}
	
	public static String getUserName(String role)
	{
		String credentials = getCredentials().get(role);
		return credentials.split(":")[0];
	}
	
	public static String getPassword(String password)
	{
		String credentials = getCredentials().get(password);
		return credentials.split(":")[1];
	}
}
