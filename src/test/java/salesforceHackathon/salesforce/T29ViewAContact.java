package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class T29ViewAContact extends SalesforceUtility {

	public static void main(String[] args) throws Exception{

		launchBrowser();
		gotosalesforceURL();
		Map<String, String>  rowMap = readRowFromExcel(30);
		loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
	viewAContact();
		quitBrowser();
	}
	public static void viewAContact() throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Contact_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		 Thread.sleep(3000);
		 driver.switchTo().activeElement();
		driver.findElement(By.id("tryLexDialogX")).click();
		waitExplicitly(10,driver.findElement(By.xpath("//tbody/tr[2]/th[1]/a[1]")));
		 driver.findElement(By.xpath("//tbody/tr[2]/th[1]/a[1]")).click();
		 Thread.sleep(3000);
		
	}

}
