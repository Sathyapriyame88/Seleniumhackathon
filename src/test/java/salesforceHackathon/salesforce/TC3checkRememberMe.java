package salesforceHackathon.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import salesforceUtility.SalesforceUtility;

public class TC3checkRememberMe extends SalesforceUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotosalesforceURL();
		//loginToSalesforce();
		rememberMe();
		quitBrowser();
		
	}
	public static void rememberMe()throws Exception{
		waitExplicitly(10, driver.findElement(By.id("username")));
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("spt@abc.com");
		waitExplicitly(10, driver.findElement(By.id("password")));
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("sathyasampu1");
		WebElement li=driver.findElement(By.xpath("//input[@id='rememberUn']"));
		li.click();
		waitExplicitly(10, driver.findElement(By.id("Login")));
		 driver.findElement(By.id("Login")).click();
		 waitExplicitly(10, driver.findElement(By.id("userNavLabel")));
		 driver.findElement(By.id("userNavLabel")).click();
		 waitExplicitly1(driver,driver.findElement(By.xpath("//a[@title='Logout']")));
		// waitExplicitly(10, driver.findElement(By.xpath("//a[@title='Logout']")));
		 driver.findElement(By.xpath("//a[@title='Logout']")).click();
		 Thread.sleep(5000);
		
		
	}

}
