package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC26CreateNewViewInContact extends SalesforceUtility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		 Map<String, String>  rowMap = readRowFromExcel(27);
		loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
		createNewViewInContact(rowMap.get("AccNewView"));
		quitBrowser();
	}
public static void createNewViewInContact(String newcont) throws Exception{
	waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Contact_Tab']")));
	 driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
	 Thread.sleep(3000);
	 driver.switchTo().activeElement();
	driver.findElement(By.id("tryLexDialogX")).click();
	
	waitExplicitly(10,driver.findElement(By.xpath(" //a[contains(text(),'Create New View')]")));
	 driver.findElement(By.xpath(" //a[contains(text(),'Create New View')]")).click();
	 
	 waitExplicitly1(driver, driver.findElement(By.xpath("//input[@id='fname']")));
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(newcont);
		driver.findElement(By.xpath("//input[@id='devname']")).clear();
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='devname']")));
		Thread.sleep(3000);
		waitExplicitly1(driver, driver.findElement(By.xpath("//input[@data-uidsfdc='4']")));
		driver.findElement(By.xpath("//input[@data-uidsfdc='4']")).click();
}
}
