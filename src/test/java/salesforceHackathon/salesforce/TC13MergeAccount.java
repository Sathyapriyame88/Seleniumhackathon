package salesforceHackathon.salesforce;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;
import salesforceHackathon.salesforce.TC10CreateAccount; 

public class TC13MergeAccount extends SalesforceUtility{

	public static void main(String[] args)throws Exception {
		launchBrowser();
		gotosalesforceURL();
		 loginToSalesforce("spt@abc.com", "sathyasampu1");
		 TC10CreateAccount.createAccount();
		 mergeAccount();
		 quitBrowser();
		

	}
	public static void mergeAccount() throws Exception{
		waitExplicitly1(driver, driver.findElement(By.xpath("//li[@id='Account_Tab']")));
		driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
		Thread.sleep(3000);
		//driver.switchTo().activeElement();
	  //  driver.findElement(By.id("tryLexDialogX")).click();
	   // Thread.sleep(3000);
	    waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
	    waitExplicitly(10, driver.findElement(By.xpath("//input[@id='srch']")));
	    driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("Automation");
	    waitExplicitly(10, driver.findElement(By.xpath("//input[@value='Find Accounts']")));
	    driver.findElement(By.xpath("//input[@value='Find Accounts']")).click();
	    waitExplicitly(10, driver.findElement(By.xpath("(//input[@title='Next'])[2]")));
	    driver.findElement(By.xpath("(//input[@title='Next'])[2]")).click();
	    
	    waitExplicitly(10, driver.findElement(By.xpath("(//input[@title='Merge'])[1]")));
	    driver.findElement(By.xpath("(//input[@title='Merge'])[1]")).click();
	    Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
	}

}
