package salesforceHackathon.salesforce;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC9Logout extends SalesforceUtility{

	public static void main(String[] args)throws Exception {
		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
		logOut();
		quitBrowser();
		

	}
	public static void logOut()throws Exception{
		waitExplicitly(10, driver.findElement(By.id("userNavLabel")));
		 driver.findElement(By.id("userNavLabel")).click();
		
		 waitExplicitly1(driver,driver.findElement(By.xpath("//a[@title='Logout']")));
		 driver.findElement(By.xpath("//a[@title='Logout']")).click();
		 Thread.sleep(3000);
	}

}
