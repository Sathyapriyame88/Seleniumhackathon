package salesforceUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceUtility {
	public static WebDriver driver;
	public static void launchBrowser()throws Exception{
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Launched Succesfully");
		
	}
	public static void gotosalesforceURL(){
		driver.get("https://login.salesforce.com/");
		System.out.println("Succesfully launched the Salesforce Application ");
	}
	public static void quitBrowser() throws Exception{
		Thread.sleep(3000);
		driver.quit();
	}
	public static void launchFirefox(){
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	public static void waitExplicitly(int iseconds,WebElement ele){
		WebDriverWait wait=new WebDriverWait(driver, iseconds);
		wait.ignoring(NoSuchElementException.class, ElementNotVisibleException.class);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	public static void waitExplicitly1(WebDriver driver,WebElement obj )
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(obj));
		
}	
	
	public static void loginToSalesforce(String userName, String password) throws Exception{
		waitExplicitly(10, driver.findElement(By.id("username")));
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(userName);
		waitExplicitly(10, driver.findElement(By.id("password")));
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		waitExplicitly(10, driver.findElement(By.id("Login")));
		 driver.findElement(By.id("Login")).click();
		 Thread.sleep(10000);
		 System.out.println("Successfuly Loged in  to the Salesforce");
		
		
		
	}
	
	
	
	
	
	

}
