package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC14CreateAccountreport extends SalesforceUtility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		 Map<String, String>  rowMap = readRowFromExcel(15);
			loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
		 TC10CreateAccount.	createAccount(rowMap.get("accountname"));
		createAccountReport();
		quitBrowser();
		
	}
	public static void createAccountReport()throws Exception {
		waitExplicitly1(driver, driver.findElement(By.xpath("//li[@id='Account_Tab']")));
		driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
	    driver.findElement(By.id("tryLexDialogX")).click();
	  Thread.sleep(3000);
	   waitExplicitly1(driver, driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		waitExplicitly1(driver, driver.findElement(By.xpath("//input[@id='ext-gen20']")));
		driver.findElement(By.xpath("//input[@id='ext-gen20']")).click();
		waitExplicitly1(driver, driver.findElement(By.xpath("//div[contains(text(),'Created Date')]")));
		driver.findElement(By.xpath("//div[contains(text(),'Created Date')]")).click();
		waitExplicitly1(driver, driver.findElement(By.xpath("//img[@id='ext-gen152']")));
		driver.findElement(By.xpath("//img[@id='ext-gen152']")).click();
		waitExplicitly1(driver, driver.findElement(By.xpath("(//button[contains(text(),'Today')])[1]")));
		driver.findElement(By.xpath("(//button[contains(text(),'Today')])[1]")).click();
		
		waitExplicitly1(driver, driver.findElement(By.xpath("//img[@id='ext-gen154']")));
		driver.findElement(By.xpath("//img[@id='ext-gen154']")).click();
		
		waitExplicitly1(driver, driver.findElement(By.xpath("(//button[contains(text(),'Today')])[2]")));
		driver.findElement(By.xpath("(//button[contains(text(),'Today')])[2]")).click();
		waitExplicitly1(driver, driver.findElement(By.xpath("//button[@id='ext-gen49']")));
		driver.findElement(By.xpath("//button[@id='ext-gen49']")).click();
		
		
		waitExplicitly1(driver, driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")));
		driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")).sendKeys("savedreport1");
		
	
		
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")));
		//driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")).clear();
		driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")).click();
     Thread.sleep(5000);
		waitExplicitly1(driver, driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]")));
	driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]")).click();
		Thread.sleep(5000);
	
		
		
		
	}
	 
}
