package salesforceHackathon.salesforce;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC31CancelButtonInCreateNewView extends SalesforceUtility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
	cancelButtonInCreateNewView();
		quitBrowser();


	}
	public static void cancelButtonInCreateNewView() throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Contact_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		waitExplicitly(10,driver.findElement(By.xpath(" //a[contains(text(),'Create New View')]")));
		 driver.findElement(By.xpath(" //a[contains(text(),'Create New View')]")).click();
		 waitExplicitly1(driver, driver.findElement(By.xpath("//input[@id='fname']")));
			driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("ABCD");
			
			waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='devname']")));
			driver.findElement(By.xpath("//input[@id='devname']")).clear();
			driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFGH");
			Thread.sleep(3000);
			waitExplicitly1(driver,driver.findElement(By.xpath("(//input[@value='Cancel'])[2]")));
			driver.findElement(By.xpath("(//input[@value='Cancel'])[2]")).click();;
			Thread.sleep(3000);
		
		
	}

}
