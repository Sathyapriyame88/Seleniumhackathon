package salesforceHackathon.salesforce;

import org.openqa.selenium.By;
import salesforceUtility.SalesforceUtility;

public class TC23TodaysLeadWork extends SalesforceUtility{

	public static void main(String[] args) throws Exception{
	launchBrowser();
	gotosalesforceURL();
	loginToSalesforce("spt@abc.com", "sathyasampu1");
	todaysLeadWork();
	quitBrowser();

	}
	public static void todaysLeadWork() throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Lead_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Lead_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		waitExplicitly(10,driver.findElement(By.id("fcf")) );
		driver.findElement(By.id("fcf")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//option[@value='00B4x000007cWq5']")));
		driver.findElement(By.xpath("//option[@value='00B4x000007cWq5']")).click();
		Thread.sleep(5000);
	
	}

}
