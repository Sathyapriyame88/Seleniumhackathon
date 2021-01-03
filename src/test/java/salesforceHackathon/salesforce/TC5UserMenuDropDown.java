package salesforceHackathon.salesforce;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC5UserMenuDropDown extends SalesforceUtility{

	public static void main(String[] args)throws Exception {
		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
		userMenuDropDown();
		quitBrowser();
		

	}
public static void userMenuDropDown()throws Exception{
	 waitExplicitly(10, driver.findElement(By.id("userNavLabel")));
	 driver.findElement(By.id("userNavLabel")).click();
	 Thread.sleep(5000);
}
}
