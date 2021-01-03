package salesforceHackathon.salesforce;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class T29ViewAContact extends SalesforceUtility {

	public static void main(String[] args) throws Exception{

		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
	viewAContact();
		quitBrowser();
	}
	public static void viewAContact() throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Contact_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		waitExplicitly(10,driver.findElement(By.xpath("//a[contains(text(),'spt')]")));
		 driver.findElement(By.xpath("//a[contains(text(),'spt')]")).click();
		 Thread.sleep(3000);
		
	}

}
