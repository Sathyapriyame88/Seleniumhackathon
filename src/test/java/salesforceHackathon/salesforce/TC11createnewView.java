package salesforceHackathon.salesforce;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC11createnewView extends SalesforceUtility{

	public static void main(String[] args) throws Exception{
      launchBrowser();
      gotosalesforceURL();
      loginToSalesforce("spt@abc.com", "sathyasampu1");
      createNewview();
      quitBrowser();

	}
	public static void createNewview()throws Exception{
		waitExplicitly1(driver, driver.findElement(By.xpath("//li[@id='Account_Tab']")));
		driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
	    driver.findElement(By.id("tryLexDialogX")).click();
		waitExplicitly1(driver, driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		waitExplicitly1(driver, driver.findElement(By.xpath("//input[@id='fname']")));
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("abcd1");
		driver.findElement(By.xpath("//input[@id='devname']")).clear();
		
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='devname']")));
		//driver.findElement(By.xpath("//input[@id='devname']")).clear();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("Automatiom View1");
		Thread.sleep(3000);
		waitExplicitly1(driver, driver.findElement(By.xpath("//input[@data-uidsfdc='4']")));
		driver.findElement(By.xpath("//input[@data-uidsfdc='4']")).click();
		
	}

}
