package salesforceHackathon.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import salesforceUtility.SalesforceUtility;

public class TC35VerifyTabCustomization extends SalesforceUtility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
		verifytabCustomization();
		quitBrowser();

	}
	public static void verifytabCustomization() throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='AllTab_Tab']")));
		 driver.findElement(By.xpath("//li[@id='AllTab_Tab']")).click();
	 
		waitExplicitly(10,driver.findElement(By.xpath("//input[@value='Customize My Tabs']")));
		 driver.findElement(By.xpath("//input[@value='Customize My Tabs']")).click();
		 Select se=new Select(driver.findElement(By.id("duel_select_1")));
			se.selectByVisibleText("Subscriptions");
			
		 
		// waitExplicitly(10,driver.findElement(By.xpath("//option[@value='ContentSubscriptions']")));
		// driver.findElement(By.xpath("//option[@value='ContentSubscriptions']")).click();
		// Thread.sleep(3000);
		 
		 waitExplicitly(10,driver.findElement(By.xpath("//img[@title='Remove']")));
		 driver.findElement(By.xpath("//img[@title='Remove']")).click();
		 Thread.sleep(3000);
		 
		 waitExplicitly(10,driver.findElement(By.xpath("//input[@title='Save']")));
		 driver.findElement(By.xpath("//input[@title='Save']")).click();
		 Thread.sleep(4000);
		 waitExplicitly(10, driver.findElement(By.id("userNavLabel")));
		 driver.findElement(By.id("userNavLabel")).click();
		
		 waitExplicitly1(driver,driver.findElement(By.xpath("//a[@title='Logout']")));
		 driver.findElement(By.xpath("//a[@title='Logout']")).click();
		 Thread.sleep(3000);
		 loginToSalesforce("spt@abc.com", "sathyasampu1");
		 System.out.println("The Removed Tab is not Displayed");
		 
		
	}

}
