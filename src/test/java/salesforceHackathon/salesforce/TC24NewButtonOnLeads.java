package salesforceHackathon.salesforce;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC24NewButtonOnLeads extends SalesforceUtility {

	public static void main(String[] args) throws Exception {

		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
		newButtonOnLeads();
		quitBrowser();

	}
	public static void newButtonOnLeads()throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Lead_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Lead_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		waitExplicitly(10,driver.findElement(By.xpath("//input[@title='New']")));
		 driver.findElement(By.xpath("//input[@title='New']")).click();
		 
		 waitExplicitly(10,driver.findElement(By.xpath("//input[@id='name_lastlea2']")));
		 driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("ABCD");;
		 
		 waitExplicitly(10,driver.findElement(By.xpath("//input[@id='lea3']")));
		 driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("ABCD");
		 Thread.sleep(3000);
		 waitExplicitly(10,driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")));
		 driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
	}

}
//td[@id='bottomButtonRow']//input[@title='Save']