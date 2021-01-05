package salesforceHackathon.salesforce;

import java.util.Map;
import salesforceHackathon.salesforce.TC10CreateAccount;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility; 

public class TC13MergeAccount extends SalesforceUtility{

	public static void main(String[] args)throws Exception {
		launchBrowser();
		gotosalesforceURL();
		 Map<String, String>  rowMap = readRowFromExcel(14);
			loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
		TC10CreateAccount.createAccount(rowMap.get("accountname"));
		 mergeAccount(rowMap.get("accountname"));
		 quitBrowser();
		

	}
	public static void mergeAccount(String accName) throws Exception{
		waitExplicitly1(driver, driver.findElement(By.xpath("//li[@id='Account_Tab']")));
		driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
		Thread.sleep(3000);
		//driver.switchTo().activeElement();
	  //  driver.findElement(By.id("tryLexDialogX")).click();
	   // Thread.sleep(3000);
	    waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
	    waitExplicitly(10, driver.findElement(By.xpath("//input[@id='srch']")));
	    driver.findElement(By.xpath("//input[@id='srch']")).sendKeys(accName);
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
