package salesforceHackathon.salesforce;

import java.util.Map;

import org.openqa.selenium.By;

import salesforceUtility.SalesforceUtility;

public class TC20Leadtab extends SalesforceUtility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotosalesforceURL();
		 Map<String, String>  rowMap = readRowFromExcel(21);
			loginToSalesforce(rowMap.get("userName"), rowMap.get("Password"));
		leadTab();
		quitBrowser();
		
	}
public static void leadTab()throws Exception{
	waitExplicitly(10,driver.findElement(By.xpath("//li[@id='Lead_Tab']")));
	 driver.findElement(By.xpath("//li[@id='Lead_Tab']")).click();
	 Thread.sleep(3000);
	 driver.switchTo().activeElement();
	driver.findElement(By.id("tryLexDialogX")).click();
}
}
