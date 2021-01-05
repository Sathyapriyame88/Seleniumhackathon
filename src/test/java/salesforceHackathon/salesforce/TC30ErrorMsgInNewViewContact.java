package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC30ErrorMsgInNewViewContact extends  SalesforceUtility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		Map<String, String>  rowMap = readRowFromExcel(31);
		loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
	errorMsginViewContact();
		quitBrowser();

	}
public static void errorMsginViewContact() throws Exception{
	waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Contact_Tab']")));
	 driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
	 Thread.sleep(3000);
	 driver.switchTo().activeElement();
	driver.findElement(By.id("tryLexDialogX")).click();
	waitExplicitly(10,driver.findElement(By.xpath(" //a[contains(text(),'Create New View')]")));
	 driver.findElement(By.xpath(" //a[contains(text(),'Create New View')]")).click();
	 waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='devname']")));
	 driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFGH");
	 waitExplicitly1(driver, driver.findElement(By.xpath("//input[@data-uidsfdc='4']")));
		driver.findElement(By.xpath("//input[@data-uidsfdc='4']")).click();
}
}
