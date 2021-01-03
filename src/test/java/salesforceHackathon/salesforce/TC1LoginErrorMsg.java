package salesforceHackathon.salesforce;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC1LoginErrorMsg extends SalesforceUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotosalesforceURL();
		logintoSalesforceError();
		quitBrowser();
		

	}
public static void logintoSalesforceError() throws Exception{
		
		waitExplicitly(10, driver.findElement(By.id("username")));
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("spt@abc.com");
		waitExplicitly(10, driver.findElement(By.id("password")));
		driver.findElement(By.id("password")).clear();
		//driver.findElement(By.id("password")).sendKeys("sathyasampu1");
		waitExplicitly(10, driver.findElement(By.id("Login")));
		 driver.findElement(By.id("Login")).click();
		 Thread.sleep(5000);
		
		
	}

}
