package salesforceHackathon.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import salesforceUtility.SalesforceUtility;

public class TC10CreateAccount extends SalesforceUtility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		loginToSalesforce("spt@abc.com", "sathyasampu1");
		createAccount();
		quitBrowser();

	}
	public static void createAccount()throws Exception{
		waitExplicitly1(driver, driver.findElement(By.xpath("//li[@id='Account_Tab']")));
		driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
	    driver.findElement(By.id("tryLexDialogX")).click();
	    waitExplicitly1(driver, driver.findElement(By.xpath("//input[@title='New']")));
		driver.findElement(By.xpath("//input[@title='New']")).click();
		waitExplicitly1(driver, driver.findElement(By.xpath("//input[@id='acc2']")));
		driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("Automation");;
		Select se=new Select(driver.findElement(By.id("acc6")));
		se.selectByVisibleText("Technology Partner");
		Thread.sleep(3000);
		Select se1=new Select(driver.findElement(By.id("00N4x00000Dfvhe")));
		se1.selectByVisibleText("High");
		Thread.sleep(3000);
		waitExplicitly1(driver, driver.findElement(By.xpath("//input[@tabindex='34']")));
		driver.findElement(By.xpath("//input[@tabindex='34']")).click();
		waitExplicitly1(driver, driver.findElement(By.xpath("//li[@id='Account_Tab']")));
		driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
		
			
	}

}