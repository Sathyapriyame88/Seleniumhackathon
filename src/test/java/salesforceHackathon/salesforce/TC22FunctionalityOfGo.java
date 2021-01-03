package salesforceHackathon.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import salesforceUtility.SalesforceUtility;

public class TC22FunctionalityOfGo extends SalesforceUtility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
		functionalityOfGo();
		quitBrowser();

	}
	public static void functionalityOfGo()throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Lead_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Lead_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		waitExplicitly(10,driver.findElement(By.id("fcf")) );
		driver.findElement(By.id("fcf")).click();
		Select se=new Select(driver.findElement(By.id("fcf")));
		se.selectByVisibleText("My Unread Leads");
	//	Thread.sleep(3000);
		waitExplicitly(10, driver.findElement(By.id("userNavLabel")));
		 driver.findElement(By.id("userNavLabel")).click();
		
		 waitExplicitly1(driver,driver.findElement(By.xpath("//a[@title='Logout']")));
		 driver.findElement(By.xpath("//a[@title='Logout']")).click();
		 Thread.sleep(5000);
		 loginToSalesforce("spt@abc.com", "sathyasampu1");
		 waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Lead_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Lead_Tab']")).click();
		 waitExplicitly(10,driver.findElement(By.xpath("//input[@title='Go!']")));
		 driver.findElement(By.xpath("//input[@title='Go!']")).click();
		  Thread.sleep(3000);
	}

}
