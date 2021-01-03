package salesforceHackathon.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import salesforceUtility.SalesforceUtility;

public class T28CheckMyContactView extends SalesforceUtility{
	
		public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
		checkMyContactView();
		quitBrowser();
		
	}
	public static void checkMyContactView() throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Contact_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		Select se=new Select(driver.findElement(By.id("fcf")));
		se.selectByVisibleText("My Contacts");
		Thread.sleep(3000);
		
	}

}
